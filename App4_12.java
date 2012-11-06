
public class App4_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x=1,y=0,j,k=1;
		while(k==1)
		{
			y=x*x+x+41;
			if(y%2==0) 
		    	k=0;
		    else{
		    	j=3;
		    	while(j<Math.sqrt(y)&&(y%j!=0))
		    		j++;
		    	if(j<=Math.sqrt(y))
		    		k=0;
		    }
			x++;
		}
		System.out.print(x-1);
		/*int x,y=0,j;
	    Scanner reader=new Scanner(System.in);
	    System.out.print("请输入一个正整数x:");
	    x=reader.nextInt();
	    y=x*x+x+41;
	    if(y%2==0) 
	    	System.out.print(y+"不是素数.");
	    else{
	    	j=3;
	    	while(j<Math.sqrt(y)&&(y%j!=0))
	    		j++;
	    	if(j>Math.sqrt(y))
	    		System.out.print(y+"是素数。");
	    }*/

	}

}
