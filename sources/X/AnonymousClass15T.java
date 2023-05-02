package X;

import android.content.Context;

/* renamed from: X.15T  reason: invalid class name */
public class AnonymousClass15T {
    public final C16040sK A00;
    public final C16000sG A01;
    public final C16080sP A02;
    public final C16980tz A03;
    public final AnonymousClass013 A04;

    public AnonymousClass15T(C16040sK r1, C16000sG r2, C16080sP r3, C16980tz r4, AnonymousClass013 r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final String A00(C15830rv r6, int i2) {
        Context context = this.A03.A00;
        Object[] objArr = new Object[1];
        C16000sG r0 = this.A01;
        AnonymousClass00B.A06(r6);
        String str = null;
        String A08 = this.A02.A08(r0.A0A(r6));
        if (A08 != null) {
            str = this.A04.A0G(A08);
        }
        objArr[0] = str;
        return context.getString(i2, objArr);
    }
}
