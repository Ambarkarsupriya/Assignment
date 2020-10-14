import java.util.Scanner;
public class sum
{
    public static void main(String args[])
    {
        System.out.println("DAY 4 - QUESTION 3");
        System.out.println("----------------------------");
        int[] arr = new int[5];
        int sum=0;
        Scanner n = new Scanner(System.in);
        for( int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the "+i+" array value ");
            arr[i] = n.nextInt();
        }

        for(int i =0; i<5;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("Sum of the elements of the arrays: "+sum);
    }

}
