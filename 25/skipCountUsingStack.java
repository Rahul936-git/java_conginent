import java.util.*;
import java.util.Stack;

public class skipCountUsingStack{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int totalSkipCount = 0;

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){

            int skipCount = 0;

            while(!st.empty() && arr[i] > st.peek()){

                st.pop();

                skipCount++;
            }

            totalSkipCount += skipCount;

            st.push(arr[i]);
        }
        System.out.println(totalSkipCount);
    }
}