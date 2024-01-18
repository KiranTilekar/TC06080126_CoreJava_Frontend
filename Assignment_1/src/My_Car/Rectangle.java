package My_Car;

class Rectangle {
	int area;
	
	Rectangle(int l,int b)
	{
		area = l*b;
	}
	int Area()
	{
		return area;
	}
}


class Sample
{
	public static void main(String args[])
	{
		Rectangle rec = new Rectangle();
	}
}