package Inheritance.multilevel;

 class A {
     //super class
        int a,b,c;
        void add(){
            a=10;b=20;
            c=a+b;
            System.out.println("Sum of two no: "+c);
        }
        void sub(){
            a=200; b=100;
            c=a-b;
            System.out.println("Sub of two no: "+c);
        }
    }
    class B extends A {
    void mul(){
        a=10;b=20;
        c=a*b;
        System.out.println("mul of two no: "+c);
    }
}
class C extends B {
        void div() {
            a = 10;
            b = 5;
            c = a / b;
            System.out.println("div of two no: " + c);
        }
 }
class D extends C {
    void mod() {
        a = 10;
        b = 3;
        c = a % b;
        System.out.println("mod of two no: " + c);
    }
 }
class test{
    public static void main(String[] args) {
        D r=new D();
        r.add(); r.sub();
        r.mul();  r.div(); r.mod();
    }
}

