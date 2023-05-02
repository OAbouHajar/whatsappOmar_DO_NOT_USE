package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;

/* renamed from: X.2rX  reason: invalid class name and case insensitive filesystem */
public class C57652rX extends C07660cG {
    public int A00 = 150;
    public int A01 = -1;
    public int A02 = 8;
    public int A03 = -1;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;
    public final RunnableRunnableShape14S0200000_I1_2 A08 = new RunnableRunnableShape14S0200000_I1_2(this);
    public final AnonymousClass2OP A09;

    public C57652rX(AnonymousClass2OP r3) {
        this.A09 = r3;
    }

    public final void A00(RecyclerView recyclerView, int i2) {
        boolean z2;
        if (i2 != this.A03) {
            AnonymousClass2OP r2 = this.A09;
            if (r2.ALP()) {
                if (!this.A05) {
                    r2.Aff();
                }
                z2 = true;
            } else {
                C005602k A0E = recyclerView.A0E(i2, false);
                if (A0E instanceof C64713Rj) {
                    r2.AdI(((C64713Rj) A0E).A00.A05);
                    z2 = false;
                } else {
                    return;
                }
            }
            this.A05 = z2;
        }
    }

    public final void A01(RecyclerView recyclerView, int i2, int i3) {
        while (i2 >= i3) {
            if (i2 != this.A03) {
                C005602k A0E = recyclerView.A0E(i2, false);
                if (A0E instanceof C64713Rj) {
                    this.A09.AhE(((C64713Rj) A0E).A00.A05);
                }
            }
            i2--;
        }
    }

    public final void A02(RecyclerView recyclerView, int i2, int i3) {
        while (i2 <= i3) {
            if (i2 != this.A03) {
                C005602k A0E = recyclerView.A0E(i2, false);
                if (A0E instanceof C64713Rj) {
                    this.A09.AhE(((C64713Rj) A0E).A00.A05);
                }
            }
            i2++;
        }
    }

    public boolean ASI(MotionEvent motionEvent, RecyclerView recyclerView) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.A04 = false;
        }
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cd, code lost:
        if (r3 > r4) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYx(android.view.MotionEvent r6, androidx.recyclerview.widget.RecyclerView r7) {
        /*
            r5 = this;
            int r1 = r6.getActionMasked()
            r0 = 1
            if (r1 == r0) goto L_0x00f1
            r0 = 2
            if (r1 == r0) goto L_0x000e
            r0 = 3
            if (r1 == r0) goto L_0x00f1
        L_0x000d:
            return
        L_0x000e:
            float r1 = r6.getX()
            float r0 = r6.getY()
            android.view.View r0 = r7.A0B(r1, r0)
            if (r0 == 0) goto L_0x0052
            int r4 = androidx.recyclerview.widget.RecyclerView.A00(r0)
            r0 = -1
            if (r4 == r0) goto L_0x0052
            int r3 = r5.A01
            if (r4 == r3) goto L_0x0052
            int r2 = r5.A03
            if (r2 == r0) goto L_0x0052
            if (r3 != r0) goto L_0x003d
            int r1 = java.lang.Math.min(r4, r2)
            int r0 = java.lang.Math.max(r4, r2)
        L_0x0035:
            if (r1 > r0) goto L_0x0050
            r5.A00(r7, r1)
            int r1 = r1 + 1
            goto L_0x0035
        L_0x003d:
            if (r2 <= r3) goto L_0x00e8
            if (r2 <= r4) goto L_0x00e8
        L_0x0041:
            r0 = 1
        L_0x0042:
            r1 = 1
            if (r0 == 0) goto L_0x00c5
            if (r2 <= r3) goto L_0x00bd
            if (r2 <= r4) goto L_0x00bd
            if (r3 > r4) goto L_0x00cf
            int r0 = r4 + -1
            r5.A02(r7, r3, r0)
        L_0x0050:
            r5.A01 = r4
        L_0x0052:
            float r2 = r6.getY()
            int r1 = r7.getTop()
            int r0 = r5.A00
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00a8
            r0 = 0
        L_0x0063:
            r5.A07 = r0
            if (r0 == 0) goto L_0x0099
            float r2 = r6.getY()
            int r1 = r7.getBottom()
            int r0 = r5.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            float r2 = r2 - r0
            int r0 = (int) r2
        L_0x0075:
            int r0 = java.lang.Math.abs(r0)
            int r1 = r5.A00
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 * 12
            int r0 = r0 / r1
            int r0 = r0 + 8
            r5.A02 = r0
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x000d
            r0 = 1
            r5.A06 = r0
            com.facebook.redex.RunnableRunnableShape14S0200000_I1_2 r1 = r5.A08
            r1.A00 = r7
            android.os.Handler r0 = r7.getHandler()
            r0.post(r1)
            return
        L_0x0099:
            int r1 = r7.getTop()
            int r0 = r5.A00
            int r1 = r1 + r0
            float r1 = (float) r1
            float r0 = r6.getY()
            float r1 = r1 - r0
            int r0 = (int) r1
            goto L_0x0075
        L_0x00a8:
            float r2 = r6.getY()
            int r1 = r7.getBottom()
            int r0 = r5.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L_0x0063
            r0 = 0
            r5.A06 = r0
            goto L_0x0101
        L_0x00bd:
            if (r3 < r4) goto L_0x00de
            int r0 = r4 + 1
            r5.A01(r7, r3, r0)
            goto L_0x0050
        L_0x00c5:
            if (r2 <= r3) goto L_0x00d8
            int r2 = r2 - r1
            r5.A02(r7, r3, r2)
        L_0x00cb:
            int r3 = r5.A03
            if (r3 <= r4) goto L_0x00de
        L_0x00cf:
            int r3 = r3 - r1
        L_0x00d0:
            if (r3 < r4) goto L_0x0050
            r5.A00(r7, r3)
            int r3 = r3 + -1
            goto L_0x00d0
        L_0x00d8:
            int r0 = r2 + 1
            r5.A01(r7, r3, r0)
            goto L_0x00cb
        L_0x00de:
            int r0 = r3 + 1
        L_0x00e0:
            if (r0 > r4) goto L_0x0050
            r5.A00(r7, r0)
            int r0 = r0 + 1
            goto L_0x00e0
        L_0x00e8:
            if (r2 >= r3) goto L_0x00ee
            if (r2 >= r4) goto L_0x00ee
            goto L_0x0041
        L_0x00ee:
            r0 = 0
            goto L_0x0042
        L_0x00f1:
            r1 = 0
            r5.A04 = r1
            r0 = 8
            r5.A02 = r0
            r5.A05 = r1
            r0 = -1
            r5.A01 = r0
            r5.A03 = r0
            r5.A06 = r1
        L_0x0101:
            android.os.Handler r0 = r7.getHandler()
            com.facebook.redex.RunnableRunnableShape14S0200000_I1_2 r1 = r5.A08
            r0.removeCallbacks(r1)
            r0 = 0
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57652rX.AYx(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):void");
    }
}
