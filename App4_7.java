import java.util.*;
public class App4_7
{
	public static void main(String[] args)
	{
		double sum=0,num=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("�����������ݣ������������Enter����:");
		System.out.println("����һ����ĸ��Ϊ������");
		while(reader.hasNextDouble())
		{
			num=reader.nextDouble();
			sum=sum+num;
		}
		System.out.print("��������е������ܺ�Ϊ��"+sum);
	}
}