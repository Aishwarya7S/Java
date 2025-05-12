public class Task8 {
    // Inheritance based
    protected String name;
    protected int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Subtask extends Task8 {
    int studentId;

    void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
    }
    public static void main(String[] args) {
        Subtask st = new Subtask();

        st.name = "Aishu";
        st.age = 17;
        st.studentId = 1;

        st.displayDetails();
        st.displayStudentDetails();
    }
}
