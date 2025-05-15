//Access superclass variable & Call superclass constructor and method
class MainBank{
    String type ="Main";

    MainBank() {
        System.out.println("This is main constructor");
    }

    public void display() {
        System.out.println("Message from superclass");
    }
}

class SubBank  extends MainBank{
    String type = "Sub";

    SubBank() {
        super();
        System.out.println("This is constructor");
    }

    public void display() {
        super.display();
        System.out.println("Message from subclass");
    }

    public void showMessage() {
        System.out.println("Child class: " +  type);
        System.out.println("Parent class: " + super.type);
    }
}
public class SuperExample {
    public static void main(String[] args) {
        SubBank sb = new SubBank();
        sb.display();
        sb.showMessage();
    }
    
}
