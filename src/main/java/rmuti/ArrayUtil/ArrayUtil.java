package rmuti.ArrayUtil;

public class ArrayUtil 
{
	public String contactArray(String[] strArr)
	{
		String str = " ";
		for(int i = 0; i<4; i++)
		{
			str = str+strArr[i];
		}
		return str;
	}
	
	public static void main(String[] args)
	{
		ArrayUtil arr = new ArrayUtil();
		String[] str = new String[4];
		str[0] = "str0 ";
		str[1] = "str1 ";
		str[2] = "str2 ";
		str[3] = "str3 ";
		
		System.out.println(arr.contactArray(str));
	}
	
}
