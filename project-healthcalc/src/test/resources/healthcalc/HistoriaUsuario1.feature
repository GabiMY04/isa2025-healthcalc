#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template   
@tag
Feature: Calcular peso ideal
  As a cliente I want to  introducir mis datos en el programa so that puedo conocer el resultado

  @tag1
  Scenario Outline: Genero invalido
    Given Tengo una calculadora de salud 
    And Introduzco el genero "<genero>"
    And Introduzco la altura "<altura>"
    When Calcular el peso ideal 
    Then El sistema lanza una excepcion indicando que el genero es incorrecto

        Examples:
      | genero | altura |
      | x      | 160    |
      | 9      | 170    |

  @tag2
  Scenario Outline: Altura invalida 
    Given Tengo una calculadora de salud
    And Introduzco la altura "<altura>"
    And Introduzco el genero "<genero>"
    When Calcular el peso ideal 
    Then El sistema lanza una excepcion indicando que la altura es incorrecta

        Examples:
      | genero | altura |
      | m      | 0      |
      | w      | 300    |

  
  @tag3
  Scenario Outline: Calcular con la altura y el genero validos
    Given Tengo una calculadora de salud
    And Introduzco la altura "<altura>"
    And Introduzco el genero "<genero>"
    When Calcular el peso ideal 
    Then Se muestra el resultado <expected>
    Examples:
      | altura | genero | expected |
      | 150    | m      | 50.0    |
      | 160    | m      | 57.5    |
      | 160    | w      | 56.0    |

  @tag4
  Scenario Outline: Genero vacio
    Given Tengo una calculadora de salud 
    And el genero no tiene valor
    And Introduzco la altura "<altura>"
    When Calcular el peso ideal 
    Then El sistema lanza una excepcion indicando que el genero es obligatorio

        Examples:
      | altura |
      | 160    |
      | 170    |
  
