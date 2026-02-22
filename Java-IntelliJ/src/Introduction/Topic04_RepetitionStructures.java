package Introduction;
/**
 * <h2>Repetition Structures Overview</h2>
 *
 * <h3>for Loop</h3>
 * <ul>
 *   <li>Executes a block of code a known number of times</li>
 *   <li>Syntax: for(initialization; condition; update) { ... }</li>
 *   <li>Commonly used when the number of iterations is predetermined</li>
 * </ul>
 *
 * <h3>while Loop</h3>
 * <ul>
 *   <li>Executes a block of code while a condition is true</li>
 *   <li>Condition is evaluated before each iteration (pre-test loop)</li>
 *   <li>Used when the number of iterations is unknown</li>
 * </ul>
 *
 * <h3>do-while Loop</h3>
 * <ul>
 *   <li>Executes a block of code at least once, then repeats while a condition is true</li>
 *   <li>Condition is evaluated after the loop body (post-test loop)</li>
 * </ul>
 *
 * <h3>Nested Loops</h3>
 * <ul>
 *   <li>A loop inside another loop</li>
 *   <li>Commonly used for multidimensional arrays, grids, or complex iterations</li>
 * </ul>
 *
 * <h3>Break and Continue</h3>
 * <ul>
 *   <li>break: immediately exits the loop</li>
 *   <li>continue: skips the current iteration and proceeds with the next</li>
 * </ul>
*/
public class Topic04_RepetitionStructures {
    static void main() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        int counttwo = 1;
        do {
            System.out.println("Do-while iteration: " + counttwo);
            counttwo++;
        } while (counttwo <= 5);

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        // Break example
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;  // sai do loop
            System.out.println("Break example i=" + i);
        }

        // Continue example
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;  // pula a iteração
            System.out.println("Continue example i=" + i);
        }
    }
}
