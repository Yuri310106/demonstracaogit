#Author: julioquintiliano@gmail.com

@tag
Feature: Site da Armani
  Como usuario quero acessar o site da Armani para acessar os produtos

  @tag1
  Scenario: Acessar o site
    Given que o usuario entre no site da amarni "https://www.armaniexchange.com.br/"
    When pesquisar o title
    Then valido se o title esta correto
   

  