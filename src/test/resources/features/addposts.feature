Feature: add new posts

  Background: user is loged on page
    Given user is on the login page
    When user enter user opensourcecms and Password opensourcecms

  Scenario Outline: User can add posts

    Given user can Add new posts
    When user enter all fields
      | title   | blockParagraph   | visibility   | day   | month   | year   | hour   | minutes   | typeTime   | postFormat   | format   | category   | tag   | except   |
      | <title> | <blockParagraph> | <visibility> | <day> | <month> | <year> | <hour> | <minutes> | <typeTime> | <postFormat> | <format> | <category> | <tag> | <except> |
    Then user registers new post <title>
    Examples:
      | title             | blockParagraph     | visibility | day | month    | year | hour | minutes | typeTime | postFormat | format                       | category | tag  | except                      |
      | prueba nuevo post | esto es una prueba | Private    | 27  | November | 2020 | 10   | 30      | PM       | Aside      | Stick to the top of the blog | pruebas  | test | esto es una prueba de posts |