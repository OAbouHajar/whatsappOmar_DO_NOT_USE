package X;

import android.content.Context;

/* renamed from: X.2jy  reason: invalid class name and case insensitive filesystem */
public abstract class C55572jy extends AnonymousClass09W implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C55572jy(Context context, AnonymousClass0P5 r5) {
        super(context, r5);
        if (!this.A01) {
            this.A01 = true;
            C55562jx r2 = (C55562jx) this;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            r2.A0A = (C17090uW) r1.ADM.get();
            r2.A0B = (AnonymousClass01V) r1.AOi.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
