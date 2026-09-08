import java.util.*;

public class fruitFrequency{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] count = new int[s.length()];

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            for(int j=0;j<s.length();j++){

                if(s.charAt(j)==ch){
                    count[i]++;
                }
            }
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++){

            if(count[i]%2 == 1){

                if(count[i] > maxOdd){
                    maxOdd = count[i];
                }
            }
            else{
                if(count[i] < minEven){
                    minEven = count[i];
                }
            }
        }
        int ans = Math.abs(maxOdd - minEven);

        System.out.println(ans);
    }
}