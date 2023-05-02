package X;

import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import java.lang.ref.WeakReference;

/* renamed from: X.3Cn  reason: invalid class name and case insensitive filesystem */
public class C62243Cn implements View.OnClickListener {
    public final View A00;
    public final C16040sK A01;
    public final C16000sG A02;
    public final C16080sP A03;
    public final AnonymousClass2Ao A04;
    public final AnonymousClass1B5 A05;
    public final C19610yi A06;
    public final C15860rz A07;
    public final AnonymousClass013 A08;
    public final WeakReference A09;

    public C62243Cn(Activity activity, View view, C16040sK r4, C16000sG r5, C16080sP r6, AnonymousClass2Ao r7, AnonymousClass1B5 r8, C19610yi r9, C15860rz r10, AnonymousClass013 r11) {
        this.A00 = view;
        this.A05 = r8;
        this.A06 = r9;
        this.A09 = C13690nt.A0h(activity);
        this.A08 = r11;
        this.A04 = r7;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A07 = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r2 == 10) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C38701rH r11) {
        /*
            r10 = this;
            java.lang.ref.WeakReference r0 = r10.A09
            java.lang.Object r3 = r0.get()
            android.app.Activity r3 = (android.app.Activity) r3
            if (r11 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x0050
            X.1B5 r2 = r10.A05
            r4 = 0
            r1 = 0
            r0 = 1
            X.2DT r3 = r2.A01(r3, r1, r0)
            r3.A0O = r11
            r3.A0A = r0
            int r2 = r11.A0C
            r0 = 9
            if (r2 == r0) goto L_0x0024
            r1 = 10
            r0 = 0
            if (r2 != r1) goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            r3.A0T = r0
            r3.A0J = r4
            r0 = 0
            r2 = 1
            r3.A0B(r0, r2, r2)
            X.0yi r8 = r10.A06
            X.013 r9 = r10.A08
            android.view.View r3 = r10.A00
            X.2Ao r7 = r10.A04
            X.0sK r4 = r10.A01
            X.0sG r5 = r10.A02
            X.0sP r6 = r10.A03
            X.AnonymousClass2DE.A01(r3, r4, r5, r6, r7, r8, r9)
            X.0rz r1 = r10.A07
            X.1Vw r0 = r11.A11
            X.0rv r0 = r0.A00
            X.AnonymousClass2DE.A0B(r1, r0)
            X.2DT r0 = r8.A00()
            if (r0 == 0) goto L_0x0050
            r0.A0X = r2
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62243Cn.A00(X.1rH):void");
    }

    public void onClick(View view) {
        C19610yi r3 = this.A06;
        boolean A0C = r3.A0C();
        boolean A0B = r3.A0B();
        if (!A0C) {
            if (A0B) {
                r3.A04();
            }
            C38701rH A012 = r3.A01();
            synchronized (r3) {
                r3.A02 = null;
            }
            A00(A012);
        } else if (A0B) {
            AnonymousClass2DT A002 = r3.A00();
            if (A002 != null) {
                A002.A06++;
            }
            r3.A04();
            if (view instanceof ImageButton) {
                AnonymousClass2DE.A06((ImageButton) view);
            }
        } else {
            AnonymousClass2DT A003 = r3.A00();
            C38701rH A013 = r3.A01();
            if (A003 != null) {
                A003.A0B(0, true, true);
                if (view instanceof ImageButton) {
                    AnonymousClass2DE.A05((ImageButton) view);
                }
            } else if (A013 != null) {
                A00(A013);
            }
        }
    }
}
