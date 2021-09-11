pipelineJob('Jenkins Tutorial Demo - Library 1 (DSL)') {
  stages {
    stage('Stage 2') {
      steps {
        echo 'Hello world!'
      }
    }
  }

}