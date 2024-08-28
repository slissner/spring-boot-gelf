# Spring Boot Gelf

This is a demo/test project for [pull request #1](https://github.com/slissner/spring-boot/pull/1) to Spring Boot.

The said PR adds Graylog Extended Log Format (GELF) to Spring Boot v3.4 structured logging feature.

## How to run Graylog locally

Set up Graylog on your local machine with docker and send local log files into that Graylog.

- Clone the following [git repo](https://github.com/Graylog2/docker-compose?tab=readme-ov-file)
- Configure the .env files for the `open-core` repo
- Start those repos with docker-compose according to the Graylog2 docker compose repository `README.md`
- [Open graylog dashboard](http://admin:yourpassword@0.0.0.0:9000/) with user `admin` and the password generated for you (see log output)
- Just following through setup wizard with the default values: Create new CA, automatic renewal, provisioning, ...
- After that: you need to log in with the user `admin`, but this time with the password that you put into `.env` (in form of a hash)
- Go to [System > Inputs](http://localhost:9000/system/inputs) and create a new GELF UDP Input with the default settings.
