
public class TestSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// in 
		
		int a = 3;
		
		
		switch(a){
		case 0:
			System.out.println("This is Monday");
			break;
		case 1:
			System.out.println("This is Tuesday");
			break;
		case 2:
			System.out.println("This is Wednesday");
			break;
		case 3:
			System.out.println("This is Thurday");
			break;
		case 4:
			System.out.println("This is Friday");
			break;
		case 5:
			System.out.println("This is Saturday");
			break;
		case 6:
			System.out.println("This is Sunday");
			break;		
		default:
				System.out.println("The number provided is out of range");
								
		}
		
		System.out.println("This is out of Switch");
	}

}
