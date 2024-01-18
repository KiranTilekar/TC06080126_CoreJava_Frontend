//22-12-2023

//Serializable is a marker Interface
//Clone is not a method of clonable Interface it is of Object class
package SerializationDemo;

import java.io.Serializable;

public class Student implements Serializable,Cloneable{
	
	private int rollNo;
	private String name;
	private transient float fees; // transient -> if we dont want to persist fees state
	
	public Student() {}

	public Student(int rollNo, String name, float fees) {
		this.rollNo=rollNo;
		this.name=name;
		this.fees=fees;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s = new Student(2,"Kalyani",12000.12f);
		Student s1 = (Student) s.clone();
		System.out.println(s1);
	}
	
	
}
