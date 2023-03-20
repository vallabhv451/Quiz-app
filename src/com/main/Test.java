package com.main;

import java.util.Scanner;

public class Test {
 public static void main(String[] args) {
	Admin ad = new Admin();
	Main main = new Main();
	Scanner sc = new Scanner(System.in);
    System.out.println("choose the operation \n 1. User operation \n 2.Admin operation");
    int a = sc.nextInt();
    if(a==1) {
    	main.main(args);
    }
    else if(a==2) {
    	ad.main(args);
    }
    else {
    	System.out.println("invalid choice");
    }
}
}
