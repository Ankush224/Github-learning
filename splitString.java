package package1;

public class splitString {

	public static void main(String[] args) 
	{
		String s = "( This is the _ 10 veative company )";
		
		String[] str = s.split("\\s");
		
		for(String w: str)
		{
			System.out.println(w);
		}
		
		int number = Integer.parseInt(str[5]);
		
		System.out.println(number);
		
	}

}
