import java.util.*;
public class Test5_1 {

	public static void main(String[] args) {
		double[] arr=new double[20];
		double avg,sum=0;
		int i=0,n=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("������n���������ÿո�����������һ����ĸ������");
		while(reader.hasNextDouble())
		{
			arr[i]=reader.nextDouble();
			i++;
			n++;
		}
		for(double element:arr)
			sum=sum+element;
		avg=sum/n;
		for(double element:arr)
		{
			if(element>avg)
				System.out.print(element+" ");
		}	

	}

}
