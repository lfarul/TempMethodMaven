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
     stage ('Build') {
        steps {
          sh 'make'
      }
    }
    
    stage {  
      stage ('Deploy'){
        when {
          expression {
            currentBuild.result == null || currentBuild.result == 'SUCCESS'
          }
        }
      }
    }
  }
}

    
