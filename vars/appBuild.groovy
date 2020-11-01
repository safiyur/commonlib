#!groovy

def call ()
{
    node
            {
               echo "hello app"
               new buildHelper().compile()
            }
}