public class CPolymorphism {
    void show() {
        System.out.println("Compile-time Polymorphism");
    }

    void show(String name) {
        System.out.println("Another Name: " + name);
    }

    void show(String n, int p) {
        System.out.println("Book Name - " + n + "\t Price - " + p);
    }

    public static void main(String[] args) {
        CPolymorphism cp = new CPolymorphism();
        cp.show();
        cp.show("Method Overloading");
        cp.show("Java", 700);
    }

}
