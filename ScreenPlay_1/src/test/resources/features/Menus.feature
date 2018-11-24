#Author: your.email@your.domain.com
@tag
Feature: Menus dinamicos

  @tag1
  Scenario Outline: Comprobacion de menus dinamicos
    Given que me autentico con usuario CJOANJIME y contraseña JORGE1989
    And introduce a library MATLIBRP
    When I search the menu <APLICATIVO> <OPTIONS1> <OPTIONS2>
    Then Verifico identidad

    Examples: 
      | APLICATIVO  | OPTIONS1 | OPTIONS2 | #OPTIONS3 |
      | MATOTOVPLS  |        1 |        2 | #F1       |
      | MATOTGNPLA  |        1 |        3 | #F6       |
      | MATOTOVCRV  |        1 |        4 | #         |
      | MATOGRUPO   |        3 |        4 | #F6       |
      | MATOBLQTR   |        5 |        5 | #         |
      | MATOMNPRM1  |        5 |        6 | #         |
      | MATOPARAM   |        5 |        7 | #1        |
      | MATONROTJ   |        5 |        8 | #F6       |
      | MATOPARGR   |        5 |        9 | #ROLLUP   |

