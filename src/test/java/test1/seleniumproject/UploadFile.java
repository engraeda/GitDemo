package test1.seleniumproject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.findElement(By.cssSelector("[class*='uploader__btn tooltip--left active']")).click();
		Runtime.getRuntime().exec("C:\\Users\\r.alsaudi\\Documents\\fileupload.exe");

	}

}
