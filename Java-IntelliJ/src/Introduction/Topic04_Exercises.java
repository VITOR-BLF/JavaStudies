package Introduction;

public class Topic04_Exercises {
    static void main() {
        //Exercise 1 - Even numbers up to N
        int n = 20;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        //Exercise 2 - Odd numbers up to M
        int m = 30;
        for (int i = 1; i <= m; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        //Exercise 3 - Multiplication table
        int anyoneNumber = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(anyoneNumber+" x "+i+" = "+(anyoneNumber * i));
        }

        System.out.println();

        //Exercise 4 - Request negative number
        int anyoneNumberExFour = -10;
        do {
            System.out.println(anyoneNumberExFour);
            anyoneNumberExFour++;
        }while (anyoneNumberExFour <= 1);

        System.out.println();

        //Exercise 5 - Sum to zero
        int[] userNumber = {5, 4, 20, 50, 0, 3, 5};
        int numberExFive;
        int num = 0;
        int sum = 0;

        do {
            numberExFive = userNumber[num];
            System.out.println(numberExFive);
            sum += numberExFive;
            num++;
        }while (numberExFive != 0);
        System.out.println(sum);

        System.out.println();

        //Exercise 6 - Asterisk square
        for (int i = 1; i <= 5; i++) {
            for (int ij = 1; ij <= 5; ij++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();

        //Exercise 7 - Asterisk Triangle
        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        //Exercise 8 - Multiplication table (Nested loops)
        for (int numExEight = 1; numExEight <= 10; numExEight++) {
            System.out.println("\nMultiplication table of ("+numExEight+")\n");
            for (int j = 1; j <= 10; j++) {
                System.out.println(numExEight+" x "+j+" = "+numExEight * j);
            }
        }

        System.out.println();

        //Exercise 9 - First multiple of 7, without being 7
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i != 7) {
                System.out.println("Between 1 and 100, is the first multiple of 7: "+i);
                break;
            }
        }


        System.out.println();

        //Exercise 10 - Numbers 1 to 20, skipping 5
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) continue;
            System.out.println(i);
        }


        System.out.println();

        //Exercise 11 - Sum of digits
        int number = 1010;
        int sumExEleven = 0;

        while (number != 0) {
            int digit = number % 10;
            sumExEleven += digit;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sumExEleven);


        System.out.println();

        //Exercise 12 - Factorial
        int numberExTwelve = 10;
        int factorial = 1;

        for (int i = numberExTwelve; i >= 1; i--) {
            System.out.println(i);
            factorial *= i;
        }
        System.out.println("factorial: " +factorial);

        System.out.println();

        //Exercise 13 - Ascending sequence validation
        double[] sequenceOfNumbers = {1, 2, 4, 4, 5};
        boolean isIncreasing = true;

        for (int i = 1; i < sequenceOfNumbers.length; i++) {
            if(sequenceOfNumbers[i] <= sequenceOfNumbers[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Strictly increasing");
        }else{
            System.out.println("Not strictly increasing");
        }

        System.out.println();

        //Exercise 14 - Interval count of multiples
        int[] sequenceOfNumbersExFourteen = {1, 6};
        int countExFourteen = 0;

        if (sequenceOfNumbersExFourteen[0] == sequenceOfNumbersExFourteen[1]) {
            System.out.println("Invalid Sequence");
            return;
        }

        if (sequenceOfNumbersExFourteen[0] > sequenceOfNumbersExFourteen[1]) {
            int temp = sequenceOfNumbersExFourteen[0];
            sequenceOfNumbersExFourteen[0] = sequenceOfNumbersExFourteen[1];
            sequenceOfNumbersExFourteen[1] = temp;
        }

        for (int i = sequenceOfNumbersExFourteen[0]; i <= sequenceOfNumbersExFourteen[1]; i++) {
            boolean multipleOfThree = (i % 3 == 0);
            boolean multipleOfFive = (i % 5 == 0);

            if ( (multipleOfThree && !multipleOfFive) || (multipleOfFive && !multipleOfThree) ) {
                countExFourteen++;
            }
        }
        System.out.println(countExFourteen);


        System.out.println();

        //Exercise 15 - Inverted pyramid with sum
        int triangleHigh = 5;
        int totalSum = 0;

        for (int i = triangleHigh; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
                totalSum += j;
            }
            System.out.println();
        }
        System.out.println(totalSum);

    }
}
