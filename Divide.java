
public class Divide 
{
	public static void divide(String str, int div)   // to divide the string 'str' into 'div' number of equal blocks
	{
		if(str.length()%div==0)
		{
			int divisions=str.length()/div;
			for(int i=0;i<str.length();i=i+divisions)
			{
				System.out.println(str.substring(i, i+divisions));
			}
		}
		else
			System.out.println("invalid");
	}

	public static void main(String[] args) 
	{
		String str = "aaaabbbbcccc";
		divide(str,3);

	}

}
