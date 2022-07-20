package Constructor;

public class parameterized {

        int x, y;

        parameterized(int a, int b) //parameterized
        {
            x = a;
            y = b;
        }

        /* parameterized(int a, String b)
        {
            System.out.println(a+" "+b);
        }
      */ void show() {
            System.out.println(x + " " + y);
        }
    }
    class c
    {
        public static void main(String[] args) {
            parameterized ref = new parameterized(100, 200);
            ref.show();
            // parameterized r=new parameterized(100,"gyan");

        }
}
