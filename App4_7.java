import java.util.*;
public class App4_7
{
	public static void main(String[] args)
	{
		double sum=0,num=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入多个数据，输入结束后用Enter结束:");
		System.out.println("输入一个字母作为结束。");
		while(reader.hasNextDouble())
		{
			num=reader.nextDouble();
			sum=sum+num;
		}
		System.out.print("输入的所有的数的总和为："+sum);
	}
}