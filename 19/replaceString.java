import java.util.*;

public class replaceString{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String p = "";

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            int count=1;

            int j=i+1;

            while(j<s.length() && s.charAt(j)==ch){

                count++;
                j++;
            }

            if(count > 1){

                p+='#';

                i=j-1;
            }
            else{
                p+=ch;
            }
        }
        String ans = "";

        for(int i=0;i<p.length();i++){

            if(p.charAt(i)=='#' && ans.length()>0 && ans.charAt(ans.length()-1)=='#'){
                continue;
            }
            ans+=p.charAt(i);
        }
        System.out.println(ans);
    }
}