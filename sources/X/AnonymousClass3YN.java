package X;

import android.os.Bundle;

/* renamed from: X.3YN  reason: invalid class name */
public abstract class AnonymousClass3YN extends AnonymousClass4R4 {
    public final int A00;
    public final Bundle A01;
    public final /* synthetic */ C15770rp A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3YN(Bundle bundle, C15770rp r3, int i2) {
        super(r3, Boolean.TRUE);
        this.A02 = r3;
        this.A00 = i2;
        this.A01 = bundle;
    }

    public void A01(C15700rh r4) {
        C15770rp r2 = ((AnonymousClass3YM) this).A00;
        r2.A08.AWA(r4);
        r2.A01 = r4.A01;
        r2.A05 = System.currentTimeMillis();
    }

    public boolean A02() {
        ((AnonymousClass3YM) this).A00.A08.AWA(C15700rh.A04);
        return true;
    }
}
