import java.util.*;
public class test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int n;
		Scanner reader=new Scanner(System.in);
		System.out.print("������һ������:");
		n=reader.nextInt();
		if(n%30==0){
			System.out.print("�����ܱ�2,3,5,6,10,15,30������");
		}
		else if(n%15==0){
			System.out.print("�����ܱ�3,5,15������");
		}
		else if(n%10==0){
			System.out.print("�����ܱ�2,5,10������");
		}
		else if(n%6==0){
			System.out.print("�����ܱ�2,3,6������");
		}
		else if(n%5==0){
			System.out.print("�����ܱ�5������");
		}
		else if(n%3==0){
			System.out.print("�����ܱ�3������");
		}
		else if(n%2==0){
			System.out.print("�����ܱ�2������");
		}
		else {System.out.print("������Щ��������");}

	}

}
