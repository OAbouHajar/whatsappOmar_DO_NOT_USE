package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.BidiToolbar;

/* renamed from: X.1Xz  reason: invalid class name and case insensitive filesystem */
public abstract class C28841Xz extends Toolbar implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C28841Xz(Context context) {
        super(context);
        A0I();
    }

    public C28841Xz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0I();
    }

    public C28841Xz(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A0I();
    }

    public void A0I() {
        if (this instanceof C52972el) {
            C52972el r1 = (C52972el) this;
            if (!r1.A00) {
                r1.A00 = true;
                ((BidiToolbar) r1).A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) r1.generatedComponent())).A07.AR8.get();
            }
        } else if (!this.A01) {
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
