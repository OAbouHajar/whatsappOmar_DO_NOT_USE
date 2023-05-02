package X;

import android.content.SharedPreferences;
import java.util.Locale;

/* renamed from: X.0vq  reason: invalid class name and case insensitive filesystem */
public abstract class C17910vq {
    public final C16440t3 A00;
    public final C15860rz A01;
    public final C31081dR A02;

    public C17910vq(C16440t3 r10, C15860rz r11, C16490t9 r12, AnonymousClass17S r13, C19500yX r14, String str, int i2) {
        this.A00 = r10;
        this.A01 = r11;
        C31081dR r2 = new C31081dR(r10, r12, r13, r14, str, i2);
        r2.A06.A03 = true;
        this.A02 = r2;
    }

    public final void A00(int i2, String str) {
        C18450wi.A0H(str, 1);
        C31081dR r3 = this.A02;
        r3.A04(i2, str, true);
        A01(i2, "timestamp_ms", System.currentTimeMillis());
        C19500yX r4 = r3.A08;
        int i3 = r3.A06.A05;
        r4.AKq("is_debug_build", i3, i2, false);
        String string = ((SharedPreferences) this.A01.A01.get()).getString("pref_graphql_domain", "whatsapp.com");
        C18450wi.A0B(string);
        String lowerCase = string.toLowerCase(Locale.ROOT);
        C18450wi.A0B(lowerCase);
        r4.AKq("is_graphql_prod", i3, i2, lowerCase.equals("whatsapp.com"));
    }

    public final void A01(int i2, String str, long j2) {
        C31081dR r0 = this.A02;
        r0.A08.AKo(str, r0.A06.A05, i2, j2);
    }

    public final void A02(int i2, String str, String str2) {
        C18450wi.A0H(str2, 2);
        C31081dR r0 = this.A02;
        r0.A08.AKp(str, str2, r0.A06.A05, i2);
    }
}
