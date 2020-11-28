# vois-task


# Automating testing
 automating the login, registration, and checkout process of  http://automationpractice.com/index.php

## Requirements

- Eclipse, Maven and Java's JDK
   
- selenium WebDriver
- Chrome driver https://chromedriver.chromium.org/downloads

## Setup

First download or clone the repositiory and unzip the directory into a folder. Next install [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) if you're missing it.  Next install [Eclipse](https://www.eclipse.org/downloads/) and your os specific version [maven](https://maven.apache.org/download.cgi). You will need to make sure maven has been added to your variable path. OS specific path instructions are available [here](https://www.baeldung.com/install-maven-on-windows-linux-mac#:~:text=Adding%20Maven%20to%20the%20Environment,run%20the%20Maven's%20command%20everywhere.). Then after that choose your [chrome driver] (https://chromedriver.chromium.org/downloads) according to your installed google chrome browser and extract it in a resources folder.

Once  Eclipse, Maven, chromedriver.exe and variable path have been installed and setup correctly. You should be ready to rock and roll!  
  
Go ahead and start Eclipse.
Go to File-> New-> Project-> Maven-> Maven Project then press next, browse the location, select the archtype -> enter the group id and the artifact id then finish.
after creation of th project you will need to add the dependency to POM.xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.0.0-alpha-7</version>
</dependency>

Eclipse will begin collecting the missing dependencies and make some configurations from the files provided.

## project files
Since this is an automation testing, I've separated each test case in a class with its main so you can run and see the behavior of the test cases separately.
## run
After everything is finished you're ready to run the project from Eclipse IDE. Choose the test case java file then run it. 
## Expected output:
- Pass: will print pass in the Eclipse Console.
- Fail: will print the error message with the failed test cases in the Eclipse Console.
