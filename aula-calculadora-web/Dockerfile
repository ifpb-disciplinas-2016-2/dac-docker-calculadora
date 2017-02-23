FROM payara/server-full
MAINTAINER Ricardo Job <sousajob@gmail.com>
ENV DOMAIN domain1
ENV DEPLOY ${PAYARA_PATH}/glassfish/domains/${DOMAIN}/autodeploy/
ENTRYPOINT $PAYARA_PATH/bin/asadmin start-domain --verbose ${DOMAIN}
ADD target/aula-calculadora-web.war  ${DEPLOY}
# COPY $LIB/* ${PAYARA_PATH}/glassfish/domains/${DOMAIN}/lib/ext