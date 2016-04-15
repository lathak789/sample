import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomGenerator {

	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt(10);
		System.out.println(i);
		
		System.out.println(System.currentTimeMillis());
		long currentTime = System.currentTimeMillis();
		
		int day, month, year;
		int second, minute, hour;
		GregorianCalendar date = new GregorianCalendar();

		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);

		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);

		System.out.println("Current date is  " + day + "/" + (month + 1) + "/" + year);
		System.out.println("Current time is  " + hour + " : " + minute + " : " + second);
		String time= day + "-" + (month + 1) + "-" + year + "-" + hour + "-" + minute + "-" + second;
		System.out.println(time);
        
	}
	
	

}
