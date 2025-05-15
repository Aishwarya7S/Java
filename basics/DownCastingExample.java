// Downcasting is casting a superclass reference back to a subclass type.
// It is not automatic. You must do it explicitly.
// Use it only when the object actually refers to a subclass instance.

class Birds {
    void show() {
        System.out.println("Bird class");
    }
}

class Dove extends Birds {
    void display() {
        System.out.println("I'm a Dove");
    }
}

public class DownCastingExample {
    public static void main(String[] args) {
        Birds b = new Dove();      // Upcasting
        Dove d = (Dove)  b;        // Downcasting - because b is actually a Dove

        d.show();                  // From Birds
        d.display();               // From  Dove
    }
    
}
