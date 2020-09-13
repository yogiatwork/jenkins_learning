package org.foo.bar

def printCMD() {
    if (isUnix() == true) {
        sh "echo 'Hello World'"
    }else {
        bat "echo 'Hello World'"
    }
}