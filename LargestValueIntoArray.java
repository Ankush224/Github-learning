package package1;

import java.util.Arrays;

public class LargestValueIntoArray
{

	public static void main(String[] args) 
	{

     int a [] = { 12,45,78,58,47,75};
     
     int len =a.length;
     
     Arrays.sort(a);
     
     System.out.println("Largest value of the array is = "+a[len-1]);
     System.out.println("Second Largest value of the array is = "+a[len-2]);
     System.out.println("Third Largest value of the array is = "+a[len-3]);
	}

}
