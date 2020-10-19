import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author Jamith Nimantha
 */
public class YearDiff {
    public static void main(String []args) throws ParseException {
        Date fromDate =  new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-20");
        Date toDate =  new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-19");

        System.out.println(getYearCountWithPeriod(fromDate, toDate));

    }


    private static int getYearCountWithPeriod(Date fromDate, Date toDate) {
        Period period = Period.between(convertToLocalDate(fromDate), convertToLocalDate(toDate));
        return period.getYears();
    }

    private static LocalDate convertToLocalDate(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
