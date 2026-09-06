import java.util.*;

public class vowelPermutation{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s=sc.next();

        int count=0;

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')

                count++;
        }

        if(count==0) System.out.println(0);

        else{

            int fact = 1;

            for(int j=1;j<=count;j++){
                fact=fact*j;
            }
            System.out.println(fact);
        }   
    }
}