import java.util.*;
public class App4_1
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner reader=new Scanner(System.in);
		System.out.print("�������һ��������");
		a=reader.nextInt();
		System.out.print("������ڶ���������");
		b=reader.nextInt();
		System.out.print("�����������������");
		c=reader.nextInt();
		if(a>b)
		{
			if(a<c)
			{
				System.out.println(c+"���"+b+"��С��");
				}
			else if(b>c)
			{
				System.out.println(a+"���"+c+"��С��");
				}
			else 
			{
				System.out.println(a+"���"+b+"��С��");
				}
			}
		else
		{
			if(b<c)
			{
				System.out.println(c+"���"+a+"��С��");
				}
			else if(a>c)
			{
				System.out.println(b+"���"+c+"��С��");
				}
			else
			{
				System.out.println(b+"���"+a+"��С��");
				}
			}
		}
	
	}