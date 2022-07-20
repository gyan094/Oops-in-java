package Inheritance.multiple;

interface A {
    abstract void show();  //public +abstract
}
interface B {
    abstract void show();  //public +abstract
}
class Multiple implements A,B{
    @Override
    public void show() {
        System.out.println("Interface A & B");
    }

    public static void main(String[] args) {
        Multiple m=new Multiple();
        m.show();
    }
}
