#Author: mateusefigenio55@gmail.com

@Tag1
Feature: Cadastro de usuario
	Eu como usuario quero efetuar um cadastro 

  @tag1
  Scenario: Cadastro
    Given que eu esteja no site "https://www.advantageonlineshopping.com"
    And entrar na tela de cadastro
    When for preenchidas as informacoes corretamente
    Then eu valido o cadastro

