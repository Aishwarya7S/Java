public class ExplicitCastingExample {
    public static void main(String[] args) {
        double d = 123.456;           
        float f = (float) d;          
        long l = (long) f;            
        int i = (int) l;              
        short s = (short) i;          
        byte b = (byte) s;            

        System.out.println("Double value: " + d);
        System.out.println("Double to Float: " + f);
        System.out.println("Float to Long: " + l);
        System.out.println("Long to Int: " + i);
        System.out.println("Int to Short: " + s);
        System.out.println("Short to Byte: " + b);
    }
}
