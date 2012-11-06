//输入一个浮点数，输出其整数部分
import java.util.*;
public class App40_11
{
	public static void main(String[] args)
	{
		float num;
		int a;
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入一个浮点数：");
		num=reader.nextFloat();
		a=(int)num;
		System.out.println("输出整数部分："+a);
		
		}
	}