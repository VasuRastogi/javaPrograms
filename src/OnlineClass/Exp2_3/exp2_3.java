//20BCS5135 ((C) VasuRastogi / Github )
package OnlineClass.Exp2_3;
import java.util.LinkedList;
import java.util.Scanner;

public class exp2_3 {

    static LinkedList<String> List = new LinkedList<String>();


    public static void insert(String item){
        List.add(item);
        System.out.println("Inserted successfully");
    }
    public static void search(String item){
        if(List.contains(item)){
            System.out.println("Item found at index: "+List.indexOf(item));
        }else{
            System.out.println("Item not found in the list.");
        }
    }
    public static void delete(String item){
        if(List.contains(item)){
            List.remove(List.indexOf(item));
            System.out.println("Item deleted");
        }else{
            System.out.println("Item does not exist!");
        }
    }
    public static void display(){
        System.out.println("Items in the list are: ");
        for(String s : List){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int input;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            input = sc1.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter the item to be inserted: ");
                    String s = sc.next();
                    insert(s);
                    break;
                case 2:
                    System.out.println("Enter the item to search : (beware of case)");
                    String s1 = sc.next();
                    search(s1);
                    break;
                case 3:
                    System.out.println("Enter the item to delete : (beware of case)");
                    String s2 = sc.next();
                    delete(s2);
                    break;
                case 4:
                    display();
                    break;
            }
        }while(input!=0);
        sc.close();
        sc1.close();
    }
}
