package org.foo.bar

private script
 
// init function
def initClass(script){
    return new org.foo.bar.UtilClasses(script)
    }

def printCMD(){

    def util = initClass(this)

    if (isUnix() == true) {
        util.echoCmdLin()
    }else {
        util.echoCmdWin()
    }
}