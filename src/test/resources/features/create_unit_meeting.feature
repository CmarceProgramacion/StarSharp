#
Feature: Validate the creation of the business unit and the meeting
  As a StartSharp administrator
  I want to create the business unit and create a meeting
  To validate the creation of the business unit and the meeting

  @CaseUno
  Scenario Outline:Validating the creation of a meeting with a business unit
    Given that I access the StartSharp platform with "admin" and "serenity"
    When I create meeting with a business unit
      | <nameUnit> | <parentUnit> | <meetingName> | <meetingType> | <meetingNumber> | <startDate> | <starTime> | <endDate> | <endTime> | <location> | <unit> | <organizedBy> | <reporter> | <attendeeList> | <attendeeType> | <attenDanceStatus> |
    Then I verify the successful creation of the meeting "<meetingName>"

    Examples:
      | nameUnit  | parentUnit              | meetingName                  | meetingType | meetingNumber | startDate  | starTime | endDate    | endTime | location | unit      | organizedBy   | reporter     | attendeeList | attendeeType | attenDanceStatus |
      | Choucair1 | Marketing » Editor Team | Contextualizacion de negocio | Strategy    | 10            | 09/20/2022 | 10:00    | 09/20/2022 | 11:00   | On Site  | Marketing | Charles Davis | Alexis Lopez | Dylan Smith  | Guest        | Not Set          |
