         //compile time polymorphism

package Polymorphism.method_overloading;

public class A {
    int add(){  //return type krne pr
        int a=10,b=20,c;
        c=a+b;
       // System.out.println(c);
        return c;
    }
    void add(int x,int y){
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x,double y){
       double c;
       c=x+y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        A r=new A();
        //r.add();
        int add=r.add(); // variabel value store
        System.out.println(add); //then print
        r.add(12,12.6);
        r.add(15,16);
    }
}

