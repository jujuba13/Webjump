package br_com_webjump_homePageTeste;

import org.junit.jupiter.api.Test;

import br_com_webjump_base.BaseTest;
import br_com_webjump_homePage.HomePage;

public class HomePageTeste extends BaseTest {

	@Test

	public void testValidacaoBotao_preenchimento() throws InterruptedException {
		
		
		homePage.botaoOneButton();
		homePage.botaoTwoButton();
		homePage.botaoFourButton();

		homePage.selecionarTest();
		homePage.clicarOne();
		homePage.clicarTwo();
		homePage.clicarFour();

		homePage.SegundoFrame();
		homePage.digitePrimeiroNome("Juliana");
		homePage.selecionarTest();
		homePage.Option();
		homePage.Exempletwo();

	}

}
