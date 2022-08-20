package OnlineClass.Exp2;
import java.util.Scanner;

public class VideoStoreLauncher{
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int choice;
        VideoStore videoStore=new VideoStore();
        do {
            System.out.println("MAIN MENU \n=========");
            System.out.println("1. Add Videos:");
            System.out.println("2. Check Out Video:");
            System.out.println("3. Receive Rating:");
            System.out.println("4. Return Video:");
            System.out.println("5. List Inventory:");
            System.out.println("6. Exit:");
            System.out.print("Enter your choice(1 to 6): ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the video you want to add: ");
                    videoStore.addVideo(sc.next());
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    videoStore.doCheckout(sc.next());
                    break;
                case 3:
                    System.out.println("Enter the name of the video you want to Rate: ");
                    videoStore.receiveRating(sc.next(), sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Return:");
                    videoStore.returnVideo(sc.next());
                    break;
                case 5:
                    videoStore.listInventory();
                    break;
                case 6:
                    System.out.println("Enter ...!! Thanks for using the application");
                    System.exit(1);
                    break;
            }
        }while(!(choice==6));
        sc.close();
    }
}
