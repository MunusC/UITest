Betway Assessment Task :
Requirements in Scope 
1. Feature: As a business user, I would like to make a record of all teams which are playing today
        Scenario: Output all team names with a match today. If there are no matches today,   output a message to convey this.
1. Feature: As a sports user, I would like to read about all articles related to sports
       Scenario: Use the search option to find all articles related to ‘sports’. Output the first heading and the last heading returned on the page.
1. Feature: As a QA, I would like to verify all negative scenarios for login
       Scenario: Select Sign in’, and enter as many negative scenarios as possible. Verify that a error message is displayed and the text that it contains is as expected.

**Prerequisites :** 

1.  JDK 8 should be available in the system and JAVA_HOME should point to  JDK folder
 e.g. - > setx -m JAVA_HOME "C:\Progra~1\Java\jdk1.8.0_XX"
1.   Follow the steps below to configure maven:

- Visit [Maven official website](https://maven.apache.org/download.cgi) and download the Maven zip file, e.g. apache-   maven-3.6.0-bin.zip
- Unzip it to a folder. e.g. c:\opt\apache-maven-3.6.0
- Add MAVEN_HOME system variable, and point it to the Maven folder.
- Add %MAVEN_HOME%\bin To PATH variable
- verify maven installation using "mvn –version" in the command prompt 
1.   Ensure chrome browser is installed and the version is 97.0.4692.99 .

**To Run the project :**
1.  Clone the project from GitHub to your system e.g. C:\Betway UI
2.  Go to Project directory in the command prompt, e.g. C:\Betway UI\sports
3.  Run the command :  mvn clean test
4.  Check the reports in the %project-directory%\target\cucumber-reports\advanced-reports\extentreports folder
    e.g. C:\Betway UI\sports\target\cucumber-reports\advanced-reports\extentreports

