package X;

import android.os.ConditionVariable;

/* renamed from: X.0tK  reason: invalid class name and case insensitive filesystem */
public class C16600tK extends C16580tI {
    public int A00;
    public boolean A01;
    public final ConditionVariable A02 = new ConditionVariable(false);
    public volatile int A03 = 3;
    public volatile boolean A04;
    public volatile boolean A05;

    public C16600tK(AnonymousClass01D r3) {
        super(r3);
    }

    public void A04(C18950xW r3) {
        int i2 = this.A03;
        if (i2 == 1) {
            r3.ARz();
        } else if (i2 == 2) {
            r3.ARy();
        } else if (i2 == 3) {
            r3.AS0();
        }
        A02(r3);
    }

    public void A05(boolean z2) {
        this.A03 = 2;
        this.A01 = true;
        this.A04 = z2;
        this.A02.open();
        AnonymousClass00B.A01();
        for (C18950xW ARy : A01()) {
            ARy.ARy();
        }
    }

    public boolean A06() {
        return A08() && this.A01;
    }

    public boolean A07() {
        return this.A05;
    }

    public boolean A08() {
        return this.A03 == 2;
    }
}
