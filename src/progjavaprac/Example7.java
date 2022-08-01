package progjavaprac;

public class Example7 {

	public static void main(String[] args) {
		int a[][] = new int [2][2];
		a[0][0] = 20;
		a[0][1] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		
		//System.out.println(a[1][0]);
		
		
		for(int[] i:a)
		{
			for( int j:i)
			{
				
				System.out.println(j);
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
