package Introduction;

public class Topic01_Exercises {
    static void main() {

        // Exercise 1 - Declare and print
        int number = 10;
        System.out.println("Number is: "+number);

        System.out.println();

        // Exercise 2 - Simple sum
        byte firstNumber = 10;
        short secondNumber = 20;
        System.out.println(firstNumber+" + "+secondNumber+" = " +(firstNumber + secondNumber));

        System.out.println();

        // Exercise 3 - Product (Multiplication)
        float numberOne = 20.5F;
        int numberTwo = 4;
        System.out.println(numberOne+" x "+numberTwo+" = " +(numberOne * numberTwo));

        System.out.println();

        // Exercise 4 - Casting
        int integerCasting = 350;
        System.out.println((double)integerCasting);

        System.out.println();

        // Exercise 5 - Temperature
        double temperatureCelsius = 35;
        double temperatureFahrenheit = (temperatureCelsius * 9 / 5) + 32;
        System.out.println("Celsius ("+temperatureCelsius+"°C) to Fahrenheit: "+temperatureFahrenheit+"°F");

        System.out.println();

        // Exercise 6 - Circle Area
        double radiusCircle = 5;
        double valuePi = 3.14159;
        System.out.println("Circle area = "+valuePi * (radiusCircle * radiusCircle));

        System.out.println();

        // Exercise 7 - Salary
        double salaryByHour = 30;
        int hoursWorked = 240;
        System.out.println("Your salary is: "+salaryByHour * hoursWorked);

        System.out.println();

        // Exercise 8 - Exchange of Values with Auxiliary Variable
        int principalValue = 10;
        int secondaryValue = 20;
        int auxiliaryVariable = principalValue;
        principalValue = secondaryValue;
        secondaryValue = auxiliaryVariable;

        principalValue = principalValue + secondaryValue;
        secondaryValue = principalValue - secondaryValue;
        principalValue = principalValue - secondaryValue;

        System.out.println(principalValue);
        System.out.println(secondaryValue);

        System.out.println();

        // Exercise 9 - Predecessor and Successor
        int numberFix = 10;
        System.out.println("Predecessor: "+(numberFix - 1));
        System.out.println("Successor: "+(numberFix + 1));

        System.out.println();

        // Exercise 10 - Fuel Consumption
        double distance = 300;
        float fuel = 20;
        System.out.println("Car autonomy: "+(distance / fuel)+"km/l");

        System.out.println();

        // Exercise 11 - IMC
        double weight = 70.5;
        double height = 1.76;
        System.out.println("IMC: "+(weight / (height * height)));

        System.out.println();

        // Exercise 12 - Simple Interest
        double capital = 40000;
        double taxAnnual = 0.08;
        double timeYear = 5;
        System.out.println("Simple Interest (Annual Fee): "+(capital * taxAnnual * timeYear));

        System.out.println();

        // Exercise 13 - Volume
        double length = 18;
        double otherHeight = 39;
        double width = 94;
        System.out.println("Volume: "+(length * otherHeight * width));

        System.out.println();

        // Exercise 14 - Isosceles Triangle Area
        double triangleBase = 12;
        double triangleHeight = 34;
        System.out.println("Isosceles Triangle Area: "+(triangleBase * triangleHeight / 2));

        System.out.println();

        // Exercise 15 - Currency Conversion (Reais R$ to Dollars $)
        double reaisValue = 3500;
        double exchangeRate = 5.2349;
        System.out.println("Reais (R$) to Dollars ($)"+(reaisValue / exchangeRate));

    }
}
