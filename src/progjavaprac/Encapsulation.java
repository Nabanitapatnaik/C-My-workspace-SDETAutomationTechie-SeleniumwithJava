package progjavaprac;





public class Encapsulation {
	
	
private String name;
		
	
public String getName()

{
	return name;
	
}

public void setName(String name)

{
	this.name = name;
	System.out.println(name);
	
}
	public static void main(String[] args) {
		
		Encapsulation en  =new Encapsulation();
	
		en.setName("Radha");
		

	}

}
