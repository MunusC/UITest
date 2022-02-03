Betway Assessment execution steps :

Prerequisites : 
1) JDK 8 should be available in the system and JAVA_HOME JAVA_HOME should point to a JDK
   e.g. - > setx -m JAVA_HOME "C:\Progra~1\Java\jdk1.8.0_XX"
2) Maven should be available in the system. Follow the steps below 
   Visit Maven official website, download the Maven zip file, for example : apache-maven-3.6.0-bin.zip
   Unzip it to a folder. In this article, we are using c:\opt\apache-maven-3.6.0
   Add a MAVEN_HOME system variables, and point it to the Maven folder.
   Add %MAVEN_HOME%\bin To PATH
   verify maven installation using "mvn –version" in the command prompt 
3) Ensure chrome browser is installed and the version is 97.0.4692.99  

To Run the project 
1) Clone the project from GitHub to your system e.g. C:\C:\BetwayAssessment
2) Go to Project directory in the command prompt, e.g. C:\BetwayAssessment\sports
3) run the command :  mvn clean test 
4) check the reports in the %project-directory%target\cucumber-reports\advanced-reports\extentreports folder 
    e.g. C:\BetwayAssessment\sports\target\cucumber-reports\advanced-reports\extentreports
