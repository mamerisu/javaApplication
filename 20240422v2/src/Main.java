import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String inputDate = "2024/04/23";
        inputDate = displayDate(inputDate,2);
        System.out.println(inputDate);
    }

    public static String displayDate(String inputDate,int addday){
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



}