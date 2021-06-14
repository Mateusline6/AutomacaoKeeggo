package Testes;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testeLogin {

	Metodos m = new Metodos();
	Elementos l = new Elementos();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
		m.executarNavegador(site);
	}

	@When("for preenchidas as informacoes")
	public void for_preenchidas_as_informacoes() throws IOException {
		m.clicar(l.User);
		m.escrever(l.usernome, "Adonai5243");
		m.escrever(l.senha, "M@n1t3$c40*");
		m.clicar(l.login);
		;
	}

	@Then("eu valido o login")
	public void eu_valido_o_login() throws IOException {
		m.validar("dvantage", l.adv);
		m.screenShot("validadoLogin");
		m.fechar();
	}

}
