package com.obwhatsapp.payments.ui.widget;

import X.AnonymousClass006;
import X.AnonymousClass2SE;
import X.C110395e3;
import X.C117105sS;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;

public class TransactionsExpandableView extends C110395e3 implements AnonymousClass006 {
    public C117105sS A00;
    public C52662eE A01;
    public boolean A02;

    public TransactionsExpandableView(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A00 = new C117105sS(context);
    }

    public TransactionsExpandableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        this.A00 = new C117105sS(context);
    }

    public TransactionsExpandableView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A00 = new C117105sS(context);
    }

    public TransactionsExpandableView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAdapter(C117105sS r1) {
        this.A00 = r1;
    }

    public void setPaymentRequestActionCallback(AnonymousClass2SE r2) {
        this.A00.A02 = r2;
    }
}
