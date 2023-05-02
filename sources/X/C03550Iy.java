package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.0Iy  reason: invalid class name and case insensitive filesystem */
public class C03550Iy extends C65253Tx {
    public C119575yh A00;
    public final C12690ko A01;

    public C03550Iy(C12690ko r1, C14990q7 r2, C31201dg r3) {
        super(r2, r3);
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ void A07(View view, C14990q7 r2, C31201dg r3, Object obj) {
        A0C((FrameLayout) view, r2, r3);
    }

    public /* bridge */ /* synthetic */ void A09(View view, C14990q7 r2, C31201dg r3, Object obj) {
        A0B((FrameLayout) view, r2);
    }

    public final C119575yh A0A(C14990q7 r3) {
        C119575yh r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C119575yh A7R = this.A01.A7R(r3.A00());
        this.A00 = A7R;
        return A7R;
    }

    public void A0B(FrameLayout frameLayout, C14990q7 r3) {
        frameLayout.removeAllViews();
        A0A(r3).A05();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1.equals("front") != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(android.widget.FrameLayout r4, X.C14990q7 r5, X.C31201dg r6) {
        /*
            r3 = this;
            X.5yh r2 = r3.A0A(r5)
            r0 = 35
            java.lang.String r1 = r6.A0J(r0)
            if (r1 == 0) goto L_0x0015
            java.lang.String r0 = "front"
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r2.A08(r0)
            android.view.View r0 = r2.A03()
            r4.addView(r0)
            r2.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03550Iy.A0C(android.widget.FrameLayout, X.0q7, X.1dg):void");
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        return new FrameLayout(context);
    }
}
