package X;

import android.content.Context;

/* renamed from: X.0y6  reason: invalid class name and case insensitive filesystem */
public final class C19240y6 extends C16580tI {
    public int A00 = 200;
    public final Context A01;
    public final C14710pd A02;
    public final AnonymousClass01J A03;
    public final C15220qW A04 = new AnonymousClass1DV(new AnonymousClass2IN(this));
    public final C15220qW A05 = new AnonymousClass1DV(new AnonymousClass2IO(this));
    public final C15220qW A06;

    public C19240y6(Context context, C14710pd r4, AnonymousClass01J r5, C15220qW r6) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r5, 4);
        this.A02 = r4;
        this.A06 = r6;
        this.A01 = context;
        this.A03 = r5;
    }

    public final int A04() {
        return this.A00;
    }

    public final void A05() {
        if (A07()) {
            for (AnonymousClass4VP A002 : A01()) {
                A002.A00();
            }
        }
    }

    public final void A06(int i2) {
        if (A07()) {
            this.A00 = i2;
            for (AnonymousClass4VP A012 : A01()) {
                A012.A01(i2);
            }
        }
    }

    public final boolean A07() {
        return ((Boolean) this.A04.getValue()).booleanValue();
    }
}
