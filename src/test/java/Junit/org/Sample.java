package Junit.org;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends JunitBase {
	
@Test
public void Run() {
	WebDriverManager.chromedriver().setup();
	
	Result r = JUnitCore.runClasses(JunitTRy.class,Test2.class);
	System.out.println("Run Count-- "+r.getRunCount());
	System.out.println("Failure count -"+r.getFailureCount());
	List<Failure> failures = r.getFailures();
	for (Failure failure : failures) {
		System.out.println(failure);
}
}
}

