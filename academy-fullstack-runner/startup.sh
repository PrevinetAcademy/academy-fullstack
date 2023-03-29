#!/bin/bash
working_dir=$(basename "$PWD")

DB_CLIENTE_USERNAME=$(cat /etc/secrets/$CUSTOMER_CODE/progetto-fermi/username)
DB_CLIENTE_PASSWORD=$(cat /etc/secrets/$CUSTOMER_CODE/progetto-fermi/password)

touch /tmp/application.properties

echo ext.quarkus.datasource.jdbc.url=$DS_URL_DB_CLIENTE >> /tmp/application.properties
echo ext.quarkus.datasource.username=$DB_CLIENTE_USERNAME >> /tmp/application.properties
echo ext.quarkus.datasource.password=$DB_CLIENTE_PASSWORD >> /tmp/application.properties

java -DExternalPropertiesConfigSource=/tmp/application.properties -jar $MODULE_NAME.jar
