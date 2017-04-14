
import java.sql.*;

public class  Company {
	
	String id;
	String sname;
	public Company[] placedStud(String company)
	 {
		Company c[]=new Company[10];
		try{
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/TPC?autoReconnect=true&useSSL=false","root", "sweet@696");
		 Statement stmt=con.createStatement();
		 String sql="select * from Student where placedCompany='"+company+ "'";
		 ResultSet res=stmt.executeQuery(sql);
		 int i=0;
		 while(res.next())
		 {
			 c[i].id=res.getString("sid");
			 c[i].sname=res.getString("sname");
			 i++;
		 }
		 
	 }
	 catch(SQLException e)
	 {
		 e.printStackTrace();
	 }
		
		return c;
	 }
	
}