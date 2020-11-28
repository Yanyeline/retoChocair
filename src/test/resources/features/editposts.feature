Feature: edit posts

  Background: user is loged on page
    Given user is on the login page
    When user enter user opensourcecms and Password opensourcecms

  Scenario Outline: User can edit posts quickly

    Given user can edit posts quickly
    When user enters all fields to update quickly
      | title   | slug   | day   | month   | year   | hour   | minutes   | password   | tag   | status   |
      | <title> | <slug> | <day> | <month> | <year> | <hour> | <minutes> | <password> | <tag> | <status> |
    Then user updates post <title> quickly
    Examples:
      | title                 | slug                                 | day | month  | year | hour | minutes | password | tag            | status         |
      | prueba edicion rapida | esto es una prueba de edicion rapida | 27  | 11-Nov | 2020 | 10   | 30      | 123      | edicion rapida | Pending Review |


  Scenario Outline: User can edit posts

    Given user can edit posts
    When user enter all fields to update
      | title   | blockParagraph   | visibility   | day   | month   | year   | hour   | minutes   | typeTime   | postFormat   | format   | category   | tag   | except   |
      | <title> | <blockParagraph> | <visibility> | <day> | <month> | <year> | <hour> | <minutes> | <typeTime> | <postFormat> | <format> | <category> | <tag> | <except> |
    Then user modifies post <title>
    Examples:
      | title              | blockParagraph                      | visibility        | day | month    | year | hour | minutes | typeTime | postFormat | format                       | category | tag  | except                                 |
      | prueba editar post | esto es una prueba para editar post | Pasword Protected | 27  | November | 2020 | 10   | 30      | PM       | Aside      | Stick to the top of the blog | pruebas  | test | esto es una prueba de edicion de posts |