// Upcasting means casting a subclass object to a superclass reference.
// It allows you to access only the superclass members (methods/fields).
// Common in polymorphism (method overriding).

class Birds {
    void show() {
        System.out.println("Bird class");
    }
}

class Dove extends Birds {
    void show() {
        System.out.println("Dove class");
    }
    void display() {
        System.out.println("I'm a Dove");
    }
}
    
public class UpcastingExample {
    public static void main(String[] args) {
        Birds bird = new Dove();     // Upcasting
        bird.show();                 // Allowed: sound() is in Animal
        // bird.display();              Not allowed: display() is in Dog only
    }
    
}
