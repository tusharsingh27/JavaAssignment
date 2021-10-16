package com.xgileit.learning.student.management.service.connection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.*;
class ConnectionJDBC {

    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //creating connection

            String url="jdbc:mysql://localhost:2709/information";
            String username="root";
            String password="virender8@";

            Connection con =DriverManager.getConnection(url,username,password);

            //create query

            String q="insert into xgileitstudent(sid,sname,scity)values(?,?,?)";

            //get PreparedStatement object

            PreparedStatement pstmt=con.prepareStatement(q);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter student id:");
            int id=Integer.parseInt(br.readLine());

            System.out.println("Enter name:");
            String name=br.readLine();

            System.out.println("Enter city:");
            String city=br.readLine();

            //set values to query

            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setString(3,city);
            pstmt.executeUpdate();

            System.out.println("Done");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
