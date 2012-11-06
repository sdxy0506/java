//由键盘输入整数
import java.io.*;//加载 java.io类库里的所有类
public class App3_4
{
	public static void main(String[] args) throws IOException
	{
		float num;
		String str;
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入一个实数:");
		str=buf.readLine();
		num=Float.parseFloat(str);//将str转换成float类型赋值给num
		System.out.println("您输入的实数为:\n"+num);
		}
	}