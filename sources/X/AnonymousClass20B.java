package X;

import android.content.SharedPreferences;

/* renamed from: X.20B  reason: invalid class name */
public class AnonymousClass20B {
    public static int A00(C15860rz r1, int i2) {
        SharedPreferences sharedPreferences;
        String str;
        int i3;
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            sharedPreferences = (SharedPreferences) r1.A01.get();
            str = "autodownload_wifi_mask";
            i3 = 15;
        } else if (i2 == 2) {
            return r1.A03();
        } else {
            if (i2 == 3) {
                sharedPreferences = (SharedPreferences) r1.A01.get();
                str = "autodownload_roaming_mask";
                i3 = 0;
            } else {
                throw new IllegalArgumentException("network_type not valid");
            }
        }
        return sharedPreferences.getInt(str, i3);
    }
}
