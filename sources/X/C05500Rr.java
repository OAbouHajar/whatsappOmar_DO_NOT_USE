package X;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.support.v4.view.GravityCompat;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.facebook.redex.IDxDListenerShape265S0100000_I1;
import com.obwhatsapp.R;

/* renamed from: X.0Rr  reason: invalid class name and case insensitive filesystem */
public class C05500Rr {
    public int A00 = GravityCompat.START;
    public View A01;
    public PopupWindow.OnDismissListener A02;
    public AnonymousClass0ZU A03;
    public C12940lD A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final PopupWindow.OnDismissListener A09 = new IDxDListenerShape265S0100000_I1(this, 0);
    public final C016607w A0A;
    public final boolean A0B;

    public C05500Rr(Context context, View view, C016607w r5, int i2, int i3, boolean z2) {
        this.A08 = context;
        this.A0A = r5;
        this.A01 = view;
        this.A0B = z2;
        this.A06 = i2;
        this.A07 = i3;
    }

    public AnonymousClass0ZU A00() {
        AnonymousClass0ZU r3 = this.A03;
        if (r3 == null) {
            Context context = this.A08;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.dimen0016)) {
                r3 = new C02570Cy(context, this.A01, this.A06, this.A07, this.A0B);
            } else {
                r3 = new AnonymousClass0Cz(context, this.A01, this.A0A, this.A06, this.A07, this.A0B);
            }
            r3.A06(this.A0A);
            r3.A05(this.A09);
            r3.A04(this.A01);
            r3.Ade(this.A04);
            r3.A07(this.A05);
            r3.A01(this.A00);
            this.A03 = r3;
        }
        return r3;
    }

    public void A01() {
        AnonymousClass0ZU r0 = this.A03;
        if (r0 != null && r0.AJh()) {
            this.A03.dismiss();
        }
    }

    public void A02() {
        this.A03 = null;
        PopupWindow.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r3 = this;
            X.0ZU r0 = r3.A03
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.AJh()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.view.View r0 = r3.A01
            r1 = 0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            X.0ZU r0 = r3.A00()
            r0.A08(r1)
            r0.AfT()
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05500Rr.A03():boolean");
    }
}
