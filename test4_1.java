import java.util.*;
public class test4_1
{
	public static void main(String[] args)
	{
		int testScore;
		String grade;
		Scanner reader=new Scanner(System.in);
		System.out.print("������ɼ���");
		testScore=reader.nextInt();
		if(testScore<0||testScore>100){System.out.println("������ĳɼ���Ч��");}
		else
		{
			testScore=testScore/10;
			switch(testScore)
    	{
    		case 10:
    		case 9:
    		grade="��";
    		break;
    		case 8:
    	    grade="��";
    	    break;
    	    case 7:
    	    grade="��";
    	    break;
    	    case 6:
    	    grade="����";
    	    break;
    	    default:
    	    grade="������";
    	    break;
    	}
    	System.out.println("�����ɼ�Ϊ��"+grade);
    	}
   		/*if(testScore<0||testScore>100){System.out.println("������ĳɼ���Ч��");}
		else{
		  if(testScore>=90){grade="��";}
		  else if(testScore>=80){grade="��";}
		  else if(testScore>=70){grade="��";}
		  else if(testScore>=60){grade="����";}
		  else {grade="������";}
		  System.out.println("�����ɼ�Ϊ��"+grade);
		  }*/
		}
	}