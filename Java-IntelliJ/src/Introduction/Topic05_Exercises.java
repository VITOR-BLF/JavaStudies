package Introduction;

public class Topic05_Exercises {
    static void main (String[] args){
        // Exercise 1 - Print all elements
        int[] elements = {1, 3, 5, 7, 2};
        for (int i : elements){
            System.out.println(i);
        }

        System.out.println();
        // Exercise 2 - Sum of elements
        int[] elementsEx2 = {3, 41, 45, 70, 122};
        int sum = 0;
        for (int i : elementsEx2){
            sum += i;
        }
        System.out.println(sum);

        System.out.println();
        // Exercise 3 - Find max and min
        int[] numbersEx3 = {22, 34, 55, 72, 21};
        int max = numbersEx3[0];
        int min = numbersEx3[0];

        for (int i : numbersEx3){
            if (i > max){
                max = i;
            }else if (i < min){
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println();
        // Exercise 4 - Average value
        int[] elementsEx4 = {3, 41, 45, 70, 122};
        int sumEx4 = 0;
        int elementsQuantity = 0;

        for (int i : elementsEx4){
            sumEx4 += i;
            elementsQuantity += 1;
        }
        System.out.println(sumEx4 / elementsQuantity);

        System.out.println();
        // Exercise 5 - Count even and odd
        int[] elementsEx5 = {145, 232, 33, 446, 577, 678 ,7887 ,768, 9565, 1087};
        int even = 0;
        int odd = 0;

        for (int i : elementsEx5){
            if (i % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: " + even +" Odd: "+odd);

        System.out.println();
        // Exercise 6 - Check for element
        int anyElement = 22;
        int[] numbersEx6 = {22, 34, 55, 72, 23};

        for (int i : numbersEx6){
            if (anyElement == i){
                System.out.println("Inside the array: "+ anyElement);
                break;
            }else if (anyElement != i){
                System.out.println("Is not inside the array: "+ anyElement);
                break;
            }
        }

        System.out.println();
        // Exercise 7 - Index of element
        int anyElementEx7 = 72;
        int[] numbersEx7 = {22, 34, 55, 72, 23};
        int index = -1;

        for (int i = 0; i < numbersEx7.length - 1; i++){
            if (anyElementEx7 == numbersEx7[i]){
                index = i;
                break;
            }
        }

        if (index == -1){
            System.out.println("Is not inside the array");
        }else{
            System.out.println(index);
        }

        System.out.println();
        // Exercise 8 - Reverse array
        int[] numbersEx8 = {22, 34, 55, 72, 21, 24};

        for (int i = 0; i < numbersEx8.length / 2; i++){
            int oppositeIndex = numbersEx8.length - 1 - i;

            int temp = numbersEx8[i];
            numbersEx8[i] = numbersEx8[oppositeIndex];
            numbersEx8[oppositeIndex] = temp;
        }

        for (int i = 0; i < numbersEx8.length; i++){
            System.out.println(numbersEx8[i]+ " ");
        }

        System.out.println();
        // Exercise 9 - Duplicate check


        System.out.println();
        // Exercise 10 - Sum of positive numbers


        System.out.println();
        // Exercise 11 - Strictly increasing sequence


        System.out.println();
        // Exercise 12 - Count multiples of 3 and 5


        System.out.println();
        // Exercise 13 - Second-largest element


        System.out.println();
        // Exercise 14 - Shift array right


        System.out.println();
        // Exercise 15 - Cumulative sum array
    }
}
