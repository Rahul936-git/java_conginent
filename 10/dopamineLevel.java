import java.util.*;

public class dopamineLevel{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();

        int L=sc.nextInt();

        int R=sc.nextInt();

        int[] A = new int[N];

        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }

        int dopamine = 0;
        int max = 0;
        int min = 0;

        for(int i=0;i<N;i++){

            if(A[i] >= L && A[i] <= R){
                dopamine++;
            }
            else{
                dopamine--;
            }

            if(dopamine > max){
                max=dopamine;
            }

            if(dopamine < min){
                min=dopamine;
            }
        }
        System.out.println(max + " " + min);
    }
}