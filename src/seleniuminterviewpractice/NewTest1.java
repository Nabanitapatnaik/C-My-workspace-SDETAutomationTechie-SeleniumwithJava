package seleniuminterviewpractice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest1 {
@BeforeMethod	
 public void setup()
 {
	 System.out.println("Setup is done");
 }
 @Test(groups="sanity")
 public void test1()
 {
	 System.out.println("Test1");
	 
 }
 @Test(groups="regression")
 public void test2()
 {
	 System.out.println("Test2");
	
	 
 }
 @Test()
 public void test3()
 {
	 System.out.println("Test3");
	 
 }
 @AfterMethod	
 public void teardown()
 {
	 System.out.println("Close");
 }
 
 
 
 }
  

