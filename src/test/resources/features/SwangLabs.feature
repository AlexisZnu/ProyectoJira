@Test
Feature: Testear la funcionalidad del ingreso a la pagina

  Rule Probar todas las opciones para acceder a la pagina

  Background:
    Given Estoy en la pagina de swaglabs

@Valid
  Scenario Outline: Como usuario deseo ingresar a la pagina SwangLabs
    When Ingreso las credenciales del usuario <user> y password <password>
    And Accedo a la pagina mediante el login
    Then Ingreso correctamente a la pagina
  Examples:
  |user         |password    |
  |standard_user|secret_sauce|

 @InvalidTest
 Scenario Outline: Como Tester quiero probar user y password incorrectas
   When Ingreso incorrectamente las opciones de <username>
   And Coloco la <password>
   Then valido si pude acceder a la pagina

   Examples:
   |username   |password   |
   |standaruser|secretsauce|
   |lockeasd   |asdasda    |
   |problemuser|secreasdasd|
   |performance|           |

   @Options
   Scenario Outline: Como Tester quiero probar todas las opciones correctas para acceder a la pagina
     When Escribo la opcion de <username>
     And Escribo unicamente <password>
     Then verifico si logré ingresar a la pagina

     Examples:
     |username|password|
     |standard_user          |secret_sauce|
     |locked_out_user        |secret_sauce|
     |problem_user           |secret_sauce|
     |performance_glitch_user|secret_sauce|