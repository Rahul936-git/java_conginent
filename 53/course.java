import java.util.*;
public class course{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of course: ");

        int n=sc.nextInt();

        if(n<0 || n>20){
            System.out.print("“Invalid Range");
            return;
        }

        sc.nextLine();

        System.out.print("Enter course names: ");

        String[] courses = sc.nextLine().split(" ");

        if(courses.length != n){
            System.out.println("Invalid Range");
            return;
        }

        System.out.print("Enter the course to be searched: ");

        String search = sc.next();
        boolean found = false;

        for(String course: courses){
            if(course.equalsIgnoreCase(search)){
                found=true;
                break;
            }
        }

        if(found) System.out.println(search + " course is available");
        else System.out.println(search + " course is not available");
    }
}