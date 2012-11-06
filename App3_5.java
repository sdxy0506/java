//由键盘输入多个数据
import java.io.*;//加载 java.io类库里的所有类
public class App3_5
{
	public static void main(String[] args) throws IOException
	{
		int num1,num2;
		String str1,str2;
		InputStreamReader in;
		BufferedReader buf;
		in=new InputStreamReader(System.in);
		buf=new BufferedReader(in);
		System.out.println("请输入第一个数：");
		str1=buf.readLine();
		num1=Integer.parseInt(str1);
		System.out.println("请输入第二个数：");
		str2=buf.readLine();
		num2=Integer.parseInt(str2);
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		
		}
	}