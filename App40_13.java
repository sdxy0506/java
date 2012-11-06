//输入圆柱体的地面半径和高，输出其体积
import java.util.*;
public class App40_13
{
	public static void main(String[] args)
	{
		int r,h;
		double v;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入圆柱的底面半径：");
		r=reader.nextInt();
		System.out.print("请输入圆柱的高：");
		h=reader.nextInt();
		v=3.14*r*r*h;
		System.out.println("圆柱的体积为："+v);
		
		}
	}