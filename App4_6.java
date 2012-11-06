import java.util.*;
public class App4_6
{
	public static void main(String[] args)
	{
		int i=0,j=1,k=0,n,m;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个整数:");
		m=reader.nextInt();
		while(k<20)
		{
			n=i+j;
			
			if(n==m){System.out.print(m+"是斐波那契数列里面的数。");break;}
			else if(n>m){System.out.print(m+"不是斐波那契数列里面的数。");break;}
			else{
				i=j;
			    j=n;
			    k=k+1;}
		}
	}
}