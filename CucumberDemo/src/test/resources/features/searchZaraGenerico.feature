@tag
Feature: Buscar en Zara
  uso este template para buscar ropa

  @tag1
  Scenario Outline: Buscamos Blusas y Pantalones
    Given el usuario esta en la pagina de inicio
    When el usuario ingresa <article> en la caja de busqueda
		Then MUJER aparece
		
  Examples: 
      | article |
      | blusa   | 
      | pantalon|