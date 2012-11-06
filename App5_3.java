
public class App5_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N,S,M,k,j,g,i;
		int[] a={1,2,3,4,5,6,7,8,9,10};
		N=10;
		S=3;
		M=7;
		k=N;
		g=1;
		i=S-1;
		do{
			i=i+M-1;
			i=i%k;
			System.out.print(a[i]+" ");
			for(j=i;j<k-1;j++)
				a[j]=a[j+1];
			k--;
			g++;
		}
		while(g<=N);

	}

}
