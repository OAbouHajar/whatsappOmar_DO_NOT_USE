package X;

import android.content.Context;
import android.view.View;
import com.obwhatsapp.PagerSlidingTabStrip;
import com.obwhatsapp.R;

/* renamed from: X.3uA  reason: invalid class name and case insensitive filesystem */
public final class C76523uA extends AnonymousClass3PT implements C14830pp {
    public final PagerSlidingTabStrip A00;
    public final C83754Hx[] A01 = new C83754Hx[this.A00];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76523uA(Context context, AnonymousClass02C r4, PagerSlidingTabStrip pagerSlidingTabStrip, String str) {
        super(context, r4, str, true);
        C18450wi.A0H(pagerSlidingTabStrip, 4);
        this.A00 = pagerSlidingTabStrip;
    }

    public View AEF(int i2) {
        C83754Hx[] r4 = this.A01;
        C83754Hx r3 = r4[i2];
        if (r3 == null) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
            r3 = new C83754Hx(AnonymousClass3K4.A0K(C13680ns.A0G(pagerSlidingTabStrip), pagerSlidingTabStrip, R.layout.layout02e0));
            CharSequence A04 = A04(i2);
            C18450wi.A0H(A04, 0);
            r3.A01.setText(A04);
            r4[i2] = r3;
        }
        return r3.A00;
    }
}
