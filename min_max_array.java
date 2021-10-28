// A Java Program to find the largest and the smallest value in an array

public class min_max_array
{
    public static void main(String[] args)
    {
        int arr[] = {1,4,2,4,34,54,65,54};
        int len = arr.length;
        int min = arr[0], max = arr[0];

        for (int i = 0; i < len; i++)
        {
            if (max < arr[i])
                max = arr[i];
            
            if (min > arr[i])
                min = arr[i];
        }

        System.out.println("The Largest number is: ", max);
        System.out.println("The Smallest number is: ", min);
    }
}