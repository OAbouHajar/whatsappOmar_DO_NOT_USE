package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.obwhatsapp.HomePagerSlidingTabStrip;

/* renamed from: X.2cc  reason: invalid class name and case insensitive filesystem */
public abstract class C51972cc extends HorizontalScrollView implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C51972cc(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public void A00() {
        if (this instanceof HomePagerSlidingTabStrip) {
            HomePagerSlidingTabStrip homePagerSlidingTabStrip = (HomePagerSlidingTabStrip) this;
            if (!homePagerSlidingTabStrip.A00) {
                homePagerSlidingTabStrip.A00 = true;
                homePagerSlidingTabStrip.generatedComponent();
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
