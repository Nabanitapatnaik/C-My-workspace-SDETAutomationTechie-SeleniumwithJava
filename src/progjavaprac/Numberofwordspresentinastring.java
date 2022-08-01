package progjavaprac;

public class Numberofwordspresentinastring {

	public static void main(String[] args) {

//String s = "My Name is Khan";
/*//CharSequence words = s; 
String[] words = s.split("");
int size = words.length;
System.out.println(size);*/
	
String arr[] = new String[4]	;	
	arr[0] = "My"	;
	arr[1] = "name"	;
	arr[2] = "is"	;
	arr[3] = "Anita"	;
int size = 	arr.length;
String Name  =arr[0]+arr[1]+arr[2]+arr[3];
	System.out.println(size);
	System.out.println(Name);
	}

}
