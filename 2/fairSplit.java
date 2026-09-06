import java.util.*;

public class fairSplit {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int totalSum=0;

        int[] arr = new int[n];

        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();

            totalSum += arr[i];
        }

        int left=0;
        int right=0;
        int count=0;

        for(int i=0;i<n-1;i++){

            left=left+arr[i];

            right=totalSum-left;

            if (Math.abs(left - right) % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}