
public class App5_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={12,24,10,8,25,100,60,200};
		int i,j,temp;
		for(i=(a.length-1);i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	System.out.println(a[a.length-1]+" "+a[0]);
	
	}

}
