import java.util.*;
public class test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个整数:");
		n=reader.nextInt();
		if(n%30==0){
			System.out.print("该数能被2,3,5,6,10,15,30整除。");
		}
		else if(n%15==0){
			System.out.print("该数能被3,5,15整除。");
		}
		else if(n%10==0){
			System.out.print("该数能被2,5,10整除。");
		}
		else if(n%6==0){
			System.out.print("该数能被2,3,6整除。");
		}
		else if(n%5==0){
			System.out.print("该数能被5整除。");
		}
		else if(n%3==0){
			System.out.print("该数能被3整除。");
		}
		else if(n%2==0){
			System.out.print("该数能被2整除。");
		}
		else {System.out.print("不能这些数整除。");}

	}

}
