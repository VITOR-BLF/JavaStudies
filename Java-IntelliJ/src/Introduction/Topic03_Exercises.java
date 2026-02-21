package Introduction;

public class Topic03_Exercises {
    static void main() {
        //Exercise 1 - Allowed to Vote?
        int ageExOne = 10;
        if (ageExOne >= 18) {
            System.out.println("Allowed to vote");
        }else{
            System.out.println("Can't Vote");
        }

        System.out.println();

        //Exercise 2 - Pass or Fail?
        double gradeExTwo= 10;
        if (gradeExTwo >= 7) {
            System.out.println("Approved");
        }else{
            System.out.println("Failed");
        }

        System.out.println();

        //Exercise 3 - Biggest between three numbers
        double numberOneExThree = 50;
        double numberTwoExThree = 18;
        double numberThreeExThree = 65.9;
        if (numberOneExThree > numberTwoExThree && numberOneExThree > numberThreeExThree) {
            System.out.println(numberOneExThree);
        } else if (numberTwoExThree > numberOneExThree && numberTwoExThree > numberThreeExThree) {
            System.out.println(numberTwoExThree);
        }else{
            System.out.println(numberThreeExThree);
        }

        System.out.println();

        //Exercise 4 - Grade Classification
        double gradeExFour = 20;
        if (gradeExFour >= 90) {
            System.out.println("A");
        }else if (gradeExFour >= 70) {
            System.out.println("B");
        }else if (gradeExFour >= 50) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }

        System.out.println();

        //Exercise 5 - Temperature
        int temperatureExFive = 17;
        if (temperatureExFive >= 25) {
            System.out.println("Hot");
        }else if (temperatureExFive >= 15) {
            System.out.println("Mild");
        }else{
            System.out.println("Cold");
        }

        System.out.println();

        //Exercise 6 - IMC Classifier
        double weightExSix = 70.5;
        double heightExSix = 1.76;
        double imc = weightExSix / (heightExSix * heightExSix);
        if (imc >= 30) {
            System.out.println("Obese");
        }else if (imc >= 25) {
            System.out.println("Overweight");
        }else if (imc >= 18.5) {
            System.out.println("Normal");
        }else{
            System.out.println("Underweight");
        }

        System.out.println();

        //Exercise 7 - Allowed to Drive?
        int ageExSeven = 18;
        boolean drivingLicense = false;
        if (ageExSeven >= 18) {
            if(drivingLicense) {
                System.out.println("Allowed to drive");
            }else {
                System.out.println("You do not have your driver’s license");
            }
        }else{
            System.out.println("Can't drive");
        }

        System.out.println();

        //Exercise 8 - Interval (10 - 50)
        double numberExEight = 30;
        double intervalNumberOne = 10;
        double intervalNumberTwo = 50;
        if (numberExEight > intervalNumberOne && numberExEight < intervalNumberTwo) {
            System.out.println(numberExEight+" is between "+intervalNumberOne+" and "+intervalNumberTwo);
        }else{
            System.out.println(numberExEight+" isn't between "+intervalNumberOne+" and "+intervalNumberTwo);
        }

        System.out.println();

        //Exercise 9 - Multiple of 5 or 3
        double numberExNine = 15;
        double numberOneExNine = 5;
        double numberTwoExNine = 3;

        if (numberExNine % numberOneExNine == 0 && numberExNine % numberTwoExNine == 0) {
            System.out.println("Multiples of "+numberOneExNine+" and "+numberTwoExNine);
        }
        else if (numberExNine % numberOneExNine == 0) {
            System.out.println("Multiples of "+numberOneExNine);
        }else if (numberExNine % numberTwoExNine == 0) {
            System.out.println("Multiples of "+numberTwoExNine);
        }

        System.out.println();

        //Exercise 10 - Leap Year
        double year = 2026;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Normal Year");
        }

        System.out.println();

        //Exercise 11 - Simple Calculator
        double numberOneExEleven = 20;
        double numberTwoExEleven = 340;
        int choice = 1;
        System.out.println("-----------------------------------");
        System.out.print("Simple Calculator\n");
        System.out.println("-----------------------------------");
        System.out.println("\nInsert two numbers: ");
        System.out.println("\nChoose a Mathematical Operation\n");
        System.out.println("1) +");
        System.out.println("2) -");
        System.out.println("3) *");
        System.out.println("4) /");

        double result = 0;
        switch (choice) {
            case 1:
                result = numberOneExEleven + numberTwoExEleven;
                System.out.println("\nResult ("+numberOneExEleven+" + "+numberTwoExEleven+"): "+result);
                break;
            case 2:
                result = numberOneExEleven - numberTwoExEleven;
                System.out.println("\nResult ("+numberOneExEleven+" - "+numberTwoExEleven+"): "+result);
                break;
            case 3:
                result = numberOneExEleven * numberTwoExEleven;
                System.out.println("\nResult ("+numberOneExEleven+" x "+numberTwoExEleven+"): "+result);
                break;
            case 4:
                result = numberOneExEleven / numberTwoExEleven;
                System.out.println("\nResult ("+numberOneExEleven+" / "+numberTwoExEleven+"): "+result);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

        System.out.println();

        //Exercise 12 - Triangle
        double a = 12;
        double b = 12;
        double c = 12;
        boolean isPossibleCreateATriangle = a + b >= c && a + c >= b && b + c >= a;
        if (isPossibleCreateATriangle) {
            System.out.println("Is possible create a triangle");
            if (a != b && b != c && c != a) {
                System.out.println("Type: Scalenus Triangle");
            } else if (a == b && a != c || b == c && b != a || c == b && c != a) {
                System.out.println("Type: Isosceles Triangle");
            }else{
                System.out.println("Type: Equilateral Triangle");
            }
        }else{
            System.out.println("Isn't possible create a triangle");
        }

        System.out.println();

        //Exercise 13 - Progressive Deviation
        /*
        double itemValue = 5000;
        boolean vipClient = true;
        double deviationHigh = 0.15;
        double deviationMedium = 0.1;
        double deviationSmall = 0.05;
        double deviationVip = 0.05;

        if(itemValue < 0){
            System.out.println("Invalid Value");
            return;
        }
        if (itemValue >= 1000) {
            if (vipClient) {
                System.out.println("Vip deviation: "+deviationVip * 100+"%");
                System.out.println("Normal deviation: "+deviationHigh *100+"%");
                System.out.println("Item value: "+(itemValue - (itemValue * deviationVip) - (itemValue * deviationHigh)));
            }else {
                System.out.println("Deviation: "+deviationHigh *100+"%");
                System.out.println("Item value: "+(itemValue - (itemValue * deviationHigh)));
            }
        }else if (itemValue >= 500) {
            if (vipClient) {
                System.out.println("Vip deviation: "+deviationVip * 100+"%");
                System.out.println("Normal deviation: "+deviationMedium *100+"%");
                System.out.println("Item value: "+(itemValue - (itemValue * deviationVip) - (itemValue * deviationMedium)));
            }else {
                System.out.println("Deviation: "+deviationMedium *100+"%");
                System.out.println("Item value: "+(itemValue - (itemValue * deviationMedium)));
            }
        }else if (itemValue >= 200) {
            if (vipClient) {
                System.out.println("Vip deviation: "+deviationVip * 100+"%");
                System.out.println(" Normal deviation: "+deviationSmall * 100+"%");
                System.out.println("Item value: "+(itemValue - (itemValue * deviationVip) - (itemValue * deviationSmall)));
            }else {
                System.out.println("Deviation: "+deviationSmall * 100+"%");
                System.out.println("Item value: "+(itemValue - (itemValue * deviationSmall)));
            }
        }else {
            System.out.println("Without deviation.");
            System.out.println("Price: "+itemValue);
        }
        */

        double itemValue = 5000;
        boolean vipClient = true;
        double discount = 0;

        if(itemValue < 0){
            System.out.println("Invalid Value");
            return;
        }

        if (itemValue >= 1000){
            discount = 0.15;
        }else if (itemValue >= 500) {
            discount = 0.1;
        }else if (itemValue >= 200) {
            discount = 0.05;
        }

        if (vipClient) {
            discount += 0.05;
        }

        double finalPrice = itemValue - (discount * itemValue);
        System.out.println("Total Price: " +finalPrice);

        System.out.println();

        //Exercise 14 - Strong Password Validation
        boolean hasNumber = true;
        boolean hasUppercase = true;
        boolean hasLowercase = false;
        int passwordLength = 10;

        if (passwordLength >= 8 && hasNumber && hasUppercase && hasLowercase) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }

        System.out.println();

        //Exercise 15 - Academic Year Classifier
        double gradeExFifteen = 100;
        double absences = 0.25;
        int limitGrade = 100;
        if (absences > 0.25) {
            System.out.println("Failed for excessive absences");
        }
        else if (absences <= 0.25) {
            if(gradeExFifteen > limitGrade){
                System.out.println("Invalid grade");
            }
            else if(gradeExFifteen >= 90) {
                System.out.println("Excellent Grade - Approved");
            } else if (gradeExFifteen >= 70) {
                System.out.println("Approved");
            } else if (gradeExFifteen >= 50) {
                System.out.println("Remedial");
            }else{
                System.out.println("Failed");
            }
        }

    }
}
