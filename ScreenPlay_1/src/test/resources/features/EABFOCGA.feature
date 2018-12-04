#Author: and-rua@hotmail.com
Feature: FOC and GA for EAB programs

  @eabdi15
  Scenario Outline: Comprobacion de menus dinamicos
    Given I connect with myextra
    And Update the <DTAARA> <LIBRARY> <STAR> <LENGHT> <CHARACTERS>
    When I submit <PROGRAM> <NAME>
    Then Verify the table

    Examples: 
      | DTAARA     | LIBRARY    |STAR | LENGHT | CHARACTERS | PROGRAM   | NAME    |
      | EABDTADI15 | EABLIBRAMD |   1 |      5 |      00000 | EABODIA15 | EABDI15 |

  @eabdi16
  Scenario Outline: Comprobacion de menus dinamicos
    Given I connect with myextra
    And Update the <DTAARA> <LIBRARY> <STAR> <LENGHT> <CHARACTERS>
    When I submit <PROGRAM> <NAME>
    Then Verify the table

    Examples: 
      | DTAARA     | LIBRARY    |STAR | LENGHT | CHARACTERS | PROGRAM   | NAME    |
      | EABDTADI16 | EABLIBRAMD |   1 |      5 |      00000 | EABODIA16 | EABDI16 |

  @eabdi17
  Scenario Outline: Comprobacion de menus dinamicos
    Given I connect with myextra
    And Update the <DTAARA> <LIBRARY> <STAR> <LENGHT> <CHARACTERS>
    When I submit <PROGRAM> <NAME>
    Then Verify the table

    Examples: 
      | DTAARA     | LIBRARY    |STAR | LENGHT | CHARACTERS | PROGRAM   | NAME    |
      | EABDTADI17 | EABLIBRAMD |   1 |      5 |      00000 | EABODIA17 | EABDI17 |

  @eabdi18
  Scenario Outline: Comprobacion de menus dinamicos
    Given I connect with myextra
    And Update the <DTAARA> <LIBRARY> <STAR> <LENGHT> <CHARACTERS>
    When I submit <PROGRAM> <NAME>
    Then Verify the table

    Examples: 
      | DTAARA     | LIBRARY    |STAR | LENGHT | CHARACTERS | PROGRAM   | NAME    |
      | EABDTADI18 | EABLIBRAMD |   1 |      5 |      00000 | EABODIA18 | EABDI18 |

#  @eabdi19
#  Scenario Outline: Comprobacion de menus dinamicos
#    Given I connect with myextra
#    When Make a sql <QUERY> <TYPE> <DB> <TABLE> <WHERE>
#    Then Verify the table
#
#    Examples: 
#      | QUERY  | TYPE | DB         | TABLE     | WHERE |
#      | SELECT | *    | TDCLIBRAMD | RMUFFVISA |       |

  @tvpdi43
  Scenario Outline: Comprobacion consolidado vertical de cuentas
    Given I connect with myextra
    When I submit <PROGRAM> <NAME>
    Then Verify the table

    Examples: 
      | PROGRAM  | NAME    |
      | TVPODI43 | TVPDI43 |

  @tvpchg
  Scenario Outline: Comprobacion consolidado vertical de cuentas
    Given I connect with myextra
    And Update the <DTAARA> <LIBRARY> <STAR> <LENGHT> <CHARACTERS>
    Then Verify the table

    Examples: 
      | DTAARA     | LIBRARY    | STAR | LENGHT | CHARACTERS |
      | TVPDTDI043 | TVPLIBRAMD |    2 |      4 |       1111 |
      
  @asksql
  Scenario: Ask for SQL
    Given I connect with myextra
    When Make a sql
    Then Verify the table
