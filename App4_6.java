import java.util.*;
public class App4_6
{
	public static void main(String[] args)
	{
		int i=0,j=1,k=0,n,m;
		Scanner reader=new Scanner(System.in);
		System.out.print("������һ������:");
		m=reader.nextInt();
		while(k<20)
		{
			n=i+j;
			
			if(n==m){System.out.print(m+"��쳲������������������");break;}
			else if(n>m){System.out.print(m+"����쳲������������������");break;}
			else{
				i=j;
			    j=n;
			    k=k+1;}
		}
	}
}