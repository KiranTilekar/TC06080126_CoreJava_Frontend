package Que53;

public class Voter {
	
	int voterid;
	String name;
	int age;

	Voter(int voterid,String name,int age) throws MyException
	{
		if(age<18)
		{
			throw new MyException("Invalid age for voter");
		}
		this.voterid = voterid;
		this.name = name;
		this.age = age;
	}
}
