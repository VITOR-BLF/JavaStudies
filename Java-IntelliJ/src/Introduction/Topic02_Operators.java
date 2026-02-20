package Introduction;
/**
 * <h2>Operators</h2>
 *
 * <h3>Arithmetic Operators</h3>
 * <ul>
 *   <li><b>+</b> — Addition</li>
 *   <li><b>-</b> — Subtraction</li>
 *   <li><b>*</b> — Multiplication</li>
 *   <li><b>/</b> — Division</li>
 *   <li><b>%</b> — Modulus (remainder)</li>
 * </ul>
 *
 * <h3>Assignment Operators</h3>
 * <ul>
 *   <li><b>=</b> — Simple assignment</li>
 *   <li><b>+=</b> — Add and assign</li>
 *   <li><b>-=</b> — Subtract and assign</li>
 *   <li><b>*=</b> — Multiply and assign</li>
 *   <li><b>/=</b> — Divide and assign</li>
 *   <li><b>%=</b> — Modulus and assign</li>
 * </ul>
 *
 * <h3>Unary Operators</h3>
 * <ul>
 *   <li><b>++</b> — Increment</li>
 *   <li><b>--</b> — Decrement</li>
 * </ul>
 *
 * <h3>Relational Operators</h3>
 * <ul>
 *   <li><b>==</b> — Equal to</li>
 *   <li><b>!=</b> — Not equal to</li>
 *   <li><b>&gt;</b> — Greater than</li>
 *   <li><b>&lt;</b> — Less than</li>
 *   <li><b>&gt;=</b> — Greater or equal</li>
 *   <li><b>&lt;=</b> — Less or equal</li>
 * </ul>
 *
 * <h3>Logical Operators</h3>
 * <ul>
 *   <li><b>&amp;&amp;</b> — Logical AND</li>
 *   <li><b>||</b> — Logical OR</li>
 *   <li><b>!</b> — Logical NOT</li>
 * </ul>
 */
public class Topic02_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println(sum + " " + difference + " " + product + " " + division + " " + remainder);

        int x = 20;

        x += 5;
        x -= 3;
        x *= 2;
        x /= 4;
        x %= 6;

        System.out.println(x);

        int counter = 5;

        counter++;
        counter--;
        ++counter;
        --counter;

        System.out.println(counter);

        int y = 8;
        int z = 10;

        boolean r1 = y > z;
        boolean r2 = y <= z;
        boolean r3 = y == z;

        System.out.println(r1 + " " + r2 + " " + r3);
    }
}
