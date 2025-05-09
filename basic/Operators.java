public class Operators{
    public static void main(String args[]){
        // Arithmetic Operators
        int a = 5, b = 10, c = 20 , d = 37;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));  
        
        // Relational Operators
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        // Logical Operators
        System.out.println((a > b) && (a < c));  
        System.out.println((a > b) || (a < c));  
        System.out.println(!(a > b)); 

        // Assignment Operators
        a += 5;  
        System.out.println(a); 
        a -= 3;
        System.out.println(a); 
        a *= 2;
        System.out.println(a); 
        a /= 5;
        System.out.println(a); 
        a %= 4;
        System.out.println(a); 

        // Unary Operators
        System.out.println(d++);
        System.out.println(++d);
        System.out.println(d--);
        System.out.println(--d);

        //Ternary Operator
        int result = (a > b) ? a : b; 
        System.out.println(result);

        //Bitwise Operators
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~b);
        System.out.println(a << 1);
        System.out.println(a >> 1);
      }
}   