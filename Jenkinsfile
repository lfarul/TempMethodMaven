pipeline {
  agent any
  stages {
    stage ("Checkout"){
      steps {
        git url: "https://github.com/lfarul/TempMethodMaven.git"
      }
    }
    stage ("Compile") {
      steps {
        sh "./mvn compile"
      }
    }
  }
}
