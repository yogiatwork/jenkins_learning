package org.foo.bar

// init function
def initClass(){
    return new org.foo.bar.UtilClasses(this)
    }

def printCMD(){

    def util = initClass()

    if (isUnix() == true){
        util.echoCmdLin()
    }else {
        util.echoCmdWin()
    }
}