package anonymousDemo;

public class Test extends A
{
	public static void main(String[] args) {
		Popcorn p = new Popcorn() {

			public void taste() {
				System.out.println("Chesse");
				
			}
			
		};
		p.taste();
	}
}
