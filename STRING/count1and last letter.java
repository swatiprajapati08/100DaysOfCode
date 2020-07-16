
public String Calculate(String input)
{
String s=input1.toLowerCase();
	String str[]=s.split(" ");
	String ans="";
	for(int i=0;i<str.length;i++)
	{
			int cal=0;
			int l=0,r=str[i].length()-1;
			while(l<r)
			{
				int left=str[i].charAt(l)-'a';
				int right=str[i].charAt(r)-'a';
				cal+=Math.abs(left-right);
				l++;r--;
			}
			if(str[i].length()%2!=0)
			cal+=str[i].charAt(str[i].length()/2)-'a'+1;
		ans+=String.valueOf(cal);
	}

	return Integer.parseInt(ans);

	}
}
