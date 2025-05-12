public class Encapsulation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation enc = new Encapsulation();
        enc.setName("Java");
        System.out.println("Name is: " + enc.getName());
    }
}
