package org.foo.bar

class UtilClasses implements Serialization {
    private script
    UtilClasses(script){
        this.script = script
    }

    def echoCmdLin() {
        script.sh "echo 'Hello World'"
    }

    def echoCmdWin() {
        script.bat "echo 'Hello World'"
    }
}