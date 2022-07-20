package Constructor;

public class copy_constru {
    int a;
    String b;
    copy_constru(){
        a=100 ; b="Gyan";
        System.out.println(a+" "+b);
    }
    copy_constru(copy_constru ref){
        a= ref.a;
        b= ref.b;
        System.out.println(a+" "+b);
    }
}
class D{
    public static void main(String[] args) {
        copy_constru r = new copy_constru();
        copy_constru r2 = new copy_constru(r);
    }
}

