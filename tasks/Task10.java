//OOPs Concepts 
// Interface - defines a contract
interface PersonActions {
    void performDuty(); // Abstract method
}

// Abstract class 
abstract class Person {
    private String name; // Encapsulation
    private int id;

    public Person(String name, int id) { // Constructor
        this.name = name;
        this.id = id;
    }

    // Getters (Encapsulation)
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method 
    public abstract String getRole();
}

// Student class 
class Student extends Person implements PersonActions {
    private String grade;

    public Student(String name, int id, String grade) {
        super(name, id);
        this.grade = grade;
    }

    public String getRole() {
        return "Student";
    }

    public void performDuty() {
        System.out.println(getName() + " is attending classes and studying.");
    }

    public String getGrade() {
        return grade;
    }
}

// Teacher class
class Teacher extends Person implements PersonActions {
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    public String getRole() {
        return "Teacher";
    }

    public void performDuty() {
        System.out.println(getName() + " is teaching " + subject + ".");
    }

    public String getSubject() {
        return subject;
    }
}

// Principal class
class Principal extends Person implements PersonActions {

    public Principal(String name, int id) {
        super(name, id);
    }

    public String getRole() {
        return "Principal";
    }

    public void performDuty() {
        System.out.println(getName() + " is managing the entire school.");
    }
}

// Main class
public class Task10 {
    public static void main(String[] args) {
        // Create objects - Object Creation
        Student s1 = new Student("Alice", 101, "10th Grade");
        Teacher t1 = new Teacher("Mr. John", 201, "Mathematics");
        Principal p1 = new Principal("Mrs. Smith", 301);

        // Polymorphism: interface references to different object types
        PersonActions[] people = {s1, t1, p1};

        // Display role and duties using abstraction & polymorphism
        for (PersonActions person : people) {
            if (person instanceof Person) {
                Person p = (Person) person;
                System.out.println("\nRole: " + p.getRole());
                System.out.println("Name: " + p.getName() + ", ID: " + p.getId());
            }
            person.performDuty(); // Runtime polymorphism
        }
    }
}
