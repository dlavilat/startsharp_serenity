#Author: diluavila@gmail.com


Feature: Crear unidad de negocio en el aplicativo StarSharp
  Background: 
  	Given El usuario este logueado en la aplicacion StarSharp
  	
  
  Scenario Outline: Crear una nueva unidad de negocio sin unidad padre
    Given El usuario haya ingresado a la funcionalidad Business Units 
    When el usuario presiona la opcion New Bussiness Unit
    And diligencia el campo <nameUnit> 
    And presiona el boton Save 
    Then la unidad debe agregarse a la tabla 


    Examples: 
      | nameUnit |
      | UnitTest|    
