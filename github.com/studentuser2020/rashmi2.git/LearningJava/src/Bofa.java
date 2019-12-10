//implements is a keyword to use the interface, 
// multiply inheritance can be achieve in the interface but not at class level
// 
// Interface is a template 

public  class Bofa implements WorldB, AbsInterfaceExample{

	public static void main(String[] args) {
		// we cannot instantiation the interface or abstract class	
		WorldB w1 = new Bofa();
		w1.deposit();
	}


	public void deposit() {
		System.out.println("Deposit");
		
	}

	public void savings() {
		
		
	}

	public void checking() {
		
		
	}

}
