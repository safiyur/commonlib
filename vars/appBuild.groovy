#!groovy

def build() {
    node
            {
                buildHelper.compile()
            }
}