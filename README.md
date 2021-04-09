# Java_Jenkins_CI

This repository contains a sample java application built from Maven.

Below is sample Jenkins job to automatically build the Java_jenkins_ci sample app, SonarQube code review, test and show the Junit results, cobertura results and build a jar file.

Prerequisites:
1. Java and Jenkins should be installed in the system.
2. Maven, Java should be configured in Jenkins.










Below are the steps to create the Job:


1. Create freestyle job in Jenkins named as Build_Java_Jenkins_CI.

2. Integrate github repo:

![SCM](../master/images/scm.PNG)

3. Running Build autpmatically everyday 7 PM

![SCM](../master/images/gitpoll.PNG)

4. Integrate sonarQube with Jenkins:

![SCM](../master/images/sonarserver.PNG)
![SCM](../master/images/sonarscannerinstall.PNG)
![SCM](../master/images/sonarscnner.PNG)

5. Maven call to install and run the jar file created and publish corbetura report :

![SCM](../master/images/mavencall.PNG)

6. Publish Junit reports:

![SCM](../master/images/junit.PNG)
