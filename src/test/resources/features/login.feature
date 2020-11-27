Feature: Login

  Scenario Outline: User can successfully login

    Given user is on the login page
    When user enter user <user> and Password <password>
    Then user go to the <namePage> page
    Examples:
      | user          | password      | namePage                              |
      | opensourcecms | opensourcecms | Dashboard ‹ opensourcecms — WordPress |


