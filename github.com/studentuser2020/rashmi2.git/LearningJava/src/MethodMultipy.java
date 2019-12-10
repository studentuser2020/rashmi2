
public class MethodMultipy {
	
	public static void multiply(int a, int b){
		int c = a*b;
		System.out.println(c);
	}
	public static double multiply(double a, double b){
		double c = a*b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodMultipy m2 = new MethodMultipy();
		multiply(2,3);
		double d = multiply(8.24, 24.24);
		System.out.println(d);
		
	}

}
