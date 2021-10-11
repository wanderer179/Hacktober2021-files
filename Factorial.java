


public class Factorial {
	
	int number;
	int factorial;
	
	Factorial(int value)
	{
		number = value;
		factorial=1;
	}
	
	int cal_factorial()
	{
		for(int i=number;i>=1;i--)
		{
			factorial*=i;
		}
		return factorial;
	}
	void display_factorial()
	{
		System.out.println(factorial);
	}

	public static void main(String[] args) {
		
		Factorial f = new Factorial(5);
		f.cal_factorial();
		f.display_factorial();
		
	}

}

class FactorialExample
{  
  public static void main(String args[])
  {  
    int i,fact=1;  
    int number=5;//It is the number to calculate factorial    
    for(i=1;i<=number;i++)
    {    
        fact=fact*i;    
    }    
    System.out.println("Factorial of "+number+" is: "+fact);    
  }  
}  

