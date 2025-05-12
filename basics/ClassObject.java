public class ClassObject {
    String title;
    String author;
    int price;

    public void display() {
        System.out.println("Book title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        ClassObject co = new ClassObject();
        co.title = "Java";
        co.author ="Charles";
        co.price = 350;
        co.display();
    }
}