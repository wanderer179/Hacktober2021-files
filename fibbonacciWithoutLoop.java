
//  This code will print fibbonacci series till a given number without using a single loop.


import java.util.Scanner;
public class fibbonacciWithoutLoop
{
    public static int recur(int n){
        if(n == 0){
            return 0;
        }
        if(n <= 2){
            return 1;
        }
        return recur(n-1)+recur(n-2);
    }
    public static void fib(int n, int val){
        if(val <= n){
            System.out.println(recur(val));
            fib(n, val+1);
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int val = 0;
	    int n = sc.nextInt();        //Input the Number  
	    fib(n, val);
		
	}
}
