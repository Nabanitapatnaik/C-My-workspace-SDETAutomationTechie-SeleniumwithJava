
public class StringMethods {

	public static void main(String[] args) {
		String S = "Hello World";
		CharSequence word = S;
		System.out.println(word.length());
		String T = "Happy";
	String all = 	S+T;
	System.out.println(all);
	if(all.contains(T))
	{
		
		System.out.println("True");
		
	}
	else
		
	{
		System.out.println("False");
		
	}

	String Replace = S.replace("Hello", "Hi");
	System.out.println(Replace);
	System.out.println(S.substring(1, 3));
	
	
	
	
	
	
	
	
	
	}

}
