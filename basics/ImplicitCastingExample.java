public class ImplicitCastingExample {
    public static void main(String[] args) {
        byte b = 10;              // 1 byte
        short s = b;              // 2 bytes
        int i = s;                // 4 bytes
        long l = i;               // 8 bytes
        float f = l;              // 4 bytes (but can store large int range)
        double d = f;             // 8 bytes
        char c = 'A';             // 2 bytes 
        int ci = c;               // Char to int 

        System.out.println("Byte value: " + b);
        System.out.println("Byte to Short: " + s);
        System.out.println("Short to Int: " + i);
        System.out.println("Int to Long: " + l);
        System.out.println("Long to Float: " + f);
        System.out.println("Float to Double: " + d);
        System.out.println("Char to Int: " + ci); 
    }
}
