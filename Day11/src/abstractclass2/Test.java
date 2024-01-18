package abstractclass2;

public class Test {

	public static void main(String[] args) {
		Shape s = new Circle(5);
		System.out.println("Area of Circle="+s.Area());
		
		Shape s1 = new Rectangle(1,2);
		System.out.println("Area of Rectangle="+s1.Area());
		
	}
}
