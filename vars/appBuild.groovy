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

                //build (job: 'check')

                def paramList = ['foo','bar']
                build (job: 'check', parameters: [List(name: 'HELLO', value: paramList)])

            }
}