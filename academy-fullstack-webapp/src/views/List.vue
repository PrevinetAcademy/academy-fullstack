<template>
  <div class="list">
    <b-container fluid>
      <!-- User Interface controls -->
      <b-row>
        <b-col sm="12" md="12" lg="12" class="my-1">
          <b-form-group
            label="Filtro"
            label-for="filter-input"
            label-cols-sm="1"
            label-align-sm="right"
            label-size="sm"
            class="mb-0"
          >
            <b-input-group size="sm">
              <b-form-input
                id="filter-input"
                v-model="filter"
                type="search"
                placeholder="Cerca"
              ></b-form-input>

              <b-input-group-append>
                <b-button :disabled="!filter" @click="filter = ''"
                  >Cancella</b-button
                >
              </b-input-group-append>
            </b-input-group>
          </b-form-group>
        </b-col>

        <b-col sm="5" md="6" class="my-1">
          <b-form-group
            label="Per pagina"
            label-for="per-page-select"
            label-cols-sm="6"
            label-cols-md="4"
            label-cols-lg="3"
            label-align-sm="right"
            label-size="sm"
            class="mb-0"
          >
            <b-form-select
              id="per-page-select"
              v-model="perPage"
              :options="pageOptions"
              size="sm"
            ></b-form-select>
          </b-form-group>
        </b-col>

        <b-col sm="7" md="6" class="my-1">
          <b-pagination
            v-model="currentPage"
            :total-rows="totalRows"
            :per-page="perPage"
            align="fill"
            size="sm"
            class="my-0"
          ></b-pagination>
        </b-col>
      </b-row>

      <!-- Main table element -->
      <b-table
        :items="items"
        :fields="fields"
        :current-page="currentPage"
        :per-page="perPage"
        :filter="filter"
        :filter-included-fields="filterOn"
        stacked="md"
        show-empty
        small
        @filtered="onFiltered"
      >
        <template #cell(name)="row">
          {{ getAnagraficaName(row.item) }}
        </template>

        <template #cell(actions)="row">
          <b-button size="sm" @click="row.toggleDetails" v-if="row.item.documentoIdentificazione || row.item.recapitoNominativo">
            {{ row.detailsShowing ? "Nascondi" : "Mostra" }} Dettagli
          </b-button>
        </template>

        <template #row-details="row">
          <b-card title="Documento" bg-variant="light">
            <template v-for="(value, key) in row.item.documentoIdentificazione">
              <div class="text-left" v-if="value && key!=='content'" :key="key">
                {{ key }}: {{ value }}
              </div>
            </template>
          </b-card>
          <b-card title="Recapito" bg-variant="light">
            <template v-for="(value, key) in row.item.recapitoNominativo">
              <div class="text-left" v-if="value" :key="key">
                {{ key }}: {{ value }}
              </div>
            </template>
          </b-card>
        </template>
      </b-table>
    </b-container>
  </div>
</template>

<script>
import Vue from "vue";
import axios from 'axios';
import { SERVICE_BASE_URL } from '../config/AppConfig';

export default Vue.extend({
  data() {
    return {
      items: [],
      fields: [
        {
          key: "name",
          label: "Nome",
          sortable: true,
          sortDirection: "desc",
        },
        {
          key: "denCognome",
          label: "Cognome",
          sortable: true,
          sortDirection: "desc",
        },
        {
          key: "dataNascita",
          label: "Data di nascita",
          sortable: true,
          class: "text-center",
        },
        {
          key: "tipoSesso",
          label: "Sesso",
          sortable: true,
          class: "text-center",
        },
        { key: "actions", label: "" },
      ],
      totalRows: 1,
      currentPage: 1,
      perPage: 30,
      pageOptions: [10, 15, 30, 60],
      filter: null,
      filterOn: ['denRagioneSociale', 'denNome', 'denCognome', 'tipoSesso']
    };
  },
  mounted() {
    axios.get(`${SERVICE_BASE_URL}/anagrafica`)
      .then((response) => {
        this.items = response.data;
        this.totalRows = response.data.length;
      })
      .catch((error) => {
        console.log(error);
        this.$bvToast.toast("Qualcosa è andato storto. Riprova", {
          title: "Ooops",
          variant: "danger"
        });
      })
  },
  methods: {
    getAnagraficaName(anagrafica) {
      return anagrafica.tipoSesso === 'GIURIDICO' ? anagrafica.denRagioneSociale : anagrafica.denNome
    },
    onFiltered(filteredItems) {
      // Trigger pagination to update the number of buttons/pages due to filtering
      this.totalRows = filteredItems.length;
      this.currentPage = 1;
    },
  },
});
</script>