import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * 日付データクラス
 */
public class DateData {
    private String dateData = null;
    /**
     * dateData setter
     */
    public void setDateData(String yyyymmdd) {
        dateData = yyyymmdd;
    }
    /**
     * dateData getter
     */
    public String getDateData() {
        return dateData;
    }
    /**
     * 今日の日付取得
     */
    public String getToday() {
        Calendar cal = Calendar.getInstance();
        return String.format("%02d", cal.get(Calendar.YEAR)) +
                String.format("%02d", cal.get(Calendar.MONTH) + 1) +
                String.format("%02d", cal.get(Calendar.DAY_OF_MONTH));
    }
    /**
     * 今日か否かの判定
     */
    public boolean isToday(String yyyymmdd) {
        if(Objects.equals(yyyymmdd, getToday())){
            return true;
        }
        return false;
    }
    /**
     * うるう年判定 String
     */
    public boolean isLeapYear(String yyyymmdd) {
        return isLeapYear(Integer.parseInt(yyyymmdd.substring(0,4)));
    }
    /**
     * うるう年判定 int
     */
    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
    public static int getDaysBetweenDates(Date date1,Date date2){
        // DateをLocalDateに変換
        LocalDate localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // LocalDateの差分を計算
        long daysBetween = ChronoUnit.DAYS.between(localDate1, localDate2);

        return (int) daysBetween;
    }
    public static Date validateAndParseDate(String inputDate){
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            Date date = format.parse(inputDate);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}