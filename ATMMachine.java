//Aditya Kailas Sule
//Java Programming
//Task 3 - ATM Interface

//package ATMINTERFACE;

import java.util.Scanner;

public class ATMMachine {

    public static void main(String args[]) {
        System.out.println("WELCOME TO ATM!!!");
        System.out.println("\nSelect any one option!");
        System.out.println("1.REGISTER\n12EXIT");
        System.out.println("Enter your option :");
        Scanner sc = new Scanner(System.in);
        int ch;
        ch = sc.nextInt();
        if (ch == 1) {
            ATMFUNCTION Atm = new ATMFUNCTION();
            Atm.registers();
            while (ch == 1) {
                System.out.println("\nSelect any one option!");
                System.out.println("1.LOGIN\n2.EXIT");
                System.out.println("Enter your option :\n\n");
                int op = sc.nextInt();
                if (op == 1) {
                    if (Atm.login()) {
                        boolean isFin = false;
                        while (!isFin) {
                            System.out.println("\nSelect any option : ");
                            System.out.println(
                                    "\n\n\n1.DEPOSIT\n2.WITHDRAW\n3.TRANSFER\n4.TRANSACTION HISTORY\n5.CHECK BALANCE\n6.EXIT");
                            System.out.println("Enter your option :\n\n");
                            int c = sc.nextInt();
                            switch (c) {
                                case 1:
                                    Atm.deposits();
                                    break;
                                case 2:
                                    Atm.withdraws();
                                    break;
                                case 3:
                                    Atm.transfer();
                                    break;
                                case 4:
                                    Atm.transHistory();
                                    break;
                                case 5:
                                    Atm.checkBal();
                                    break;
                                case 6:
                                    isFin = true;
                                    break;
                                default:
                                    System.out.println("Invalid option!!!!!");
                            }
                        }
                    }
                } else {
                    System.exit(0);
                }
            }
        } else {
            System.out.print("Please Collect Your Card \n Byee\n");
            System.exit(0);
        }

    }
}
