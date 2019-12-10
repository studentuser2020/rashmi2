
public class Jclass236 {
	 // to store name of the student (Which is object)
	String name;
	
	// to store attendance of student (which is object)
	int att;
	// to store the subject of the student
	String sub;
	
	public void details(){
		
		//if (-) {
		//	System.out.println("Details of student is " + name + " " + att);
		//	else
				
			System.out.println("Details of the Student is" + name + " " + att + " " + sub );
		}
				
	//	System.out.println("Details of the Student is null");
	//}
	
	// static method to memory management
	public static void cdetails(){
			System.out.println("Batch name is 236");
	}
// parameterized constructor
	public Jclass236(String n, int a){
		name = n;
		att = a;
	}
	// 
	public Jclass236(String n, int a, String s){
		name = n;
		att = a;
		sub = s;
	}
	
	public Jclass236() {
	// empty Constructor
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaration instantiation and initialization 
		//Object Creation
		
		Jclass236 jo1 = new Jclass236();
		
		Jclass236 jo2 = new Jclass236("Malathi", 90);
		Jclass236 jo3 = new Jclass236("Vineetha", 90, "Science");
		Jclass236 jo4 = new Jclass236("Freshta", 90, "Math");
		Jclass236 jo5 = new Jclass236("Ajmal", 100);
		
		jo1.details();
		jo2.details();
		jo3.details();
		jo4.details();
		jo5.details();
		
		//static method
		cdetails();
	}
}
