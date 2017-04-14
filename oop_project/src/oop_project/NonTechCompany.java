import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NonTechCompany {

	String req;
	int id;
	String name,emailId,city;
	double cpi,salary;
	Date visitdate;
	 public NonTechCompany[] CompanyVisit(String d1,String d2)
	 {
		 NonTechCompany t[]=new NonTechCompany[10];
		 try{
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/TPC","root", "sweet@696");
				SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date date1 = sdf1.parse(d1);
				java.util.Date date2 = sdf1.parse(d2);
				java.sql.Date sqlStartDate1 = new java.sql.Date(date1.getTime());
				java.sql.Date sqlStartDate2 = new java.sql.Date(date2.getTime());
				Statement stmt= con.createStatement();
				Statement stmt1= con.createStatement();
				String sql="select * from Company where visitDate>'"+sqlStartDate1+ "' and visitDate < '"+sqlStartDate2+ "' ";
				ResultSet res= stmt.executeQuery(sql);
				int i=0;
				while(res.next())
				{
					t[i]=new NonTechCompany();
					t[i].name=res.getString("cname");
					t[i].visitdate=res.getDate("visitDate");
					t[i].cpi=res.getDouble("cpiCriteria");
					t[i].id=res.getInt("cIN");
					t[i].salary=res.getDouble("salary");
					String sql1="select * from TechCompany where cIN='"+t[i].id+ "' ";
					ResultSet res1=stmt1.executeQuery(sql1);
					while(res1.next())
					{
						t[i].req=res1.getString("requirements");
					}
			    	i++;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		 
		 
	
		return t;
	 }
	

}
