import java.util.*;
public class App4_1
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		a=reader.nextInt();
		System.out.print("请输入第二个整数：");
		b=reader.nextInt();
		System.out.print("请输入第三个整数：");
		c=reader.nextInt();
		if(a>b)
		{
			if(a<c)
			{
				System.out.println(c+"最大，"+b+"最小。");
				}
			else if(b>c)
			{
				System.out.println(a+"最大，"+c+"最小。");
				}
			else 
			{
				System.out.println(a+"最大，"+b+"最小。");
				}
			}
		else
		{
			if(b<c)
			{
				System.out.println(c+"最大，"+a+"最小。");
				}
			else if(a>c)
			{
				System.out.println(b+"最大，"+c+"最小。");
				}
			else
			{
				System.out.println(b+"最大，"+a+"最小。");
				}
			}
		}
	
	}