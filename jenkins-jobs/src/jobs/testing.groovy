job('Jenkins Tutorial Demo - Library 1 (DSL)') {
pipeline {
  agent any
  stages {
    stage('Stage 2') {
      steps {
        echo 'Hello world!'
      }
    }
  }
}
}