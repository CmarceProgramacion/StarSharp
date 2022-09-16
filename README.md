### `Automatización de pruebas Web`

#### Descripción

El proyecto de Automatización Startsharp permite validar la creación de una reunión con una unidad de negocio.

#### Escenario

> **As** a StartSharp administrator

> **I** want to create the business unit and create a meeting

> **To** validate the creation of the business unit and the meeting

#### Características del Proyecto

En la construcción del proyecto Startsharp se implementa:

- Patrón de diseño de Screemplay.
- Framework SerenityBDD.
- Gestor de paquetes Gradle.
- Desarrollado en java en su versión 8

#### Versionado

| Repository       | Version |
|------------------|---------|
| Serenity         | 3.3.4   |
| SerenityCucumber | 3.3.4   |
| SerenityEnsure   | 3.2.5   |
| Slf4jSimple      | 1.7.30  |
| Junit            | 4.13.2  |

#### Precondiciones

- [x] 1: Instar Java en su versión 8.
- [x] 1.1: Configurar variable de entorno JAVA_HOME
- [x] 2- Instar Gradle en su versión 7.2
- [x] 2.1: Configurar variable de entorno GRADLE_HOME

#### Ejecución del proyecto

Para la ejecución del proyecto se debe implementar el siguiente comando en el terminal en el directorio raíz del proyecto:

```sh
gradle test -Denvironment=stg aggregate
```

#### Script Pipeline Jenkins

Para realizar la ejecución en Jenkis se requiere usar este Pipeline Script, recuerda las versiones de Java y Gradle correctas, por último configurar un nodo de Windows.
```sh
pipeline {
    // Use agent windows
    agent{label 'window'}
    
    tools {
        // Install the Gradle version.
        gradle 'Gradle'
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git url: 'https://github.com/CmarceProgramacion/StarSharp.git', branch: 'main'

                // Run gradle.
                bat "gradle clean test -Denvironment=stg aggregate"			
            }
			post {
			  // Make the report Serenity html
				always {
					publishHTML(
						target: [
							reportName : 'Serenity',
							reportDir:   'target/site/serenity',
							reportFiles: 'index.html',
							keepAll:     true,
							alwaysLinkToLastBuild: true,
							allowMissing: false
						]
					)
				}
			}
        }
    }
}
```