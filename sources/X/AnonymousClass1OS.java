package X;

import android.content.SharedPreferences;

/* renamed from: X.1OS  reason: invalid class name */
public class AnonymousClass1OS implements C23541Cj {
    public final AnonymousClass1BL A00;

    public AnonymousClass1OS(AnonymousClass1BL r1) {
        this.A00 = r1;
    }

    public void APJ() {
        AnonymousClass1BL r4 = this.A00;
        for (Integer num : AnonymousClass1BL.A02) {
            int intValue = num.intValue();
            AnonymousClass1BK r3 = r4.A01;
            SharedPreferences sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A01.A00("privacy_highlight");
                r3.A00 = sharedPreferences;
            }
            String str = "0,0,0";
            String string = sharedPreferences.getString(AnonymousClass1BK.A00(intValue), str);
            if (string != null) {
                str = string;
            }
            String[] split = str.split(",");
            if (split.length != 3) {
                break;
            }
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int parseInt3 = Integer.parseInt(split[2]);
            if (parseInt > 0 || parseInt2 > 0 || parseInt3 > 0) {
                C75303rw r2 = new C75303rw();
                r2.A00 = 0;
                r2.A04 = Long.valueOf((long) parseInt);
                r2.A02 = Long.valueOf((long) parseInt2);
                r2.A03 = Long.valueOf((long) parseInt3);
                r2.A01 = num;
                r4.A00.A06(r2);
            }
        }
        AnonymousClass1BK r22 = r4.A01;
        SharedPreferences sharedPreferences2 = r22.A00;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = r22.A01.A00("privacy_highlight");
            r22.A00 = sharedPreferences2;
        }
        sharedPreferences2.edit().clear().apply();
    }

    public /* synthetic */ void APK() {
    }
}
