package X;

import android.content.SharedPreferences;

/* renamed from: X.1HL  reason: invalid class name */
public class AnonymousClass1HL {
    public final C15900s5 A00;
    public final C16440t3 A01;
    public final C15860rz A02;
    public final AnonymousClass2CH A03 = new AnonymousClass2CH();

    public AnonymousClass1HL(C15900s5 r2, C16440t3 r3, C15860rz r4) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public boolean A00() {
        AnonymousClass01D r3 = this.A02.A01;
        return !this.A00.A05(C15910s6.A0N) && ((SharedPreferences) r3.get()).contains("c2dm_reg_id") && ((SharedPreferences) r3.get()).getInt("logins_with_messages", 0) < 3;
    }
}
