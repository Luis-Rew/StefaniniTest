package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.internal.com.google.common.io.Files;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String appUrl, String descricaoPasso) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();

	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void screenShoot(String printName) throws IOException {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File("./evidencias/" + printName + ".png");
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	public void validarMensagem(String textoEsperado, By element) {
		String texto = driver.findElement(element).getText();
		assertEquals(textoEsperado, texto);
	}

	public void rolarPagina() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,250)", "");
	}
}
