package GFG_Interview_Question;

import java.util.Scanner;

public class SumOfm_m_diagonal {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int arr[][]=new int [m][m];
    for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    SumOfm_m_diagonal obj=new SumOfm_m_diagonal();
    obj.diagonal_Sum(arr,m);

}
public void diagonal_Sum(int arr[][],int n){
        int sum=0;
        int m=n-1;
        for(int i=0;i<n;i++,m--){
            //sum of right side diagonal
            sum+=arr[i][i];

            //sum of left side diagonal
            sum+=arr[i][m];
        }
    System.out.println(sum);
}
}
/*
00 01 02
10 11 12
20 21 22

 */