Feature: Create the Lead

@createLead
Scenario Outline: Verify Create Lead is working
Given Open TestLeaf Application
And Enter the username as <username>
And Enter the password as <password>
And Click login button
And Click crm/sfa link
And Click on CreateLead link
And Enter the Company Name as <cname>
And Enter the First Name as <fname>
And Enter the Last Name as <lname>
And click on Create Lead button
Then Verify lead is created successfully
Examples:
|username|password|cname|fname|lname|
|DemoCSR|crmsfa|Kluency12 Inc|Dhruvan12|Kabilan12|

@Fillthevalues
Scenario Outline: Verify Values are filled
Given Open TestLeaf Application
And Enter the username as <username>
And Enter the password as <password>
And Click login button
And Click crm/sfa link
And Click on CreateLead link
And Enter the Company Name as <cname>
And Enter the First Name as <fname>
And Enter the Last Name as <lname>
And click on Create Lead button
Then Verify lead is created successfully
Examples:
|username|password|cname|fname|lname|
|DemoSalesManager|crmsfa|Global123 technologies|Rajeshkumar12|kannamma32l|