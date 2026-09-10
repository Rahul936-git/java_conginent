import java.util.*;

public class productPriceProperty{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] products = s.split(";");     // split() returns a String array, so you need String[], not String.

        int totalValue=0;

        for(String product : products){

            String[] parts = product.split(":");      // split() returns a String array, so you need String[], not String.

            int price = Integer.parseInt(parts[1]);
            int quantity = Integer.parseInt(parts[2]);

            totalValue += price*quantity;
        }
        System.out.println(totalValue);
    }
}