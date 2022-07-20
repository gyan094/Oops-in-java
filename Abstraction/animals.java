package Abstraction;

abstract  class Animal {

        void legs()
        {   //common bihavior
            System.out.println("all animals have 4 lages");
        }
        abstract void sound(); //all animals is diff sound
        abstract void eat(); //all animals is diff eat than implimant abstract method
    }
    class Dog extends Animal{
        @Override
        void sound()
        {
            System.out.println("bow bow....");
        }
        void eat()
        {
            System.out.println("meat eating");
        }
    }
    class Cow extends Animal{
        @Override
        void sound()
        {
            System.out.println("Oooo Ooooo....");
        }
        void eat()
        {
            System.out.println("Grass eating");
        }
    }
    public class animals {
        public static void main(String[] args) {
            Dog d=new Dog();
            Cow c=new Cow();
            d.sound(); d.eat(); d.legs();
            c.sound(); c.eat(); c.legs();
        }
    }

