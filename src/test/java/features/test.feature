Feature: Login Feature

  Scenario: Login to site
    Given user opens homepage
    When user navigates to Login page
    And user enters username and password
    Then open Account page

