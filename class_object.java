         //class method

public class class_object {

    //personpublic static void main(String[] args) {
    int age=21;
    int weight=56;
    String color="Light";  // person properties

    void eat()  //method
    {
        System.out.println("I'm Eating");
    }                                         //behaviours
    void sleep()  //method
    {
        System.out.println("I'm Sleeping");
    }
    public static void main(String[] args) {
        class_object per = new class_object();
        System.out.println(per.age);
        System.out.println(per.weight);
        System.out.println(per.color);
        per.eat(); per.sleep();
    }
}

