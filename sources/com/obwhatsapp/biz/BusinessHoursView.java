package com.obwhatsapp.biz;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass1KR;
import X.C13680ns;
import X.C13700nu;
import X.C16150sX;
import X.C16440t3;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.obwhatsapp.R;

public class BusinessHoursView extends LinearLayout implements AnonymousClass006 {
    public ImageView A00;
    public BusinessHoursContentView A01;
    public AnonymousClass1KR A02;
    public C16440t3 A03;
    public AnonymousClass013 A04;
    public C52662eE A05;
    public boolean A06;
    public boolean A07;

    public BusinessHoursView(Context context) {
        super(context);
        A00();
        this.A06 = false;
        A01();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A06 = false;
        A01();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A06 = false;
        A01();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
        this.A06 = false;
        A01();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A03 = C16150sX.A0U(A002);
            this.A04 = C16150sX.A0Z(A002);
            this.A02 = (AnonymousClass1KR) A002.A31.get();
        }
    }

    public final void A01() {
        View inflate = C13680ns.A0G(this).inflate(R.layout.layout00b4, this, true);
        setFocusable(true);
        this.A01 = (BusinessHoursContentView) inflate.findViewById(R.id.business_hours_content_view);
        this.A00 = C13680ns.A0K(inflate, R.id.business_hours_chevron_icon);
    }

    public final void A02() {
        this.A01.setFullView(this.A06);
        ImageView imageView = this.A00;
        Context context = getContext();
        boolean z2 = this.A06;
        int i2 = R.drawable.ic_chevron_down;
        if (z2) {
            i2 = R.drawable.ic_chevron_up;
        }
        C13700nu.A0L(context, imageView, i2);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A05;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }
}
