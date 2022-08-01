package seleniuminterviewpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTestDP {
@DataProvider(name="dp")
public Object[][] dp1()

{
	Object[][] value = {{"Aadi", 6},{"Tripti", 8},{"Rex", 50}};
	return value;
}
@Test(dataProvider = "dp")
public void m1(String name, int age)
{
	System.out.println(name);
	System.out.println(age);
	
}


}
