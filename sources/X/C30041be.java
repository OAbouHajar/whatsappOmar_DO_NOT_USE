package X;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: X.1be  reason: invalid class name and case insensitive filesystem */
public abstract class C30041be extends ViewGroup implements AnonymousClass006 {
    public C52662eE A00;

    public C30041be(Context context) {
        super(context);
        A0g();
    }

    public abstract void A0g();

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
