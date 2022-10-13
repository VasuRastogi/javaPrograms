//(C) VasuRastogi 20BCS5135
package OnlineClass.Exp2;
import java.util.ArrayList;
import java.util.Arrays;

public class VideoStore2 extends Video2{
    public static ArrayList <Video2> vidArr = new ArrayList <Video2> ();
    public static ArrayList <Video2> CheckedOutArr = new ArrayList<Video2>();
    public static void addVideo(String Name){
        vidArr.add(new Video2(Name));
    }
    public static void checkOut(String name){
        for (int i =0; i < vidArr.size(); i++){
            if(vidArr.get(i).Title.equals(name)){
                beingCheckedOut(vidArr.get(i));
                CheckedOutArr.add(vidArr.get(i));
                vidArr.remove(i);
            }
        }
    }
    public static void returnVideo(String name){
        try {
            for (int i = 0; i < CheckedOutArr.size(); i++) {
                if (CheckedOutArr.get(i).Title.equals(name)) {
                    beingReturned(CheckedOutArr.get(i));
                    vidArr.add(CheckedOutArr.get(i));
                    CheckedOutArr.remove(i);
                }
            }
        }catch (Exception e){System.err.println("Video isn't checked out, You can only rate the video that is already checked out.");}
    }
    public static void receiveRating(String name, int rating){
        for(Video2 i : CheckedOutArr) { //rating must be given to the videos that are checked out already.
            if(i.Title.equals(name)){
                i.receiveRating(rating);
            }
        }
    }
    public static void listInventory(){
        for(int i =0; i < vidArr.size(); i++){
            System.out.println(vidArr.get(i).Title + "|" + vidArr.get(i).userRatings);
        }
    }
    public static void listCheckedOutVideos(){
        for(int i =0; i < CheckedOutArr.size(); i++){
            System.out.println(CheckedOutArr.get(i).Title+ "|" + CheckedOutArr.get(i).userRatings);
        }
    }
    public static void receiveReview(String name, String review){
        for(Video2 i : CheckedOutArr) { //rating must be given to the videos that are checked out already.
            if(i.Title.equals(name)){
                i.receiveReview(review);
            }
        }
    }
    public static void showReview(String name){
        for(int i=0; i<CheckedOutArr.size(); i++){
            if(CheckedOutArr.get(i).Title == name){
                System.err.println(CheckedOutArr.get(i).userReview);
                break;
            }
        }
    }
}
