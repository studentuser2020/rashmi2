

public class Cat extends Dog{

	
		 public void eating(){
			 System.out.println("This is eating method from Cat Class");
		 }
	  
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eating();
		Cat c1 = new Cat();
		c1.eating();
		
		Animal a1 = new Animal();
		a1.eating();
		a1.barking();

			
		}
}
