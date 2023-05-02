package com.google.gson.internal;

import a.a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: XFMFile */
public class PreJava9DateFormatProvider {
    public static DateFormat getUSDateFormat(int i2) {
        String str;
        if (i2 == 0) {
            str = "EEEE, MMMM d, y";
        } else if (i2 == 1) {
            str = "MMMM d, y";
        } else if (i2 == 2) {
            str = "MMM d, y";
        } else if (i2 == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException(a.d("Unknown DateFormat style: ", i2));
        }
        return new SimpleDateFormat(str, Locale.US);
    }

    public static DateFormat getUSDateTimeFormat(int i2, int i3) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i2 == 1) {
            str = "MMMM d, yyyy";
        } else if (i2 == 2) {
            str = "MMM d, yyyy";
        } else if (i2 == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException(a.d("Unknown DateFormat style: ", i2));
        }
        sb.append(str);
        sb.append(" ");
        if (i3 == 0 || i3 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i3 == 2) {
            str2 = "h:mm:ss a";
        } else if (i3 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException(a.d("Unknown DateFormat style: ", i3));
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }
}
