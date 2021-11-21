package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosTeste {

	WebDriver driver;

	public void abrirNavegador(String site) {

		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.err.println("---------erro ao abrir o navegador-------" + e.getMessage());
			System.err.println("-------causa do erro --------" + e.getCause());
		}

	}

	public void validarJanela() {
		try {
			int contador = 3;
			WebElement elemento = driver.findElement(By.xpath("//*[@class='hide wrap-modal center jn-promo-modal']/a"));
			while (elemento.isDisplayed() && contador > 0) {
				elemento.click();
				contador--;
			}
		} catch (Exception e) {
			System.err.println("---------erro ao fechar janela-------" + e.getMessage());
			System.err.println("-------causa do erro--------" + e.getCause());

		}
	}

}
