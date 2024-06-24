import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Accounting {
    private int accountid;
    private Date day;
    private Time time;
    private List<Integer> orderids;
    private int totalprice;
    private int tableid;

    Accounting(int accountid,Date day,Time time,List orderids,int totalprice,int tableid){
        this.accountid = accountid;
        this.day = day;
        this.time = time;
        this.orderids = orderids;
        this.totalprice = totalprice;
        this.tableid = tableid;
    }
}
