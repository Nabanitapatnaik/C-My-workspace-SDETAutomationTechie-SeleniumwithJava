package progjavaprac;

public class Inheritance {
	
	public void m1(int a, int b)
	
	{
		int c=a+b;
		System.out.println(c);
		
	}

public static class A extends Inheritance
	{
		public void m2(int x, int y)
		
		{
			int z=x*y;
			System.out.println(z);
			
		}
		
	
	}
		
	
	
	public static void main(String[] args) {
	A obj = new A();
obj.m1(10, 20);
obj.m2(11, 12);	

		
		
		
		
	}

}
