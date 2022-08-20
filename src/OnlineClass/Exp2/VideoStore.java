package OnlineClass.Exp2;

import java.util.ArrayList;

public class VideoStore extends Video{
    ArrayList<Video> videos = new ArrayList<Video>();

    public void addVideo(String vid){
        videos.add(new Video(vid));
        System.out.println("Video "+'"'+ videos.get(videos.size()-1).getName()+'"'+" added successfully");
    }
    public void doCheckout(String name){
        for (int i=0; i<=videos.size()-1; i++) {
            if (videos.get(i).videoName.equals(name)) {
                videos.get(i).doCheckout();
            }
        }
    }
    public void returnVideo(String vid){
        for (int i=0; i<=videos.size()-1; i++) {
            if (videos.get(i).videoName.equals(vid)) {
                videos.get(i).doReturn();
            }
        }
    }
    public void receiveRating(String vid, int rating){
        int  i = 0;
        for (;i<=videos.size()-1; i++) {
            if (videos.get(i).videoName.equals(vid)) {
                videos.get(i).receiveRating(rating);
            }
        }
        System.out.println("Rating " + '"' + videos.get(i-1).getRating() + '"' + " is given to the Video \"" + videos.get(i-1).getName() + '"');

    }
    public void listInventory(){
        System.out.println("------------------------------------------");
        System.out.println("Video Name | Checkout Status | Rating");
        for (int i=0; i<=videos.size()-1; i++) {
            System.out.println(videos.get(i).getName() + "|" + videos.get(videos.size() - 1).getCheckout() + "|" + videos.get(videos.size() - 1).getRating());
        }
        System.out.println("------------------------------------------");
    }
}
