import java.util.*;
import java.time.*;
import java.time.format.*;

public class validRegestration{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] dates = new String[n];

        for(int i=0;i<n;i++){
            dates[i]=sc.next();
        }

        String start = sc.next();

        String end = sc.next();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");   // Create the date format

        LocalDate startDate = LocalDate.parse(start,format);    // Convert start date from String to date
        LocalDate endDate = LocalDate.parse(end,format);        // Convert last date from String to date

        int count = 0;

        for(int i=0;i<n;i++){           // Check every registration date

            LocalDate date = LocalDate.parse(dates[i],format);  // Convert each String into a date

            if((date.isEqual(startDate) || date.isAfter(startDate)) &&  // Is the date equal to or after the start date?
                (date.isEqual(endDate) || date.isAfter(endDate))){      // Is the date equal to or before the end date?

                count++;
            }
        }
        System.out.println(count);
    }
}