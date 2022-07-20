package Inheritance.Hierarchical;

public class A {
    void input(){
        System.out.println("Enter your name: ");
    }
}
class B extends A{
   void Show(){
       System.out.println("My name gyan");
   }
}
class C extends A{
void disk(){
    System.out.println("my name is prakash");
}
}
class D extends A{
    void demo(){
        System.out.println("my name is abhay");
    }
}
class output{
    public static void main(String[] args) {
        B r=new B();
        C r2 =new C();
        D r3=new D();
        r.input(); r.Show();
        r2.input();r2.disk();
        r3.input();r3.demo();

    }
}

