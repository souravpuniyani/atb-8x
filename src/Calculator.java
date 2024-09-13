import java.util.Scanner;

public class Calculator {

    static int exit=0;

    public static void main(String[] args) {

        while(exit!=1)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the first number");
            double a= sc.nextDouble();
            System.out.println("Enter the second number");
            double b = sc.nextDouble();

            System.out.println("Enter your choice :");
            System.out.println("case + : Addition of two numbers");
            System.out.println("case - : Subtraction of two numbers");
            System.out.println("case * : Multiplication of two numbers");
            System.out.println("case / : Division of two numbers");
            System.out.println("case % : Modulus of two numbers");

            String input= sc.next();


            switch(input)
            {
                case "+":
                    addition(a,b);
                    System.out.println("Do you want to continue ? Y/N");
                    String result = sc.next();
                    forward(result);
                    break;

                case "-":
                    subtraction(a,b);
                    System.out.println("Do you want to continue ? Y/N");
                    String result1 = sc.next();
                    forward(result1);
                    break;

                case "*":
                    multiplication(a,b);
                    System.out.println("Do you want to continue ? Y/N");
                    String result2 = sc.next();
                    forward(result2);
                    break;

                case "/":
                    division(a,b);
                    System.out.println("Do you want to continue ? Y/N");
                    String result3 = sc.next();
                    forward(result3);
                    break;

                case "%":
                    modulus(a,b);
                    System.out.println("Do you want to continue ? Y/N");
                    String result4 = sc.next();
                    forward(result4);
                    break;
            }

        }

    }

    static void addition(double a, double b)
    {
        double c= a+b;
        System.out.println(" sum of number "+a + "and "+b +" is "+c);
    }
    static void subtraction(double a, double b)
    {
        double c= a-b;
        System.out.println(" Subtraction of number "+a + "and "+b +" is "+c);
    }
    static void multiplication(double a, double b)
    {
        double c= a*b;
        System.out.println("multiplication of number "+a + "and "+b +" is "+c);
    }
    static void division(double a, double b)
    {
        double c= a/b;
        System.out.println("division of number "+a + "and "+b +" is "+c);
    }
    static void modulus(double a, double b)
    {
        double c= a%b;
        System.out.println("modulus of number "+a + "and "+b +" is "+c);
    }
    static void exit()
    {
        exit=1;
    }
    static void forward(String result)
    {
        String s1=result.toLowerCase();
        if(s1.equals("n"))
        {
            exit();
        }
    }


}
