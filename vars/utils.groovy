package org.foo.bar

def printCMD() {
    if (IsUnix() == true) {
        sh "echo 'Hello World'"
    }else {
        bat "echo 'Hello World'"
    }
}