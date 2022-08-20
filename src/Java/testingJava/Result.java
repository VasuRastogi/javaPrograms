package Java.testingJava;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.*;
import java.lang.Math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sumRight = 0;
        int sumLeft = 0;

        for (int i=0; i < arr.size(); i++) {
            sumRight = arr.get(i).get(i) + sumRight;
        }

        for (int j=0; j < arr.size(); j++) {
            sumLeft = arr.get(j).get(arr.size() - j - 1) + sumLeft;
        }

        int ans = sumRight - sumLeft;
        return Math.abs(ans);
    }
}