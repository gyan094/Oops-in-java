package Abstraction;

    interface vehical {
        String Name="TVS";  //public+static+final
        int Speed=100;   //public+static+final

        void start();  //public+abstract
        void stop();  //public+abstract

    }
    public class Interface_customer implements vehical {

        public void start()
        {
            System.out.println("start(): insert key & press start button "+Name);
        }
        public void stop()
        {
            System.out.println("stop(): exit key ");
        }
        public static void main(String[] args) {
            Interface_customer c=new Interface_customer();
            c.start(); c.stop();
        }
    }


