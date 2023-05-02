package com.AssemMods.fakechat.utils;

import android.content.Context;
import android.widget.Toast;
import com.obwhatsapp.yo.yo;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class AppUtils {
    public static final String HANDLER_FROMME_KEY = "fromme";
    public static final String HANDLER_MESSAGE_ID_KEY = "id";
    public static final String HANDLER_MESSAGE_KEY = "message";
    public static final String HANDLER_READ_KEY = "read";
    public static final String HANDLER_TS_KEY = "ts";
    public static boolean thereIsSortTimestamp = true;

    public static void appData() {
        yo.APP_DATA = (yo.getCtx().getFilesDir().getAbsolutePath() + File.separator).replace("files/", "");
    }

    public static Date getDateFromTs(long j2) {
        Calendar.getInstance();
        TimeZone timeZone = TimeZone.getDefault();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
        String format = simpleDateFormat.format(new Date(j2));
        simpleDateFormat.setTimeZone(timeZone);
        Date date = new Date();
        try {
            return simpleDateFormat.parse(format);
        } catch (ParseException e2) {
            e2.printStackTrace();
            return date;
        }
    }

    public static void makeToast(Context context, int i2) {
        Toast.makeText(context, i2, 0).show();
    }

    public static void makeToast(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }
}
