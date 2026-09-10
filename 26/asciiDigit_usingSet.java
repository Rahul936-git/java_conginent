import java.util.*;

public class asciiDigit_usingSet{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int count=0;

        int[] arr = new int[n];

        Set<Integer>set = new HashSet<>();

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }

        String s = sc.next();

        for(int i=0;i<s.length();i++){

            int ascii = s.charAt(i);

            int dig1 = ascii % 10;
            int dig2 = ascii / 10;

            if(set.contains(dig1) || set.contains(dig2)){
                count++;
            }
        }
        System.out.println(count);
    }
}