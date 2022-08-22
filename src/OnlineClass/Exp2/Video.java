//(C) VasuRastogi 20BCS5135
package OnlineClass.Exp2;

// this class is to define what is actually a Video.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Video {
//    List<Integer> ratingBasket = new ArrayList<Integer>();
    int i=0;
    int[]ratingBasket = new int[10];
    public String Title;
    public Boolean Checked;
    public int userRatings;

    public Video(String title) {
        Title = title;
    }

    public Video(){

    }

    private int userRatingCalculator(){
//        int sum=0;
//        if(ratingBasket.size() > 1){
//            for (int i=0;i < ratingBasket.size(); i++) {
//                sum = ratingBasket.get(i) + sum;
//            }
//        } else if (ratingBasket.size() == 1) {
//            return ratingBasket.get(0);
//        }
//        return sum;
        int sum =0;
        if(ratingBasket.length>1){
            for (int i=0;i < ratingBasket.length; i++){
                sum = ratingBasket[i] + sum;
            }
        }else if (ratingBasket.length == 1) {
            return ratingBasket[0];
        }
        return sum;
    }
    public static void beingCheckedOut(Video name){
        System.err.println(name.Title+" is checked out.");
        name.Checked = true;
    }
    public static void beingReturned(Video name){
        System.out.println(name.Title+" is returned.");
        name.Checked = false;
    }

    public void receiveRating(int rating){
//        ratingBasket.add(rating);
        ratingBasket[i]=(rating);
        i++;
        userRatings = userRatingCalculator();
    }
}