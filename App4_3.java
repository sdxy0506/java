import java.util.*;
public class App4_3
{
	public static void main(String[] args) throws Exception
    {
    	float a,b;
    	char oper;
    	Scanner reader=new Scanner(System.in);
    	System.out.print("请输入第一个数:");
    	a=reader.nextFloat();
    	System.out.print("请输入第二个数:");
    	b=reader.nextFloat();
    	System.out.print("请输入运算符号:");
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
    	    System.out.println("输入的符号不正确！");
    	}
    }	
	}
