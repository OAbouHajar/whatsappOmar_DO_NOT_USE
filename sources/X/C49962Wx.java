package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.obwhatsapp.WaViewPager;

/* renamed from: X.2Wx  reason: invalid class name and case insensitive filesystem */
public abstract class C49962Wx extends ViewPager implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C49962Wx(Context context) {
        super(context);
        A0O();
    }

    public C49962Wx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0O();
    }

    public void A0O() {
        if (!this.A01) {
            this.A01 = true;
            ((WaViewPager) this).A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
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
