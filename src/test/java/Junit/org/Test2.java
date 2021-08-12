package Junit.org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Test2 {
@BeforeClass
public static void trial() {
System.out.println("start of trial ");
}
	@Test
	public void tst4() {
System.out.println("1315");
	}
	@Test
	public void tst5() {
System.out.println("yuvadh");
	}
	@Test
	public void tst6() {
System.out.println("yuvarajjjj");
	}
	@Test
	public void fail() {
System.out.println(1/0);
	}
	@Ignore
	@Test
	public void fail2() {
System.out.println(225/0);
	}
	@AfterClass
	public static void trail1() {
System.out.println("end of trail");
	}
}
