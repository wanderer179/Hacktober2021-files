// A JAVA Program to find the sum of the elements of an array

public class array_ele_sum
{
    public static void main(String[] args)
    {
        int arr[] = {1,3,4,1,4,2,3,4,3,4,5,4,3,4};
        int len = arr.length;
        int sum = 0;

        for (int i = 0; i < len; i++)
        {
            sum += i;
        }

        System.out.println("The Sum of the elements of the array is: " + sum);
    }
}