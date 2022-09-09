package com.slot1jdbc;

import java.io.FileOutputStream;
import java.sql.*;


public class demojdbcfile5 {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
    Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/anudipdeeptech","root","Hemant@123");	
	 String qu ="select * from empimg where eid=103";
	 PreparedStatement pst=con.prepareStatement(qu);
	 ResultSet rs=pst.executeQuery();
	 
	 if(rs.next()) {
		 
       Blob b=rs.getBlob(2);
		byte bar[]=b.getBytes(1, (int)b.length());
	  
		 FileOutputStream fo=new FileOutputStream("f://Tom_Cruise.png");
         fo.write(bar);
	     fo.close();
	     System.out.println("image is created");
	 }
	}

}
