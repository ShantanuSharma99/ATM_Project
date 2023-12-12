package org.MyProject;
import java.util.*;

public class ATM {

    float Balance;
    int Pin=5674;
    String note="------------------------------------------------------";

    public void checkpin(){
        System.out.println("Enter your PIN");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==Pin)
        {
            menu();
        }
        else{
            System.out.println("Invalid Pin");

            checkpin();
        }


    }

    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4 .Exit");

        Scanner sc=new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1)
        {
            checkbalance();
        }
        else if (opt==2)
        {
            withdrawmoney();
        }
        else if(opt==3)
        {
            depositmoney();
        }
        else if(opt==4)
        {
            return;
        }
        else
        {
            System.out.println("Enter a Valid Choice");
        }

    }

    public void checkbalance(){
        System.out.println("Balance: "+Balance);
        System.out.println(note);

        menu();


    }
    public void withdrawmoney() {
        System.out.println("Enter ammout to withdraw:  ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount >= Balance) {
            System.out.println("Insufficient Balance");
            System.out.println(note);
            menu();

        } else {
            Balance = Balance - amount;
            System.out.println("Withdraw money successfully");
            System.out.println(note);
            menu();

        }


    }

        public void depositmoney()
        {
            System.out.println("Enter  the ammont:  ");
            Scanner scc=new Scanner(System.in);
            float amount = scc.nextFloat();
            Balance = Balance+amount;
            System.out.println("Money Deposited Successfully");
            System.out.println(note);

            menu();

        }

    }
