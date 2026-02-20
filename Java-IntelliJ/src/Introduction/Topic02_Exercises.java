package Introduction;

public class Topic02_Exercises {
    static void main() {

        // Exercise 1 - Sum and Difference
        int numberOneExOne = 40;
        int numberTwoExOne = 20;
        System.out.println(numberOneExOne+" + "+numberTwoExOne+" = "+(numberOneExOne + numberTwoExOne));
        System.out.println(numberOneExOne+" - "+numberTwoExOne+" = "+(numberOneExOne - numberTwoExOne));
        System.out.println(numberOneExOne+" x "+numberTwoExOne+" = "+(numberOneExOne * numberTwoExOne));
        System.out.println(numberOneExOne+" / "+numberTwoExOne+" = "+(numberOneExOne / numberTwoExOne));

        System.out.println();

        // Exercise 2 - Rest of Division
        int numberOneExTwo = 40;
        int numberTwoExTwo = 2;
        int numberThreeExTwo = 3;
        System.out.println("Rest of "+numberOneExTwo+" / "+numberTwoExTwo+" = "+(numberOneExTwo % numberTwoExTwo));
        System.out.println("Rest of "+numberOneExTwo+" / "+numberThreeExTwo+" = "+(numberOneExTwo % numberThreeExTwo));

        System.out.println();

        // Exercise 3 - Real Division x Integer Division
        int numberOneExTwoInteger = 40;
        double numberOneExTwoReal = 40.0;
        int numberTwoExTwoInteger = 2;
        double numberTwoExTwoReal = 2.0;
        System.out.println("Rest of "+numberOneExTwoInteger+" / "+numberTwoExTwoInteger+" = "+(numberOneExTwoInteger % numberTwoExTwoInteger));
        System.out.println("Rest of "+numberOneExTwoReal+" / "+numberTwoExTwoReal+" = "+(numberOneExTwoReal % numberTwoExTwoReal));
            /*
                A division between integers is always an integers
                A division between real numbers is always a real number
                So inside a Primitive Type (float or double) we can't do a division
                between Integers and the same for inside an Integer Primitive Type
             */

        System.out.println();

        // Exercise 4 - Update Values
        double balance = 1000;
        double deposit = 250;
        double drawing = 120;
        double tax = (5.0 / 100) * drawing;
        System.out.println("Current Balance: R$ "+balance);
        System.out.println("Depositing (R$ "+deposit+")");
        System.out.println("Drawing (R$ "+drawing+"), applying a Fee (5% = R$ "+tax+")");
        System.out.println("Money withdrawn (R$ "+(drawing + tax)+")");
        System.out.println("New Balance: R$ "+(balance + deposit - drawing + tax) );

        System.out.println();

        // Exercise 5 - Increment
        int counter = 0;
        ++counter;
        ++counter;
        ++counter;
        ++counter;
        ++counter;
        System.out.println(counter);

        System.out.println();

        // Exercise 6 - Pre-Increment and Post-Increment
        int x = 5;
        System.out.println(x++);
        System.out.println(++x);
            /*
                x = 5, to the next code line println prints the number and after sum 1.
                For the last line code, println use the new value +1 that is 6 (5 + 1)
                and prints seven because println sum 1 to 6 (6 + 1).
            */

        System.out.println();

        // Exercise 7 - Simple Comparison
        int numberOneExSeven = 10;
        int numberTwoExSeven = 12;
        System.out.println(numberOneExSeven > numberTwoExSeven);
        System.out.println(numberOneExSeven < numberTwoExSeven);
        System.out.println(numberOneExSeven != numberTwoExSeven);
        System.out.println(numberOneExSeven == numberTwoExSeven);
        System.out.println(numberOneExSeven <= numberTwoExSeven);
        System.out.println(numberOneExSeven >= numberTwoExSeven);

        System.out.println();

        // Exercise 8 - Precedence (Without run code)
        int one = 5 + 3 * 2; /* 11 */
        int two = (5 + 3) * 2; /* 16 */

        System.out.println();

        // Exercise 9 - Multi-word Expression (Explain)
        int a = 10;
        int b = 3;
        System.out.println(a / b * b + a % b);
            /*
                Division (a / b) -> Multiplication (Division Result  * b) -> Rest (a % b) ->
                Sum (Result [Division Result * B] + Rest Result )
            */
    }
}
