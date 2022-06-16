package br.com.santander.test.steps;

import static br.com.santander.test.support.Context.rGen;
import static br.com.santander.test.support.Context.web;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import br.com.santander.test.logic.TelaHomeLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TelaHomeSteps {
	private TelaHomeLogic telaHomeLogic;

	public TelaHomeSteps() {
		telaHomeLogic = new TelaHomeLogic();
	}

	@Given("que esteja na pagina inicial home")
	public void que_esteja_na_pagina_inicial_home() {
		telaHomeLogic.acessarSistema();
	}
	
	@When("clicar no icone facebook")
	public void clicar_no_icone_facebook() {
		telaHomeLogic.clicarFacebook();
	}

	@Then("redirecionar para o facebook")
	public void redirecionar_para_o_facebook() {
		assertTrue(telaHomeLogic.validarTelaFacebook());
	}

	@When("clicar no icone Youtube")
	public void clicar_no_icone_Youtube() {
		telaHomeLogic.clicarYoutube();
	}

	@Then("redirecionar para o Youtube")
	public void redirecionar_para_o_Youtube() {
		assertTrue(telaHomeLogic.validarTelaYoutube());
	}

	@When("clicar no icone google")
	public void clicar_no_icone_google() {
		telaHomeLogic.clicarGoogle();
	}

	@Then("redirecionar para o google")
	public void redirecionar_para_o_google() {
		assertTrue(telaHomeLogic.validarTelaGoogle());
	}

	@When("clicar no icone Twitter")
	public void clicar_no_icone_Twitter() {
		telaHomeLogic.clicarTwitter();
	}

	@Then("redirecionar para o Twitter")
	public void redirecionar_para_o_Twitter() {
		assertTrue(telaHomeLogic.validarTelaTwitter());
	}

	@When("clicar no botao popular")
	public void clicar_no_botao_popular() {
		telaHomeLogic.validarBotaoPopular();
	}

	@Then("verificar se o filtro dos produtos popular foi alterado")
	public void verificar_se_o_filtro_dos_produtos_popular_foi_alterado() {
		telaHomeLogic.validarFuncionalidaPopular();
	}

	@When("clicar no botao best sellers")
	public void clicar_no_botao_best_sellers() {
		telaHomeLogic.validarBotaoBest();
	}

	@Then("verificar se o filtro dos produtos best foi alterado")
	public void verificar_se_o_filtro_dos_produtos_best_foi_alterado() {
		telaHomeLogic.validarFuncionalidadeBest();
	}

}
