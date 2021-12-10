package Java.LearningJava.FinalPracical;

public class Q2{
    static int largest(int [] arr)
    {
        int i;
        int max = arr[0];

        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];


        for (int j=0;j<arr.length;j++){
            if(arr[j]==max)
                System.out.println("index:"+j);
        }

        return max;


    }
    public static int min(int [] arr) {
        for (int i = 0; i < arr.length; i++) {

//            System.out.print(arr[i]);
        }
        int minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue)

                minValue = arr[i];
        }
        return minValue;
    }
    public static void main (String[] args) {
        int arr[] = {2,3,4,2,3};
        int max = largest(arr);
        int min = min(arr);
        int diff = max-min;
        System.out.println ("Diifference is"+diff);
    }
}
