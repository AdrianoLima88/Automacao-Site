package br.com.santander.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.santander.core.webdriver.page.PageMaker;
import lombok.Getter;

@Getter
public class TelaHomePage implements PageMaker {
	
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	private WebElement paginaInicial;
	
	@FindBy(xpath = "//*[@id=\"social_block\"]/ul/li[1]/a")
	private WebElement lifacebook;
	
	@FindBy(xpath = "//div[@role='button' and text()='Selenium Framework']")
	private WebElement btnfacebook;
	
	@FindBy(xpath = "//a[@href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
	private WebElement liyoutube;
	
	@FindBy(xpath = "//yt-icon[@id='logo-icon']")
	private WebElement btyoutube;

	@FindBy(xpath = "//a[@href='https://plus.google.com/111979135243110831526/posts']")
	private WebElement ligoogle;
	
	@FindBy(xpath = "//h1[@class='ahT6S ']")
	private WebElement btgoogle;
	
	@FindBy(xpath = "//a[@href='https://twitter.com/seleniumfrmwrk']")
	private WebElement litwitter;
	
	@FindBy(xpath = "//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0']")
	private WebElement bttwitter;
	
    @FindBy(xpath = "//a[@class='homefeatured']")
    private WebElement btnPopular;
    
    @FindBy(xpath = "//li[@class='active']/a[text()='Popular']")
    private WebElement liPopular;

    @FindBy(xpath = "//a[@class='blockbestsellers']")
	private WebElement btBest;
    
    @FindBy(xpath = "//li[@class='active']/a[text()='Best Sellers']")
    private WebElement libestsellers;
}
