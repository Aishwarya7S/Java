class MainPoly {
    void show() {
        System.out.println("Run-time Polymorphism or Method Overriding");
    }
}

class SubPoly1 extends MainPoly {
    void show(){
        System.out.println("First SubPoly... ");
    }
}

class SubPoly2 extends MainPoly {
    void show(){
        System.out.println("Second SubPoly... ");
    }
}

public class RPolymorphism {
    public static void main(String[] args) {
        MainPoly mp = new MainPoly();
        MainPoly spa = new SubPoly1();
        MainPoly spb = new SubPoly2();
        mp.show();
        spa.show();
        spb.show();
        
    }
}
