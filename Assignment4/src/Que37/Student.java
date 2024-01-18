//28-12-2023
package Que37;

public class Student {

	String name;
	int rollNo;
	int age;
	int score;
	
	public Student(String name, int rollNo, int age, int score) 
	{
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + ", score=" + score + "]\n";
	}
	
	
}
