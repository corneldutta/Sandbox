package services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateFormatter {

    public static void main(String[] args) {
        System.out.println(curr_Date_MMddyyyy(4));
    }

    public static int curr_Date_MMddyyyy(int n){
        int m = (int) Math.pow(10, n - 1);
        return m + new Random().nextInt(9 * m);
    }
}
