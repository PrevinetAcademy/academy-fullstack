package it.previnet.academy.fullstack.presentation.adapter.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@ApplicationScoped
@ApplicationPath("/api")
public class RestServiceApplication extends Application {

    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Singleton
    @Produces
    public ObjectMapper objectMapper() {
        LocalDateDeserializer dateDeserializer = new LocalDateDeserializer(DateTimeFormatter.ISO_DATE);
        LocalDateSerializer dateSerializer = new LocalDateSerializer(DateTimeFormatter.ISO_DATE);
        JavaTimeModule javaDateModule = new JavaTimeModule();
        javaDateModule.addDeserializer(LocalDate.class, dateDeserializer);
        javaDateModule.addSerializer(LocalDate.class, dateSerializer);

        LocalDateTimeDeserializer dateTimeDeserializer = new LocalDateTimeDeserializer(DateTimeFormatter.ISO_DATE_TIME);
        LocalDateTimeSerializer dateTimeSerializer = new LocalDateTimeSerializer(DateTimeFormatter.ISO_DATE_TIME);
        JavaTimeModule javaDateTimeModule = new JavaTimeModule();
        javaDateTimeModule.addDeserializer(LocalDateTime.class, dateTimeDeserializer);
        javaDateTimeModule.addSerializer(LocalDateTime.class, dateTimeSerializer);
        
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.registerModule(javaDateModule);
        objectMapper.registerModule(javaDateTimeModule);

        return objectMapper;
    }


}