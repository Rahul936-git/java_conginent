import java.util.*;

public class stringLengthFrequency{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        String s= sc.next();

        int[] count = new int[s.length()];

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            for(int j=0;j<s.length();j++){

                if(s.charAt(j)==ch) count[i]++;
            }
        }

        int Max=0;
        int Min=Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++){

            int freq=count[i];

            int freqCount = 0;

            for(int j=0;j<s.length();j++){

                if(count[j]==freq){
                    freqCount++;
                }
            }

            if(freqCount > Max){

                Max = freqCount;
                Min = freq;
            }
            else if(freqCount == Max){

                if(freq < Min){
                    Min = freq;
                }
            }
        }

        System.out.println( Min);
    }
}