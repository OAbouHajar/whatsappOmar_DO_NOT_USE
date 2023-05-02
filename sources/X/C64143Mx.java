package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.3Mx  reason: invalid class name and case insensitive filesystem */
public abstract class C64143Mx extends View implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C64143Mx(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
