import java.util.*;

public class loanAmount{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr = new int[n*n];

        int Min = Integer.MAX_VALUE;

        int k=0;

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                arr[k] = sc.nextInt();
                k++;
            }
        }

        for(int i=0;i<n*n;i++){

            if(arr[i]>0){

                int count=0;

                for(int j=0;j<n*n;j++){

                    if(arr[i]==arr[j]){
                        count++;
                    }
                }

                if(count==1){

                    if(arr[i]<Min){
                        Min = arr[i];
                    }
                }
            }
        }
        System.out.println(Min);
    }
}