package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.notification.PopupNotification;

/* renamed from: X.30e  reason: invalid class name and case insensitive filesystem */
public class C601230e extends AnonymousClass2Q5 {
    public boolean A00;
    public final /* synthetic */ PopupNotification A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C601230e(Context context, PopupNotification popupNotification, C38701rH r9) {
        super(context, (AnonymousClass1YG) null, popupNotification.A0f, popupNotification.A0g, r9);
        this.A01 = popupNotification;
        A0g();
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
