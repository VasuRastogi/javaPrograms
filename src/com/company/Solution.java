package com.company;
class Solution {

    // Function to find square root
    // of given number upto given
    // precision
    static int squareRoot(int number)
    {
        int start = 0, end = number;
        int mid;

        // variable to store the answer
        int ans = 0;

        // for computing integral part
        // of square root of number
        while (start <= end) {
            mid = (start + end) / 2;

            if (mid * mid == number) {
                ans = mid;
                break;
            }

            // incrementing start if integral
            // part lies on right side of the mid
            if (mid * mid < number) {
                start = mid + 1;
                ans = mid;
            }

            // decrementing end if integral part
            // lies on the left side of the mid
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        // Function calling
        System.out.println(squareRoot(5));

    }
}