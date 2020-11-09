#!groovy

def build() {
    node
            {
               /* buildHelper.compile()
                buildHelper.doPackage()
                buildHelper.buildImage()
                buildHelper.doPush()
                buildHelper.deployToStage()
                buildHelper.cleanup()*/

                build 'safiyur/check/master'
            }
}