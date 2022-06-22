pipeline {
agent any
    stages {
        stage('Descargar fuentes') {
           steps {
               echo 'Descargando fuentes...'
				git credentialsId: 'agilelearningperu', url: "https://github.com/agilelearningperu/modulo2-web.git"
           }
        }
        
        stage('Compilar') {
           steps {
               echo 'Compilando...'
               sh 'mvn -f modulo2-web/pom.xml clean'
           }
        }
		
        stage('Pruebas Funcionales') {
        		echo 'Ejecutando pruebas funcionales ...'
                    sh 'mvn -f modulo2-web/pom.xml verify'
        }
    }
}




