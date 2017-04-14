package oop_project;


import java.text.SimpleDateFormat;
import java.sql.*;

public class CompanyVisit {

	String name;
	Date  visitdate;
	public static void main(String[] args) {
		CompanyVisit c= new CompanyVisit();
		CompanyVisit d[] = new CompanyVisit[5];
		d=c.visitingDate("2016-02-13","2018-12-06");
		for(int i=0;i<5;i++){
			try{
				System.out.println(d[i].name+"  "+d[i].visitdate);
			}
			catch(Exception e){}
		}


	}


	public CompanyVisit[] visitingDate(String d1,String d2)
	{
		CompanyVisit c[]=new CompanyVisit[5];
		try
		{
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/TPC","root", "sweet@696");
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			try{
				java.util.Date date1 = sdf1.parse(d1);
				java.util.Date date2 = sdf1.parse(d2);
				java.sql.Date sqlStartDate1 = new java.sql.Date(date1.getTime());
				java.sql.Date sqlStartDate2 = new java.sql.Date(date2.getTime());
				Statement stmt= con.createStatement();
				String sql="select * from Company where visitDate>'"+sqlStartDate1+ "' and visitDate < '"+sqlStartDate2+ "' ";
				ResultSet res= stmt.executeQuery(sql);
				int i=0;
				while(res.next())
				{
					c[i]=new CompanyVisit();
					c[i].name=res.getString("cname");
					c[i].visitdate=res.getDate("visitDate");
					i++;
				}

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return c;
	}

}


