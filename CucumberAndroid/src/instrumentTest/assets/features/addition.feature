Feature: Add two numbers
  Calculate the sum of two numbers which consist of one or more digits

  Scenario Outline: Enter one digit per number and press =
    Given I have a MainActivity
    When I press <num1>
    And I press +
    And I press <num2>
    And I press =
    Then I should see on the display

  Examples:
    | num1 | num2 |
    | 0    | 0    |