Feature: login prueba

  @login
  Scenario Outline: inicion sesion satisfactoriamente
    Given ingreso al aplicativo demo
    When ingreso usuario y contraseña
      | user   | password   |
      | <user> | <password> |
    Then valido texto en pantalla <texto>
    Examples:
      | user  | password | texto       |
      | Admin | admin123 | Dashboard   |
