# spark3-maven-starter
This project provides a starter template for building a Spark 3.0.0 project with maven build with Scala 2.12.

All required dependencies for Spark SQL are added in this template

####This setup features:

    Spark 3.0.0
    Scala 2.12.8
    
####To start building the project:
    mvn clean install
    
####This setup also features following plugins:
    Scala-style : For better coding style
    Scoverage   : For better code coverage
    
#####Running Scala-style:
    mvn scalastyle:check
    
#####Running Scoverage:
    mvn scoverage:check