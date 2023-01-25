import java.util.*;

class DEMOPRACTICE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n;
            n = sc.nextInt();
            int[][] matrix1 = new int[n][n];
            int[][] matrix2 = new int[n][n];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    matrix1[i][j] = sc.nextInt();

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    matrix2[i][j] = sc.nextInt();

            Solution Obj = new Solution();
            Obj.printMultiplication(matrix1,matrix2,n);
        }
        sc.close();
    }
}
class Solution {
    public void printMultiplication(int[][] matrix1,int[][] matrix2,int n) {
        //Write code here and print output
        int arr[][]=new int [n][n];
        int sum=1;
        int sum2=1;

        for(int i=0;i<n;i++){
            for(int  j=0;j<n;j++){
              sum*=matrix1[i][j];
              sum2*=matrix2[i][j];
                arr[i][j]=sum+sum2;
            }

        }
        for(int i=0;i<n;i++){
            for(int k =0;k<n;k++){
                System.out.print(arr[i][k]+" ");
            }
            System.out.println();
        }

    }}