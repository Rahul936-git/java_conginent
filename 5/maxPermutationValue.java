import java.util.*;

public class maxPermutationValue{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        String[] arr = new String[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }

        int maxCount=0;

        for(int i=0;i<n;i++){

            int count=0;

            for(int j=0;j<arr[i].length();j++){

                char ch= arr[i].charAt(j);

                if(ch != 'a' && ch != 'e' && ch != 'i' && ch !='o' && ch != 'u' && 
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')

                    count++;
            }

            int fact = 1;

            for(int k=1;k<=count;k++){

                fact = fact * k;
            }

            if(fact > maxCount){
                maxCount = fact;
            }
        }
        System.out.println(maxCount);
    }
}