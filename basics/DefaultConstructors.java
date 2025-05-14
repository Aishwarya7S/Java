public class DefaultConstructors {
    DefaultConstructors() {
        System.out.println("Default Constructors...");
    }

    public void show() {
        System.out.println("Constructors");
    }

    public static void main(String[] args) {
        DefaultConstructors con = new DefaultConstructors();
        con.show();
    }
}
