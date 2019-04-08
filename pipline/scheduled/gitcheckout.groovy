def fetch_code() {
    stage('git checkout'){
        deleteDir()
        git checkout
    }
}

def checkvars() {
    withEnv([ "ENV=uat"]){
        stage('get the environemnt'){
            echo env.ENV
        }
    }
}
node('master') {
    stage('message'){
        dir('C:/Work'){
            bat 'dir'
        }
    }
    fetch_code()
    checkvars() 
}