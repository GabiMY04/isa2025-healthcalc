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
Feature: Calculo del peso ideal
  As a cliente I want to  introducir mis datos en el programa
  so that puedo conocer mi peso ideal

  @tag1
  Scenario: Genero invalido
    Given el genero introducido es distinto de M 
    And el genero es distinto de H
    When presiono el boton calcular
    Then El error se muestra por pantalla que el genero es invalido
  @tag2
  Scenario: Altura invalida
    Given La altura introducida es mayor a 3 metros
    When presiono el boton calcular
    Then Se muestra por pantalla un error de altura incorrecta
  @tag3
  Scenario: Datos validos
    Given Introduzco los datos correctos
    When presiono el boton calcular
    Then Se muestra el resultado de la funcion peso ideal por pantalla

  @tag4
  Scenario: Genero vacio
    Given el genero no tiene valor
    When presiono el boton calcular
    Then se muestra un error por la pantalla indicando que el genero es obligatorio
      
