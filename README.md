# StartSharp

Este proyecto consiste en la automatización de dos funcionalidades de la aplicación https://serenity.is/demo. 
Estas funcionalidades son: Crear Business Unit y Crear una Meeting con la unidad de negocio previamente creada.
Se automatizó un escenario por funcionalidad. 


## The StartSharp project

Se implementó Serenity, Cucumber y Maven Project (Java). 


### Estructura del directorio del Proyecto
El proyecto está construido basado en el patrón de diseño ScreenPlay.
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
	+ startsharp.navigation
	+ startsharp.runners
	+ startsharp.stepdefinitions
	+ startsharp.task.BusinessUnit
	+ startsharp.task.Login
	+ startsharp.task.Meeting
    + resources	
      + features                  Feature files
	+ businessUnit
	+ meeting

```

Serenity 2.2.13 introduced integration with WebdriverManager to download webdriver binaries.

## Escenarios Planteados
### Crear Business Unit

```Gherkin
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

```
### Crear Meeting
```Gherkin
Feature: Crear reunión en el aplicativo StarSharp
  Background: 
  	Given El usuario esté logueado en la aplicación StarSharp
  	
  	
    Scenario: Crear una nueva reunion, diligenciando todos los campos y 
    asociando una unidad de negocio previamente creada
    Given El usuario haya ingresado a la funcionalidad Meetings
    When el usuario presiona la opción New Meetings
    And diligenciar los siguientes campos:
     	| MeetingName 			| MeetingType | MeetingNumber|StartDate	|EndDate		|Location								|Unit		 |OrganizedByName|OrganizedByLastName	 |Correo|Dominio|
      | Inducción a test	| General			| 1						 |01/11/2021|01/11/2021	|Edif. Santa Maria			|UnitTest|Diana 				 |Avila								 |dianaqa|@gmail.com|    		
    And presiona el botón Save 
    Then la reunión debe agregarse a la tabla de la vista inicial del modulo

```