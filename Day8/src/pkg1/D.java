package pkg1;

import p1.Student;
import static p1.Student.*;
import static p1.Student.fees;
import static p1.Student.getFees;

public class D 
{
	public static void main(String[] args) {
		System.out.println("fees="+fees);
		System.out.println("fees="+getFees());
	}
}
