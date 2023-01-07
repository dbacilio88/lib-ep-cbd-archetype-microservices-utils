# Ejército del Perú - Centro de Infromática del Ejército
![GitHub repo size](https://img.shields.io/github/repo-size/dbacilio88/lib-ep-cbd-archetype-microservices-utils)
![GitHub repo file count](https://img.shields.io/github/directory-file-count/dbacilio88/lib-ep-cbd-archetype-microservices-utils)
![GitHub all releases](https://img.shields.io/github/downloads/dbacilio88/lib-ep-cbd-archetype-microservices-utils/total)
[![GitHub contributors](https://img.shields.io/github/contributors/dbacilio88/lib-ep-cbd-archetype-microservices-utils)](https://github.com/dbacilio88/lib-ep-cbd-archetype-microservices-utils/graphs/contributors)
[![GitHub last commit](https://img.shields.io/github/last-commit/dbacilio88/lib-ep-cbd-archetype-microservices-utils?logoColor=success)](https://github.com/dbacilio88/lib-ep-cbd-archetype-microservices-utils/graphs/commit-activity)
![GitHub pull requests](https://img.shields.io/github/issues-pr/dbacilio88/lib-ep-cbd-archetype-microservices-utils?color=red)
![GitHub language count](https://img.shields.io/github/languages/count/dbacilio88/lib-ep-cbd-archetype-microservices-utils)
![GitHub followers](https://img.shields.io/github/followers/dbacilio88?style=social)
[![GitHub watchers](https://img.shields.io/github/watchers/dbacilio88/lib-ep-cbd-archetype-microservices-utils?style=social)](https://github.com/dbacilio88/lib-ep-cbd-archetype-microservices-utils/watchers)
[![**GitHub Repo stars**](https://img.shields.io/github/stars/dbacilio88/lib-ep-cbd-archetype-microservices-utils?style=social)](https://github.com/dbacilio88/lib-ep-cbd-archetype-microservices-utils/stargazers)

# Archetype Microservices Spring Boot

## Definition

```bash
mvn archetype:generate \
  -DarchetypeGroupId=ep.mil.microservices.archetypes \
  -DarchetypeArtifactId=lib-ep-cbd-archetype-microservices-utils \
  -DarchetypeVersion=1.0.0 \
  -DgroupId=[YOUR_GROUP_ID] \
  -DartifactId=[YOUR_ARTIFAC_ID] \
  -Dversion=[YOUR_VERSION] \
  -DinteractiveMode=false
```

## Usage

Use of maven generator:

Terminal Bash :

```bash
mvn archetype:generate \
  -DarchetypeGroupId=ep.mil.microservices.archetypes \
  -DarchetypeArtifactId=lib-ep-cbd-archetype-microservices-utils \
  -DarchetypeVersion=1.0.0 \
  -DgroupId=ep.mil.microservices \
  -DartifactId=lib-ep-cbd-demo-microservice-utils \
  -Dversion=1.0.0 \
  -DinteractiveMode=false
```

Terminal Cmd:

```bash
mvn archetype:generate ^
  -DarchetypeGroupId=ep.mil.microservices.archetypes ^
  -DarchetypeArtifactId=lib-ep-cbd-archetype-microservices-utils ^
  -DarchetypeVersion=1.0.0 ^
  -DgroupId=ep.mil.microservices ^
  -DartifactId=lib-ep-cbd-demo-microservice-utils ^
  -Dversion=1.0.0 ^
  -DinteractiveMode=false
```