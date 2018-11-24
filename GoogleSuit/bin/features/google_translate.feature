#Author: your.email@your.domain.com

Feature: Google Translate
  I want to use this template for my feature file
  As a web user
  I want to use Google Translate
  to translate words between differents languages
  

  Scenario:	Translate to English to Spanish
    Given that Susan wants to translate a word
    When she transaltes the word cheese from English to Spanish 
    Then she should see the word leche in the screen
    