#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Register
Feature: Register
  user want to register

  @Register001
  Scenario: TC.Reg.002.001 - user want to register with valid credential
    Given : Open browser "https://secondhand.binaracademy.org/"
    When : User click button masuk in homepage
    And : User click button daftar disini
    And : User fill field username "tina"
    And : User fill field email register "tina123@gmail.com"
    And : User fill field password register "tina123"
    And : User click button daftar register
    And : verify button profile
 		And : User click button profile
  	And : User click button keluar
  	Then : Close Browser
    
