<template>
  <div class="create">
    <b-container fluid>
      <div class="row">
        <b-col cols="12" sm="8">
          <b-card class="mt-3" header="Form">
            <validation-observer v-slot="{ reset, invalid }">
              <b-form @submit.prevent="handeleSubmit" @reset.prevent="handleReset(reset)">

                <b-form-group label="Tipo Persona">
                  <b-form-select 
                    v-model="personType" 
                    :options="personTypeOptions" 
                    @change="handleReset(reset)"
                    text-field="description"
                    value-field="code"
                  >
                    <!-- This slot appears above the options from 'options' prop -->
                    <template #first>
                      <b-form-select-option :value="null" disabled>-- Seleziona un tipo --</b-form-select-option>
                    </template>
                  </b-form-select>
                </b-form-group>

                <template v-if="personType">

                  <b-form-group v-if="isPhysicalPerson" label="Cognome">
                    <validation-provider name="cognome" rules="required" v-slot="{errors, valid, touched}">
                      <b-form-input
                        v-model="form.denCognome"
                        placeholder="Inserisci cognome"
                        :state="touched ? valid : null"
                      ></b-form-input>
                      <!-- This will only be shown if the preceding input has an invalid state -->
                      <b-form-invalid-feedback>{{ errors[0] }}</b-form-invalid-feedback>
                    </validation-provider>
                  </b-form-group>

                  <b-form-group v-if="isPhysicalPerson" label="Nome">
                    <validation-provider name="nome" rules="required" v-slot="{errors, valid, touched}">
                      <b-form-input
                        v-model="form.denNome"
                        placeholder="Inserisci nome"
                        :state="touched ? valid : null"
                      ></b-form-input>
                      <b-form-invalid-feedback>{{ errors[0] }}</b-form-invalid-feedback>
                    </validation-provider>
                  </b-form-group>

                  <b-form-group label="Sesso">
                    <validation-provider name="sesso" rules="required" v-slot="{errors, valid}">
                      <b-form-select 
                        v-model="form.tipoSesso"
                        :options="tipoSessoOptions"
                        text-field="description"
                        value-field="code"
                        :state="form.tipoSesso ? valid : null"
                      ></b-form-select>
                      <b-form-invalid-feedback>{{ errors[0] }}</b-form-invalid-feedback>
                    </validation-provider>
                  </b-form-group>

                  <b-form-group v-if="isPhysicalPerson" label="Email">
                    <validation-provider name="email" rules="email" v-slot="{errors, valid, touched}">
                      <b-form-input
                        v-model="form.denEmail"
                        placeholder="Inserisci email"
                        :state="touched ? valid : null"
                      ></b-form-input>
                      <b-form-invalid-feedback>{{ errors[0] }}</b-form-invalid-feedback>
                    </validation-provider>
                  </b-form-group>

                  <b-form-group v-if="isPhysicalPerson" label="Codice Fiscale">
                    <validation-provider name="codice fiscale" rules="required" v-slot="{errors, valid, touched}">
                      <b-form-input
                        v-model="form.codFiscale"
                        placeholder="Inserisci codice fiscale"
                        :state="touched ? valid : null"
                      ></b-form-input>
                      <b-form-invalid-feedback>{{ errors[0] }}</b-form-invalid-feedback>
                    </validation-provider>
                  </b-form-group>

                  <b-form-group v-if="isPhysicalPerson" label="Data di nascita">
                    <validation-provider name="data di nascita" rules="required" v-slot="{errors, valid, touched}">
                      <b-form-datepicker 
                        v-model="form.dataNascita"
                        placeholder="Seleziona una data"
                        :state="touched ? valid : null"
                      ></b-form-datepicker>
                      <b-form-invalid-feedback>{{ errors[0] }}</b-form-invalid-feedback>
                    </validation-provider>
                  </b-form-group>

                  <b-form-group v-if="isLegalPerson" label="Ragione sociale">
                    <validation-provider name="ragione sociale" rules="required" v-slot="{errors, valid, touched}">
                      <b-form-input
                        v-model="form.denRagioneSociale"
                        placeholder="Inserisci la ragione sociale"
                        :state="touched ? valid : null"
                      ></b-form-input>
                      <b-form-invalid-feedback>{{ errors[0] }}</b-form-invalid-feedback>
                    </validation-provider>
                  </b-form-group>

                  <b-form-group v-if="isLegalPerson" label="Partita iva">
                    <validation-provider name="partita iva" rules="required" v-slot="{errors, valid, touched}">
                      <b-form-input
                        v-model="form.codPartitaIva"
                        placeholder="Inserisci PIVA"
                        :state="touched ? valid : null"
                      ></b-form-input>
                      <b-form-invalid-feedback>{{ errors[0] }}</b-form-invalid-feedback>
                    </validation-provider>
                  </b-form-group>

                  <b-form-group label="Tipo Documento">
                    <validation-provider name="tipo documento" rules="required" v-slot="{errors, valid}">
                      <b-form-select
                        v-model="form.tipoDocumentoIdentificazione"
                        :options="tipoDocumentoOptions"
                        text-field="description"
                        value-field="code"
                        :state="form.tipoDocumentoIdentificazione ? valid : null"
                      ></b-form-select>
                      <b-form-invalid-feedback>{{ errors[0] }}</b-form-invalid-feedback>
                    </validation-provider>
                  </b-form-group>

                  <b-form-group label="Documento">
                    <validation-provider name="documento" rules="required" v-slot="{errors, valid, touched}">
                      <b-form-file
                        v-model="file"
                        placeholder="Seleziona un file"
                        :state="touched ? valid : null"
                      ></b-form-file>
                      <b-form-invalid-feedback>{{ errors[0] }}</b-form-invalid-feedback>
                    </validation-provider>
                  </b-form-group>

                  <b-form-group label="Tipo Recapito">
                    <validation-provider name="tipo recapito" rules="required" v-slot="{errors, valid}">
                      <b-form-select
                        v-model="form.tipoRecapitoNominativo"
                        :options="tipoRecapitoOptions"
                        text-field="description"
                        value-field="code"
                        :state="form.tipoRecapitoNominativo ? valid : null"
                      ></b-form-select>
                      <b-form-invalid-feedback>{{ errors[0] }}</b-form-invalid-feedback>
                    </validation-provider>
                  </b-form-group>

                </template>

                <b-button type="submit" :disabled="invalid" variant="primary">Invia</b-button>
                <b-button type="reset" variant="danger">Reset</b-button>
              </b-form>
            </validation-observer>
          </b-card>
        </b-col>
        <b-col cols="12" sm="4">
          <b-card class="mt-3" header="Form Data Result">
            <pre class="m-0">{{ form }}</pre>
          </b-card>
        </b-col>
      </div>
    </b-container>
  </div>
</template>

<script>
import Vue from "vue";
import axios from 'axios';
import { ValidationObserver, ValidationProvider, extend, localize } from 'vee-validate';
import { required, email } from 'vee-validate/dist/rules';
import it from 'vee-validate/dist/locale/it.json';
import { SERVICE_BASE_URL } from '../config/AppConfig';

extend('email', email);
extend('required', required);
localize('it', it);

const TIPO_PERSONA = {
  FISICA: {
    code: 'PF',
    description: 'Fisica'
  },
  GIURIDICA: {
    code: 'PG',
    description: 'Giuridica'
  }
}

export default Vue.extend({
  components: {
    ValidationObserver,
    ValidationProvider
  },
  data() {
    return {
      form: {
        denEmail: "",
        denNome: "",
        denCognome: "",
        codFisclae: "",
        dataNascita: "",
        tipoRecapitoNominativo: "",
        tipoSesso: "",
        tipoDocumentoIdentificazione: "",
        denRagioneSociale: "",
        codPartitaIva: ""
      },
      file: null,
      personTypeOptions: [TIPO_PERSONA.FISICA, TIPO_PERSONA.GIURIDICA],
      personType: null,
      tipoSessoOptions: [],
      tipoRecapitoOptions: [],
      tipoDocumentoOptions: []
    };
  },
  computed: {
    isPhysicalPerson() {
      return this.personType === TIPO_PERSONA.FISICA.code
    },
    isLegalPerson() {
      return this.personType === TIPO_PERSONA.GIURIDICA.code
    },
  },
  methods: {
    handeleSubmit() {
      const form = new FormData();
      form.append('file', this.file);
      form.append('data', JSON.stringify(this.form));

      axios.post(`${SERVICE_BASE_URL}/anagrafica`, form)
        .then((response) => {
          console.log(response);
          this.$bvToast.toast("Anagrafica inserita con successo", {
            title: "OK!",
            variant: "success"
          });
          this.$router.push('list');
        })
        .catch((error) => {
          console.log(error);
          let message = "Qualcosa è andato storto. Riprova";
          if (error.response.status === 444 && error.response.data.length > 0) {
            message = (error.response.data).join(', ');
          }
          this.$bvToast.toast(message, {
            title: "Ooops!",
            variant: "danger"
          });
        })
    },
    getTipoSesso() {
      axios.get(`${SERVICE_BASE_URL}/tipo/sesso?persona=${this.personType}`)
        .then((response) => {
          this.tipoSessoOptions = response.data;
          if (response.data.length === 1) {
            this.form.tipoSesso = this.tipoSessoOptions[0].code;
          }
        });
    },
    getTipoRecapito() {
      axios.get(`${SERVICE_BASE_URL}/tipo/recapito?persona=${this.personType}`)
        .then((response) => {
          this.tipoRecapitoOptions = response.data;
          if (response.data.length === 1) {
            this.form.tipoRecapitoNominativo = this.tipoRecapitoOptions[0].code;
          }
        });
    },
    getTipoDocumento() {
      axios.get(`${SERVICE_BASE_URL}/tipo/documento?persona=${this.personType}`)
        .then((response) => {
          this.tipoDocumentoOptions = response.data;
          if (response.data.length === 1) {
            this.form.tipoDocumentoIdentificazione = this.tipoDocumentoOptions[0].code;
          }
        });
    },
    handleReset(validationResetFn) {
      validationResetFn();

      // Reset our form values
      this.form.denEmail = "";
      this.form.denNome = "";
      this.form.denCognome = "";
      this.form.codFisclae = "";
      this.form.dataNascita = "";
      this.form.tipoRecapitoNominativo = "";
      this.form.tipoSesso = "";
      this.form.tipoDocumentoIdentificazione = "";
      this.form.denRagioneSociale = "";
      this.form.codPartitaIva = "";
      this.file = null;

      this.getTipoSesso();
      this.getTipoRecapito();
      this.getTipoDocumento();
    },
  },
});
</script>