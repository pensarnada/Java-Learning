package javalearning;

public class Classlearning {
	
	public static void main(String[] args)
	{
		int n=5;
		long [] a = new long[n];
		for (int i=0;i<n;i++) {
			a[i]=i+1;
			System.out.println(a[i]);
		}
		
		String s1 = "Hello ", s2 = "Wolrd!";
		String s3 = s1 + s2;
		System.out.println(s3);
		
	}
	
}