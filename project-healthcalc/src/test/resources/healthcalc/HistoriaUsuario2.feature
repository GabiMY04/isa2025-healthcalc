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
Feature:Calculo tasa metabolica basal
  As a cliente I want to  calcular la tasa metabolica basal
  so that puedo controlar mi salud

  @tag1
  Scenario Outline: Edad invalida
    Given Tengo una calculadora de salud
    And Edad introducida es "<edad>"
    And Introduzco la altura "<altura>"
    And Introduzco el peso "<peso>"
    And Introduzco el genero "<genero>"
    When Calcular TasaMetabolica
    Then El sistema lanza una excepcion indicando que la edad es incorrecto

    Examples:
      | genero | altura | peso | edad |
      | m      | 160    | 120  | 900   |
      | w      | 170    | 70   | 0   |

  @tag2
  Scenario Outline: Introduzco peso invalido
    Given Tengo una calculadora de salud
    And Introduzco el peso "<peso>"
    And Introduzco el genero "<genero>"
    And Introduzco la altura "<altura>"
    And Edad introducida es "<edad>"
    When Calcular TasaMetabolica
    Then El sistema lanza una excepcion indicando que el peso es incorrecto
    Examples:
      | genero | altura | peso | edad |
      | m      | 160    | 700  | 25   |
      | w      | 170    | 800  | 30   |
  @tag3
  Scenario Outline: Calcular con el genero, altura, peso y edad validos 
    Given Tengo una calculadora de salud
    And Introduzco el genero "<genero>"
    And Introduzco la altura "<altura>"
    And Introduzco el peso "<peso>"
    And Edad introducida es "<edad>"
    When Calcular TasaMetabolica
    Then Se muestra el resultado <expected>
    Examples:
      | genero | altura | peso | edad | expected |
      | m      | 160    | 120  | 25   | 2321.916748046875  |
      | w      | 170    | 70   | 30   | 1491.6429443359375  |
      | m      | 160    | 52   | 25   | 1410.9208984375  |
      | w      | 170    | 80   | 30   | 1584.113037109375  |
   
@tag4
  Scenario Outline: Edad vacio
    Given Tengo una calculadora de salud
    And la edad no tiene valor
    And Introduzco el peso "<peso>"
    And Introduzco la altura "<altura>"
    And Introduzco el genero "<genero>"
    When Calcular TasaMetabolica
    Then se muestra un error por la pantalla indicando que la edad es obligatorio
    Examples:
      | genero | altura | peso |
      | m      | 160    | 120  |
      | w      | 170    | 70   |

  