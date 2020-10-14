public class Printonlyoddvalues
{
    public static void main(String[] args)
    {
        System.out.println("DAY 4 - QUESTION 2");
        System.out.println("-------------------------");
        int[] arr = new int[] {23,34,54,67,87};
        System.out.println("Odd values in given array ");
        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
            }

        }

    }
}
