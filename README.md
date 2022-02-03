Betway Assessment execution steps :

Prerequisites : 
1) JDK 8 should be available in the system and JAVA_HOME should point to a JDK
   e.g. - > setx -m JAVA_HOME "C:\Progra~1\Java\jdk1.8.0_XX"
2) Follow the steps below to configure maven  
      a)Visit Maven official website and download the Maven zip file, e.g. apache-maven-3.6.0-bin.zip
      b)Unzip it to a folder. e.g. c:\opt\apache-maven-3.6.0
      c)Add MAVEN_HOME system variable, and point it to the Maven folder.
      d)Add %MAVEN_HOME%\bin To PATH
      e)verify maven installation using "mvn –version" in the command prompt 
3) Ensure chrome browser is installed and the version is 97.0.4692.99 . 

To Run the project 
1) Clone the project from GitHub to your system e.g. C:\Betway UI
2) Go to Project directory in the command prompt, e.g. C:\Betway UI\sports
3) Run the command :  mvn clean test 
4) Check the reports in the %project-directory%\target\cucumber-reports\advanced-reports\extentreports folder 
    e.g. C:\Betway UI\sports\target\cucumber-reports\advanced-reports\extentreports
