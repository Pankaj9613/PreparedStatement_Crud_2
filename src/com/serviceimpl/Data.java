package com.serviceimpl;

import java.sql.*;
import com.service.*;
import java.util.*;

public class Data implements Requirement {
	Scanner sc = new Scanner(System.in);

	public void createTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
		String sql = "create table person(id int primary key,name varchar(25),gender varchar(10),age int,emailid varchar(30))";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
		conn.close();
		System.out.println("Table Created successfully");
	}

	public void insertData() throws Exception {

		System.out.println("Enter User ID:");
		int uid = sc.nextInt();
		System.out.println("Enter User Name");
		String name = sc.next();
		System.out.println("Enter User Gender");
		String gender = sc.next();
		System.out.println("Enter user age");
		int age = sc.nextInt();
		System.out.println("Enter Email id");
		String emailid = sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
		String sql = "insert into person value(?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, uid);
		ps.setString(2, name);
		ps.setString(3, gender);
		ps.setInt(4, age);
		ps.setString(5, emailid);
		ps.execute();
		ps.close();
		conn.close();
		System.out.println("data inserted successfully");
	}

	public void updateData() throws Exception {
		while (true) {
			System.out.println(
					"Enter your choice to Update Data\n 1 with the help of  id\n 2 with the help of name\n 3 with the help of emailid\n 4 for exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter User ID:");
				int uid = sc.nextInt();
				System.out.println("Enter User Name");
				String uname = sc.next();
				System.out.println("Enter User Gender");
				String ugender = sc.next();
				System.out.println("Enter user age");
				int uage = sc.nextInt();
				System.out.println("Enter Email id");
				String uemailid = sc.next();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
				String sql = "update person set name=?, gender=?, age=?, emailid=? where id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, uname);
				ps.setString(2, ugender);
				ps.setInt(3, uage);
				ps.setString(4, uemailid);
				ps.setInt(5, uid);
				ps.execute();
				ps.close();
				conn.close();
				System.out.println("data updated successfully");
				break;
			}
			case 2: {
				System.out.println("Enter User Name");
				String uname = sc.next();
				System.out.println("Enter User ID:");
				int uid = sc.nextInt();
				System.out.println("Enter User Gender");
				String ugender = sc.next();
				System.out.println("Enter user age");
				int uage = sc.nextInt();
				System.out.println("Enter Email id");
				String uemailid = sc.next();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
				String sql = "update person set id=?,gender=?,age=?,emailid=? where name=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, uid);
				ps.setString(2, ugender);
				ps.setInt(3, uage);
				ps.setString(4, uemailid);
				ps.setString(5, uname);
				ps.execute();
				ps.close();
				conn.close();
				System.out.println("data updated successfully");
				break;
			}
			case 3: {
				System.out.println("Enter User ID:");
				int uid = sc.nextInt();
				System.out.println("Enter User Name");
				String uname = sc.next();
				System.out.println("Enter User Gender");
				String ugender = sc.next();
				System.out.println("Enter user age");
				int uage = sc.nextInt();
				System.out.println("Enter Email id");
				String uemailid = sc.next();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
				String sql = "update person set id=?,name=?,gender=?,age=? where emailid=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, uid);
				ps.setString(2, uname);
				ps.setString(3, ugender);
				ps.setInt(4, uage);
				ps.setString(5, uemailid);
				ps.execute();
				ps.close();
				conn.close();
				System.out.println("data updated successfully");
				break;
			}
			case 4: {
				System.out.println();
				return;
			}

			}

		}
	}

	public void viewSingleData() throws Exception {
		while (true) {
			System.out.println("Enter your choice to view single Data\n1 for with the help of id\n2 for with the help of name\n3 for with thr help of email id\n4 Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter user id to view data");
				int uid = sc.nextInt();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
				String sql = "select * from person where id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, uid);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
							+ " " + rs.getString(5));
				}
				ps.close();
				conn.close();
				System.out.println("data view successfully");
				break;
			}
				
			case 2: {
				System.out.println("Enter user Name to view data");
				String uname = sc.next();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
				String sql = "select * from person where name=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, uname);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
							+ " " + rs.getString(5));
				}
				ps.close();
				conn.close();
				System.out.println("data view successfully");
				break;
			}
				
			case 3: {
				System.out.println("Enter user emailid to view data");
				String uemailid = sc.next();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
				String sql = "select * from person where emailid=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, uemailid);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
							+ " " + rs.getString(5));
				}
				ps.close();
				conn.close();
				System.out.println("data view successfully");
				break;
			}
				
			case 4: {
				System.out.println();
				return;
			}
			}
		}
	}

	public void viewAllData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
		String sql = "select * from person";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		}
		ps.close();
		conn.close();
		System.out.println("All data view successfully");
	}

	public void deleteSingleData() throws Exception {
		while(true)
		{
			System.out.println("Enter your choice to delete single Data\n1 for with the help of id\n2 for with the help of name\n3 for with thr help of email id\n4 Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter id to Delete Single Data");
				int uid = sc.nextInt();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
				String sql = "Delete from person where id=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, uid);
				ps.executeUpdate();
				ps.close();
				conn.close();
				System.out.println("single data deleted successfully");
				break;
			}
			case 2:{
				System.out.println("Enter user name to Delete Single Data");
				String uname = sc.next();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
				String sql = "Delete from person where name=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, uname);
				ps.executeUpdate();
				ps.close();
				conn.close();
				System.out.println("single data deleted successfully");
				break;
			}
			case 3:
			{
				System.out.println("Enter user Emailid to Delete Single Data");
				String uemailid = sc.next();
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
				String sql = "Delete from person where emailid=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, uemailid);
				ps.executeUpdate();
				ps.close();
				conn.close();
				System.out.println("single data deleted successfully");
				break;
			}
			case 4:
			{
				System.out.println();
				return;
			}
				
			}
		}
	}

	public void deleteAllData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
		String sql = "Delete from person";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		System.out.println("all data deleted successfully");
	}

	public void deleteTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "rootroot");
		String sql = "Drop table person";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		conn.close();
		System.out.println("Table deleted successfully");
	}

}