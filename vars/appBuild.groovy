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
                build (job: 'check', parameters: [string(name: 'HELLO', value: 'hello param')])

            }
}