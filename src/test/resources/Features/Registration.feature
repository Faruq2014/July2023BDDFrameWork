@registration @regression
Feature: Registration test
@first
  Scenario Outline: As a tester I open facebook registration page
    to build a dynamic registration test to input test data
    so that user can  be validated

    Given tester open facebook home page
    And tester click on registration button
    When tester input first name <enterFirstName>
    And tester input last name <enterLastName>
    And tester input email <enterEmail>
    And tester input password <EnterYourPassword>
    And tester input birth month <enterYourBirthMonth>
    And tester input birth day <enterYourBirthDay>
    And tester input birth year <enterYourBirthYear>
    And tester input gender <enterGender>
    And tester click login button
    Then tester should landing on user page

    Examples: 
      | enterFirstName | enterLastName | enterEmail     | EnterYourPassword | enterYourBirthMonth | enterYourBirthDay | enterYourBirthYear | enterGender |
      | "Moumita"      | "Shen"        | "ms@ymail.com" | "shem$123"        | "Mar"                | "22"              | "2002"             | "female"         |

   @second
  Scenario Outline: As a tester I open facebook registration page
    to build a dynamic registration test to input wrong test data
    so that user can not  be validated

    Given tester open facebook home page
    And tester click on registration button
    When tester input first name <enterFirstName>
    And tester input last name <enterLastName>
    And tester input email <enterEmail>
    And tester input password <EnterYourPassword>
    And tester input birth month <enterYourBirthMonth>
    And tester input birth day <enterYourBirthDay>
    And tester input birth year <enterYourBirthYear>
    And tester input gender <enterGender>
    And tester click login button
    Then tester should landing on user page
    Then Tester landing on wrong page

    Examples: 
      | enterFirstName | enterLastName | enterEmail     | EnterYourPassword | enterYourBirthMonth | enterYourBirthDay | enterYourBirthYear | enterGender |
      | "Moumita"      | "Shen1"       | "ms@ymail.com" | "shem$123"        | "Nov"                | "22"              | "2002"             | "F"         |
