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
Feature: Title of your feature
  I want to use this template for my feature file

  check more outcomes

  @tag2
  Scenario: Title of your scenario outline
  	Given abrir el navegador
  	Then Iniciar sesion con usuario y contrasena 
  	 When Actualizar información del cliente

      
  @tag3
  Scenario: Title of your scenario
  
 		Given abrir el navegador
  	Then Iniciar sesion con usuario y contrasena 
  	When realizar compra sin cupon
  
   @tag4
  Scenario: Title of your scenario
  
 		Given abrir el navegador
  	Then Iniciar sesion con usuario y contrasena 
  	When realizar compra con cupon
  
  
  