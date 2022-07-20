package Constructor;

public class constru {
    int a;
    String name;

    /* constructor() {
         a = 0;
         name = null;
     }
     */
    void show() {
        System.out.println(a+ " " +name);
    }


    public static void main(String[] args) {
        constru ref = new constru();
        ref.show();
    }
}
