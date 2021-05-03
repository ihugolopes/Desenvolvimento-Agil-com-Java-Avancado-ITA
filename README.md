# Desenvolvimento-Agil-com-Java-Avancado-ITA 

ASSIGNMENT 01

The objective of this task is to exercise the creation of dynamic pages with Servlets, as well as their testing using Selenium.

The student must create an HTML page with a form where the user must choose in a dropbox whether to convert from Fahrenheit to Celsius or from Celsius to Fahrenheit, put in a text field the value to be converted and click on a button to submit . When submitting, a servlet must receive these parameters, perform the conversion and generate an HTML response containing the converted value. It is not allowed to use any additional framework.

Perform tests with Selenium to access the application and check if you are converting correctly:

When converting from Celsius to Fahrenheit the value of 100, the result must be 212 When converting from Fahrenheit to Celsius the value of 212, the result must be 100 The web application project (in Eclipse or Netbeans) must be delivered with what was requested in a .zip file, the class code with Selenium tests in .java format and a screen image showing the results of the tests.

Review criteria The following will be considered in the evaluation:

If what was requested has been implemented. If the functional requirements were met If the implementation used the requested technologies If the tests were created as requested How to perform the conversion between the scales The following formula can be used for the conversion from Celsius (C) to Fahrenheit (F):

F = ((C * 9) / 5) + 32

The following formula can be used for converting Fahrenheit (F) to Celsius (C):

C = ((F - 32) * 5) / 9
