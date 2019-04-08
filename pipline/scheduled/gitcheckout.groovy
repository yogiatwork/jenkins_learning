node {
    stage('message'){
        dir('C:/Work'){
            bat 'dir'
        }
       isUnix()    
       echo 'Hello World'
    } 
}