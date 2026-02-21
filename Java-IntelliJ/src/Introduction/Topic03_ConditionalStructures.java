package Introduction;
/**
 * <h2>Conditional Structures</h2>
 *
 * <h3>if</h3>
 * <ul>
 *   <li>Executes a block of code if a condition is true</li>
 *   <li>Used for simple decision making</li>
 * </ul>
 *
 * <h3>if-else</h3>
 * <ul>
 *   <li>Executes one block if condition is true</li>
 *   <li>Executes another block if condition is false</li>
 * </ul>
 *
 * <h3>else-if</h3>
 * <ul>
 *   <li>Allows checking multiple conditions sequentially</li>
 *   <li>Only the first true condition executes</li>
 * </ul>
 *
 * <h3>Nested if</h3>
 * <ul>
 *   <li>An if statement inside another if</li>
 *   <li>Used for more complex decision logic</li>
 * </ul>
 *
 * <h3>switch</h3>
 * <ul>
 *   <li>Selects a block based on variable value</li>
 *   <li>Useful when comparing against multiple constants</li>
 * </ul>
 *
 * <h3>Ternary Operator</h3>
 * <ul>
 *   <li>Short form of if-else</li>
 *   <li>Syntax: condition ? valueIfTrue : valueIfFalse</li>
 * </ul>
 */
public class Topic03_ConditionalStructures {
    static void main() {
        int temperature = 30;

        if (temperature > 25) {
            System.out.println("It is hot");
        }

        System.out.println();

        int age = 16;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        System.out.println();

        int grade = 85;

        if (grade >= 90) {
            System.out.println("Excellent");
        } else if (grade >= 70) {
            System.out.println("Good");
        } else if (grade >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println();

        int agetwo = 18;
        boolean hasID = true;

        if (agetwo >= 18) {
            if (hasID) {
                System.out.println("Entry allowed");
            }else{
                System.out.println("Entry not allowed");
            }
        }else{
            System.out.println("Age Invalid");
        }

        System.out.println();

        int agethree = 18;

        String result = (agethree >= 18) ? "Adult" : "Minor";
        System.out.println(result);

        System.out.println();

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}