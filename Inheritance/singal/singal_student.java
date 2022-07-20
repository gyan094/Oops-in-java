package Inheritance.singal;

public class singal_student {   //super class
     protected  int roll,marks;
    String name;
   protected void input(){
       System.out.println("Enter roll no & name & marks: ");
   }
}
class teacher extends singal_student{  //sub class
    void output(){
        roll=1; name="Gyan"; marks=70;
        System.out.println(roll+" "+name+" "+marks);
    }

    public static void main(String[] args) {
        teacher r=new teacher();
        r.input();r.output();
    }
}
