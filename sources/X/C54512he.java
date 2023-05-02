package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.2he  reason: invalid class name and case insensitive filesystem */
public abstract class C54512he extends C006002o implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C54512he(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public void A00() {
        C52642eC r1;
        C54492hc r0;
        if (this instanceof C54492hc) {
            C54492hc r02 = (C54492hc) this;
            if (!r02.A00) {
                r02.A00 = true;
                r1 = (C52642eC) r02.generatedComponent();
                r0 = r02;
            } else {
                return;
            }
        } else if (!this.A01) {
            this.A01 = true;
            r1 = (C52642eC) generatedComponent();
            r0 = (C54502hd) this;
        } else {
            return;
        }
        r0.A04 = (AnonymousClass013) ((C52652eD) r1).A07.AR8.get();
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
