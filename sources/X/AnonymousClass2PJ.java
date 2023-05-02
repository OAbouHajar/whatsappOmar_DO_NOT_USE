package X;

import android.content.Context;
import android.view.TextureView;

/* renamed from: X.2PJ  reason: invalid class name */
public abstract class AnonymousClass2PJ extends TextureView implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass2PJ(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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
