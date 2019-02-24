package javalearning;

public class Classlearning {
	
	static void ArrayStuff() 
	{
		int n=5; //n here is the length of myArray
		long [] myArray = new long[n];
		for (int i=0;i<n;i++) // initiate i as 0 and increase 1 at every iteration
							 //	until i is not lower than n
		{
			myArray[i]=i+1; // At every iteration adds 1 to i and prints it.
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
		//then prints a: value of a, b: value of b, c: value of c...
	}
	
	public static void main(String[] args)
	{
		// We call our methods in our main
		ArrayStuff(); 
		StringStuff();
		PrintStuff();
		
	}
	
}
