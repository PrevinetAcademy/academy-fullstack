package it.previnet.academy.fullstack.presentation.adapter.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.previnet.academy.fullstack.application.port.DocumentoIdentificazioneManager;
import it.previnet.academy.fullstack.application.port.NominativoManager;
import it.previnet.academy.fullstack.application.port.RecapitoNominativoManager;
import it.previnet.academy.fullstack.bean.DocumentoIdentificazione;
import it.previnet.academy.fullstack.bean.Nominativo;
import it.previnet.academy.fullstack.bean.RecapitoNominativo;
import it.previnet.academy.fullstack.bean.TipoDocumentoIdentificazione;
import it.previnet.academy.fullstack.bean.TipoRecapitoNominativo;
import it.previnet.academy.fullstack.bean.TipoSesso;
import it.previnet.academy.fullstack.bean.request.NominativoRequest;
import it.previnet.academy.fullstack.presentation.port.service.NominativoRestService;
import org.apache.commons.collections4.CollectionUtils;
import org.jboss.logging.Logger;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.MultivaluedMap;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ApplicationScoped
public class NominativoRestServiceImpl implements NominativoRestService {
    private static final Logger logger = Logger.getLogger(NominativoRestServiceImpl.class);

    private static final Pattern FILENAME_PATTERN = Pattern.compile(".*filename=\"(.*)\"");

    @Inject
    NominativoManager nominativoManager;

    @Inject
    RecapitoNominativoManager recapitoNominativoManager;

    @Inject
    DocumentoIdentificazioneManager documentoIdentificazioneManager;

    @Inject
    ObjectMapper objectMapper;

    @Override
    public List<Nominativo> fetch(String cognome, String nome, String tipoSesso) {
        logger.info("called REST SERVICE fetch");
        return nominativoManager.fetch(cognome, nome, tipoSesso);
    }

    @Override
    public Nominativo save(Nominativo nominativo) {
        logger.info("called REST SERVICE save");
        return nominativoManager.save(nominativo);
    }

    @Override
    public Nominativo uploadNominativo(MultipartFormDataInput input) throws Exception {
        logger.info("called REST SERVICE uploadNominativo");

        Map<String, List<InputPart>> uploadForm = input.getFormDataMap();
        List<InputPart> dataParts = uploadForm.get("data");
        NominativoRequest nominativoRequest = null;

        if (CollectionUtils.isEmpty(dataParts)) {
            logger.error("missing data part");
        } else {
            InputPart dataPart = dataParts.get(0);
            try {
                String body = dataPart.getBody(String.class, null);
                nominativoRequest = objectMapper.readValue(body, NominativoRequest.class);
            } catch (Exception e) {
                logger.error("catching exception", e);
            }
        }

        List<InputPart> fileParts = uploadForm.get("file");
        InputStream file = null;

        if (CollectionUtils.isEmpty(fileParts)) {
            logger.error("missing file part");
        } else {
            InputPart filePart = fileParts.get(0);
            String filename = "";
            try {
                file = filePart.getBody(InputStream.class, null);
                MultivaluedMap<String, String> headers = filePart.getHeaders();
                if (!Objects.isNull(headers)) {
                    String partHeader = headers.getFirst("Content-Disposition");
                    Matcher matcher = FILENAME_PATTERN.matcher(partHeader);
                    if (matcher.matches()) {
                        filename = matcher.group(1);
                        logger.info("reading uploaded file: " + filename);
                    } else {
                        logger.info("reading uploaded file");
                    }
                }
            } catch (Exception e) {
                logger.error("catching exception", e);
            }
        }

        if (nominativoRequest != null && file != null) {
            return nominativoManager.uploadNominativo(nominativoRequest, file);
        }

        throw new Exception("missing data");
    }

    @Override
    public List<RecapitoNominativo> fetchRecapiti(Integer tokenNominativo) {
        logger.info("called REST SERVICE fetchRecapiti");
        return recapitoNominativoManager.fetch(tokenNominativo);
    }

    @Override
    public RecapitoNominativo saveRecapito(Integer tokenNominativo, RecapitoNominativo recapitoNominativo) {
        logger.info("called REST SERVICE saveRecapito");
        return recapitoNominativoManager.save(tokenNominativo, recapitoNominativo);
    }

    @Override
    public List<DocumentoIdentificazione> fetchDocumenti(Integer tokenNominativo) {
        logger.info("called REST SERVICE fetchDocumenti");
        return documentoIdentificazioneManager.fetch(tokenNominativo);
    }

    @Override
    public DocumentoIdentificazione saveDocumento(Integer tokenNominativo, DocumentoIdentificazione documentoIdentificazione) {
        logger.info("called REST SERVICE saveDocumento");
        return documentoIdentificazioneManager.save(tokenNominativo, documentoIdentificazione);
    }

    @Override
    public DocumentoIdentificazione uploadDocumento(Integer tokenDocumento, byte[] imageBytes) {
        logger.info("called REST SERVICE uploadDocumento");
        return documentoIdentificazioneManager.upload(tokenDocumento, imageBytes);
    }

    @Override
    public byte[] getDocumento(Integer tokenDocumento) {
        logger.info("called REST SERVICE getDocumento");
        return documentoIdentificazioneManager.getContent(tokenDocumento);
    }

    @Override
    public List<TipoSesso> fetchTipoSesso() {
        return nominativoManager.fetchTipoSesso();
    }

    @Override
    public List<TipoRecapitoNominativo> fetchTipoRecapito() {
        return recapitoNominativoManager.fetchTipoRecapito();
    }

    @Override
    public List<TipoDocumentoIdentificazione> fetchTipoDocumento() {
        return documentoIdentificazioneManager.fetchTipoDocumento();
    }
}
