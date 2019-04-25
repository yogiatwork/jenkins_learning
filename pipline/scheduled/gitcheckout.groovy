def fetch_code() {
    stage('git checkout'){
        deleteDir()
        checkout scm
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
    @Library('checkutil@') import org.eng.ext.testcall
    
    p1 = new testcall()
    p1.sayhello('baba')

        stage('updated message'){
         log.info 'Starting'
         log.warning 'Nothing to do!'
       
    }

    stage ('variable as library'){
        libvar "Sapna"
        libvar()
    }
}
