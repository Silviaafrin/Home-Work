package hw4JavaVariables;

public class AboutMeTest {

	/*Create another class AboutMeTest. Instantiate AboutMe class under main method.
	 *  Initialize variables and call the method by object. I expect print outcome for 2 person,
	 *   one for you and another for your best friend Alex. give a single line comment where a 
	 *   variable is declared and initialized, constructor is declared and initialized, method is
	 *    implemented and initialized. Follow indentation by Organizing the code and push to the
	 *     github and paste the link of github below. [Mark distribution (100) : using variable --10, Create a method and constructor - 20, instantiate class - 10, initialize variables and call methods for you and Alex= 15  variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized -- 10, organize code and other-- 25]. push your code to github -- 10. share the package link below*/
	
	public static void main(String[] args) {
		
		//Instantiate AboutMe class under main method:
		AboutMe obj = new AboutMe();
		System.out.println(" Turing, "+ " Alan");
		//Initialize variables:
		obj.age= 12;
	     obj.name="Silvia";
		
		//calling method:
		obj.aboutMe();
	}

}
