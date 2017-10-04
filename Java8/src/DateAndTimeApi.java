import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * Created by vikash on 4/10/17.
 */
public class DateAndTimeApi {
    public static void main(String[] args) {
        LocalDate date =LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfWeek());


        int dd=date.getDayOfMonth();
        int mm=date.getMonthValue();
        int yyyy=date.getYear();

        System.out.println(dd+"..."+mm+"..."+yyyy);
        System.out.printf("%d-%d-%d",dd,mm,yyyy);

        LocalTime time=LocalTime.now();
        System.out.println("\n"+time);
        int h=time.getHour();
        int m=time.getMinute();
        int s=time.getSecond();
        int ns=time.getNano();

        System.out.println(h+" : "+m+" : "+s+" : "+ns);
        //System.out.printf("%d:%d:%d:%d",h,m,s,ns);


        // How to get age frrom any your birthdate till now
        LocalDate date1=LocalDate.of(1992,10,3);
        LocalDate date2=LocalDate.now();
        Period p=Period.between(date1,date2);
        System.out.printf("You are %d years % months % days",p.getYears(),p.getMonths(),p.getDays());

    }
}
