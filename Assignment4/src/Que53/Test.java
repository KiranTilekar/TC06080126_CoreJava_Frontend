package Que53;

public class Test {

	public static void main(String[] args) {
		
		try {
			Voter v1 = new Voter(1,"Kiran",21);
			throw new MyException("");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
