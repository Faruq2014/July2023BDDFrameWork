#Author: your.email@your.domain.com
@login @regression
Feature: I want to build login functionality

  @smoke @regression
  Scenario: As a user I want to have login credential
    so that only valid user can log in

    Given user open facebook home page
    When user enter userName and password
    Then user succesfully logged in
