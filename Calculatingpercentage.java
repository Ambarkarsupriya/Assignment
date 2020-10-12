package Studentmarks;
import java.util.Scanner;

public class Calculatingpercentage {
    public static void main(String[] args)
    {
        System.out.println("Day-3 ASSIGNMENT");
        System.out.println("-----------------------");

        int maths,che,phy,comp,eng;
        float total,percentage;
        Scanner sc= new Scanner(System.in);
        System.out.println("Student details:");
        System.out.println("Enter student name: ");
        String name = sc.next();
        System.out.println("Please Enter 5 subject marks:");
        System.out.println("Enter maths marks");
        maths = sc.nextInt();
        System.out.println("Enter che marks:");
        che= sc.nextInt();
        System.out.println("Enter phy marks:");
        phy = sc.nextInt();
        System.out.println("Enter comp marks:");
        comp = sc.nextInt();
        System.out.println("Enter eng marks:");
        eng = sc.nextInt();

        total = eng + che + phy + comp + eng;
        percentage = (total/500)*100;
        System.out.println("Student name = "+name);
        System.out.println("Total marks = "+total);
        System.out.println("percentage  = "+percentage);

        System.out.println(" The Student grade is : ");
        if(percentage>=80)
        {
            System.out.println("Your grade is A and percentage is "+percentage);
        }
        else if(percentage>=60 && percentage<80)
        {
            System.out.println("Your grade is B and percentage is"+percentage);
        }
        else if(percentage>=35 && percentage<60)
        {
            System.out.println("Your grade is C and percentage is"+percentage);
        }
        else
        {
            System.out.println("You have failed.Better luck next time! and your percentage is"+percentage);
        }
    }

}
