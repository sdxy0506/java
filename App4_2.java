import java.util.*;
public class App4_2
{
	public static void main(String[] args)
	{
		int testScore;
		char grade;
		Scanner reader=new Scanner(System.in);
		System.out.print("������ɼ���");
		testScore=reader.nextInt();
		if(testScore<0 ){System.out.println("������ĳɼ���Ч��");}
		else{
		  if(testScore>=90){grade='A';}
		  else if(testScore>=80){grade='B';}
		  else if(testScore>=70){grade='C';}
		  else if(testScore>=60){grade='D';}
		  else {grade='E';}
		  System.out.println("�����ɼ�Ϊ��"+grade);
		  }
		}
	}