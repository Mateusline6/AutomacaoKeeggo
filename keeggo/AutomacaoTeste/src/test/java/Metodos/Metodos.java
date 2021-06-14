package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	WebDriver driver;

	public void executarNavegador(String site) {

		try {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Executando");
		} catch (Exception e) {
			
			System.out.println("Erro ao abrir navegador " + e);

		}

	}

	public void escrever(By elemento, String txt) throws IOException {
		try {

			driver.findElement(elemento).sendKeys(txt);

		} catch (Exception e) {
			
			System.out.println("erro ao digitar " + e);
			screenShot("erro - evidencia1");
		}

	}

	public void clicar(By elemento) throws IOException {

		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			
			System.out.println("erro ao clicar " + e);
			screenShot("erro - evidencia2");
		}

	}

	public void screenShot(String nomeSrc) throws IOException {

		try {

			TakesScreenshot srcShot = ((TakesScreenshot) driver);
			File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nomeSrc + ".png");
			FileUtils.copyFile(srcFile, destFile);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("erro ao tirar print " + e);

		}

	}

	public void tempo(int tempo) throws InterruptedException, IOException {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			
			System.out.println("erro no sleep " + e);
			screenShot("erro - evidencias4");
		}
	}

	public void validar(String texto, By elemento) throws IOException {
		try {
			String txtTela = driver.findElement(elemento).getText();
			assertEquals(texto, txtTela);
		} catch (Exception e) {
			
			System.out.println("erro no sleep " + e);
			screenShot("erro - evidencias5");
		}
	}

	
	public void esperarElemento(By elemento) throws IOException {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		}catch (Exception e) {
			System.out.println("erro no sleep " + e);
			screenShot("erro - evidencias6");
		}
		
	}
	
	public void fechar() {
		try {
		
		driver.quit();
		}catch (Exception e) {
			System.out.println(" -----------------ERRO--------------"+ e);
		}
	}
	
}
