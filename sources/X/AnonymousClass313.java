package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

/* renamed from: X.313  reason: invalid class name */
public class AnonymousClass313 extends AnonymousClass31M {
    public boolean A00;
    public final View.OnClickListener A01;

    public AnonymousClass313(Context context, View.OnClickListener onClickListener, C16730tY r4) {
        super(context, (AnonymousClass1YG) null, r4);
        A0g();
        this.A01 = onClickListener;
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
        }
    }

    public void A0z() {
        this.A01.onClick(this);
    }

    public void onDraw(Canvas canvas) {
        View view = this.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C13680ns.A0D(this).getDimensionPixelSize(R.dimen.dimen0623);
            view.setLayoutParams(layoutParams);
        }
        C30011bb.A0I(view, this);
        view.setPadding(getResources().getDimensionPixelSize(R.dimen.dimen02b6), getResources().getDimensionPixelSize(R.dimen.dimen02b7), getResources().getDimensionPixelSize(R.dimen.dimen02b6), getResources().getDimensionPixelSize(R.dimen.dimen02b5));
        super.onDraw(canvas);
    }
}
