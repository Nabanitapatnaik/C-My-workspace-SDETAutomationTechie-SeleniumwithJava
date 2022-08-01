package progjavaprac;

public class Variables {
	
	public int x ;
	/*public void m1()
	
	{
		
	    int a =10;
		System.out.println(a);
		
	}*/
	Variables(int x)
	
	{
		this.x = x;
		
		
	}
public void display()

{
	System.out.println(x);
	
}
	public static void main(String[] args) {
Variables var = new Variables(10);
//Variables obj = new Variables();
var.display();
//obj.m1;

 
		
//obj.m1();

	}

}
