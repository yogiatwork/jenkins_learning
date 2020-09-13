package org.foo.bar

// init function
def initClass(){
    return new org.foo.bar.UtilClasses 
}

def printCMD(){

    def util = initClass(this)

    if (isUnix() == true) {
        util.echoCmdLin()
    }else {
        util.echoCmdWin()
    }
}