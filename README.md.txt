Prerequisite:
Setup the Appium , Java , UiAutomator2 , Android  Emulator appropriately.
Appium server should be up and running with Android Uiautomator2Driver  loaded
Android  Emulator should be up and running .
the apk file has been placed in the folder 'thescore_apk_file' under the Main folder
theScore App has to be installed  in an Andriod Emulator /device.
The app has to be Get started  with atleast below options selected for Leagues
NFL
NHL
NBA
The app has to be up and running.


Capabilities Configuration:
Capabilities properties can be viewed or changed  at the /src/test/resources/Properties/Capabilities.properties  file 


Data Parameterization:
The team and the tab to navigate can be provided as data in the feature file  
NFL | NFLLeader
NHL | NHLLeader
NBA | NBALeader

Execution:
Build the maven project and run maven test


Reports:
Ccucumber Reports can be located at the /src/test/resources/Reports folder 

Logs:
Logs are displayed in console and also in the Log file  /src/test/resources/Logs/Automation_ExecutionLog
Note: Please ensure the log4j.properties file is detected in the maven project while running else the log won't show up.

Testspec:
Testspec can be located at the src/test/java/MyRunner/testspec.txt


TestApproach:

A parameterized data driven approach has been chosen for the BDD Cucumber testng framework designed in 3 layers 
consists of Page Objects, Step definition and Feature file with additional test management capapbilities provided by testng.

The Scenario in the feature file which are in the User story format at top layes provide proper abstraction and
ensure effective collaration among Project stakeholders 
during testing planning , execution and monitoring.
The  same suite can be executed with diffrent data sets and testng support can be leverage to run the scenarios in parallel too.

The Common resuable functions are implemented in the CommonUtil file which is called in the Application Base class.
This will help to reuse those funtions across the projects as required .

Proper Abstraction at the test definition layer  improves maintainability and adaptability to enhanced  SUT features.

All the requirements have been captured in the feature  file and the execution coverage can be tracked in the report also.