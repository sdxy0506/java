import java.util.*;
public class App_test1 {
	public static void main(String[] args) {
		int num,i,j,k,t,flag1=0,flag2=0;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个偶数：");
		num=reader.nextInt();
		k=3;
		t=num-k;
		while(k<num/2&&flag1==0&&flag2==0)
		{
			i=3;
			t=num-k;
			while(i<Math.sqrt(k)&&(k%i!=0))
			{
				i++;
			}
			if(i>Math.sqrt(k))
			{
				j=3;
				while(j<Math.sqrt(t)&&(t%j!=0))
				{
					j++;					
				}
				if(j>Math.sqrt(t))
					flag2=0;
				else flag2=1;
			}
			else flag1=1;
			if(flag1==0&&flag2==0)
				System.out.println(k+" "+t);
			else
			{
				flag1=0;
				flag2=0;
			}
			k=k+2;
			
		}

	}

}
