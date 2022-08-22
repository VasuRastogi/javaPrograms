//(C) VasuRastogi 20BCS5135
package OnlineClass.Exp2;

import java.util.Scanner;

public class VideoStoreLauncher extends VideoStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int userInput;
        try {
            do {
                System.out.println("*********Welcome to the Main Menu.*************");
                System.out.println("1. Add Video");
                System.out.println("2. Check Out Video");
                System.out.println("3. Return Video");
                System.out.println("4. Give Rating");
                System.out.println("5. List Inventory");
                System.out.println("6. List Checked Out Inventory");
                System.out.println("0. Exit");
                System.out.println("Select option(s) by entering number:");
                userInput = sc.nextInt();
                if(userInput>6 || userInput<0){
                    throw new myException("Input value did not match specified range.");
                }

                switch (userInput){
                    case 1:
                        System.out.println("Enter the name of the video you want to add: ");
                        VideoStore.addVideo(sc1.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter name of the video you want to check out: ");
                        VideoStore.checkOut(sc1.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter name of the video you want to return: ");
                        VideoStore.returnVideo(sc1.nextLine());
                        break;
                    case 4:
                        System.out.println("Enter name of the video and your rating respectively: ");
                        VideoStore.receiveRating(sc1.nextLine(), sc1.nextInt());
                        break;
                    case 5:
                        System.out.println("***********--Inventory--***********\n");
                        VideoStore.listInventory();
                        break;
                    case 6:
                        System.out.println("*******--Checked Out Videos : --********");
                        VideoStore.listCheckedOutVideos();
                        break;
                }

            } while (userInput != 0);
            sc.close();
            sc1.close();
        }catch(Exception e){System.err.println((e.getMessage()));}
    }
}
