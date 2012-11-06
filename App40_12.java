//输入两个整数，并将它们相除
import java.util.*;
public class App40_12
{
	public static void main(String args[])
	{
		int a,b;
		float c;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		a=reader.nextInt();
		System.out.print("请输入第二个整数：");
		b=reader.nextInt();
		c=(float)a/b;
		System.out.println(a+"/"+b+"="+c);
		}
	}