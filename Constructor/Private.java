package Constructor;

public class Private {
    int a; double b; String c;
    private Private(){
        a=100; b=20.20; c="GYAN";
        System.out.println(a+" "+b+" "+c);
    }
    //  static void show(){}  // without object call
    public static void main(String[] args) {
        Private r= new Private();

    }
}
/*   class E{
    public static void main(String[] args) {
        private_cons r= new private_cons();
    }
}

 */

