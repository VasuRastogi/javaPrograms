// (C)VasuRastogi (Github)
// 20BCS5135
package OnlineClass.Exp2_1;
import java.util.*;

public class Main extends Card {
    public static void main(String[] args) {


        int count = 0;
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hash = new HashMap<>();

        // I have created an Arraylist of the values to compare with hashmap values.
        ArrayList<String> arr= new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");

        for(int i = 0; i<Integer.MAX_VALUE; i++){
            System.out.println("Enter a card: ");
            Card c = new Card();
            c.setSymbol(Character.toString(sc.nextLine().charAt(0)));
            c.setNumber(sc.nextInt());
            sc.nextLine();
            hash.put(c.number, c.Symbol);
            // used comparison instead of logical expression
            if(hash.values().containsAll(arr)){
                count = i+1;
                break;
            }
        }

        System.out.println("Four symbols gathered in "+ count +" Cards");
        System.out.println("Cards in set are: ");
        System.out.println(hash);
    }
}
