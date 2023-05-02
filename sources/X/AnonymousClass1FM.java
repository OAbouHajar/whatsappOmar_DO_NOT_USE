package X;

import android.os.Build;

/* renamed from: X.1FM  reason: invalid class name */
public class AnonymousClass1FM implements AnonymousClass1FG {
    public final C16980tz A00;
    public final C16490t9 A01;
    public final C16220sf A02;

    public AnonymousClass1FM(C16980tz r1, C16490t9 r2, C16220sf r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void API() {
        if (Build.VERSION.SDK_INT < 19 || new AnonymousClass03S(this.A00.A00).A03()) {
            C75423s8 r2 = new C75423s8();
            C16220sf r0 = this.A02;
            AnonymousClass1WS A03 = r0.A03();
            AnonymousClass1WS A022 = r0.A02();
            r2.A01 = Boolean.valueOf(A022.A0A());
            int i2 = 1;
            r2.A00 = Boolean.valueOf(!A022.A02().A0F);
            int i3 = 2;
            if (A022.A02().A0B.equals(A022.A0B)) {
                i3 = 1;
            }
            r2.A04 = Integer.valueOf(i3);
            r2.A03 = Boolean.valueOf(A03.A0A());
            r2.A02 = Boolean.valueOf(!A03.A02().A0F);
            if (!A03.A02().A0B.equals(A03.A0B)) {
                i2 = 2;
            }
            r2.A05 = Integer.valueOf(i2);
            this.A01.A04(r2);
        }
    }
}
