public class Kadane{
	public static void main(String args[]) {
		int[] a = {1,2,3,-2,5};
		int totalsum = Integer.MIN_VALUE, sum = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
			if(totalsum<sum) 
				totalsum = sum;
			if(sum<0) 
				sum = 0;
		}
		System.out.println(totalsum);
	}
}
