package com.slot1jdbc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;


public class demojdbc4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/anudipdeeptech","root","Hemant@123");
       
       String query="insert into empimg values(?,?)";
       PreparedStatement pst=con.prepareStatement(query);
       FileInputStream fis=new FileInputStream("C:/Users/HEMANT/Desktop/Tom_Cruise.jpg");
	   
       pst.setInt(1, 103);
       pst.setBinaryStream(2, fis);
       
       int count=pst.executeUpdate();
       System.out.println(count +"row(s) are affected");
	}

}
