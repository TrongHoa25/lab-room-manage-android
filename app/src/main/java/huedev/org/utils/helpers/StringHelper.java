package huedev.org.utils.helpers;

import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringHelper {
    public static String dateToString(){
        Date date = new Date();
        return date.getDate() + "";
    }

    public static String dateToString(int date, int month){
        return date + "/" + month;
    }

    public static String dateToString(long date){
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMMM , 'yyyy");
        String sDate = sdf.format(date);
        return sDate;
    }

    public static String dateToString(int date, int month, int year){
        return date + "/" + month + "/" + year;
    }



    public static String getStringResourceByName(String aString, Context mContext) {
        String packageName = mContext.getPackageName();
        int resId = mContext.getResources().getIdentifier(aString, "string", packageName);
        return mContext.getString(resId);
    }
}