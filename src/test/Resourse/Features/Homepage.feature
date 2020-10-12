Feature: user should navigate to different categories
  @trial
  Scenario: user shuold able to navigate to categories
    Given user is on homepage
    When user click on women category
    And user click on top category
    Then user should see