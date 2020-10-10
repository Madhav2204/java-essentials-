 import java.util.Scanner;

class Employee
{
   
    String Name;
    int Age;
    String City ;

    void details()           
    {
        Name = "Madhav";
        Age = 19 ;
        City = "Indore";

    }
    void details2(){
        
        Name = "Mayank";
        Age = 20 ;
        City = "Barwani";
        
    }

    void display()           // Defining display()
    {

        System.out.print("\n\tEmployee Name : " + Name);
        System.out.print("\n\tEmployee Age : " + Age);
        System.out.print("\n\tEmployee City : " + City);

    }

    public static void main(String args[])
    {

        Employee e1 = new Employee();// Creating Object
        Employee e2 = new Employee();
        e1.details();          // Calling GetData()
        e1.display();          // Calling display()
        e2.details2();
        e2.display();

        }
    }