import java.util.*;

public class totalTypingDistance{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int sum = 0;

        for(int i=0;i<s.length()-1;i++){

            int a = s.charAt(i)-'a';

            int b = s.charAt(i+1)-'a';

            sum+=Math.abs(a-b);
        }
        System.out.println(sum);
    }
}
