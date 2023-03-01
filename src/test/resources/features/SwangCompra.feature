@Compra
Feature: Testear la compra de un producto

  Scenario Outline: Como usuario deseo comprarme un producto en la pagina Swang Labs
    Given El usuario navega a la pagina de Swang Labs
    When  El usuario ingresa las credenciales del User "standard_user" y contrasenia "secret_sauce"
    And El usuario clickea login
    And El usuario agrega un producto al carrito
    And El usuario realiza el checkout
    And El usuario agrega sus <credenciales1> <credenciales2> <credenciales3> para realizar la compra
    Then El usuario verifica si pudo realizar la compra

    Examples:
    |credenciales1|credenciales2|credenciales3|
    |asdasdasdasd |asdasdasdasd |asdasdasdasd |
