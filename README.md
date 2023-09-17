# HemaNandhini-Circle
To automate the patients journey in booking an appointment In Circle Website
Project title: Circle Journey

The automation framework is written using BDD Cucumber framework using JAVA programming language.
Used POM concepts and the connection details are written in Property file and read using ReadProperty class.
The script runs in both Chrome and Firefox using Webdriver manager in Selenium 

**Steps to execute the script:**
1.Clone the github project 
2.Navigate the project path : cd <path of project
3.If we want to run the script in chrome , use the below mvn command
mvn -Dbrowser=Chrome test
If FireFox,
mvn -Dbrowser=FireFox test
