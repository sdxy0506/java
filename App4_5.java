public class App4_5
{
	public static void main(String[] args)
	{
		int i=0,j=1,k=0,n;
		System.out.print("0 1 ");
		while(k<14)
		{
			n=i+j;
			i=j;
			j=n;
			k=k+1;
			System.out.print(j+" ");
		}
	}
}