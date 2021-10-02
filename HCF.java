public class HCF {
    // Function to return gcd of a and b
    static int hcf(int a, int b)
    {
        if (a == 0)
            return b;
        return hcf(b % a, a);
    }

    // Function to find gcd of array of
    // numbers
    static int findHCF(int arr[], int n)
    {
        int result = 0;
        for (int element: arr){
            result = hcf(result, element);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        int arr[] = { 15, 35};
        int n = arr.length;
        System.out.println(findHCF(arr, n));
    }
}