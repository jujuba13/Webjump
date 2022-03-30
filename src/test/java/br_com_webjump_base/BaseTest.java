package br_com_webjump_base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br_com_webjump_homePage.HomePage;

public class BaseTest {
		
		private static WebDriver driver;
		
		protected HomePage homePage;
		
		@BeforeAll
		
		public static void inicializar() {
			System.setProperty("webdriver.chrome.driver", "C:\\WEBDRIVERS\\ChromeDriver\\99\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	 
		@BeforeEach
	        public void carregarPaginaInicial() {
			driver.get("https://wj-qa-automation-test.github.io/qa-test/");
			homePage = new HomePage(driver);
			
		}
		@AfterAll
		
		public static void finalizar() {
			//driver.quit();
		}
	}

	
	
	

