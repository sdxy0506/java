import java.io.*;
public class App4_4
{
	public static void main(String[] args) throws IOException
	{
		int month,days;
		String str;
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�������·ݣ�");
		str=buf.readLine();
		month=Integer.parseInt(str);
		switch(month)
		{
			case 2: days=28;
			        break;
			case 4:
			case 6:
			case 9:
			case 11: days=30;
			         break;
			default: days=31;
		}
		System.out.println(month+"�·�Ϊ\""+days+"\"��");
	}
}