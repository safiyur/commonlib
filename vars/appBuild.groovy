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

                List <String> paramList = new ArrayList <String> ()
                paramList.add("foo")
                paramList.add("bar")
                build (job: 'check', parameters: [list(name: 'HELLO', value: paramList)])

            }
}