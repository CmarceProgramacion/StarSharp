Feature: Validate the creation of the business unit and the meeting
  As a StartSharp administrator
  I want to create the business unit and create a meeting
  To validate the creation of the business unit and the meeting

  Background: Accessing the platform
    Given that I access the StartSharp platform with "admin" and "serenity"


  Scenario Outline: Validate business unit creation
    When I create a business unit "<nameUnit>" and "<parentUnit>"
    Then I verify the successful creation of the business unit
      | <nameUnit> | <parentUnit> |

    Examples:
      | nameUnit  | parentUnit |
      | Choucair1 | Marketing  |


  Scenario Outline: Validate meeting creation
    When I create the meeting
      | <meetingName> | <meetingType> | <meetingNumber> | <startDate> | <starTime> | <endDate> | <endTime> | <location> | <unit> | <organizedBy> | <reporter> | <attendeeList> | <attendeeType> | <attenDanceStatus> |
    Then I verify the successful creation of the meeting "<meetingName>"

    Examples:
      | meetingName                  | meetingType | meetingNumber | startDate  | starTime | endDate    | endTime | location | unit      | organizedBy   | reporter     | attendeeList | attendeeType | attenDanceStatus |
      | Contextualizacion de negocio | General     | 10            | 09/20/2022 | 11:00    | 09/20/2022 | 12:00   | On Site  | Marketing | Charles Davis | Alexis Lopez | Dylan Smith  | Guest        | Not Set          |




