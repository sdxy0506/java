//next与nextLine的区别
import java.util.*;
public class App3_7
{
	public static void main(String[] args)
	{
		String s1,s2;
		Scanner n=new Scanner(System.in);
		System.out.print("请输入第一个字符串:");
		s1=n.nextLine();//nextLine返回的是Enter键之前的所有字符
		System.out.print("请输入第二个字符串:");
		s2=n.next();//next一定要读取到有效字符后才可以结束输入
		System.out.print("\n输入的是"+s1+"和"+s2+"\n");
		}
	}