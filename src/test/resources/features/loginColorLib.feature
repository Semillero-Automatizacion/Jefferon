#Author: Jefferson Beltran
#Feature para el inivio de sesion aplicacion Colorlib
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
Feature: Inicio sesion ColorLib

  @tag1
  Scenario: Inicio de sesion ColorLib
    Given Ingreso al navegador
    When Ingresar usuario "demo"
    And Ingresar contraseña "demo"
    And Click en boton ingresar
    Then Se valida el ingreso correcto

 