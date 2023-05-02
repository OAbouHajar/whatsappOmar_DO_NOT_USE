package com.whatsapp.util;

import X.C86444Ss;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class IDxTLocalShape13S0000000_2_I0 extends C86444Ss {
    public final int A00;

    public IDxTLocalShape13S0000000_2_I0(int i2) {
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object A00() {
        Locale locale;
        String str;
        switch (this.A00) {
            case 0:
                locale = Locale.US;
                str = "yyyy-MM-dd HH:mm:ss.SSSZ";
                break;
            case 3:
                locale = Locale.US;
                str = "MMM dd, yyyy";
                break;
            case 4:
                locale = Locale.US;
                str = "yyyy-MM-dd";
                break;
            default:
                return new GregorianCalendar();
        }
        return new SimpleDateFormat(str, locale);
    }
}
