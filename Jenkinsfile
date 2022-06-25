pipeline {
agent any
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
               sh 'mvn -f modulo2-web/pom.xml clean'
           }
        }
		
        stage('Pruebas Funcionales') {
         steps {
             echo 'Ejecutando pruebas funcionales ...'
             sh 'mvn -f modulo2-web/pom.xml verify'
         }

        }
    }
}




