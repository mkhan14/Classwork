package introduction;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5.0/2);
		System.out.println((double) 5/2);
		System.out.println(5/2);
		System.out.println(3+5.0/2+5*2);
		System.out.println((int)(3.0 + 5)/(2 + 5 * 2));
		if(42 == 42.0) System.out.println("42 equals 42.0");
		//more info takes precedence over less info
		

		double d1 = 4.64; 
		double d2 = 2.0;
		double d3 = 2.64;

		System.out.println("d1 : " + d1); 
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3);  
		System.out.println("d1 - d2 : " + (d1 - d2));
		

		//String s = 1;
		//System.out.println(s); 
		//does not compile
		
		//String s = (String)1;
		//System.out.println(s); 
		//does not compile
		
		//String s = "1";
		//System.out.println(s);
		
		//String s = ""+1;
		//System.out.println(s); 
		
		//String s = "Happy "+18+"th birthday!";
		//System.out.println(s);
		
		//String s = "Happy 18th birthday!";
		//System.out.println(s);
		
		//String s = "Happy "+54/3+"th birthday!";
		//System.out.println(s);
		
		//String s = "Happy "+(54/3)+"th birthday!";
		//System.out.println(s);
		
		//int m = 22;
		//int n = 7;
		//System.out.println("m/n is "+(m/n));
		
		//int m = 22;
		//int n = 7;
		//System.out.println("m/n is "+((double)m/n));
		
		//int/int is int
		//diuble/ubt is double
		//hw due 9/20/16 is: do Lesson 0.3, no writing necessary
		
		//.1+.2 = .3000000000000000004
		//-128 to 127 bytes
		//primitive type is not a class
		//violates encapsulation
		//cant go up the chain
		
		String ten = "10";
		String two = "2";
		if(ten.compareTo(two)>0) System.out.println("10 is greater than two");
		else System.out.println("10 is not greater than two");
		//strings are naturally ordered in alphabetical order
			
	}

}
