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
Feature: calcular tasa metabolica basal
  As a cliente I want to  calcular la tasa metabolica basal
  so that puedo controlar mi salud

  @tag1
  Scenario: Genero invalido
    Given Genero introducido es distinto de M 
    And Genero es distinto de H
    When presiono el boton calcular
    Then El error se muestra por pantalla sobre el genero
  @tag2
  Scenario: Introduzco peso valido
    Given el peso introducir es menor a 300kg 
    And el peso es mayor a 0 kg
    When presiono el boton calcular
    Then Se muestra el resultado de la funcion calcular tasa metabolica por pantalla
  @tag3
  Scenario: Introduzco altura y genero correctamente
    Given Introduzco los datos correctos
    When presiono el boton calcular
    Then Se muestra el resultado de la funcion calcular tasa metabolica por pantalla
@tag4
  Scenario: Genero vacio
    Given el genero no tiene valor
    When presiono el boton calcular
    Then se muestra un error por la pantalla indicando que el genero es obligatorio
@tag5
    Scenario: Edad invalida
    Given edad mayor a 120 años
    When presiono el boton calcular
    Then Se muestra por pantalla un error en la edad introducida
  