      //  Method Overrding


package Polymorphism.method_Overriding;

      public class shape {
    void drow(){
        System.out.println("con't Say shape Type");
    }
}
class square extends shape{
    @Override
    void drow() {
        System.out.println("square shape");
    }
}
class test{
    public static void main(String[] args) {
        //square r=new square();
        shape r=new square();
        r.drow();
    }
}

