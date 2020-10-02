import java.util.*;
import java.lang.*;
import java.io.*;
class TowerOfHanoi
 {
	public static void main (String[] args)
	 {
	  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of test cases");
	  int t = sc.nextInt();
	  
	  while(t>0)
	  {t--;
     System.out.println("Enter the number of discs");
	   int n = sc.nextInt();
	   System.out.println(towerOfHanoi(n,1,3));
	  }
     }
     
     static int towerOfHanoi(int n,int fromRod,int toRod){
         int step = 0;
         if(n==1)
         {
             System.out.println("move disk "+n+" from rod "+fromRod+" to rod "+toRod);
             return 1;
         }
         
         int helpRod = 6-fromRod-toRod;
         step += towerOfHanoi(n-1,fromRod,helpRod);
         System.out.println("move disk "+n+" from rod "+fromRod+" to rod "+toRod); step++;
         step += towerOfHanoi(n-1,helpRod,toRod);
            
         return step;
     }
}
