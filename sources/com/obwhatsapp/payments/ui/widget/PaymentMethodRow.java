package com.obwhatsapp.payments.ui.widget;

import X.AnonymousClass006;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C52662eE;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.obwhatsapp.CopyableTextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import org.apache.commons.io.IOUtils;

public class PaymentMethodRow extends LinearLayout implements AnonymousClass006 {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public ShimmerFrameLayout A06;
    public CopyableTextView A07;
    public WaImageView A08;
    public C52662eE A09;
    public boolean A0A;

    public PaymentMethodRow(Context context) {
        super(context);
        if (!this.A0A) {
            this.A0A = true;
            generatedComponent();
        }
        A00();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        A00();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0A) {
            this.A0A = true;
            generatedComponent();
        }
        A00();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A0A) {
            this.A0A = true;
            generatedComponent();
        }
        A00();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A0A) {
            this.A0A = true;
            generatedComponent();
        }
    }

    public void A00() {
        C13680ns.A0G(this).inflate(R.layout.layout045d, this, true);
        setOrientation(1);
        this.A00 = C004601z.A0E(this, R.id.payment_method_row_container);
        this.A01 = C13680ns.A0J(this, R.id.payment_method_provider_icon);
        this.A05 = C13680ns.A0L(this, R.id.payment_method_bank_name);
        this.A07 = (CopyableTextView) C004601z.A0E(this, R.id.payment_method_account_id);
        this.A04 = C13680ns.A0L(this, R.id.payment_method_provider_name);
        this.A03 = C13680ns.A0L(this, R.id.payment_method_decorate);
        this.A08 = C13690nt.A0R(this, R.id.payment_method_decorate_icon);
        this.A02 = C13680ns.A0L(this, R.id.payment_branding);
        this.A06 = (ShimmerFrameLayout) C004601z.A0E(this, R.id.payment_method_name_shimmer);
        this.A07.setVisibility(8);
        this.A04.setVisibility(8);
        this.A03.setVisibility(8);
        this.A08.setVisibility(8);
        this.A02.setVisibility(8);
        this.A06.A00();
    }

    public void A01(String str) {
        int i2 = 0;
        if (TextUtils.isEmpty(str) || !str.contains(IOUtils.LINE_SEPARATOR_UNIX)) {
            this.A04.setSingleLine(true);
            this.A04.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            this.A04.setSingleLine(false);
        }
        this.A04.setText(str);
        TextView textView = this.A04;
        if (TextUtils.isEmpty(str)) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public void A02(boolean z2) {
        TextView textView = this.A05;
        Context context = getContext();
        if (!z2) {
            C13680ns.A0v(context, textView, R.color.color0616);
            this.A00.setBackground((Drawable) null);
            return;
        }
        C13680ns.A0v(context, textView, R.color.color0507);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A09;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public int getLayoutRes() {
        return R.layout.layout045d;
    }

    public ImageView getMethodIconView() {
        return this.A01;
    }
}
