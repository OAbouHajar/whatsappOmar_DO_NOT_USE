package X;

import android.content.SharedPreferences;

/* renamed from: X.19m  reason: invalid class name and case insensitive filesystem */
public class C228419m {
    public final AnonymousClass01D A00;
    public final AnonymousClass01D A01;

    public C228419m(AnonymousClass01D r1, AnonymousClass01D r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean A00() {
        AnonymousClass01D r6 = this.A01;
        int i2 = ((SharedPreferences) ((C15860rz) r6.get()).A01.get()).getInt("shops_privacy_notice", -1);
        AnonymousClass01D r2 = this.A00;
        C15900s5 r0 = ((C228519n) r2.get()).A00;
        C16520tC r1 = C15910s6.A1v;
        if (i2 >= r0.A02(r1)) {
            return true;
        }
        ((SharedPreferences) ((C15860rz) r6.get()).A01.get()).getInt("shops_privacy_notice", -1);
        ((C228519n) r2.get()).A00.A02(r1);
        return false;
    }
}
