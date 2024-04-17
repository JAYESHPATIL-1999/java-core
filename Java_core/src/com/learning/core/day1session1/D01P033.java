package com.learning.core.day1session1;
import java.util.Scanner;



public class D01P033 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float Marks,Per=0;
		
		char choice;
		do {
			System.out.println("        Please Enter The Marks:-    ");
			Marks = sc.nextFloat();
			
			Per=((Marks)*100)/100;
			System.out.println("Percentage :- " +Per);


		if(Per>=60) {
			System.out.println(" \nCongrats You Are Passout with Grade 'A'");
		}else if(Per>=45) {
			System.out.println(" \nCongrats You Are Passout with Grade 'B'");
		}else if(Per>=35) {
			System.out.println(" \nCongrats You Are  Passout with Grade 'C'");
		}else if(Per<35) {
			System.out.println(" \nSorry You are Fail !");
		}
		System.out.println("\nIf You want to continue ? Then select Yes or No !");
		choice = sc.next().charAt(0);
		}
	
		while(choice=='y' || choice == 'Y');
		System.out.println("\nCalculation is done! ");

	}


}
