import java.util.*;
public class IncrementCalculation{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double salery=sc.nextDouble();
        double rating=sc.nextDouble();

        if(salery<=0 || rating<1 || rating>5){
            System.out.println("Invalid data");
            return;
        }

        double increment=0;

        if(rating >1 && rating <3) increment=0.1*salery;
        if(rating >3 && rating <4) increment=0.25*salery;
        if(rating >4 && rating <5) increment=0.30*salery;

        double newSalery=salery+increment;

        System.out.println(newSalery);
    }
}