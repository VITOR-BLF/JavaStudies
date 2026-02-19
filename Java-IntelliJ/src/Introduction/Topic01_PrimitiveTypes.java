package Introduction;

public class Topic01_PrimitiveTypes {

    /**
     * - Explains basic concepts about variables and primitive types:<br><br>
     *
     * <p>1) A variable reserves a space in memory to store a value.</p>
     *
     * <p>2) Primitive types are basic data types that store simple values directly in memory,
     * such as integers, floating-point numbers, characters, and booleans.</p>
     */

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
