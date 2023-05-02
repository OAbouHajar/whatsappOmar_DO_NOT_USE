package com.obwhatsapp.payments.ui.widget;

import X.AnonymousClass1MB;
import X.AnonymousClass1Vt;
import X.AnonymousClass2SR;
import X.AnonymousClass69G;
import X.C110115dX;
import X.C110465eA;
import X.C13680ns;
import X.C18290wS;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.R;

public class PaymentInteropShimmerRow extends C110465eA implements AnonymousClass69G {
    public View A00;
    public View A01;
    public AnonymousClass1Vt A02;
    public C18290wS A03;
    public AnonymousClass1MB A04;

    public PaymentInteropShimmerRow(Context context) {
        super(context);
        A01();
    }

    public PaymentInteropShimmerRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public PaymentInteropShimmerRow(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
    }

    public final void A01() {
        C13680ns.A0G(this).inflate(R.layout.layout0482, this);
        setOrientation(1);
        this.A00 = findViewById(R.id.payment_shimmer);
        this.A01 = findViewById(R.id.static_shimmer);
        AnonymousClass2SR.A07(getContext(), C13680ns.A0K(this, R.id.transaction_loading_error), R.color.color05fc);
        setOnClickListener(C110115dX.A06(this, 135));
    }

    /* renamed from: A02 */
    public void A5U(AnonymousClass1Vt r5) {
        this.A02 = r5;
        AnonymousClass1MB r2 = this.A04;
        String str = r5.A0K;
        boolean contains = TextUtils.isEmpty(str) ? false : r2.A00.contains(str);
        View view = this.A00;
        if (contains) {
            view.setVisibility(8);
            this.A01.setVisibility(0);
            return;
        }
        view.setVisibility(0);
        this.A01.setVisibility(8);
    }

    public void Abn() {
        AnonymousClass1Vt r0 = this.A02;
        if (r0 != null) {
            A5U(r0);
        }
    }
}
