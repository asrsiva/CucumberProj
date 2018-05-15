Feature: Job Search

  Scenario Outline: Quick job search
    Given Go to jobserve
    And Enter "<Keyword>"
    And Enter location as "<Location>"
    And Select "<JobAge>"
    When I click on search
    Then Jobs shoud be displayed

    Examples: 
      | Keyword  | Location | JobAge        |
      | Selenium | Chennai  | Today         |
      | QTP      | Pune     | Within 2 days |
