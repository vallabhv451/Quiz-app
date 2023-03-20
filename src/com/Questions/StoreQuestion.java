package com.Questions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StoreQuestion {

	public void storeQuest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the question");
		String e = sc.nextLine();
		System.out.println("Enter first option");
		String a = sc.nextLine();
		System.out.println("Enter second option");
		String b = sc.nextLine();
		System.out.println("Enter third option");
		String c = sc.nextLine();
		System.out.println("Enter fourth option");
		String d = sc.nextLine();
		System.out.println("enter correct answer");
		String f = sc.nextLine();
		sc.close();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp","root","V12v34v56v78@");
			PreparedStatement ps = connection.prepareStatement("insert into questions(question,option1,option2,option3,option4,correctans)values(?,?,?,?,?,?)");
			ps.setString(1, e);
			ps.setString(2, a);
			ps.setString(3, b);
			ps.setString(4, c);
			ps.setString(5, d);
			ps.setString(6, f);
			ps.execute();
			System.out.println("Question stored Successful");


			
			
		} catch (Exception x) {
			x.printStackTrace();
		}

	}
	
}
