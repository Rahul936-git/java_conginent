import java.util.*;

public class signalStrength{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr = new int[n];

        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<n-1;i++){

            if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                ans[i]=arr[i];
            }

            if(arr[i]<arr[n-1] && arr[i]>arr[n+1]){
                ans[i]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i] + " ");
        }
    }
}