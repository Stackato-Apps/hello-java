Hello Java Sample
=================

This sample (originally based on the [SpringSource sample](https://github.com/SpringSource/cloudfoundry-samples/tree/master/hello-java)) aims to demonstrate the simplest possible Servlet-based Java webapp. Here we walk through the entire content of the application.


Building the Application
------------------------

It is possible to build the application either with Ant or Maven.

### Maven

Make sure you have [Maven](http://maven.apache.org/ "Maven") installed.
Then, *cd* into the root directory and execute:

	mvn clean package

That will create the *hello-java-1.0.war* file and the *hello-java-1.0* folder, both within the 'target' directory.


### Ant

Make sure your have [Ant](http://ant.apache.org/ "Ant") installed.
Then, *cd* into the root directory and execute:

	ant clean package
	
That will create the *hello-java-1.0.war* file and the *hello-java-1.0* folder, both within the 'target' directory.


Running the Application
-----------------------

To run the application, make sure you have the Stackato client installed and that you are logged in successfully for your desired target environment (e.g. http://api.stackato.local).

Then, from the root folder of the application, execute:

	stackato push -n 

This will run the default java buildpack, who will download and create a new instance of a Tomcat server to deploy this sample.

Note that in this example, we specified the folder of compiled java classes *target/hello-java-1.0* as our app-path, because the java buildpack needs extracted files to work correctly. All the files inside that folder were pushed to Stackato.

However, by specifying the *target/hello-java-1.0.war* file instead, this can also work, as the command line client will recognise the archive type and extract it before pushing it, which would result in the same files as the *hello-java-1.0* folder.

The result when visiting the 'Application Deployed URL' should look something like this:

	Hello from 172.30.49.150:20488

That's all. Have fun!
