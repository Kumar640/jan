package ecommece;

import java.io.IOException;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		int a,b,sum,mul,sub,div;
		Scanner sc=new Scanner(System.in);
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
			a=sc.nextInt();
			System.out.println("Enter Second Value");
			b=sc.nextInt();
			sum=a+b;
			System.out.println("Addition of 2 number is "+sum);
			break;
		case '2':
			System.out.println("Enter First Value");
			a=sc.nextInt();
			System.out.println("Enter Second Value");
			b=sc.nextInt();
			sub=a-b;
			System.out.println("Substraction of 2 number is "+sub);
			break;
		case '3':
			System.out.println("Enter First Value");
			a=sc.nextInt();
			System.out.println("Enter Second Value");
			b=sc.nextInt();
			mul=a*b;
			System.out.println("Multiplication of 2 number is "+mul);
			break;
		case '4':
			System.out.println("Enter First Value");
			a=sc.nextInt();
			System.out.println("Enter Second Value");
			b=sc.nextInt();
			div=a/b;
			System.out.println("Division of 2 number is "+div);
					
		}

	}

}
