import java.util.*;
public class test4_1
{
	public static void main(String[] args)
	{
		int testScore;
		String grade;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入成绩：");
		testScore=reader.nextInt();
		if(testScore<0||testScore>100){System.out.println("您输入的成绩无效！");}
		else
		{
			testScore=testScore/10;
			switch(testScore)
    	{
    		case 10:
    		case 9:
    		grade="优";
    		break;
    		case 8:
    	    grade="良";
    	    break;
    	    case 7:
    	    grade="中";
    	    break;
    	    case 6:
    	    grade="及格";
    	    break;
    	    default:
    	    grade="不及格";
    	    break;
    	}
    	System.out.println("评定成绩为："+grade);
    	}
   		/*if(testScore<0||testScore>100){System.out.println("您输入的成绩无效！");}
		else{
		  if(testScore>=90){grade="优";}
		  else if(testScore>=80){grade="良";}
		  else if(testScore>=70){grade="中";}
		  else if(testScore>=60){grade="及格";}
		  else {grade="不及格";}
		  System.out.println("评定成绩为："+grade);
		  }*/
		}
	}