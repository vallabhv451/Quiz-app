package com.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentRegistration {
	Scanner sc = new Scanner(System.in);
 
	public void registration() {
	   
		System.out.println("Enter the first name");
		String a = sc.next();
		System.out.println("Enter the last name");
		String b = sc.next();
		System.out.println("Enter username");
		String c = sc.next();
		System.out.println("Enter password");
		String d = sc.next();
		System.out.println("Enter the city");
		String e = sc.next();
		System.out.println("Enter the mail id");
		String f = sc.next();
		System.out.println("Enter the mobile number");
		String g = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp","root","V12v34v56v78@");
			PreparedStatement ps = connection.prepareStatement("insert into registration(firstname,lastname,username,password,city,mailid,mobilenumber)values(?,?,?,?,?,?,?)");
			ps.setString(1, a);
			ps.setString(2, b);
			ps.setString(3, c);
			ps.setString(4, d);
			ps.setString(5, e);
			ps.setString(6, f);
			ps.setString(7, g);
			ps.execute();
			System.out.println("Registration Successful");


			
			
		} catch (Exception x) {
			x.printStackTrace();
		}
		
	}
	
	
}
