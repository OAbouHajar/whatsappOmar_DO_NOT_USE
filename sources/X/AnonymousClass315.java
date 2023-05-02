package X;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.notification.PopupNotification;

/* renamed from: X.315  reason: invalid class name */
public class AnonymousClass315 extends AnonymousClass2Q3 {
    public boolean A00;
    public final /* synthetic */ PopupNotification A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass315(android.content.Context r9, X.AnonymousClass2Ao r10, X.C19610yi r11, com.obwhatsapp.notification.PopupNotification r12, X.C38701rH r13) {
        /*
            r8 = this;
            r3 = 0
            r0 = r8
            r8.A01 = r12
            X.1RV r6 = r12.A19
            X.1B5 r4 = r12.A0f
            r1 = r9
            r2 = r10
            r5 = r11
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.A0g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass315.<init>(android.content.Context, X.2Ao, X.0yi, com.obwhatsapp.notification.PopupNotification, X.1rH):void");
    }

    public void A0g() {
        if (!this.A00) {
            this.A00 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0U(A06, this);
            this.A00 = C17270uo.A00(A06.AGp);
            this.A02 = C17270uo.A00(A06.ALh);
            this.A01 = C17270uo.A00(A06.AK1);
            this.A01 = (C52922ef) A07.A04.get();
        }
    }

    public void onDraw(Canvas canvas) {
        View view = this.A04;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C13680ns.A0D(this).getDimensionPixelSize(R.dimen.dimen0623);
            view.setLayoutParams(layoutParams);
        }
        C30011bb.A0I(view, this);
        super.onDraw(canvas);
    }
}
