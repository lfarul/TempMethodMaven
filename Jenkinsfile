pipeline {
  agent any
  stages {
    stage ('Checkout'){
      steps {
        git url: "https://github.com/lfarul/TempMethodMaven.git"
      }
    }
    stage ('Compile') {
      steps {
        echo "Compiling"
      }
    }
    stages {
      stage ('Build') {
        steps {
          sh 'make'
      }
    }
    stages {
      stage ('Deploy'){
        when {
          expression {
            currentBuild.result == null || currentBuild.result == 'SUCCESS'
          }
        }
        steps {
          sh 'make publish'
        }
      }
    }
  }
}
}
    
