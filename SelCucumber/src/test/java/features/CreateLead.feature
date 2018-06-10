Feature: Create the Lead
Scenario: Verify Create Lead is working
Given Open TestLeaf Application
And Enter the username as DemoSalesManager
And Enter the password as crmsfa
And Click login button
And Click crm/sfa link
And Click on CreateLead link
And Enter the Company Name as Pramati Tech12
And Enter the First Name as Dineshk12
And Enter the Last Name as Kumaran12
And click on Create Lead button
Then Verify lead is created successfully

Scenario: Verify Create Lead is working
Given Open TestLeaf Application
And Enter the username as DemoCSR
And Enter the password as crmsfa
And Click login button12