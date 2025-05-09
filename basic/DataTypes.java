public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types => boolean,byte,short,int,long,double,float,char
        byte b = 100;
        short s = 7000;
        int i = 777;
        long l = 700000L;
        float f = 19.99F;
        double d = 3.1234567;
        char c = 'A';
        boolean isBool = true;
        // Non-Primitive Data Types => String,Array

        String name = "Java";
        int[] arrays = {1,3,5,7,0};
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + isBool);
        System.out.println("String: "+ name);
        System.out.println("Array Element: " + arrays[0]);
    }
}