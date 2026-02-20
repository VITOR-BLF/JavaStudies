package Introduction;
/**
 * <h2>Primitive Types Overview</h2>
 *
 * <h3>Integer Types</h3>
 * <ul>
 *   <li><b>byte</b> — 8-bit signed integer</li>
 *   <li><b>short</b> — 16-bit signed integer</li>
 *   <li><b>int</b> — 32-bit signed integer (most commonly used)</li>
 *   <li><b>long</b> — 64-bit signed integer</li>
 * </ul>
 *
 * <h3>Floating-Point Types</h3>
 * <ul>
 *   <li><b>float</b> — 32-bit floating-point number</li>
 *   <li><b>double</b> — 64-bit floating-point number (default for decimals)</li>
 * </ul>
 *
 * <h3>Character Type</h3>
 * <ul>
 *   <li><b>char</b> — 16-bit Unicode character</li>
 * </ul>
 *
 * <h3>Boolean Type</h3>
 * <ul>
 *   <li><b>boolean</b> — Represents true or false</li>
 * </ul>
 *
 * <h3>Key Characteristics</h3>
 * <ul>
 *   <li>Store simple values directly in memory</li>
 *   <li>Have fixed size</li>
 *   <li>Are not objects</li>
 *   <li>Provide fast performance</li>
 *   </ul>
 */
public class Topic01_PrimitiveTypes {
    static void main() {

        // Small Integer Numbers (8 bits)
        byte one = 12;
        // Integer Numbers (32 bits)
        int two = 345678;
        // Simple Decimal - Float Point (32 Bits)
        float three = 27484.56F;
        // Precise Decimal - Precise Point (64 bits)
        double four = 850385.3474;
        // Short Integer Numbers (16 bits)
        short five = 3547;
        // Big Integer Numbers (64 bits)
        long six = 853723845;
        // Unique Character (16 bits)
        char seven = 'A';
        // Boolean values (false - true)
        boolean eight = true;

        System.out.println("byte: "+one);
        System.out.println("int: "+two);
        System.out.println("float: "+three);
        System.out.println("double: "+four);
        System.out.println("short: "+five);
        System.out.println("long: "+six);
        System.out.println("char: "+seven);
        System.out.println("boolean: "+eight);
    }
}
