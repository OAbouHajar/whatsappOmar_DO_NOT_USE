package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0sj  reason: invalid class name and case insensitive filesystem */
public class C16260sj {
    public final C16980tz A00;
    public final C15860rz A01;

    public C16260sj(C16980tz r1, C15860rz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static List A00() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_PHONE_STATE");
        if (C15450qv.A09()) {
            arrayList.add("android.permission.READ_PHONE_NUMBERS");
        }
        return arrayList;
    }

    public static boolean A01(Context context) {
        return C15450qv.A0B() && context.getApplicationInfo().targetSdkVersion >= 33;
    }

    public static boolean A02(Context context, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        return packageManager != null && packageManager.checkPermission(str, "com.obwhatsapp.w4b") == 0;
    }

    public int A03(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        int A012 = AnonymousClass00T.A01(this.A00.A00, str);
        if (A012 == 0) {
            this.A01.A0K().remove(str).apply();
        }
        return A012;
    }

    public int A04(String[] strArr) {
        if (Build.VERSION.SDK_INT >= 23) {
            for (String A03 : strArr) {
                int A032 = A03(A03);
                if (A032 != 0) {
                    return A032;
                }
            }
        }
        return 0;
    }

    public boolean A05() {
        return A03("android.permission.ACCESS_COARSE_LOCATION") == 0 || A03("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public boolean A06() {
        return A03("android.permission.NEARBY_WIFI_DEVICES") == 0;
    }

    public boolean A07() {
        AnonymousClass01D r3 = this.A01.A01;
        if (!"scoped".equals(((SharedPreferences) r3.get()).getString("external_storage_type", (String) null))) {
            return false;
        }
        int i2 = ((SharedPreferences) r3.get()).getInt("reg_skip_storage_perm", 0);
        return i2 == 1 || i2 == 2;
    }

    public boolean A08() {
        return A03("android.permission.READ_CALL_LOG") == 0;
    }

    public boolean A09() {
        return A03("android.permission.ANSWER_PHONE_CALLS") == 0 && A0C();
    }

    public boolean A0A() {
        String str;
        if (!C15450qv.A08()) {
            str = "android.permission.CALL_PHONE";
        } else if (A03("android.permission.ANSWER_PHONE_CALLS") != 0) {
            return false;
        } else {
            str = "android.permission.READ_CALL_LOG";
        }
        return A03(str) == 0 && A0C();
    }

    public boolean A0B() {
        return A04(C28971Zm.A00(this.A00.A00, false, true)) == 0;
    }

    public boolean A0C() {
        boolean z2 = true;
        for (String A03 : A00()) {
            boolean z3 = false;
            if (A03(A03) == 0) {
                z3 = true;
            }
            z2 &= z3;
        }
        return z2;
    }

    public boolean A0D() {
        return C15450qv.A0A() && A03("android.permission.READ_PHONE_STATE") == -1;
    }

    public boolean A0E() {
        return !A07() && !A0B();
    }

    public boolean A0F(String str) {
        return "mounted".equals(str) && A03("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public boolean A0G(boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        return !((i2 < 23 && this.A00.A00.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) || (C15450qv.A04() && A03("android.permission.RECORD_AUDIO") != 0)) && !(z2 && ((i2 < 23 && this.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") != 0) || (C15450qv.A04() && A03("android.permission.CAMERA") != 0)));
    }
}
