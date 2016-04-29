FROM jenkins:2.0
MAINTAINER Baptiste Mathus <batmat@batmat.net>

COPY init_scripts/*.groovy  /usr/share/jenkins/ref/init.groovy.d/
