@Login
Feature: login
  User want to login

  @Login001 
  Scenario: TC.Log.001.001 - User login with valid credential
  Given : Open browser "https://secondhand.binaracademy.org/"
  When : User click button masuk in homepage
  And : User fill field email "kaliaja1@gmail.com"
  And : User fill field password "kali123"
  And : User click button masuk
  And : verify button profile
  And : User click button profile
  And : User click button keluar
  Then : Close Browser


