import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void getdate(String[] args) {

        LocalDate d1 = LocalDate.parse("2019-12-01");
        LocalDate d2 = LocalDate.parse("2019-12-02");
        LocalDate d3 = LocalDate.parse("2019-12-02");


        System.out.println(d1.isBefore(d2));
        System.out.println(d1.isAfter(d2));
        System.out.println(d2.equals(d3));

        System.out.println(d1.getDayOfWeek());
        System.out.println(d1.getMonth());
        System.out.println(d1.plus(1, ChronoUnit.YEARS));

        LocalDate d4 = LocalDate.now();
        System.out.println(d4);
        System.out.println(d4.format(DateTimeFormatter.ofPattern("MMM d yyyy")));
    }
}
