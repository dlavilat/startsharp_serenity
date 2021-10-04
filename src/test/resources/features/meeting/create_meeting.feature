#Author: diluavila@gmail.com

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

   