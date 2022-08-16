package hw3JavaVariables;

public class AboutMe {
//	variable  declared
	public int a;

//	variable initialized
	public int houseNumber = 5971;
	public String roadName = "Hillside Dr";
	public String county = "Atlanta";
	public String state = "GA";
	public int zipcode = 30340;
	public boolean USA = true;
	public byte age = 36;
	public long id = 25066987l;
	public float Hight = 5.55565841f;
	public double myGPA = 3.4566;
	public char sex = 'F';

	public static void main(String[] args) {
		AboutMe myInfo = new AboutMe(); //

		System.out.println("My house number is: " + myInfo.houseNumber + " \nMy road name is: " + myInfo.roadName);
		System.out.println("My county is: " + myInfo.county + ". \nMy state name is: " + myInfo.state
				+ " \nMy zip code is " + myInfo.zipcode);
		System.out.println("My Id Number is: " + myInfo.id + ". \nMy myGPA  is: " + myInfo.myGPA);
	}
}
