import java.util.*; // This imports Java's utility classes. // We need Scanner, so we write:    import java.util.*;

public class mostFrequentPair{  // Every Java program is normally written inside a class. So your file should normally be:PairFrequency.java

    public static void main(String[] args){   //  This is where Java starts executing the program.

        Scanner sc = new Scanner(System.in);    // This creates a Scanner to take input from the keyboard.

        String s = sc.nextLine();   // nextLine() reads the complete line, including spaces. // because next() stops at the space.

        String[] words = s.split(" ");   // It means take the complete sentence and break it into separate words wherever there is a space. // breaks it wherever there is a space.
                                            // create an array of words of type String  // Split sentence into words
        
        String[] pairs = new String[words.length]; // We need to store the pairs we create. // Why words.length? Because there can be at most one new pair for every word. If there are 9 words, we create an array of size 9.

        int[] count = new int[words.length];     // This stores how many times each pair occurs.

        int size = 0;

        for(int i=0;i<words.length;i++){

            String p = "";

            p+=words[i].charAt(0);
            p+=words[i].charAt(words[i].length()-1);

            int found=-1;

            for(int j=0;j<size;j++){

                if(pairs[j].equals(p)){
                    found=j;
                    break;
                }
            }
            
            if(found == -1){

                pairs[size]=p;
                count[size]=1;
                size++;
            }
            else{
                count[found]++;
            }
        }

        int max = 0;

        for(int i=0;i<size;i++){

            if(count[i]>max){
                max=count[i];
            }
        }

        for(int i=0;i<size;i++){

            if(count[i]==max){
                System.out.print(pairs[i]+" ");
            }
        }
    }
}

