import java.util.Scanner;
public class Main {
  public static void main(String[] args){
      //ask user for number of numbers to find average;
      System.out.println("Enter the number of entries:");
      Scanner obj1 = new Scanner(System.in);
      int entries = obj1.nextInt();
      
      //now make a loop that takes all entries in an array.
      int [] arrEntries = new int[entries];
      //data initialisation
      for (int i=0;i<arrEntries.length;i++){
          System.out.println("Entry no."+i+" :");
          Scanner obj =new Scanner(System.in);
          int data = obj.nextInt();
          
          arrEntries[i]=data;
      }
      //data manipulation
      for (int j=0;j<((arrEntries.length)-1);j++){
          arrEntries[j+1]+=arrEntries[j];
      }
      System.out.println((arrEntries[entries-1])/entries);
      
  }
}
