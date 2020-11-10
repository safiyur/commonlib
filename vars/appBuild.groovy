#!groovy

def build() {
    node
            {
                parameters {
                    string(defaultValue: "123", description: 'This is a parameter', name: 'PARAMETER01')
                }
               /* buildHelper.compile()
                buildHelper.doPackage()
                buildHelper.buildImage()
                buildHelper.doPush()
                buildHelper.deployToStage()
                buildHelper.cleanup()*/

                //build (job: 'check')
                build (job: 'check', parameters: [string(name: 'HELLO', value: String.valueOf(PARAMETER01))])

            }
}