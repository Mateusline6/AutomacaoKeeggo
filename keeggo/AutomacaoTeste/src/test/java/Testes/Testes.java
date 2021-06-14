package Testes;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testes {

	Metodos m = new Metodos();
	Elementos l = new Elementos();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		m.executarNavegador(site);
	}

	@Given("entrar na tela de cadastro")
	public void entrar_na_tela_de_cadastro() throws IOException, InterruptedException {
		
		m.clicar(l.User);
	
		m.clicar(l.newAccount);

	}

	@When("for preenchidas as informacoes corretamente")
	public void for_preenchidas_as_informacoes_corretamente() throws IOException, InterruptedException {
	
		m.escrever(l.UserName, "Adonai5243");
		m.escrever(l.email, "adonai5243@gmail.com");
		m.escrever(l.password, "M@n1t3$c40*");
		m.escrever(l.confirmPassword, "M@n1t3$c40*");
		m.escrever(l.firstName, "Adonai");
		m.escrever(l.lastName, "Santos");
		m.escrever(l.phone, "11971462646");
		m.escrever(l.country, "Brazil");
		m.escrever(l.city, "São Paulo");
		m.escrever(l.address, "rua tom jobim 55");
		m.escrever(l.state, "SP");
		m.escrever(l.postal, "06502065");
		m.clicar(l.agree);
		m.clicar(l.btnRegister);
		m.tempo(6);
		m.screenShot("cadastro");
	}

	@Then("eu valido o cadastro")
	public void eu_valido_o_cadastro() throws IOException {
		m.validar("dvantage", l.adv);
		m.screenShot("validado");
		m.fechar();
	}

}
