
public class CarConstructor {

		  int modelYear;
		  String modelName;

		  public CarConstructor(int year, String name) {
		    modelYear = year;
		    modelName = name;
		  }

		  public static void main(String[] args) {
		    CarConstructor myCar = new CarConstructor(1969, "Mustang");
		    System.out.println(myCar.modelYear + " " + myCar.modelName);
		  }
		}