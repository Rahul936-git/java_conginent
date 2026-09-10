import java.util.*;

public class barkingDogSet{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] bark = s.split("\\.+");

        Set<Integer>set = new HashSet<>();

        for(int i=0;i<bark.length;i++){

            int len = bark[i].length();

            set.add(len);
        }
        System.out.println(set.size());
    }
}