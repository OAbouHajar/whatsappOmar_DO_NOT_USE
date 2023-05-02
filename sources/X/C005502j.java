package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.02j  reason: invalid class name and case insensitive filesystem */
public abstract class C005502j {
    public long A00 = 120;
    public long A01 = 250;
    public long A02 = 250;
    public long A03 = 120;
    public C11960jc A04 = null;
    public ArrayList A05 = new ArrayList();

    public static void A00(C005602k r3) {
        int i2 = r3.A00;
        int i3 = i2 & 14;
        if ((i2 & 4) == 0 && (i3 & 4) == 0) {
            int i4 = r3.A03;
            int A002 = r3.A00();
        }
    }

    public AnonymousClass0O0 A01(C005602k r4) {
        AnonymousClass0O0 r2 = new AnonymousClass0O0();
        View view = r4.A0H;
        r2.A00 = view.getLeft();
        r2.A01 = view.getTop();
        view.getRight();
        view.getBottom();
        return r2;
    }

    public final void A02() {
        ArrayList arrayList = this.A05;
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw new NullPointerException("onAnimationsFinished");
        } else {
            arrayList.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C005602k r8) {
        /*
            r7 = this;
            X.0jc r2 = r7.A04
            if (r2 == 0) goto L_0x0054
            X.0cE r2 = (X.C07640cE) r2
            r0 = 1
            r8.A04(r0)
            X.02k r0 = r8.A0A
            r1 = 0
            if (r0 == 0) goto L_0x0015
            X.02k r0 = r8.A0B
            if (r0 != 0) goto L_0x0015
            r8.A0A = r1
        L_0x0015:
            r8.A0B = r1
            int r0 = r8.A00
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0054
            androidx.recyclerview.widget.RecyclerView r4 = r2.A00
            android.view.View r3 = r8.A0H
            r4.A0R()
            X.0SK r6 = r4.A0K
            X.0kS r0 = r6.A01
            X.0c7 r0 = (X.C07570c7) r0
            androidx.recyclerview.widget.RecyclerView r5 = r0.A00
            int r2 = r5.indexOfChild(r3)
            r0 = -1
            if (r2 != r0) goto L_0x0055
            r6.A08(r3)
        L_0x0036:
            r2 = 1
            X.02k r1 = androidx.recyclerview.widget.RecyclerView.A01(r3)
            X.0SJ r0 = r4.A0w
            r0.A09(r1)
            r0.A08(r1)
        L_0x0043:
            r0 = r2 ^ 1
            r4.A0t(r0)
            if (r2 != 0) goto L_0x0054
            int r0 = r8.A00
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0054
            r0 = 0
            r4.removeDetachedView(r3, r0)
        L_0x0054:
            return
        L_0x0055:
            X.0SE r1 = r6.A00
            boolean r0 = r1.A06(r2)
            if (r0 == 0) goto L_0x0073
            r1.A07(r2)
            r6.A08(r3)
            android.view.View r0 = r5.getChildAt(r2)
            if (r0 == 0) goto L_0x006f
            r5.A0i(r0)
            r0.clearAnimation()
        L_0x006f:
            r5.removeViewAt(r2)
            goto L_0x0036
        L_0x0073:
            r2 = 0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005502j.A03(X.02k):void");
    }

    public long A04() {
        return this.A00;
    }

    public long A05() {
        return this.A01;
    }

    public long A06() {
        return this.A02;
    }

    public long A07() {
        return this.A03;
    }

    public abstract void A08();

    public abstract void A09();

    public abstract void A0A(C005602k r1);

    public abstract boolean A0B();

    public boolean A0C(C005602k r3, List list) {
        return !((AnonymousClass0Fd) this).A00 || (r3.A00 & 4) != 0;
    }
}
