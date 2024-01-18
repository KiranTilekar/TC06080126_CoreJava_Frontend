package Que37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Student> l = new ArrayList();
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("Enter student info:");
			
			System.out.println("Enter name:");
			String name = sc.next();
			
			System.out.println("Enter rollNo:");
			int rollNo = sc.nextInt();
			
			System.out.println("Enter age:");
			int age = sc.nextInt();
			
			System.out.println("Enter score:");
			int score = sc.nextInt();
			
			l.add(new Student(name,rollNo,age,score));
		}
		
		System.out.println(l);
		
		
		List<Student> group_0_50 = new ArrayList<>();
        List<Student> group_50_65 = new ArrayList<>();
        List<Student> group_65_80 = new ArrayList<>();
        List<Student> group_80_100 = new ArrayList<>();
        
//        for(int i=1; i<=10; i++)
//        {
//        	if()
//        }
	}
}
