@regression
Feature: I want to use login test for multiple users

  @dataDriven
  Scenario Outline: As a tester I want to have a dynamic login test
    so that multiple valid user can use

    Given tester open facebook home page <url>
    When tester enter <userName> and <password>
    Then I verify the <title> of the tester

    Examples: 
      | url                         | userName | password    | title                          |
      | "https://www.facebook.com/" | "Asma"   | "asma123"   | "Facebook - log in or sign up" |
      | "https://www.facebook.com/" | "Depty"  | "depty123"  | "Facebook - log in or sign up" |
      | "https://www.facebook.com/" | "Ishrak" | "ishrak123" | "Facebook - log in or sign up" |
