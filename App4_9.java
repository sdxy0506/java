import java.util.*;
public class App4_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a,b,k;
		Scanner reader=new Scanner(System.in);
		System.out.print("�������һ����������");
		a=reader.nextInt();
		System.out.print("������ڶ���������:");
		b=reader.nextInt();
		do{
			k=a%b;
			a=b;
			b=k;
		}
		while(k!=0);
		System.out.print(a+"�����ǵ����Լ����");
		
        
	}

}
