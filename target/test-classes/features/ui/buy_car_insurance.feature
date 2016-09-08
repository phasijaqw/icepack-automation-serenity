
Feature: Verify Car Insurance Payment

  As an interviewee
  I want to buy care insurance
  So that I can insure my car

  @Smoke
  Scenario: Verify Payment of Car insurance
    Given I have access to  sydney heroku app
    When I click on get car quote link
    Then I enter quote request with following details:
    |Audi |2016 |28 |female |New South Wales  |priyanka.hassija@gmail.com |
    And I submit car quote details
    And I verify car details are correct:
    |28 |priyanka.hassija@gmail.com |Female |Audi |2016 |New South Wales  |
    And I check '52.50' dollar as monthly premium amount
    When I buy car insurance
    Then I enter following details for insurance payment:
    |priyanka |priyanka.hassija@gmail.com |priyanka |5105105105105100 |July (07)|2016 |123  |
    And I pay for car insurance

