
public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=67;
boolean t1 = (n!=0); //true
boolean t2 = (n%2==0); //false
//boolean t3 = (n==0;) //false

//if ((n!=0)&&(n%2==0)
	if(t1&&t2){
	System.out.println("The given number "+n+ " is Even");
}
else
{
	//if(t3){ or
	//if (n==0){
	if(!t1){
		System.out.println("The Given Number" +n+ " is Zero");
	}
	else {

		System.out.println("The given number "+n+ " is not a Even");
			}

		}
	}
}
