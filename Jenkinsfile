pipeline {
agent any
 tools {
        maven 'maven3.8.6'
        jdk 'jdk8'
    }

    stages {
        stage('Descargar fuentes') {
           steps {
               echo 'Descargando fuentes...'
				git credentialsId: '880ec811-e063-4b01-b9a6-0e174d5e6caf', url: "https://github.com/agilelearningperu/modulo2-web.git"
           }
        }
        
        stage('Compilar') {
           steps {
               echo 'Compilando...'
               sh 'mvn -f pom.xml clean'
           }
        }
		
        stage('Pruebas Funcionales') {
         steps {
             echo 'Ejecutando pruebas funcionales ...'
             sh 'mvn -f pom.xml verify'
             cucumber buildStatus: 'null', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
         }

        }
    }
}




