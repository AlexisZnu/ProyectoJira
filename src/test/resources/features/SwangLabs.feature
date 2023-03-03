@Test
Feature: Testear la funcionalidad del ingreso a la pagina

  Rule Probar todas las opciones para acceder a la pagina

  Background:
    Given Estoy en la pagina de swaglabs

    @HappyPass
  Scenario Outline: Como usuario deseo ingresar a la pagina SwangLabs
    When Ingreso las credenciales del usuario <user> y password <password>
    And Accedo a la pagina mediante el login
    Then Ingreso correctamente a la pagina
  Examples:
  |user         |password    |
  |standard_user|secret_sauce|

     @UserInvalido
  Scenario Outline:  Login con usuario invalido
    When El usuario ingresa incorrectamente el <usuario> y correcta <contrasenia>
    And El usuario clickea el boton login
    Then Valido el resultado de la pagina

  Examples:
  |usuario|contrasenia |
  |asdasda|secret_sauce|

    @PassInvalido
  Scenario Outline:  Login con contraseña invalido
    When El usuario ingresa correctamente el <usuario> e incorrecta <contrasenia>
    And El usuario hace click el boton login
    Then Valido el resultado del ingreso a la pagina

    Examples:
      |usuario      |contrasenia|
      |standard_user|asasdasdasd|

    @SinUser
  Scenario Outline:  Login sin ingresar usuario
    When El usuario ingresa <contrasenia> correcta deja vacio el espacio del usuario
    And El usuario da un click al boton login
    Then Valido la respuesta de la pagina

    Examples:
      |contrasenia |
      |secret_sauce|

    @SinPass
  Scenario Outline:  Login sin ingresar contraseña
    When El usuario ingresa correctamente el <usuario> y dedja vacio el espacio de contrasenia
    And El usuario accede a presionar el boton login
    Then Valido si pude acceder a la pagina sin contrasenia

    Examples:
      |usuario|
      |asdasda|

@UserLocked
  Scenario Outline:  Login con usuario lockeado
    When El usuario ingresa el <usuario> bloqueado y <contrasenia> correcta
    And El usuario vuelve a clickear el boton login
    Then Valido la respuesta del usuario bloqueado

    Examples:
      |usuario        |contrasenia |
      |locked_out_user|secret_sauce|

 @UserEspeciales
 Scenario Outline: Login de usuario con caracteres especiales
   When El usuario ingresa en el <usuario> caracteres especiales y una <contrasenia> correcta
   And El intenta ingresar clickeando el boton login
   Then valido la respuesta recibida de la aplicacion

   Examples:
   |usuario     |contrasenia |
   |asdasd123124|secret_sauce|

   @PassEspeciales
  Scenario Outline: Login de password con caracteres especiales
    When El usuario ingresa el <usuario> valido y la <contrasenia> con caracteres especiales
    And El usuario clickea el boton login de la aplicacion
    Then valido la respuesta recibida de la aplicacion por la contrasenia escrita

    Examples:
      |usuario      |contrasenia |
      |standard_user|asdasd123124|

    @UserElevado
  Scenario Outline: Login ingresando  el usuario una cantidad elevada de caracteres
    When El usuario ingresa el <usuario> con una cantidad elevada de caracteres y <contrasenia> valida
    And El usuario clickea el boton login despues de colocar elevados caracteres en el usuario
    Then valido la respuesta recibida del programa

    Examples:
      | usuario                                  |contrasenia |
      |mfglmdlkfmgkldmfklgmdlmfglmdflkmgldfklgdf |secret_sauce|

    @PassElevado
  Scenario Outline: Login ingresando un password con una cantidad elevada de caracteres
    When El usuario ingresa el <usuario> valido y <contrasenia> con una cantidad elevada de caracteres
    And El usuario clickea el boton login despues de colocar elevados caracteres en la contrasenia
    Then valido la respuesta recibida del programa despues de colocar esa contrasenia

    Examples:
      |usuario      |contrasenia                              |
      |standard_user|mfglmdlkfmgkldmfklgmdlmfglmdflkmgldfklgdf|

   @OptionsValidas
   Scenario Outline: Como Tester quiero probar todas las opciones correctas para acceder a la pagina
     When El usario ingresa todos los <username> validos en el campo de texto y la <contrasenia>
     And El usuario clickea el boton login luego de colocar las credenciales validas
     Then verifico si logre ingresar a la pagina luego de colocar todas las opciones

     Examples:
     |username               |contrasenia |
     |standard_user          |secret_sauce|
     |problem_user           |secret_sauce|
     |performance_glitch_user|secret_sauce|
