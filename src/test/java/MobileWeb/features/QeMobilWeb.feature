
@QEUygulumaMobileWebTestCases
Feature: Mobile Web Test Cases

  @CheckLoginpageMobile
  Scenario: Check if user is on mobile loginpage
    Given User is on mobile loginpage
    Then User should see enter username on mobile web

  @FalseLoginMobile
  Scenario: User enters wrong username and password on mobile web
    Given User is on mobile loginpage
    When User writes wrong Username and Password on mobile web
    Then User should see check invalid credentials message about login on mobile web

  @CorrectLoginMobile
  Scenario: User enters correct username and password on mobile web
    Given User is on mobile loginpage
    When User enters correct username and password on mobile web
    Then User should see challenge name on mobile web

  @CheckOpenMyAccountPageMobile
  Scenario: Check if user is on mobile myaccount page
    Given User is on mobile loginpage
    When User enters correct username and password on mobile web
    When User clicks open money transfer button on mobile web
    Then User should see My account page text on mobile web

  @CheckTransferMoneyPageMobile
  Scenario: Check if user is on mobile transfer money page
    Given User is on mobile loginpage
    When User enters correct username and password on mobile web
    When User clicks open money transfer button on mobile web
    When User clikcs transfer money on mobile web
    Then User should see Transfer money title on mobile web

  @CheckAddMoneyPageMobile
  Scenario: Check if user is on mobile add money page
    Given User is on mobile loginpage
    When User enters correct username and password on mobile web
    When User clicks open money transfer button on mobile web
    When User clicks add button on mobile web
    Then User should see Add money title on mobile web

  @CheckEditAccountPageMobile
  Scenario: Check if user is on mobile edit account page
    Given User is on mobile loginpage
    When User enters correct username and password on mobile web
    When User clicks open money transfer button on mobile web
    When User clicks edit account on mobile web
    Then User should see Edit account title on mobile web

  @TransferMoneyToAnotherAccountMobile
  Scenario: Check if user can successfully transfer money to another account on mobile web
    Given User is on mobile loginpage
    When User enters correct username and password on mobile web
    When User clicks open money transfer button on mobile web
    When User sees balance on mobile web
    When User clikcs transfer money on mobile web
    When User select "Testinium-3" account on mobile web
    When User accepts alert on mobile web
    When User types "1000" amount to the amount field on mobile web
    When User clicks send button on mobile web
    When User refreshes page after sending money on mobile web
    When User clicks open money transfer button on mobile web
    Then User should see that the amount is reduced by "1100" on mobile web

  @AddMoneyToAccountMobile
  Scenario: Check if user can successfully add money to account on mobile web
    Given User is on mobile loginpage
    When User enters correct username and password on mobile web
    When User clicks open money transfer button on mobile web
    When User sees balance on mobile web
    When User clicks add money button on mobile web
    When User should see Add money page title on mobile web
    When User enters "Refik Gunhan" to card holder field on mobile web
    When User enters "1234123412341234" to card number field on mobile web
    When User enters "1026" to expiry date field on mobile web
    When User enter "110" to cvv field on mobile web
    When User enters money amount to add on mobile web
    When User clicks add button on mobile web
    When User refreshes page after sending money on mobile web
    When User clicks open money transfer button on mobile web
    Then User should see that the amount is increased by "3000" on mobile web


  @AddMoneyPageFieldCheckMobile
  Scenario: Check the required areas on mobile add money page
    Given User is on mobile loginpage
    When User enters correct username and password on mobile web
    When User clicks open money transfer button on mobile web
    When User clikcs add money on mobile web
    When User clicks add button on mobile web
    Then User should see required text on mobile web

  @EditAccountNameMobile
  Scenario: Check if user can succesfully edit account name on mobile web
    Given User is on mobile loginpage
    When User enters correct username and password on mobile web
    When User clicks open money transfer button on mobile web
    When User clicks edit account on mobile web
    When User updates account name on mobile web
    When User clicks update button on mobile web
    Then User should see that the account name has changed on mobile web


