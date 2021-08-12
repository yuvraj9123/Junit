

package Junit.org;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitBase  {
	public static WebDriver driver;
	public static Select sc; 
	public static  void BrowserLaunch() {
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.manage().window().maximize();
	}
	public static void getUrl(String url) {
		driver.get(url);

	}
	public static void send(WebElement e,String value) {
    e.sendKeys(value);
	}
	public static void btnclk(WebElement e) {
e.click();
	}
	public static  void Selectclass(WebElement selectref) {
 sc = new Select(selectref);
	}
	
	public static void selectbyvisibletxt(String visible) {
sc.selectByVisibleText(visible);
}
	public static void selectbyindex(int ind) {
sc.selectByIndex(ind);
	}
	public static void selectbyvalue(String valuee) {
sc.selectByValue(valuee);
	}
	public static void winclose() {
driver.close();
	}
	public static void date( Date d ) {
Date D = new Date();
System.out.println(D);
	}
	
}
