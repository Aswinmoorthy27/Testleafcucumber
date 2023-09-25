
Feature: CreateLead on Leaftap app

  Scenario Outline: CreateLead with multiple Data
  Given Enter the username as 'Demosalesmanager'
  And Enter the password as 'crmsfa'
  When Click on the Login button
  Then HomePage should be displayed
  When Click on crmsfaLink
  And Click Leads Button
  And Click CreateLead link
  Given Enter the companyname as <companyname>
  And Enter the firstname as <firstname>
  And Enter the lastname as <lastname>
  And Enter the Phonenumber as <Phoen>
  When Click on createLead button
  Then ViewLeadsPage should be displayed as <companyname>
  
    Examples: 
      | companyname  | firstname | lastname  | Phoen|
      | TestLeaf |     Aswin | Moorthy |2323|
      | TestLeaf |     AswinTesting | Moorthy    |2332|
