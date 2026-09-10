import java.util.*;

public class balanceString{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n=s.length();

        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<n;i++){

            if(i%2==0){

                if(s.charAt(i)!='X'){
                    count1++;
                }

                if(s.charAt(i)!='Y'){
                    count2++;
                }
            }
            else{

                if(s.charAt(i)!='Y'){
                    count1++;
                }

                if(s.charAt(i)!='X'){
                    count2++;
                }
            }
        }
        int ans = Math.min(count1,count2);

        System.out.println(ans);
    }
}