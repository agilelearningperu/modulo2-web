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
               sh 'mvn -f modulo2-web/pom.xml clean compile'
           }
        }

		
		stage('Build') {
			steps {
				echo 'Generando build...'
				sh 'mvn -f fuentes/pom.xml package -DskipTests=true'
			}
		}
		
        stage('Pruebas Funcionales') {
        		echo 'Ejecutando pruebas funcionales ...'
        		dir('modulo2-web') {
                    bat 'mvn test'
                    step([$class: 'Publisher'])
        		}
	
        
    }
}




