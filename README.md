# Gradle_web

[![Build Status](https://github.com/yiisoft/yii2/workflows/build/badge.svg)](https://github.com/ABtank/scheduler)

Использованные инструменты
------------
1) Java 17
2) Spring Boot
3) Lombok
4) H2
5) Builder - Gradle

Установка 
------------

- Установить Java 17.
- в корне проекта выполнить 
```
  ./gradlew clean build
```
- Затем выполнить 
```
java -jar .\build\libs\gradle_web-0.0.1-SNAPSHOT.jar
```

# Consul
- Скачать и установить (настроить переменные среды)
- Запустить
```
consul agent -dev
```
- По умолчанию запускается на [localhost:8500](http://localhost:8500/ui/) 