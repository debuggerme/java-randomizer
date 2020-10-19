import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author Jamith Nimantha
 */
public class Main {
    public static void main(String []args) throws ParseException {
        Date fromDate =  new SimpleDateFormat("yyyy-MM").parse("2017-01");
        Date toDate =  new SimpleDateFormat("yyyy-MM").parse("2018-02");

        System.out.println(getMonthCountWithPeriod(fromDate, toDate)); // Method 1

        System.out.println(getMonthsCountWithChronoUnit(fromDate, toDate)); // Method 2

        System.out.println(BigDecimal.ZERO);
    }

    private static long getMonthsCountWithChronoUnit(Date fromDate, Date toDate) {
        return ChronoUnit.MONTHS.between(
                YearMonth.from(convertToLocalDate(fromDate)),
                YearMonth.from(convertToLocalDate(toDate))
        );
    }

    private static int getMonthCountWithPeriod(Date fromDate, Date toDate) {
        Period period = Period.between(convertToLocalDate(fromDate), convertToLocalDate(toDate));
        return period.getYears() * 12 + period.getMonths();
    }

    private static LocalDate convertToLocalDate(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
