package Constructor;

public class defaulat {
    int a; String b; boolean c;
    defaulat()  //default
    {
        a=100; b="gyan"; c=true;
    }
    void display()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class B {

    public static void main(String[] args) {
        defaulat ref = new defaulat();
        ref.display();

    }
}
