package StringProblem;

public class countAge {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,15,8,50,60};
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=18)count1++;
            else if(arr[i]>18)count2++;
        }
        System.out.println("Children Count: "+count1);
        System.out.println("Adult Count: "+count2);
    }
}
