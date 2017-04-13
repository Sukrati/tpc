import java.sql.*;
abstract class CellMember 
{
	private int id;
	private String name;
	private String password;
	private String EmailId;
	private String ContactNumber;
	private String category;
	private String gender;
	private int year;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmailId() {
		return EmailId;
	}


	public void setEmailId(String emailId) {
		EmailId = emailId;
	}


	public String getContactNumber() {
		return ContactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.ContactNumber = contactNumber;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	void  showDetails(int c1id)
	{
		try
		{
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/TPC","root","sweet@696");

			Statement stmt= con.createStatement();
			ResultSet res= stmt.executeQuery("select * from CellMember");
			while(res.next())
			{
				if(res.getInt("cid")== c1id)
				{
					id=res.getInt("cid");
					name=res.getString("cname");
					password=res.getString("cpassword");
					EmailId=res.getString("cEmailId");
					ContactNumber =res.getString("ContactNumber");
					category=res.getString("category");
					gender=res.getString("gender");
					year=res.getInt("year");
				}	
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	 int editDetails(String field,String value)
	 {
		 if(field.equals("year"))
		 {try
		 {
			 year= Integer.parseInt(value) ;
			 return 1;
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 } }
		 
		 if(field.equals("id"))
		 {
			 id= Integer.parseInt(value) ;
			 return 0;
		 }
		 if(field.equals("name"))
		 {
			 name=value;
			 return 1;
		 }
		 if(field.equals("password"))
		 {
			 password=value;
			 return 1;
		 }
		 if(field.equals("EmailId"))
		 {
			 EmailId=value;
			 return 1;
		 }
		 if(field.equals("ContactNumber"))
		 {
			 ContactNumber=value;
			 return 1;
		 }
		 if(field.equals("category"))
		 {
			 category=value;
			 return 1;
		 }
		 if(field.equals("gender"))
		 {
			 gender=value;
			 return 1;
		 }
		 else
		 {
			 return 0;
		 }
	 }
}
	