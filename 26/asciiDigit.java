import java.util.*;

public class asciiDigit{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        String s = sc.next();

        int count = 0;

        for(int i=0;i<s.length();i++){

            int ascii = s.charAt(i);

            int dig1 = ascii % 10;
            int dig2 = ascii / 10;

            boolean found = false;

            for(int j=0;j<n;j++){

                if(arr[j]==dig1 || arr[j]==dig2){
                    found=true;
                    break;
                }
            }

            if(found){
                count++;
            }
        }
        System.out.println(count);
    }
}   