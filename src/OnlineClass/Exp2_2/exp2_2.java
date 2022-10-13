//20BCS5135 ((C) VasuRastogi / Github )
package OnlineClass.Exp2_2;

import java.util.*;
/*
* Playing cards during travel is a fun filled experience. For this game they wanted to collect all four
unique symbols. Can you help these guys to collect unique symbols from a set of cards?
Create Card class with attributes symbol and number. From our main method collect each card
details (symbol and number) from the user.

Collect all these cards in a set, since set is used to store unique values or objects.
Once we collect all four different symbols display the first occurrence of card details in alphabetical
order.
*/
public class exp2_2 extends Card2 {
    public static void main(String[] args) {
        int count = 0;

        ArrayList<String> arr= new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");

        Scanner sc = new Scanner(System.in);
        Set<String> hash = new HashSet<String>();
        ArrayList<Integer> hash2 = new ArrayList<Integer>();


        for(int i = 0; i<Integer.MAX_VALUE; i++){
            System.out.println("Enter a card: ");

            OnlineClass.Exp2_2.Card2 c = new OnlineClass.Exp2_2.Card2();
            c.setSymbol(Character.toString(sc.nextLine().charAt(0)));
            c.setNumber(sc.nextInt());

            sc.nextLine();
            if(!hash.contains(c.Symbol)) {
                hash2.add(c.number);
            }else {
                hash.add(c.Symbol);
            }
            hash.add(c.Symbol);

            count++;

            if(hash.containsAll(arr)){
                break;
            }
        }

        System.out.println("4 cards found after "+count+" steps.");
        System.out.println("Cards in set are: ");
        System.out.println(hash);
        System.out.println(hash2);
    }
}