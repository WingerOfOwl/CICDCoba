Feature: User
  As an admin
  I want to see list of user
  So that I can create new user

  Scenario: Get - As admin I have be able to get detail user
    Given I set GET endpoints1
    When I send GET HTTP request
    Then I receive valid HTTP response code 200

  Scenario: Get - As Admin I Input Wrong URL
    Given I set GET Wrong EndPoint
    When I send GET HTTP request2
    Then I receive valid HTTP response code 404

  Scenario: POST - As admin I have be able to to create new user
    Given I set POST endpoints
    When I send POST HTTP request1
    Then I receive valid HTTP response code 201

  Scenario: POST - As Admin I Input Wrong URL
    Given I set POST Wrong EndPoint
    When I send POST HTTP request2
    Then I receive Post valid HTTP response code 404

  Scenario: Get By ID - As Admin I Input Wrong URL
    Given I set Wrong Get By Id EndPoint
    When I send GET BY ID HTTP request2
    Then I receive GET BY ID valid HTTP response code 404

  Scenario: Get By ID - As admin I have be able to get detail user
    Given I set GET by ID endpoints
    When I send GET by ID HTTP request
    Then I receive GET by ID valid HTTP response code 200

  Scenario: PUT - As admin I have be able to to update existing user
    Given I set PUT endpoints
    When I send PUT HTTP request
    Then I receive PUT valid HTTP response code 200

  Scenario: PUT - As admin I Wrong URL
    Given I set PUT Wrong endpoints
    When I Send PUT HTTP Request2
    Then I receive PUT valid HTTP response code 404

  Scenario: DELETE - As admin I have be able to to delete existing user
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I receive DELETE valid HTTP response code 200

  Scenario: DELETE - As admin I Wrong URL
    Given I set DELETE Wrong endpoints
    When I send DELETE HTTP request1
    Then I receive DELETE valid HTTP response code 404