import java.util.*;

public class digitSubstring{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int count=0;

        for(int i=0;i<s.length()-1;i++){

            if(Character.isDigit(s.charAt(i)) && Character.isLetter(s.charAt(i-1))){

                int j=i;

                while(j<s.length() && Character.isDigit(s.charAt(j))){
                    j++;
                }

                if(j<s.length() && Character.isLetter(s.charAt(j))){
                    count++;
                }

                i=j-1;
            }
        }
        System.out.println(count);
    }
}