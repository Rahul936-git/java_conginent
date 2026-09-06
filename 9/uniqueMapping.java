import java.util.*;

public class uniqueMapping{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int count=0;

        for(int i=0;i<s.length();i++){
            count++;
        }

        for(int i=0;i<s.length()-1;i++){

            int num=Integer.parseInt(s.substring(i,i+2));   // substring() gives us a String:

            if(num <= 26){
                count++;
            }
        }
        System.out.println(count);
    }
}

