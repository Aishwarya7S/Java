public class Task9 {
    //Constructors based
    String name;
    String department;
    int experience;

    Task9() {
        name = "Not Assigned";
        department ="Unknown";
        experience = 0;
    }

    Task9(String n, String d, int e) {
        name = n;
        department = d;
        experience = e;
    }

    Task9(String str1, String str2) {
        name = str1;
        department = str2;
        experience = 3;
    }

    public void display() {
        System.out.println(name + "\n" + department  + "\n" + experience + "\n---");
    }

    public static void main(String[] args) {
        Task9 taska = new Task9();
        Task9 taskb = new Task9("Aishu", "HR", 7);
        Task9 taskc = new Task9("Atharvaa", "IT");

        taska.display();
        taskb.display();
        taskc.display();
    }
}
