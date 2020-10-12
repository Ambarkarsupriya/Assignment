package Salary;
import com.sun.xml.internal.ws.wsdl.writer.WSDLOutputResolver;

import java.util.Scanner;

public class Employeesal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name: ");
        String name = sc.next();
        System.out.println("Enter date of birth");
        int dob = sc.nextInt();
        System.out.println("Enter birth month");
        int month = sc.nextInt();
        System.out.println("Enter birth year");
        int year = sc.nextInt();
        System.out.println("Enter monthly employee salary : ");
        float salary = sc.nextFloat();

        float annualSalary = salary*12;
        int a=100000;
        int age = 2020-year;
        float tax;

        System.out.println("EMPLOYEE SALARY DETAILES ");
        System.out.println("---------------------------------");
        System.out.println("Employee name : "+name);
        System.out.println("Employee age : "+age);
        System.out.println("employee Annual Salary : "+annualSalary);

        if(annualSalary > 5*a)
        {
            tax = annualSalary*20/100;
            System.out.println("Employee has to pay tax : "+tax);
        }
        else if(annualSalary>4*a)
        {
            tax = annualSalary*15/100;
            System.out.println("Employee has to pay tax : "+tax);
        }
        else if(annualSalary>3*a)
        {
            tax = annualSalary*10/100;
            System.out.println("Employee has to pay tax : "+tax);
        }
        else if(annualSalary> 2*a)
        {
            tax = annualSalary * 5 / 100;
            System.out.println("Employee has to pay tax :" + tax);
        }
        else
        {
            System.out.println("Employee has to pay no tax.");
        }
    }
}
