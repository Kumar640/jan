package ecommece;

import java.io.IOException;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		do{
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Substraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		System.out.println("Enter the value as per your choice");
		ch=(char)System.in.read();	
		}while (ch <'1' || ch> '5');
		switch(ch) {
		case '1':
			System.out.println("Enter First Value");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("Enter Second Value");
			int b=sc.nextInt();
			int sum=a+b;
			System.out.println("Addition of 2 number is "+sum);
			break;
		case '2':
			System.out.println("Enter First Value");
			Scanner sc1=new Scanner(System.in);
			int a1=sc1.nextInt();
			System.out.println("Enter Second Value");
			int b1=sc1.nextInt();
			int sub=a1-b1;
			System.out.println("Substraction of 2 number is "+sub);
			break;
		case '3':
			System.out.println("Enter First Value");
			Scanner sc3=new Scanner(System.in);
			int a2=sc3.nextInt();
			System.out.println("Enter Second Value");
			int b2=sc3.nextInt();
			int mul=a2*b2;
			System.out.println("Multiplication of 2 number is "+mul);
		case '4':
			System.out.println("Enter First Value");
			Scanner sc4=new Scanner(System.in);
			int a3=sc4.nextInt();
			System.out.println("Enter Second Value");
			int b3=sc4.nextInt();
			int div=a3/b3;
			System.out.println("Division of 2 number is "+div);
			
			
					
		}

	}

}
