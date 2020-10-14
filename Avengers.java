
import java.util.Scanner;
public class Avengers
{
    String name,power,weapon,planet = new String();
    int age;
    Scanner sc= new Scanner(System.in);

    public void Getdeatiles()
    {
        System.out.println("Enter Avenger name : ");
        name = sc.next();
        System.out.println("Enter Avenger age : ");
        age = sc.nextInt();
        System.out.println("Enter Avenger power : ");
        power = sc.next();
        System.out.println("Enter Avenger weapon : ");
        weapon = sc.next();
        System.out.println("Enter Avenger planet : ");
        planet = sc.next();

    }
    public void Displaydeatiles()
    {
        System.out.println("Avenger name is "+name);
        System.out.println("Avenger age is "+age);
        System.out.println("Avenger power is "+power);
        System.out.println("Avenger weapon is "+weapon);
        System.out.println("Avenger planet is "+planet);
    }

    public static void main(String[] args)
    {
        System.out.println("DAY 4 - QUESTION 1");
        System.out.println("------------------------------------");
        Avengers[] marvel = new Avengers[5];
        for(int i = 0; i <5;i++)
        {
            marvel[i]= new Avengers();
            marvel[i].Getdeatiles();
        }
        for(int j = 0;j<5;j++)
        {
            marvel[j].Displaydeatiles();
        }
    }
}

