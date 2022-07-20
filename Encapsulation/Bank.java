package Encapsulation;

import java.util.Scanner;

public class Bank {

        private double bal=5000;
        private int pwd;

        public void Deposite(double money)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter password");
            pwd= sc.nextInt();
            System.out.println("Deposite the money: ");
            bal=bal+sc.nextInt();


            if (pwd==123)
            {
                bal=bal+money;
                System.out.println("Deposite money: ");
                System.out.println("Total balance: "+bal);
            }
            else
            {
                System.out.println("Incrrect password...");
            }
        }
        public void Withdraw(double money)
        {
            System.out.println("Enter password");
            Scanner sc=new Scanner(System.in);
            pwd= sc.nextInt();



            if (pwd==123)
            {


                System.out.println("Withdrow money: ");
                int wit=sc.nextInt();
                bal=bal-wit;
                System.out.println("Total balance: "+bal);
            }
            else
            {
                System.out.println("Incrrect password...");
            }
        }
        public void CheckBalance(double money)
        {
            System.out.println("Enter password");
            Scanner sc=new Scanner(System.in);
            pwd= sc.nextInt();
            if (pwd==123)
            {

                System.out.println("Total balance: "+bal);
            }
            else
            {
                System.out.println("Incrrect password...");
            }
        }
    }
    class customer{

        public static void main(String[] args) {
            Bank gy=new Bank();
            System.out.println("1. Deposite");
            System.out.println("2. Withdraw");
            System.out.println("3. CheckBalance");
            System.out.println("\nEnter your choice: ");
            Scanner sc2=new Scanner(System.in);
            int ch= sc2.nextInt();
            switch(ch) {
                case 1: gy.Deposite(0);
                    break;
                case 2: gy.Withdraw(0);
                    break;
                case 3: gy.CheckBalance(0);
                    break;
                default:
                    System.out.println("Invalid choice: ");
            }
        }
    }

