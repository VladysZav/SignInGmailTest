Feature: Tests for sign in Gmail

  Scenario: Login with valid data
    Given I am on the Sign in Gmail
    When I enter 'vladyslav048' in email string
    Then I enter 'zaval123' in password string

  Scenario: Login with the wrong email
    Given I am on the Sign in Gmail
    When I enter 'wrong' in email string
    Then I check error text email

  Scenario: Login with the wrong password
    Given I am on the Sign in Gmail
    When I enter 'vladyslav048' in email string
    And I enter 'wrong' in password string
    Then I check error text password

