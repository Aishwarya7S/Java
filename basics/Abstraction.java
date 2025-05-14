abstract class Animal {
    abstract void show();

    void display() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    void show() {
        System.out.println("Cat - meows");
    }
}

class Dog extends Animal {
    void show() {
        System.out.println("Dog - barks");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.show();
        dog.show();
        cat.display();
    }
    
}