import java.util.*;
public class test4_2
{
	public static void main(String[] args)
	{
		int testScore;
		char grade;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入成绩：");
		testScore=reader.nextInt();
		if(testScore<0||testScore>100){System.out.println("您输入的成绩无效！");}
		else
		{
			testScore=testScore/5;
			switch(testScore)
    	{
    		case 20:
    		case 19:
    		case 18:
    		case 17:
    		grade='A';
    		break;
    		case 16:
    		case 15:
    		case 14:
    	    grade='B';
    	    break;
    	    case 13:
    	    case 12:
    	    grade='C';
    	    break;
    	    default:
    	    grade='D';
    	}
    	System.out.println("评定成绩为："+grade);
    	}
		/*if(testScore<0||testScore>100){System.out.println("您输入的成绩无效！");}
		else{
		  if(testScore>=85){grade='A';}
		  else if(testScore>=70){grade='B';}
		  else if(testScore>=60){grade='C';}
		  else {grade='D';}
		  System.out.println("评定成绩为："+grade);
		  }*/
		}
	}