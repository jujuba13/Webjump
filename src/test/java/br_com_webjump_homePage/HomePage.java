package br_com_webjump_homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	private static WebDriver driver;

	private By botaoOne = By.cssSelector("#panel_body_one #btn_one");
	private By botaoTwo = By.cssSelector("#panel_body_one #btn_two");
	private By botaoFour = By.cssSelector("#panel_body_one #btn_link");
	private By primeiroFrameTest = By.xpath("//*[@id='iframe_panel_body']/iframe");
	private By botaoOneIframe = By.id("btn_one");
	private By botaotwoIframe = By.id("btn_two");
	private By botaofourIframe = By.id("btn_link");
	private By segundoFrame = By.xpath("//*[@id='iframe_panel_body_two']/iframe");
	private By yourFirsName = By.xpath("//input[@id='first_name']");
	private By seletor = By.id("select_box");
	private By optThree = By.xpath("/html[1]/body[1]/div[1]/div[3]/label[1]/input[1]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void botaoOneButton() {
		driver.findElement(botaoOne).click();

	}

	public void botaoTwoButton() {
		driver.findElement(botaoTwo).click();
	}

	public void botaoFourButton() {
		driver.findElement(botaoFour).click();

	}

	public void Exempletwo() {
		WebElement element = driver.findElement(seletor);
		Select combo = new Select(element);
		combo.selectByVisibleText("ExampleTwo");
	}

	public void Option() {

		driver.findElement(optThree).click();

	}

	public void SegundoFrame() {
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(segundoFrame));

	}

	public void digitePrimeiroNome(String texto) {

		driver.findElement(yourFirsName).sendKeys(Keys.chord(texto));

	}

	public void selecionarTest() {
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(primeiroFrameTest));

	}

	public void clicarOne() {
		driver.findElement(botaoOneIframe).click();

	}

	public void clicarTwo() {
		driver.findElement(botaotwoIframe).click();

	}

	public void clicarFour() {

		driver.findElement(botaofourIframe).click();
	}

}
