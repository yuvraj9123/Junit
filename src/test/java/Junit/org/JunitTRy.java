package Junit.org;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.annotations.Beta;

import junit.framework.Assert;

public class JunitTRy extends JunitBase {
	@BeforeClass
	public static void tst1() {
	BrowserLaunch();
	getUrl("https://en-gb.facebook.com/");
	}
	@Before
	public void tst2() {
Date d = new Date();
System.out.println("start time -- "+d);
	}
	@Test
	public void tst3() {
WebElement user = driver.findElement(By.name("email"));
send(user, "Yuvaraj123");
WebElement pass = driver.findElement(By.name("pass"));
send(pass, "1234567899");
}
    @Test
    public void BtnCLk() {
    	WebElement log = driver.findElement(By.name("login"));
    	Assert.assertTrue(log.isEnabled());
        btnclk(log);}
    @Test
    public void tst4() {
    	Date d = new Date();
    	System.out.println("End time --"+d);
	}
        @AfterClass
        public static  void clos() {
winclose();		
	}

}
