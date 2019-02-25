package javalearning;

import java.util.Scanner;

public class Classlearning {
	
	static void ArrayStuff() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of your array: ");
		int n = scanner.nextInt(); //n here is the length of myArray
		System.out.println("Enter increase amount: ");
		int a = scanner.nextInt(); //We can get another inputs by using Scanner class
		long [] myArray = new long[n];
		for (int i=0;i<n;i++) // initiate i as 0 and increase 1 at every iteration
							 //	until i is not lower than n
		{
			myArray[i]=i+a; // At every iteration adds "int a" to "int i" and prints it.
			System.out.println(myArray[i]);
		}
	}
	
	static void StringStuff()
	{
		String s1 = "Hello ", s2 = "Wolrd!";
		String s3 = s1 + s2;
		System.out.println(s1+"+ "+s2+" = "+s3);
		// We put "Hello " into String s1 and "World!" into String s1
		// And merge them together in String variable s3
	}
	
	static void PrintStuff() 
	{
		int a = 5, b, c; // initiate int a, int b, int c and put 5 into a
		b = a + 5; //Summation a and 5 into b
		c = a * b; //Multiplication a and b into c
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("If we write only a+b+c, it does not prints a,b,c... "
				+ "It sums them and prints summation as: "+(a+b+c));
		System.out.println(a+b+c);
		//then prints a: value of a, b: value of b, c: value of c...
	}
	static void ifStuff() 
	{
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a value: ");
		int x = 0; //Initiate x as 0...
		int n = scanner.nextInt(); //Gets an input by Scanner class and puts into n...
		if (x!=n) //If x is not equal to n...
		{
			System.out.println("They are not equal!"); //If x!=n, prints this.
		}
		else {
			System.out.println("They are equal."); //If x=n, prints this.
		}
		if ( x < n ) //If x is smaller than n...
		{
			x = n; //Put n's value into x
		}
		System.out.println(x); //Prints x anyway
		
		
	}
	
	public static void main(String[] args)
	{
		// We call our methods in our main
		ArrayStuff(); 
		StringStuff();
		PrintStuff();
		ifStuff();
		
	}
	
}
