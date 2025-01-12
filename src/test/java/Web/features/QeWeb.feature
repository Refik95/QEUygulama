
@QEUygulumaWebTestCases
  Feature: Web Test Cases

  @CheckLoginpage
  Scenario: Check if user is on loginpage
    Given User is on loginpage
    Then User should see enter username

    @FalseLogin
    Scenario: User enters wrong username and password
      Given User is on loginpage
      When User writes wrong Username and Password
      Then User should see check invalid credentials message about login

    @CorrectLogin
    Scenario: User enters correct username and password
      Given User is on loginpage
      When User enters correct username and password
      Then User should see challenge name

    @CheckOpenMyAccountPage
    Scenario: Check if user is on myaccount page
      Given User is on loginpage
      When User enters correct username and password
      When User clicks open money transfer button
      Then User should see My account page text

    @CheckTransferMoneyPage
    Scenario: Check if user is on transfer money page
      Given User is on loginpage
      When User enters correct username and password
      When User clicks open money transfer button
      When User clikcs transfer money
      Then User should see Transfer money title

   @CheckAddMoneyPage
   Scenario: Check if user is on add money page
     Given User is on loginpage
     When User enters correct username and password
     When User clicks open money transfer button
     When User clicks add button
     Then User should see Add money title

   @CheckEditAccountPage
   Scenario: Check if user is on edit account page
     Given User is on loginpage
     When User enters correct username and password
     When User clicks open money transfer button
     When User clicks edit account
     Then User should see Edit account title

   @TransferMoneyToAnotherAccount
   Scenario: Check if user can successfully transfer money to another account
     Given User is on loginpage
     When User enters correct username and password
     When User clicks open money transfer button
     When User sees balance
     When User clikcs transfer money
     When User select "Testinium-3" account
     When User accepts alert
     When User types "1000" amount to the amount field
     When User clicks send button
     When User refreshes page after sending money
     When User clicks open money transfer button
     Then User should see that the amount is reduced by "1100"

    @AddMoneyToAccount
    Scenario: Check if user can successfully add money to account
      Given User is on loginpage
      When User enters correct username and password
      When User clicks open money transfer button
      When User sees balance
      When User clicks add money button
      When User should see Add money page title
      When User enters "Refik Gunhan" to card holder field
      When User enters "1234123412341234" to card number field
      When User enters "1026" to expiry date field
      When User enter "110" to cvv field
      When User enters money amount to add "1000"
      When User clicks add button
      When User refreshes page after sending money
      When User clicks open money transfer button
      Then User should see that the amount is increased by "3000"


    @AddMoneyPageFieldCheck
    Scenario: Check the required areas on add money page
      Given User is on loginpage
      When User enters correct username and password
      When User clicks open money transfer button
      When User clicks add money button
      When User clicks add button
      Then User should see required text

    @EditAccountName
    Scenario: Check if user can succesfully edit account name
      Given User is on loginpage
      When User enters correct username and password
      When User clicks open money transfer button
      When User clicks edit account
      When User updates account name
      When User clicks update button
      Then User should see that the account name has changed


