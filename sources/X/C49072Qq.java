package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

/* renamed from: X.2Qq  reason: invalid class name and case insensitive filesystem */
public abstract class C49072Qq extends SurfaceView implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C49072Qq(Context context) {
        super(context, (AttributeSet) null, 0);
        A00();
    }

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            C49062Qp r2 = (C49062Qp) this;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            r2.A0G = (AnonymousClass01V) r1.AOi.get();
            r2.A0I = (AnonymousClass1DX) r1.A3R.get();
            r2.A0J = (C17020u3) r1.AMG.get();
            r2.A0H = (C16260sj) r1.AQe.get();
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
