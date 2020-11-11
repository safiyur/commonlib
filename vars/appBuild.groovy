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

               String params = "foo,bar"
                build (job: 'check', parameters:[string(name:'HELLO',value:params)])

            }
}