import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
    }
    public static Date validateAndParseDate(String inputDate){
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            return format.parse(inputDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean isWeekday(String yyyymmdd){
        try{
            Date date = Main.validateAndParseDate(yyyymmdd);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            return (dayOfWeek != Calendar.SATURDAY && dayOfWeek !=Calendar.SUNDAY);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean isSaturdayOrSunday(String yyyymmdd){
        try{
            Date date = Main.validateAndParseDate(yyyymmdd);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            return dayOfWeek == calendar.SATURDAY || dayOfWeek == calendar.SUNDAY;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static String addDate(String inputDate,int addday){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        try{
            Date d = sdf.parse(inputDate);
            calendar.setTime(d);
            calendar.add(Calendar.DAY_OF_MONTH,addday);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
        return sdf.format(calendar.getTime());
    }
    public static int cntBetweenWeekday(String from,String to){
        int cnt = 0;
        int i = 1;
        Date fromDate = validateAndParseDate(from);
        Date toDate = validateAndParseDate(to);

        while(!fromDate.equals(toDate)){
            String date = addDate(from,i);//日付加算
            fromDate = validateAndParseDate(date);
            if(isWeekday(date)){
                cnt++;
            }
            i++;
        }
        return cnt;
    }
    public static String nextWeekday(String inputDate){
        int i = 1;
        while(isSaturdayOrSunday(addDate(inputDate, i))) i++;
        return addDate(inputDate,i);
    }
}