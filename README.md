# QE Uygulama
This project is about a banking website.
This project can run test cases both on mobile-web and web pages.
In this project we will try to run the most critical cases and try to find defects and bugs then report them using allure reports.
## To run the tests
1. To run the tests you must ensure that the username and password is correct. I didn't gave mine here because that's my unique password.
2. To run the test in different platforms you must change the value of broweser.platfrom to Chrome, Safari or ChromeMobile
3. In order to generate report .....
```properties
login.page = https://catchylabs-webclient.testinium.com/signIn
login.username = testkullancısı
login.password = test1234

#Driver Settings
browser.platform = ChromeMobile
implicit.timeout = 10
pageload.timeout = 10
explicit.timeout = 10
```
