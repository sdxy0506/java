//由键盘输入字符串
import java.io.*;//加载 java.io类库里的所有类
public class App3_3
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader buf;//声明buf为BufferedReader类的变量，该类在java.io类库中
		String str;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入字符串:");
		str=buf.readLine();//将输入的字符串指定给str存放
		System.out.println("您输入的字符串为:\n"+str);
		}
	}