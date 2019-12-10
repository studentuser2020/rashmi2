
public class Dog extends Animal {

	public void eating(){
	
		System.out.println("This eating method from Dog class");
	}
	
	/* public void eating (String s){
		System.out.println("parameters");
	} */
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.barking();
		d1.eating();
		
		Cat c1 = new Cat();
		c1.eating();
		Animal a1 = new Animal();
		a1.eating();
	

	}

}
