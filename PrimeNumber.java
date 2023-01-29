package ecommece;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value to find Prime or Not");
		num=sc.nextInt();
		if (isPrime(num)) {  
	           System.out.println(num + " is a prime number");  
	       } else {  
	           System.out.println(num + " is not a prime number");  
	       }
		sc.close();
	   }  
	  
	   public static boolean isPrime(int no) {  
	       if (no <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < no; i++) {  
	           if (no % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }
	   
}
