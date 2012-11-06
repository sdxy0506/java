
public class Test5_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N,S,M,k,j,g,i,t;
		int[] a=new int[30];
		//int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,189,20,21,22,23,24,25,26,27,28,29,30};
		N=30;
		S=1;
		M=13;
		k=N;
		g=1;
		i=S-1;
		for(t=0;t<N;t++)
		{
			a[t]=t+1;
		}
		do{
			i=i+M-1;
			i=i%k;
			System.out.print(a[i]+" ");
			for(j=i;j<k-1;j++)
				a[j]=a[j+1];
			k--;
			g++;
		}
		while(g<=15);

	}

}
