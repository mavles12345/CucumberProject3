Feature: Verifying Adactine home page details

  Scenario Outline: User should book the details in Adaction hotel page
    Given User should enter the "<userName>", "<passWord>" and click the login
    When User user should enter the details "<location>","<hotels>","<room>","<noofroom>","<checkin>","<checkout>","<adult>","<child>" and click the search button
    And User select the hotel and continue
    And user should enter booking details "<firstname>","<lastname>","<billingaddress>","<cardno>","<cardtype>","<expmonth>","<expyear>","<cvv>" and click the book now
    Then User should verify the order number and close the browser

    Examples: 
      | userName   | passWord | location    | hotels         | room         | noofroom | checkin    | checkout   | adult   | child   | firstname | lastname | billingaddress | cardno           | cardtype | expmonth | expyear | cvv |
      | jackmavles | selvam   | Sydney      | Hotel Cornice  | Standard     | 1 - One  | 29/01/2021 | 30/01/2021 | 1 - One | 1 - One | Selvam    | M        | Nest           | 1111222233334444 | VISA     | December |    2022 | 123 |
      | jackmavles | selvam   | Brisbane    | Hotel Sunshine | Double       | 1 - One  | 29/01/2021 | 30/01/2021 | 1 - One | 1 - One | Viji      | M        | Nest           | 1111222233334444 | VISA     | December |    2022 | 123 |
      | jackmavles | selvam   | Brisbane    | Hotel Sunshine | Double       | 1 - One  | 29/01/2021 | 30/01/2021 | 1 - One | 1 - One | Henik     | M        | Nest           | 1111222233334444 | VISA     | December |    2022 | 123 |
      | jackmavles | selvam   | Adelaide    | Hotel Hervey   | Deluxe       | 1 - One  | 29/01/2021 | 30/01/2021 | 1 - One | 1 - One | Amirtham  | M        | Nest           | 1111222233334444 | VISA     | December |    2022 | 123 |
      | jackmavles | selvam   | Adelaide    | Hotel Hervey   | Deluxe       | 1 - One  | 29/01/2021 | 30/01/2021 | 1 - One | 1 - One | Hema      | M        | Nest           | 1111222233334444 | VISA     | December |    2022 | 123 |
      | jackmavles | selvam   | London      | Hotel Creek    | Super Deluxe | 1 - One  | 29/01/2021 | 30/01/2021 | 1 - One | 1 - One | Mahi      | M        | Nest           | 1111222233334444 | VISA     | December |    2022 | 123 |
      | jackmavles | selvam   | New York    | Hotel Creek    | Super Deluxe | 1 - One  | 29/01/2021 | 30/01/2021 | 1 - One | 1 - One | Uma       | M        | Nest           | 1111222233334444 | VISA     | December |    2022 | 123 |
      | jackmavles | selvam   | Los Angeles | Hotel Cornice  | Standard     | 1 - One  | 29/01/2021 | 30/01/2021 | 1 - One | 1 - One | Selvam    | M        | Nest           | 1111222233334444 | VISA     | December |    2022 | 123 |
      | jackmavles | selvam   | Paris       | Hotel Sunshine | Standard     | 1 - One  | 29/01/2021 | 30/01/2021 | 1 - One | 1 - One | Selvam    | M        | Nest           | 1111222233334444 | VISA     | December |    2022 | 123 |
      | jackmavles | selvam   | Paris       | Hotel Sunshine | Standard     | 1 - One  | 29/01/2021 | 30/01/2021 | 1 - One | 1 - One | Selvam    | M        | Nest           | 1111222233334444 | VISA     | December |    2022 | 123 |
