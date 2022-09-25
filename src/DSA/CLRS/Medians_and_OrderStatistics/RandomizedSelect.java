package DSA.CLRS.Medians_and_OrderStatistics;
// it has an average case linear time complexity. i.e. θ(n) and worst is O(n^2).
import java.util.Random;
/* it works on principle that an i'th smallest element will lie at i'th sorted position
   so, instead of sorting fully, we only sort any random element, and check left [sub-array + pivot == i].
*/

// ALGO:
/*
RANDOMIZED-SELECT(A, p, r, i )
 if p = r
 then return A[p]
 q ←RANDOMIZED-PARTITION(A, p, r )
 k ← q − p + 1
 if i = k pivot value is the answer
 then return A[q]
 elseif i < k
 then return RANDOMIZED-SELECT(A, p, q − 1, i )
 else return RANDOMIZED-SELECT(A, q + 1, r, i − k)
*/
public class RandomizedSelect {
    // we will check if after our random pivot reaches its real position, is it greater or less than i (location we are looking for)
    public static int partition(int[]A, int p, int r){
        int pivot = A[r];
        int i = p-1;
        for(int j=p; j<r; j++){
            if(A[j]<=pivot){
                i++;
                swap(A, i, j);
            }
        }
        swap(A, r, i+1);
        return i+1;
    }
    public static int RandomizedPartition(int[]A, int p, int r){
        int x = (int)(Math.random() * (r - p) + p);
        swap(A, x, r);
        return partition(A, p, r);
    }
    public static void swap(int[]A, int a, int b){
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
    public static int randomizedSelect(int[] A, int p, int r, int i){ // i is what order statistic am I looking for.
        // agar sort hone ke baad hamare pivot ke location i'th hai to vohi order statistic hai.

        if(p==r){return A[p];}

        int q = RandomizedPartition(A, p , r); // q koi bhi random index hai joki apni sahi location me pahuch chuka hai.
        int k = q-p+1; // K shows how many elements ahead is q (including q)
        if(k==i){
            // we found i'th order statistic
            return A[q];
        } else if (k > i) {
            // then search left subarray
            return randomizedSelect(A, p, q-1, i);
        } else {
            return randomizedSelect(A, q+1, r, i-k);
        }
    }

    public static void main(String[] args) {
        int [] A = new int[]{5,4,8,9,1,2,6};
        System.out.println(randomizedSelect(A, 0, A.length-1, 3));
    }
}
