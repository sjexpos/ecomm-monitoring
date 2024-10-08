
# Spring Admin Server

[![GitHub release](https://img.shields.io/github/release/sjexpos/ecomm-monitoring.svg?style=plastic)](https://github.com/sjexpos/ecomm-monitoring/releases/latest)
[![CI workflow](https://img.shields.io/github/actions/workflow/status/sjexpos/ecomm-monitoring/ci.yaml?branch=main&label=ci&logo=github&style=plastic)](https://github.com/sjexpos/ecomm-monitoring/actions?workflow=CI)
[![Codecov](https://img.shields.io/codecov/c/github/sjexpos/ecomm-monitoring?logo=codecov&style=plastic)](https://codecov.io/gh/sjexpos/ecomm-monitoring)
[![Issues](https://img.shields.io/github/issues-search/sjexpos/ecomm-monitoring?query=is%3Aopen&label=issues&style=plastic)](https://github.com/sjexpos/ecomm-monitoring/issues)
[![Commits](https://img.shields.io/github/last-commit/sjexpos/ecomm-monitoring?logo=github&style=plastic)](https://github.com/sjexpos/ecomm-monitoring/commits)

[![Docker pulls](https://img.shields.io/docker/pulls/sjexposecomm/monitoring?logo=docker&style=plastic)](https://hub.docker.com/r/sjexposecomm/monitoring)
[![Docker size](https://img.shields.io/docker/image-size/sjexposecomm/monitoring?logo=docker&style=plastic)](https://hub.docker.com/r/sjexposecomm/monitoring/tags)

![](docs/images/arch-monitoring.png)

This microservice is responsible for ...

## Framework

* [Spring Boot 3.3.2](https://spring.io/projects/spring-boot/)
* [Spring Cloud 2023.0.3](https://spring.io/projects/spring-cloud)
* [Spring Admin 3.3.3](https://github.com/codecentric/spring-boot-admin)

## Requirements

* [Java 21](https://openjdk.org/install/)
* [Maven 3.8.8+](https://maven.apache.org/download.cgi)
* [AWS Cli](https://aws.amazon.com/es/cli/)
* [Docker](https://www.docker.com/)

## Build

```bash
mvn clean && mvn install
```

## Run Tests
```bash
mvn clean && mvn tests
```

### Run application
```bash
./run.sh
```

## Swagger UI

http://localhost:9090/

