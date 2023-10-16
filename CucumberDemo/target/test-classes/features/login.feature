@tag
Feature: test de login
  Quiero testear el login de usuario

  @tag1
  Scenario: Test Exitoso con credenciales validas de usu/passw
    Given el usuario esta logueado
    When el usuario ingresa su nombre y password
    And el usuario hizo click
    Then el usuario fue a la home page
