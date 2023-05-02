package X;

import android.app.Activity;
import android.view.View;
import com.facebook.redex.IDxConsumerShape29S0300000_2_I0;

/* renamed from: X.2Zg  reason: invalid class name and case insensitive filesystem */
public class C50382Zg implements C49592Tx {
    public View A00;
    public View A01;
    public C05370Qr A02;
    public boolean A03 = true;
    public final Activity A04;
    public final AnonymousClass04N A05;
    public final AnonymousClass027 A06 = new AnonymousClass027();
    public final AnonymousClass027 A07 = new AnonymousClass027();
    public final AnonymousClass4QB A08 = new AnonymousClass4QB();
    public final C50372Zf A09;
    public final C50362Ze A0A;

    public C50382Zg(C001000l r3, C50372Zf r4, C50362Ze r5, C16490t9 r6) {
        this.A04 = r3;
        this.A0A = r5;
        this.A09 = r4;
        this.A05 = new IDxConsumerShape29S0300000_2_I0(r6, r3, this, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.View r12, X.AnonymousClass027 r13) {
        /*
            r11 = this;
            X.0Qr r0 = r11.A02
            if (r0 == 0) goto L_0x002d
            if (r12 == 0) goto L_0x002d
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x0018
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x002e
            android.app.Activity r0 = r11.A04
            boolean r0 = r0.isInPictureInPictureMode()
            if (r0 == 0) goto L_0x002e
        L_0x0018:
            X.2Wg r2 = X.C49872Wg.A03
        L_0x001a:
            java.lang.Object r1 = r13.A01()
            if (r1 != 0) goto L_0x0024
            int r0 = r2.A00
            if (r0 == 0) goto L_0x002d
        L_0x0024:
            boolean r0 = X.C34901l3.A00(r1, r2)
            if (r0 != 0) goto L_0x002d
            r13.A09(r2)
        L_0x002d:
            return
        L_0x002e:
            X.0Qr r0 = r11.A02
            X.0mV r10 = X.C810046l.A00(r0)
            if (r10 == 0) goto L_0x0018
            android.view.ViewParent r5 = r12.getParent()
            android.view.View r5 = (android.view.View) r5
            int r0 = r5.getHeight()
            if (r0 == 0) goto L_0x002d
            boolean r0 = r10.AJg()
            if (r0 == 0) goto L_0x0018
            r0 = 2
            int[] r7 = new int[r0]
            r5.getLocationOnScreen(r7)
            r9 = 0
            r6 = r7[r9]
            r4 = 1
            r3 = r7[r4]
            int r0 = r5.getWidth()
            int r2 = r6 + r0
            r1 = r7[r4]
            int r0 = r5.getHeight()
            int r1 = r1 + r0
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r6, r3, r2, r1)
            X.0cl r10 = (X.C07950cl) r10
            X.0RQ r0 = r10.A00
            int r6 = r0.A01
            int r3 = r0.A03
            int r2 = r0.A02
            int r1 = r0.A00
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r6, r3, r2, r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r0)
            boolean r1 = r3.intersect(r8)
            int r0 = r3.width()
            if (r0 != 0) goto L_0x008c
            int r0 = r3.height()
            if (r0 == 0) goto L_0x0018
        L_0x008c:
            if (r1 == 0) goto L_0x0018
            r0 = r7[r9]
            int r1 = -r0
            r0 = r7[r4]
            int r0 = -r0
            r3.offset(r1, r0)
            int r0 = r3.left
            if (r0 != 0) goto L_0x00b0
            int r2 = r5.getWidth()
            int r0 = r5.getHeight()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r2, r0)
            r0 = 2
            X.2Wg r2 = new X.2Wg
            r2.<init>(r1, r3, r0)
            goto L_0x001a
        L_0x00b0:
            int r0 = r3.top
            if (r0 != 0) goto L_0x002d
            int r2 = r5.getWidth()
            int r1 = r5.getHeight()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            X.2Wg r2 = new X.2Wg
            r2.<init>(r0, r3, r4)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50382Zg.A00(android.view.View, X.027):void");
    }

    public AnonymousClass028 AAL() {
        return this.A06;
    }

    public AnonymousClass028 AAM() {
        return this.A07;
    }

    public void AUG() {
        C50362Ze r1 = this.A0A;
        Activity activity = this.A04;
        synchronized (r1) {
            r1.A00();
            r1.A01(activity);
        }
    }

    public void AUk() {
        C50362Ze r1 = this.A0A;
        Activity activity = this.A04;
        synchronized (r1) {
            r1.A00();
            r1.A01(activity);
        }
    }

    public void AXR(View view) {
        this.A01 = view;
        C50362Ze r1 = this.A0A;
        r1.A02(this.A05);
        r1.A02(this.A09);
        r1.A01(this.A04);
    }

    public void AXv() {
        C50362Ze r0 = this.A0A;
        r0.A00();
        r0.A01.clear();
    }

    public void Add(View view) {
        this.A00 = view;
        A00(view, this.A06);
    }

    public void Adu(boolean z2) {
        if (this.A03 != z2) {
            this.A03 = z2;
            A00(this.A01, this.A07);
            A00(this.A00, this.A06);
        }
    }

    public void onGlobalLayout() {
        A00(this.A01, this.A07);
        A00(this.A00, this.A06);
    }
}
