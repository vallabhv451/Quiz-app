package com.Questions;

import java.util.Scanner;

import com.login.Login;

public class Questions {
 
		String q = "1. Who invented Java Programming?\r\n" + 
				"a) Guido van Rossum\r\n" + 
				"b) James Gosling\r\n" + 
				"c) Dennis Ritchie\r\n" + 
				"d) Bjarne Stroustrup";
		String r = "2. Which statement is true about Java?\r\n" + 
				"a) Java is a sequence-dependent programming language\r\n" + 
				"b) Java is a code dependent programming language\r\n" + 
				"c) Java is a platform-dependent programming language\r\n" + 
				"d) Java is a platform-independent programming language";
		String s = "3. Which one of the following is not a Java feature?\r\n" + 
				"a) Object-oriented\r\n" + 
				"b) Use of pointers\r\n" + 
				"c) Portable\r\n" + 
				"d) Dynamic and Extensible";
		String t = "4. Which of the following is not an OOPS concept in Java?\r\n" + 
				"a) Polymorphism\r\n" + 
				"b) Inheritance\r\n" + 
				"c) Compilation\r\n" + 
				"d) Encapsulation";
		String u = "5. Which of these is selection statements in Java?\r\n" + 
				"a) break\r\n" + 
				"b) continue\r\n" + 
				"c) for()\r\n" + 
				"d) if()";
		String v = "6. Which of the following is a superclass of every class in Java?\r\n" + 
				"a) ArrayList\r\n" + 
				"b) Abstract class\r\n" + 
				"c) Object class\r\n" + 
				"d) String\r\n";
		String w = "7. Which of these keywords are used for the block to be examined for exceptions?\r\n" + 
				"a) check\r\n" + 
				"b) throw\r\n" + 
				"c) catch\r\n" + 
				"d) try\r\n"; 
		String x = "8. Which one of the following is not an access modifier?\r\n" + 
				"a) Protected\r\n" + 
				"b) Void\r\n" + 
				"c) Public\r\n" + 
				"d) Private";
		String y = "9. What is the process of defining a method in a subclass having same name & type signature as a method in its superclass?\r\n" + 
				"a) Method overloading\r\n" + 
				"b) Method overriding\r\n" + 
				"c) Method hiding\r\n" + 
				"d) None of the mentioned";
		String z = "10. Which of these keywords can be used to prevent Method overriding?\r\n" + 
				"a) static\r\n" + 
				"b) constant\r\n" + 
				"c) protected\r\n" + 
				"d) final";
		
		public static int count=0;
		Scanner sc = new Scanner(System.in);
		public void quest() {
			System.out.println(q);
			System.out.println("Enter your answer");
			char a = sc.next().charAt(0);
			if(a=='b') {
				count++;
			}
			System.out.println(r);
			System.out.println("Enter your answer");
			char b = sc.next().charAt(0);
			if(b=='d') {
				count++;
			}
			System.out.println(s);
			System.out.println("Enter your answer");
			char c = sc.next().charAt(0);
			if(c=='b') {
				count++;
			}
			System.out.println(t);
			System.out.println("Enter your answer");
			char d = sc.next().charAt(0);
			if(d=='c') {
				count++;
			}
			System.out.println(u);
			System.out.println("Enter your answer");
			char e = sc.next().charAt(0);
			if(e=='d') {
				count++;
			}
			System.out.println(v);
			System.out.println("Enter your answer");
			char f = sc.next().charAt(0);
			if(f=='c') {
				count++;
			}
			System.out.println(w);
			System.out.println("Enter your answer");
			char g =sc.next().charAt(0);
			if(g=='d') {
				count++;
			}
			System.out.println(x);
			System.out.println("Enter your answer");
			char h = sc.next().charAt(0);
			if(h=='b') {
				count++;
			}
			System.out.println(y);
			System.out.println("Enter your answer");
			char i = sc.next().charAt(0);
			if(i=='b') {
				count++;
			}
			System.out.println(z);
			System.out.println("Enter your answer");
			char j = sc.next().charAt(0);
			if(j=='d') {
				count++;
			}
			Login lg = new Login();
			lg.Result();
		}
			
				
	}

