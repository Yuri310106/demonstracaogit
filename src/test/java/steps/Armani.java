package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosTeste;

public class Armani {

	MetodosTeste metodos = new MetodosTeste();

	@Given("que o usuario entre no site da amarni {string}")
	public void que_o_usuario_entre_no_site_da_amarni(String site) {
		
		metodos.abrirNavegador(site);
		metodos.validarJanela();
		
	}

	@When("pesquisar o title")
	public void pesquisar_o_title() {

	}

	@Then("valido se o title esta correto")
	public void valido_se_o_title_esta_correto() {

	}

}
