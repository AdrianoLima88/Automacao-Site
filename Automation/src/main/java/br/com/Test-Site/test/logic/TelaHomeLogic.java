package br.com.santander.test.logic;
import static br.com.santander.test.support.Context.rGen;
import static br.com.santander.test.support.Context.web;
import br.com.santander.core.webdriver.page.PageMaker;
import br.com.santander.test.pages.TelaHomePage;
import br.com.santander.test.sheet.model.HomeData;
import br.com.santander.test.support.Context;

public class TelaHomeLogic {
	private TelaHomePage telaHomePage;
	//private HomeData homeData;

	public TelaHomeLogic() {
		telaHomePage = PageMaker.getInstance(TelaHomePage.class, web().getWebDriver());
		//homeData = (HomeData) Context.testData();
	}

	public void acessarSistema() {
		web().navigateToUrl("http://automationpractice.com/index.php");
		web().elementIsVisible(telaHomePage.getPaginaInicial());
		rGen().registerStep(web().getScreenshot(), "Tela inicial");
	}
	
	public void clicarFacebook() {
		web().scroll(telaHomePage.getLifacebook());
		web().elementIsVisible(telaHomePage.getLifacebook());		
		web().click(telaHomePage.getLifacebook());
		rGen().registerStep(web().getScreenshot(),"Botão facebook");
	}
	
	public Boolean validarTelaFacebook() {
		web().switchToWindow(1);
		web().waitVisibilityOf(telaHomePage.getBtnfacebook());
		rGen().registerStep(web().getScreenshot(),"Tela inicial facebook");
		return web().elementIsVisible(telaHomePage.getBtnfacebook());
	}
	
	
	public void clicarYoutube() {
		web().scroll(telaHomePage.getLiyoutube());;
		web().elementIsVisible(telaHomePage.getLiyoutube());
		web().click(telaHomePage.getLiyoutube());
		rGen().registerStep(web().getScreenshot(),"Botão youtube");
	}
	
	public Boolean validarTelaYoutube()  {
		web().switchToWindow(1);
		rGen().registerStep(web().getScreenshot(),"Tela inicial youtube");
		return web().elementIsVisible(telaHomePage.getBtyoutube());
	}

	public void clicarGoogle() {
		web().scroll(telaHomePage.getLigoogle());;
		web().elementIsVisible(telaHomePage.getLigoogle());
		web().click(telaHomePage.getLigoogle());
		rGen().registerStep(web().getScreenshot(),"Botão google");
	}
	
	public Boolean validarTelaGoogle()  {
		web().switchToWindow(1);
		rGen().registerStep(web().getScreenshot(),"Tela inicial google");
		return web().elementIsVisible(telaHomePage.getBtgoogle());
	}
	
	public void clicarTwitter() {
		web().scroll(telaHomePage.getLitwitter());;
		web().elementIsVisible(telaHomePage.getLitwitter());
		web().click(telaHomePage.getLitwitter());
		rGen().registerStep(web().getScreenshot(),"Botão twitter");
	}
	
	public Boolean validarTelaTwitter()  {
		web().switchToWindow(1);
		rGen().registerStep(web().getScreenshot(),"Tela inicial twitter");
		return web().elementIsVisible(telaHomePage.getBttwitter());
	}
	
	public void validarBotaoPopular() {
		web().scroll(telaHomePage.getBtnPopular());;
		web().elementIsVisible(telaHomePage.getBtnPopular());
		web().click(telaHomePage.getBtnPopular());
	}
	
	public void validarFuncionalidaPopular() {
		web().elementIsVisible(telaHomePage.getLiPopular());
		web().click(telaHomePage.getLiPopular());
		rGen().registerStep(web().getScreenshot(),"Popular");
	}
	
	public void validarBotaoBest()  {
		web().scroll(telaHomePage.getBtBest());;
		web().elementIsVisible(telaHomePage.getBtBest());
		web().click(telaHomePage.getBtBest());
	}
	
	public void validarFuncionalidadeBest() {
		web().elementIsVisible(telaHomePage.getLibestsellers());
		web().click(telaHomePage.getLibestsellers());
		rGen().registerStep(web().getScreenshot(),"Best sellers");
	}
}










