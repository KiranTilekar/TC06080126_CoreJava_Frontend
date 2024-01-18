// 22-12-2023
package SerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
//		FileOutputStream fos = new FileOutputStream("d://abc.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		Student s = new Student(1,"Kiran",1000.89f);
//		
//		//Serialization
//		oos.writeObject(s);
//		System.out.println("Success");
//		oos.close();
//		fos.close();
		
		//de-serialization
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://abc.txt"));
		Student s = (Student) ois.readObject();
		System.out.println(s);
		
		
	}
	
	
}
