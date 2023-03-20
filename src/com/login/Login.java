package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import com.Questions.*;
public class Login extends Questions {
  Scanner sc = new Scanner(System.in);
  static String c;
  static String b;
  int a = Questions.count;
	public void storeInfo() {
		System.out.println("Enter username");
   	    c = sc.next();
   	   System.out.println("Enter password");
   	   b = sc.next();		
	}
	public void Result() {
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp","root","V12v34v56v78@");
		    PreparedStatement ps = con.prepareStatement("update registration set result =? where username =? and password =?");
		    ps.setInt(1, a);
		    ps.setString(2, c);
		    ps.setString(3, b);
		    ps.execute();
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    
	 }
	
	public void getResult() {
		Login lg = new Login();
		lg.storeInfo();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp","root","V12v34v56v78@");
		   PreparedStatement ps = con.prepareStatement("select result from registration where username=? and password=?");
		   ps.setString(1,c);
		   ps.setString(2,b);
		   
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()) {
		   System.out.println(rs.getInt("result"));
		   }
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Login lg = new Login();
		lg.storeInfo();
		lg.Result();
	}
	
	}
	

