package hw4JavaVariables;

public class AboutMeTest {

	/*
	 * Create another class AboutMeTest. Instantiate AboutMe class under main
	 * method. Initialize variables and call the method by object. I expect print
	 * outcome for 2 person, one for you and another for your best friend Alex. give
	 * a single line comment where a variable is declared and initialized,
	 * constructor is declared and initialized, method is implemented and
	 * initialized. Follow indentation by Organizing the code and push to the github
	 * and paste the link of github below. [Mark distribution (100) : using variable
	 * --10, Create a method and constructor - 20, instantiate class - 10,
	 * initialize variables and call methods for you and Alex= 15 variable is
	 * declared and initialized, constructor is declared and initialized, method is
	 * implemented and initialized -- 10, organize code and other-- 25]. push your
	 * code to github -- 10. share the package link below
	 */

	public static void main(String[] args) {

		// Instantiate AboutMe class under main method:
		AboutMe obj = new AboutMe();

		// Initialize variables:
		obj.age = 63;
		obj.name = "Silvia";
		obj.myApartmentNo = 5971;
		obj.yearlySalary = 25000;
		obj.usCitizen = true;
		obj.myHeight = 5.5f;
		obj.sex = 'F';
		obj.bankBalance = 36000;
		obj.myGrade = 4.00;

		// calling method:
		obj.aboutMe();

		System.out.println("-----------------------------------------");
		AboutMe obj1 = new AboutMe();

		obj1.age = 63;
		obj1.name = "Alex";
		obj1.myApartmentNo = 595;
		obj1.yearlySalary = 20000;
		obj1.usCitizen = true;
		obj1.myHeight = 6.5f;
		obj1.sex = 'M';
		obj1.bankBalance = 66000;
		obj1.myGrade = 5.00;
		obj1.aboutMe();
	}

}
