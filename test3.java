import java.util.*;
public class test3
{
	public static void main(String[] args)
	{
		int x=3,y=17;
		boolean yn=true;
		System.out.println("x+y*x--="+(x+y*x--));
		x=3;
		y=17;
		System.out.println("-x*y+y="+(-x*y+y));
		x=3;
		y=17;
		System.out.println("x<y&&yn="+(x<y&&yn));
		x=3;
		y=17;
		System.out.println("x>y||!yn="+(x>y||!yn));
		x=3;
		y=17;
		System.out.println("y!=++x?x:y="+(y!=++x?x:y));
		x=3;
		y=17;
		System.out.println("y++/--x="+(y++/--x));
		x=3;
		y=17;
		System.out.println("--y>>>3="+(--y>>>3));
		x=3;
		y=17;
		System.out.println("++x/++x="+(++x/++x));
		x=3;
		y=17;
		System.out.println("x++/++x="+(x++/++x));
		x=3;
		y=17;
		System.out.println("++x/x++="+(++x/x++));
	}
}