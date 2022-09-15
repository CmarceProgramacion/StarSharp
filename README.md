### `Automatizacion de pruebas Web`

#### Descripcion

El proyecto de Automatización Startsharp permite validar la creación de una reunión con una unidad de negocio.

#### Escenario

> **As** a StartSharp administrator

> **I** want to create the business unit and create a meeting

> **To** validate the creation of the business unit and the meeting

#### Características del Proyecto

En la construccion del proyecto Startsharp se implementa:

- Patrón de diseño de Screemplay.
- Framework SerenityBDD.
- Gestor de paquetes Gradle.
- Desarrollado en java en su version 8

#### Versionamiento

| Repository       | Version |
|------------------|---------|
| Serenity         | 3.3.4   |
| SerenityCucumber | 3.3.4   |
| SerenityEnsure   | 3.2.5   |
| Slf4jSimple      | 1.7.30  |
| Junit            | 4.13.2  |

#### Precondiciones

- [x] 1: Instar Java en su version 8.
- [x] 1.1: Configurar variable de entorno JAVA_HOME
- [x] 2- Instar Gradle en su version 7.2
- [x] 2.1: Configurar variable de entorno GRADLE_HOME

#### Ejecución del proyecto

Para la ejecución del proyecto se debe implementar el siguiente comando en el terminal en el directorio raiz del proyecto:

```sh
gradle test -Denvironment=stg aggregate
```
