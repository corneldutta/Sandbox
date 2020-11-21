Feature: Verify Order Management Partner APIs

  @Regression
  Scenario: Verify seller is able to get Order using Order_ID
    Given Seller has generated Authentication Token
    And Status of getToken API Response is 200
    When Seller calls "getOrder" API using GET HTTP Request for "1806670081717"
    Then status of getOrder API Response is 200
    And purchaseOrderId in API Response is "1806670081717"

  @Regression
  Scenario: Verify seller is able to fetch all Released Orders between startDate and endDate
    Given Seller has generated Authentication Token
    When Seller calls getAllReleasedOrders API using GET HTTP Request between "2020-09-10T10:30:15Z" and "2020-11-10T10:30:15Z"
    Then status of getAllReleasedOrders API Response is 200
    And List of all Released orders should be displayed within "2020-09-10T10:30:15Z" and "2020-11-10T10:30:15Z"