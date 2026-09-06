import java.util.*;

public class string_repeat{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String result = "";

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            int firstIdx = s.indexOf(ch);

            int count=firstIdx + 1;

            for(int j=0;j<count;j++){

                result += ch;
            }

            if(i != s.length()-1){
                result += '-';
            }
        }
        System.out.println(result);
    }
}