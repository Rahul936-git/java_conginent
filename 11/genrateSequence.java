import java.util.*;

public class genrateSequence{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=6;i<n;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}