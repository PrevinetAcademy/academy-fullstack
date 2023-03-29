package it.previnet.academy.fullstack.application.adapter;

import io.smallrye.config.common.AbstractConfigSource;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class ExternalPropertiesConfigSource extends AbstractConfigSource {

    final private Map<String, String> mapProperties = new HashMap<String, String>();

    public ExternalPropertiesConfigSource() {
        super(ExternalPropertiesConfigSource.class.getSimpleName(), DEFAULT_ORDINAL);

        if (System.getProperty("ExternalPropertiesConfigSource") != null) {
            Path path = Paths.get(System.getProperty("ExternalPropertiesConfigSource"));
            if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
                try (InputStream is = Files.newInputStream(path)) {
                    Properties properties = new Properties();

                    properties.load(is);

                    mapProperties.putAll(properties.entrySet().stream().collect(
                            Collectors.toMap(
                                    e -> e.getKey().toString(),
                                    e -> e.getValue().toString()
                            )
                    ));
                } catch (FileNotFoundException | NoSuchFileException var2) {
                    return;
                } catch (IOException var3) {
                    throw new IOError(var3);
                }
            }
        }

    }

    @Override
    public Map<String, String> getProperties() {
        return mapProperties;
    }

    @Override
    public String getValue(final String propertyName) {
        return mapProperties.get(propertyName);
    }

    @Override
    public String getName() {
        return ExternalPropertiesConfigSource.class.getSimpleName();
    }
}
