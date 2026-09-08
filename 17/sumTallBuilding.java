import java.util.*;

public class sumTallBuilding{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int d = sc.nextInt();

        int sum = 0;

        for(int i=0;i<n;i++){

            boolean tall = true;

            int a=i-d;
            int b=i+d;

            if(a>=0){

                if(arr[i] <= arr[a]){
                    tall=false;
                }
            }

            if(b<n){

                if(arr[i] <= arr[b]){
                    tall = false;
                }
            }

            if(tall){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}