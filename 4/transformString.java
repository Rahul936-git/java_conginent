import java.util.*;

public class transformString{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s1=sc.next();
        String s2=sc.next();

        int[] count1=new int[26];
        int[] count2=new int[26];

        for(int i=0;i<s1.length();i++){
            count1[s1.charAt(i)-'A']++;
        }

        for(int j=0;j<s2.length();j++){
            count2[s2.charAt(j)-'A']++;
        }

        int cost=0;

        for(int k=0;k<26;k++){

            if(count2[k]-count1[k]>0){
                cost = cost + (count2[k]-count1[k]);
            }
        }
        System.out.println(cost);
    }
}