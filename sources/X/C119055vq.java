package X;

import com.whatsapp.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.5vq  reason: invalid class name and case insensitive filesystem */
public class C119055vq {
    public static Date A00(String str) {
        AnonymousClass00B.A05(str);
        try {
            return new SimpleDateFormat("dd/MM/yyyy", Locale.US).parse(str);
        } catch (ParseException e2) {
            Log.e("Couldn't parse the date", e2);
            return null;
        }
    }

    public static int[] A01(String str) {
        Date A00 = A00(str);
        int[] iArr = {-1, -1, -1};
        if (A00 == null) {
            return iArr;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(A00);
        return new int[]{instance.get(5), instance.get(2), instance.get(1)};
    }
}
