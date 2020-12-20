package newFeature;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        String date = "202009";
    }
    public static void caltest(String date){
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(4));

        Calendar calendar = Calendar.getInstance();

    }
}
