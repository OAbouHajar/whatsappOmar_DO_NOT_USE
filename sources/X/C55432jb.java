package X;

import android.content.Context;
import android.widget.RelativeLayout;

/* renamed from: X.2jb  reason: invalid class name and case insensitive filesystem */
public abstract class C55432jb extends RelativeLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C55432jb(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            C55422ja r2 = (C55422ja) this;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            r2.A06 = (AnonymousClass01V) r1.AOi.get();
            r2.A07 = (AnonymousClass013) r1.AR8.get();
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
