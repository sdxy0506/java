import java.util.*;
public class App4_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a,b,k;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入第一个正整数：");
		a=reader.nextInt();
		System.out.print("请输入第二个正整数:");
		b=reader.nextInt();
		do{
			k=a%b;
			a=b;
			b=k;
		}
		while(k!=0);
		System.out.print(a+"是它们的最大公约数。");
		
        
	}

}
