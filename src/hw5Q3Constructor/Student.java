/*
	 * Declare some variable -- stName, stID, sex, isProgrammer(as boolean), grade(as float).
	 *  Declare default constructor and only one parameterized
	 * constructor (use select variables--right click--source to create it). Use
	 * only one System.out.println() in parameterized constructor to declare the
	 * above variables. 
	 *
	 */
package hw5Q3Constructor;

    public class Student {
	public String stName;
	public int stId;
	public char sex;
	public float grade;
	public boolean javaprogram;

	public Student() {
	// default constructor
	}
	
	public Student(String stName,int stId,char sex, float grade, boolean javaprogram) {
	this.stName=stName;
	this.stId=stId;
	this.sex=sex;
	this.grade=grade;
	this.javaprogram=javaprogram;	
	System.out.println("My Student Name: "+stName+"\n Student Id"+stId+"\n Student Sex"
	+sex+"\n Student Grade"+grade+"\n My Student knows Jave:"+javaprogram);
	
	}
	

	}

