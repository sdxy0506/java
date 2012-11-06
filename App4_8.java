import java.util.*;
public class App4_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        int i=1,n,sum=0;
        Scanner reader=new Scanner(System.in);
        do{
        	System.out.print("请输入一个正整数：");
        	n=reader.nextInt();
        }
        while(n<=0);
        while(i<=n){
        	sum+=i;
        	i++;
        }
        System.out.print("1+2+3+...+"+n+"="+sum);
	}

}
