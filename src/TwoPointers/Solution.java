package TwoPointers;
import java.io.*;
import java.util.*;
class Solution {
    public static int solve(int[] arr, int k) {
        // your code goes here
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j <arr.length; j++) {
                sum += arr[j];
                if (sum < k) count++;
            }
        }
        return count;
    }
}


        class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int[] A = new int[n];
                for (int i = 0; i < n; i++)
                    A[i] = sc.nextInt();
                int B = sc.nextInt();
                Solution Obj = new Solution();
                System.out.println(Obj.solve(A, B));

            }
        }

