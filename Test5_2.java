import java.util.*;
public class Test5_2 {

	public static void main(String[] args) {
		int k=0,n=0,i,j,temp,N=20;
		int[] arr=new int[N];
		Scanner reader=new Scanner(System.in);
		System.out.println("������n���������ÿո񡢻س����߻��м������������һ����ĸ������");
		while(reader.hasNextInt())
		{
			arr[k]=reader.nextInt();
			k++;
			n++;
		}
		for(i=n;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	System.out.println(arr[n]+" "+arr[1]);

	}

}
