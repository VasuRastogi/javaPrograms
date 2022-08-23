package OnlineClass.Exp3;

import java.util.Scanner;

public class DriverClass extends Account{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);

        int UserInput;

        do {
                System.out.println("Select the option:");
                System.out.println("    1. Interest Calculator –SB");
                System.out.println("    2. Interest Calculator –FD");
                System.out.println("    3. Interest Calculator –RD");
                System.out.println("    0. Exit");

                UserInput = sc.nextInt();

                switch (UserInput){
                    case 1:
                        System.out.println("Enter the Average amount in your account:");
                        SBAccount.amount = sc1.nextInt();
                        System.out.println("Specify if you are Normal or NRI (note: Program is case Sensitive)");
                        SBAccount.type = sc2.nextLine();
                        System.out.println("Interest gained : ₹" + SBAccount.calculateInterest());
                        break;

                    case 2:
                        System.out.println("Enter the FD amount:");
                        FDAccount.amount = sc1.nextInt();
                        System.out.println("Enter the number of days:");
                        FDAccount.noOfDays = sc2.nextInt();
                        System.out.println("Enter your age:");
                        FDAccount.ageOfACHolder = sc3.nextInt();
                        System.out.println("Interest gained : ₹" + FDAccount.calculateInterest());
                        break;

                    case 3:
                        System.out.println("Enter the RD amount:");
                        RDAccount.amount = sc1.nextInt();
                        System.out.println("Enter the number of months:");
                        RDAccount.noOfMonths = sc2.nextInt();
                        System.out.println("Enter monthly amount:");
                        RDAccount.monthlyAmount = sc3.nextInt();
                        System.out.println("Enter A/C holder's age:");
                        RDAccount.ageOfACHolder1 = sc4.nextInt();
                        System.out.println("Interest gained : ₹" + RDAccount.calculateInterest());
                        break;
                }
        }while (UserInput!=0);
        sc.close();
        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();
    }
}
