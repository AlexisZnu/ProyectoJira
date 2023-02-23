@Test
Feature: Testear la funcionalidad del ingreso a la pagina

  Scenario Outline: Como usuario deseo ingresar a la pagina SwangLabs
    Given Estoy en la pagina de swaglabs
    When Ingreso las credenciales del <username>
    When Ingreso la <password>
    Then Ingreso correctamente a la pagina

    Examples:
    |username     |password    |
    |standard_user|secret_sauce|