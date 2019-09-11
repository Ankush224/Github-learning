package package1;

public class compareArray1Element 
{

	public static void main(String[] args)
	{
		int [] a = {10,45,12,47,50,55};
		int [] b = {15,10,12,49,55,75,56};
		
		int l1 = a.length;
		int l2 = b.length;
		
		for(int i=0; i< l1; i++)
		{
			for(int j =0; j< l2; j++)
			{
				if(a[i] == b[j])
				{
					System.out.println(a[i]);
					
				}
				
			}
		}

	}

}
