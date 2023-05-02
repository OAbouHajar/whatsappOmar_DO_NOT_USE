package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.payments.ui.widget.PaymentInteropShimmerRow;

/* renamed from: X.5eA  reason: invalid class name and case insensitive filesystem */
public abstract class C110465eA extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C110465eA(Context context) {
        super(context);
        A00();
    }

    public C110465eA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public C110465eA(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            PaymentInteropShimmerRow paymentInteropShimmerRow = (PaymentInteropShimmerRow) this;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            paymentInteropShimmerRow.A03 = C110115dX.A0Q(r1);
            paymentInteropShimmerRow.A04 = (AnonymousClass1MB) r1.AHQ.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
