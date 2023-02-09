package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the value of n?");
		int endNumber = in.nextInt();
		
		boolean[] sieve = new boolean[endNumber + 1];
		
		//boolean sieveNumber = true;
		
		for (int x = 1; x <= endNumber; x++)
		{

			sieve [x] = true;
		}
		
		for (int y = 2; y < sieve.length; y++)
		{
			for (int z = y*y; z < sieve.length; z+=y)
			{
				sieve [z] = false;
			}
		}
		
		for (int a = 2; a < sieve.length; a ++)
		{
			if (sieve[a] == true)
			{
				System.out.println(a);
			}
		}
		

	}

}
