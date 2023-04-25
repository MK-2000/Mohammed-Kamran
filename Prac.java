import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		
		//reads a number from user & multiplication table 
		
		 /* Scanner sc = new Scanner(System.in);
		  int x = sc.nextInt();
		  
		  for(int i =1;i<=10;i++) {
			int result = x*i;
			System.out.println(x + " X " + i + " = " + result);
		}*/
		
		
		//reads a number from the user and prints the sum of all the numbers 
		//from 1 to that number using a do-while loop
		
		/*Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum=0;
		int i=1;
		do{
			sum = sum + i;
			i++;
			
		}while(i<=x);
		
		System.out.println("Sum : " + sum);*/
		
		//prints the numbers from 1 to 10 using a while loop
		
		/*int x=1;
		while(x<=10) {
			System.out.println(x);
			x++;
		}*/
		
		//get a number from the user and print whether 
		//it is positive or negative   
		
		/*Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x>0) {
			System.out.println("Positive Number");
		}
		else {
		System.out.println("Negative Number");	
		}*/
		
		//Take three numbers from the user 
		//and print the greatest number
		/*Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("Greatest : " + a);
		}
		else if( b>c) {
			System.out.println("Greatest : " + b);
		}
		else 
			System.out.println("Greatest : " + c);*/
		
		//reads a string from the user and prints each 
		//character of the string in reverse order using a for loop
	
		Scanner sc = new Scanner(System.in);
		String  s = sc.nextLine();
		sc.close();
		String reversedString = "";
		for(int i=0;i<s.length();i++) {
			
		}
		
		//Swap Two Numbers
		/*int a = 4 , b = 6;
		int temp;
		 temp = a;
		   a=b;
		   b=temp;
		
		System.out.println(a);
		System.out.println(b);*/
		
		
	}

}
