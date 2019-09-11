package package1;

public class mergeTwoArrays {

	public static void main(String[] args) 
	{

     int [] a = {10,20,15,14,12};
     int [] b = {1,5,8,40,85,65,47,85};
     
     int l1 = a.length;
     int l2 = b.length;
     
     int count =0;
     
     int [] result = new int [l1+l2];
     
     for(int i =0; i< l1; i++)
     {
    	 result[i] = a[i];
    	 count++;
     }
     
     for(int j =0; j<l2; j++)
     {
    	 result[count++] = b[j];
    	 
     }
     
     for(int k =0; k< result.length; k++)
     {
    	 System.out.println(result[k]);
     }

	}

}
