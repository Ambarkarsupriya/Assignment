package com.firstjava;
public  class Employee
{
  String name = new String();
  int age;
  String city = new String();

  public void display() {
    System.out.println("The name is : " + name);
    System.out.println("The age is : " + age);
    System.out.println("The city is : " + city);
  }


    public static void main(String[] args) {
      System.out.println("DAY-2 ASSIGNMENT");
      System.out.println("-------------------------");
      Employee a = new Employee();
      a.name = "Ram";
      a.age = 23;
      a.city = "chennai";
      a.display();
      Employee a1 = new Employee();
      a1.name = "Ravi";
      a1.age = 25;
      a1.city = "hyderabad";
      a1.display();
    }
  }
