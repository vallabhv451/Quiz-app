package com.main;
import java.util.Scanner;

import com.registration.*;
import com.Questions.*;
import com.login.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     Login lg = new Login();
	         System.out.println("Welcome to Quiz based application \n");
	    	 System.out.println("Fill the data below for Registration \n");
           StudentRegistration sr = new StudentRegistration();
           sr.registration();
	     
	     System.out.println("Enter details below to login");
	    	 lg.storeInfo();
	     
	     
	    	 Questions qs  = new Questions();
	    	 qs.quest();
	     
	     
	    	 
	    	 System.out.println("result stored successfully");
	    	 
	     
	     System.out.println("Enter details below to get score");
	    	 lg.getResult();
	    	  
	     
	     
	}

}
