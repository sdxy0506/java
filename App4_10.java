import java.util.*;
public class App4_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int n=1,s=1,m;
		Scanner reader=new Scanner(System.in);
		do{
			System.out.print("������һ������1��������");
			m=reader.nextInt();
		}
		while(m<=1);
		while(s<m){
			s=s*n;
			n++;
		}
		System.out.print("s="+s/(n-1)+",n="+(n-2));

	}

}
