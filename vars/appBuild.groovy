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

                List<ParameterValue> newParams = [
                        new StringParameterValue('ENV', "foo"),
                        new StringParameterValue('ENV_NO', "bar")
                ]
                build (job: 'check', parameters: newParams)

            }
}