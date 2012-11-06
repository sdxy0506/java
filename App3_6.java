//由键盘输入多个数据
import java.util.*;//加载 java.io类库里的所有类
public class App3_6
{
	public static void main(String[] args) 
	{
		int num1;
		float num2;
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		num1=reader.nextInt();
		System.out.println("请输入第二个数：");
        num2=reader.nextFloat();
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		
		}
	}