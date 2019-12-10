
public class Methodex1 {
// a group of statements is called method
	
// method name always starts with lower case
	// naming convention in the methods always starts with lower case ex.. add, addMath
// accessmodifer returntype methodname(args/parameters)	
	public static void add(int a, int b){
		int c = a+b;
		System.out.println(c);
	}
	public static void add(int a, int b, int c){
		int d = a+b+c;
		System.out.println(d);
	}
	public static void add(double a, double b){
		double c = a+b;
		System.out.println(c);
	}
	public static void add(double a, double b, double c){
		double d = a+b+c;
		System.out.println(d);
	}
	public static void add(byte a, byte b){
		int c = a+b;
		System.out.println(c);
	}
	
	public static int add1(int a, int b){
		int c= a+b;
		return c;
	}
	
	public static int add2(){
		int a = 5;
		int b = 7;
		int c = a+b;
		System.out.println(c);
		return c;
	}
	public static int add3(){
		int a = 10;
		int b = 24;
		int c = a+b;
		
		return c;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test statement");
		Methodex1 m1 = new Methodex1();
		
		add(4,5);
		int d = add1(5,6);
		System.out.println(d);
		add2();
		int e = add3();
		System.out.println(e);
		
		String name;
		
		m1.add(11.11, 11.11);
		//System.out.println(m1);
	}

}
