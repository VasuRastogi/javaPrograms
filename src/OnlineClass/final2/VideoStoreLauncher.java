package OnlineClass.final2;

import java.util.Scanner;

class VideoStoreLauncher
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        VideoStore vs=new VideoStore();
        vs.addVideo();
        System.out.println("Enter a video for checkout");
        s=sc.nextLine();
        vs.checkOut(s);
        System.out.println("Enter a video for check in");
        s=sc.nextLine();
        vs.returnVideo(s);
        vs.listInventory();
    }
}

