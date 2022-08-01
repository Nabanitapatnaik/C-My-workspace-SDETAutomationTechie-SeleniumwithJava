package seleniuminterviewpractice;

import java.util.logging.Logger;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest2 {
	
	@Parameters({"data"})
	@Test(groups="sanity")
	 public void test4(String data)
	 {
		 System.out.println(data);
		 
	 }
	 @Test(groups="regression")
	 public void test5()
	 {
		 System.out.println("Test5");
		
		 
	 }
	 @Test(groups="regression")
	 public void test6()
	 {
		 System.out.println("Test6");
		 
	 }
}
