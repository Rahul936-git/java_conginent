import java.util.*;

public class surlandOperats{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int p=sc.nextInt();

        int q=sc.nextInt();

        int  min = Integer.MAX_VALUE;

        for(int bus=0;bus<=n/80+1;bus++){

            int busPeople = bus * 80;

            int busCost = bus * p * 75;

            int remaining = n-busPeople;

            if(remaining < 0){
                remaining = 0;
            }

            int shuttle = (remaining + 7)/8;  // ceil(a / b) = (a + b - 1) / b

            int shuttleCost = shuttle * q * 75;

            int finalCost = busCost + shuttleCost;

            if(finalCost < min){
                min = finalCost;
            }
        }
        System.out.println(min);
    }
}