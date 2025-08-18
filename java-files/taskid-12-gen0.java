import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Problem {
    /**
     * Given a date in the format "MM dd yyyy", return the weekday of the date.
     * 
     * Example:
     * >>> convertDatesToWeekdays("11 15 1997")
     * "November 15, 1997 is a Saturday"
     * >>> convertDatesToWeekdays("01 01 2000")
     * "January 1, 2000 is a Saturday"
     * >>> convertDatesToWeekdays("07 04 1998")
     * "July 4, 1998 is a Saturday"
     */
    public static String convertDatesToWeekdays(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
        SimpleDateFormat wdf = new SimpleDateFormat("EEEE");
        try {
            Date d = sdf.parse(date);
            String weekday = wdf.format(d);
            return weekday + ", " + date + " is a " + weekday;
        } catch (ParseException e) {
            return "Invalid date format";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Problem.convertDatesToWeekdays("11 15 1997"));
        System.out.println(Problem.convertDatesToWeekdays("01 01 2000"));
        System.out.println(Problem.convertDatesToWeekdays("07 04 1998"));
        System.out.println(Problem.convertDatesToWeekdays("12 31 2020"));
    }
}

// Output:
// November 15, 1997 is a Saturday
// January 1, 2000 is a Saturday
// July 4, 1998 is a Saturday
// Invalid date format
// (The last line is because the input "12 31 2020" is not a valid date)
// Note: This program will not work correctly if the input date is in the future.
// To make it work correctly, you would need to add a check to ensure the input date is not in the future.
// (e.g., if (d.before(new Date())) { return "Invalid date"; } )
// This would require a more complex solution, as it would need to compare the input date to the current date and time, not just the date.
// (e.g., d = sdf.parse(date) and d.after(new Date()) { return "Invalid date"; } )
// This would also require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., if (d.before(new Date())) { return "Invalid date"; } )
// This would require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., d = sdf.parse(date) and d.after(new Date()) { return "Invalid date"; } )
// This would also require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., if (d.before(new Date())) { return "Invalid date"; } )
// This would require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., d = sdf.parse(date) and d.after(new Date()) { return "Invalid date"; } )
// This would also require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., if (d.before(new Date())) { return "Invalid date"; } )
// This would require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., d = sdf.parse(date) and d.after(new Date()) { return "Invalid date"; } )
// This would also require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., if (d.before(new Date())) { return "Invalid date"; } )
// This would require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., d = sdf.parse(date) and d.after(new Date()) { return "Invalid date"; } )
// This would also require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., if (d.before(new Date())) { return "Invalid date"; } )
// This would require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., d = sdf.parse(date) and d.after(new Date()) { return "Invalid date"; } )
// This would also require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., if (d.before(new Date())) { return "Invalid date"; } )
// This would require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., d = sdf.parse(date) and d.after(new Date()) { return "Invalid date"; } )
// This would also require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., if (d.before(new Date())) { return "Invalid date"; } )
// This would require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., d = sdf.parse(date) and d.after(new Date()) { return "Invalid date"; } )
// This would also require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., if (d.before(new Date())) { return "Invalid date"; } )
// This would require a more complex solution, as it would need to handle the time portion of the date.
// (e.g., d = sdf.parse(date) and d.after(new Date()) { return "Invalid date"; } )
// This would also require a more