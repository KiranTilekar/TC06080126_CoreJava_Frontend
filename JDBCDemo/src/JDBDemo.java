import java.sql.*;
import java.util.*;

public class JDBDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Kiran@12345@");
		PreparedStatement pstm = con.prepareStatement("insert into employee values(?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID= ");
		int id = sc.nextInt();
		System.out.println("Enter Name= ");
		String name = sc.next();
		System.out.println("Enter salary= ");
		float sal = sc.nextFloat();
		
		pstm.setInt(1, id);
		pstm.setString(2, name);
		pstm.setFloat(3, sal);
		
		int i = pstm.executeUpdate();
		
		if(i>0)
			System.out.println("Record added...");
		else
			System.out.println("Failed");
		
		PreparedStatement pstm1 = con.prepareStatement("select *from employee");
		ResultSet rs = pstm1.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}
		
		
	}
}
