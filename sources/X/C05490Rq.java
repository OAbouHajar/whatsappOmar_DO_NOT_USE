package X;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0Rq  reason: invalid class name and case insensitive filesystem */
public abstract class C05490Rq {
    public int A00 = -1;
    public View A01;
    public AnonymousClass02W A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C05260Px A07 = new C05260Px();

    public PointF A00(int i2) {
        AnonymousClass02W r1 = this.A02;
        if (r1 instanceof AnonymousClass02X) {
            return ((AnonymousClass02X) r1).A6V(i2);
        }
        Log.w("RecyclerView", AnonymousClass000.A0h(AnonymousClass02X.class.getCanonicalName(), AnonymousClass000.A0r("You should override computeScrollVectorForPosition when the LayoutManager does not implement ")));
        return null;
    }

    public final void A01() {
        if (this.A05) {
            this.A05 = false;
            AnonymousClass0Fo r0 = (AnonymousClass0Fo) this;
            r0.A01 = 0;
            r0.A00 = 0;
            r0.A02 = null;
            this.A03.A0y.A06 = -1;
            this.A01 = null;
            this.A00 = -1;
            this.A04 = false;
            AnonymousClass02W r1 = this.A02;
            if (r1.A06 == this) {
                r1.A06 = null;
            }
            this.A02 = null;
            this.A03 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(int r10, int r11) {
        /*
            r9 = this;
            androidx.recyclerview.widget.RecyclerView r4 = r9.A03
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x000d
            int r1 = r9.A00
            r0 = -1
            if (r1 == r0) goto L_0x000d
            if (r4 != 0) goto L_0x0010
        L_0x000d:
            r9.A01()
        L_0x0010:
            boolean r0 = r9.A04
            r3 = 0
            if (r0 == 0) goto L_0x0041
            android.view.View r0 = r9.A01
            if (r0 != 0) goto L_0x0041
            X.02W r0 = r9.A02
            if (r0 == 0) goto L_0x0041
            int r0 = r9.A00
            android.graphics.PointF r5 = r9.A00(r0)
            if (r5 == 0) goto L_0x0041
            float r2 = r5.x
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0032
            float r0 = r5.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
        L_0x0032:
            float r0 = java.lang.Math.signum(r2)
            int r1 = (int) r0
            float r0 = r5.y
            float r0 = java.lang.Math.signum(r0)
            int r0 = (int) r0
            r4.A0g(r1, r3, r0)
        L_0x0041:
            r0 = 0
            r9.A04 = r0
            android.view.View r0 = r9.A01
            if (r0 == 0) goto L_0x0068
            X.02k r2 = androidx.recyclerview.widget.RecyclerView.A01(r0)
            if (r2 == 0) goto L_0x0116
            int r1 = r2.A06
            r0 = -1
            if (r1 != r0) goto L_0x0055
            int r1 = r2.A05
        L_0x0055:
            int r0 = r9.A00
            if (r1 != r0) goto L_0x010b
            android.view.View r2 = r9.A01
            X.0Ri r1 = r4.A0y
            X.0Px r0 = r9.A07
            r9.A03(r2, r0, r1)
            r0.A00(r4)
            r9.A01()
        L_0x0068:
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x00c6
            X.0Px r5 = r9.A07
            r7 = r9
            X.0Fo r7 = (X.AnonymousClass0Fo) r7
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            X.02W r0 = r0.A0S
            int r0 = r0.A05()
            if (r0 == 0) goto L_0x00ac
            int r0 = r7.A00
            int r2 = r0 - r10
            int r0 = r0 * r2
            if (r0 > 0) goto L_0x0083
            r2 = 0
        L_0x0083:
            r7.A00 = r2
            int r1 = r7.A01
            int r0 = r1 - r11
            int r1 = r1 * r0
            if (r1 > 0) goto L_0x008d
            r0 = 0
        L_0x008d:
            r7.A01 = r0
            if (r2 != 0) goto L_0x00af
            if (r0 != 0) goto L_0x00af
            int r0 = r7.A00
            android.graphics.PointF r8 = r7.A00(r0)
            if (r8 == 0) goto L_0x00a8
            float r6 = r8.x
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c7
            float r0 = r8.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c7
        L_0x00a8:
            int r0 = r7.A00
            r5.A04 = r0
        L_0x00ac:
            r7.A01()
        L_0x00af:
            int r1 = r5.A04
            r0 = 0
            if (r1 < 0) goto L_0x00b5
            r0 = 1
        L_0x00b5:
            r5.A00(r4)
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x0119
            r0 = 1
            r9.A04 = r0
            X.0hI r0 = r4.A0z
            r0.A00()
        L_0x00c6:
            return
        L_0x00c7:
            float r1 = r6 * r6
            float r3 = r8.y
            float r0 = r3 * r3
            float r1 = r1 + r0
            double r0 = (double) r1
            double r1 = java.lang.Math.sqrt(r0)
            float r0 = (float) r1
            float r6 = r6 / r0
            r8.x = r6
            float r3 = r3 / r0
            r8.y = r3
            r7.A02 = r8
            r1 = 1176256512(0x461c4000, float:10000.0)
            float r6 = r6 * r1
            int r0 = (int) r6
            r7.A00 = r0
            float r3 = r3 * r1
            int r0 = (int) r3
            r7.A01 = r0
            r0 = 10000(0x2710, float:1.4013E-41)
            int r6 = r7.A07(r0)
            int r0 = r7.A00
            float r0 = (float) r0
            r1 = 1067030938(0x3f99999a, float:1.2)
            float r0 = r0 * r1
            int r3 = (int) r0
            int r0 = r7.A01
            float r0 = (float) r0
            float r0 = r0 * r1
            int r2 = (int) r0
            float r0 = (float) r6
            float r0 = r0 * r1
            int r1 = (int) r0
            android.view.animation.LinearInterpolator r0 = r7.A05
            r5.A02 = r3
            r5.A03 = r2
            r5.A01 = r1
            r5.A05 = r0
            r0 = 1
            r5.A06 = r0
            goto L_0x00af
        L_0x010b:
            java.lang.String r1 = "RecyclerView"
            java.lang.String r0 = "Passed over target position while smooth scrolling."
            android.util.Log.e(r1, r0)
            r9.A01 = r3
            goto L_0x0068
        L_0x0116:
            r1 = -1
            goto L_0x0055
        L_0x0119:
            r9.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05490Rq.A02(int, int):void");
    }

    public abstract void A03(View view, C05260Px r2, AnonymousClass0Ri r3);
}
