import java.util.*;
public class App4_3
{
	public static void main(String[] args) throws Exception
    {
    	float a,b;
    	char oper;
    	Scanner reader=new Scanner(System.in);
    	System.out.print("�������һ����:");
    	a=reader.nextFloat();
    	System.out.print("������ڶ�����:");
    	b=reader.nextFloat();
    	System.out.print("�������������:");
    	oper=(char)System.in.read();
    	switch(oper)
    	{
    		case '+':
    		System.out.println(a+"+"+b+"="+(a+b));
    		break;
    		case '-':
    	    System.out.println(a+"-"+b+"="+(a-b));
    	    break;
    	    case '*':
    	    System.out.println(a+"*"+b+"="+(a*b));
    	    break;
    	    case '/':
    	    System.out.println(a+"/"+b+"="+(a/b));
    	    break;
    	    default:
    	    System.out.println("����ķ��Ų���ȷ��");
    	}
    }	
	}
