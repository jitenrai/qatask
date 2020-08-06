# qatask


This repository contains QA task from 7S. It contains code which checks exisitence of elements on website. It is an Selenium, Java, TestNg, Maven project.
I have used Eclispse Version: 2020-06 (4.16.0), Build id: 20200615-1200, maven version maven, TestNg version 7.3.0 on OS Name	Microsoft Windows 10 Pro, version Version	10.0.18362 Build 18362 machine.

To be able to execute the task, one must have the simillar setup. How to download details can be found under 
Eclipse - https://www.eclipse.org/
TestNg - https://testng.org/doc/
maven - https://maven.apache.org/

Once the setup is completed, project can be exported. To run the tests, right click on qatask and then select run with TestNg. This will trigger all the tests.

To run individual tests, under src click on Komoothtestcase and then select any test case to run. Right click on the test and then select run with TestNg.

*******

In general, I spent more than expected time for the setup. I had issues with connecting my eclipse workspace to git. To be able to upload file to git repository, files we manually uploaded to the repository. 

It was my first time working on end to end project. It was amazing learning excercise. I do feel that, I would have used more of TestNg anotations for example @AfterTest and @BeforeTest. 

xpath is used to selecting elements.

Design pattern is page object model with lot of scope for improvements. I was not able to get PageFactory Struchure in this project. 

Errors which I was not able to resolve during completion of this project are:

When running tests : JavaScript error: resource://gre/modules/URIFixup.jsm, line 281: NS_ERROR_FAILURE: Should pass a non-null uri

When triggering build via Jenkins 

Gestartet durch Benutzer admin
Running as SYSTEM
Baue in Arbeitsbereich C:\WINDOWS\system32\config\systemprofile\AppData\Local\Jenkins.jenkins\workspace\qatask
[qatask] $ cmd.exe /C "mvn compile && exit %%ERRORLEVEL%%"
Der Befehl "mvn" ist entweder falsch geschrieben oder
konnte nicht gefunden werden.
Build step 'Maven Goals aufrufen' marked build as failure
Finished: FAILURE

*******

