public class ParaConstructors {
    String name;
    String role;
    int experience;

    ParaConstructors( String n, String r, int e) {
        name = n;
        role = r;
        experience = e;
    }
    
    public void show() {
        System.out.println(name + "\n" + role  + "\n" + experience);
    }

    public static void main(String[] args) {
        ParaConstructors pc = new ParaConstructors("Aishu", "Analyst",3);
        pc.show();
    }
}
