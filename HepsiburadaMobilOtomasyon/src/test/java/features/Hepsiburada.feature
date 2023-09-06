@LoginPage
  Feature: Login Page Test Scenarios

    @Check
    Scenario: Check Login Page Components
      When Click to Don't Allow Button
      When Click to MyAccount Symbol
      When Click to GirisYap Button
      Then Check to GirisYap Button is Available in Login Page
      Then Check E-Posta Box is Available in Login Page

    @FalseEMailAddress
    Scenario Outline: False E-Mail Address
      When Click to Don't Allow Button
      When Click to MyAccount Symbol
      When Click to GirisYap Button
      When Write False Email Address
      Then Check to "<Error>" Message
      Examples:
      |Error                                   |
      |Gecerli bir e-posta adresi girmelisiniz.|

    @FalsePhoneNumber
    Scenario Template: False Phone Number
      When Click to Don't Allow Button
      When Click to MyAccount Symbol
      When Click to GirisYap Button
      When Write False Phone Number
      Then Check to "<Error>" Message About Phone Number
      Examples:
      |Error                                |
      |Gecerli bir cep telefonu girmelisiniz|


    @CorrectEMailandFalsePassword
    Scenario Outline: Correct E Mail and False Password
      When Click to Don't Allow Button
      When Click to MyAccount Symbol
      When Click to GirisYap Button
      When Write Correct Email Address
      When Write False Password
      Then Check to "<Error>" Message About Login
      Examples:
      |Error                      |
      |Beklenmeyen bir hata olustu|











