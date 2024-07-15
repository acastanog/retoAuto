Feature: candidato

  @registroEmpleado
  Scenario Outline: Registro nuevo candidato
    Given ingreso al aplicativo demo
    When ingreso usuario y contraseña
      | user   | password   |
      | <user> | <password> |
    Then registro candidato
      | firstName   | middleName   | lastName   | email   |
      | <firstName> | <middleName> | <lastName> | <email> |
    And validar candidato registrado "<text>" y "<name>"
    Examples:
      | user  | password | firstName | middleName | lastName | email            | text              | name                |
      | Admin | admin123 | Alexander | M          | Gallego  | prueba@gmail.com | Application Stage | Alexander M Gallego |