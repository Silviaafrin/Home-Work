/*Create another class StudentTest. Create object as many as
	 * you want under the main method. Initialize constructors. I want the first
	 * outcome in the console as --> This is from default Constructor of Student
	 * class. in the next line, The second outcome -- > Student Name: <your name>,
	 * ID: <your id>, Sex: <your sex in char>, Grade: <your grade> and Java
	 * Programmer? Ans: true. Organize the code. Push in the github. Paste your
	 * github link below.*/

package hw5Q3Constructor;

public class StudentTestclass {

	public static void main(String[] args) {
		Student student = new Student();

		Student student1 = new Student("Silvia", 123, 'F', 3.2f, true);

		System.out.println("-------------------------------------------");
		Student student2 = new Student("Mahir", 13, 'M', 4.2f, true);

	}
}
