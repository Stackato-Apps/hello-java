Hello Java Sample test commt with commit added in issue of jira1a
avoid open Issues Commit in jira
jira test commit for repourl validation
=================

This sample (originally based on the [SpringSource sample](https://github.com/SpringSource/cloudfoundry-samples/tree/master/hello-java)) aims to demonstrate the simplest possible Servlet-based Java webapp. Here we walk through the entire content of the application.


Building the Application
------------------------

Make sure you have [Maven](http://maven.apache.org/ "Maven") installed.
Then, *cd* into the root directory and execute:

	mvn clean package

That will create the *hello-java-1.0.war* file within the 'target' directory.

Running the Application
-----------------------

To run the application, make sure you have the Stackato client installed and that you are logged in successfully for your desired target environment (e.g. http://api.stackato.local).

Then execute:

	stackato push -n 

Notice that it detected the app type as "Java Web Application". In this case, it's only recognizing a runtime (Java)
but not a framework (e.g. Spring or Grails), since this really is just a barebones Java web application. If you were
to create a Spring or Grails application, you would see that it detects both the runtime and the framework.

The result when visiting the 'Application Deployed URL' should look something like this:

	Hello from 172.30.49.150:20488

That's all. Have fun!***
