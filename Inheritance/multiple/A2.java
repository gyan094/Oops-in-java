package Inheritance.multiple;

interface A2 {
    abstract void Show();  //public +abstract
}
interface B2 {
    abstract  void disk();  //public +abstract
}
class Mul implements A2,B2{
    @Override
    public void Show() {
        System.out.println("Interface A2");
    }
    public void disk() {
        System.out.println("Interface B2");
    }

    public static void main(String[] args) {
        Mul m=new Mul();
        m.Show(); m.disk();
    }
}
