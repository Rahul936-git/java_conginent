import java.util.*;

public class barkingDog{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] bark = s.split("\\.+");

        int n=bark.length;

        int count[] = new int[bark.length];

        int size=0;

        for(int i=0;i<bark.length;i++){

            int length = bark[i].length();

            boolean found = false;

            for(int j=0;j<size;j++){

                if(count[j]==length){
                    found = true;
                    break;
                }
            }
            if(!found){
                count[size]=length;
                size++;
            }
        }
        System.out.println(size);
    }
}