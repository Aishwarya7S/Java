public class Inheritance {
    void start() {
        System.out.println("Super class...");
    }
}

class SubInheritance extends Inheritance {
    void begin() {
        System.out.println("Sub class...");
    }

    public static void main(String[] args) {
        SubInheritance in = new SubInheritance();
        in.start();  
        in.begin();  
    }
}

