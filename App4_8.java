import java.util.*;
public class App4_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        int i=1,n,sum=0;
        Scanner reader=new Scanner(System.in);
        do{
        	System.out.print("������һ����������");
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
