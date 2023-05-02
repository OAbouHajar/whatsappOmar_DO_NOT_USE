package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1BL  reason: invalid class name */
public class AnonymousClass1BL {
    public static final List A02 = Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
    public final C16490t9 A00;
    public final AnonymousClass1BK A01;

    public AnonymousClass1BL(C16490t9 r1, AnonymousClass1BK r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(int i2, int i3) {
        AnonymousClass1BK r4 = this.A01;
        String A002 = AnonymousClass1BK.A00(i2);
        SharedPreferences sharedPreferences = r4.A00;
        if (sharedPreferences == null) {
            sharedPreferences = r4.A01.A00("privacy_highlight");
            r4.A00 = sharedPreferences;
        }
        String str = "0,0,0";
        String string = sharedPreferences.getString(A002, str);
        if (string != null) {
            str = string;
        }
        String[] split = str.split(",");
        if (i3 < split.length) {
            split[i3] = String.valueOf(Integer.parseInt(split[i3]) + 1);
            String join = TextUtils.join(",", split);
            SharedPreferences sharedPreferences2 = r4.A00;
            if (sharedPreferences2 == null) {
                sharedPreferences2 = r4.A01.A00("privacy_highlight");
                r4.A00 = sharedPreferences2;
            }
            sharedPreferences2.edit().putString(A002, join).apply();
            return;
        }
        throw new IllegalStateException("position exceeds event array length");
    }
}
