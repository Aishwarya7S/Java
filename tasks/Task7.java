public class Task7 {
    //Encapsulation & class & object
    private String name;
    private int rollnumber;
    private char grade;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollnumber;
    }
    public void setRollNumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }   
    
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade =  grade;
    }

    public void  display() {
        System.out.println("Student Name : " + name);
        System.out.println("Student Rollnumber : " + rollnumber);
        System.out.println("Student Grade : " + grade);
    }

    public static void main(String[] args) {
        Task7 task = new Task7();

        task.setName("Aishu");
        task.setRollNumber(737);
        task.setGrade('A');

        task.display();
    }
}
