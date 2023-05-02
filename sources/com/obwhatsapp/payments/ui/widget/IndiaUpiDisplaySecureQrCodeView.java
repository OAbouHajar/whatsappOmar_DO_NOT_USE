package com.obwhatsapp.payments.ui.widget;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass173;
import X.AnonymousClass174;
import X.AnonymousClass1Vo;
import X.AnonymousClass2JN;
import X.AnonymousClass5zX;
import X.AnonymousClass62Q;
import X.AnonymousClass63M;
import X.C004601z;
import X.C110105dW;
import X.C110115dX;
import X.C110665ec;
import X.C13680ns;
import X.C15900s5;
import X.C15910s6;
import X.C16150sX;
import X.C28401Vy;
import X.C28411Vz;
import X.C51252bG;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape213S0100000_3_I1;
import com.facebook.redex.IDxCListenerShape242S0100000_3_I1;
import com.obwhatsapp.QrImageView;
import com.obwhatsapp.R;
import java.math.BigDecimal;

public class IndiaUpiDisplaySecureQrCodeView extends LinearLayout implements AnonymousClass006 {
    public View A00;
    public FrameLayout A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C51252bG A09;
    public QrImageView A0A;
    public C15900s5 A0B;
    public AnonymousClass013 A0C;
    public AnonymousClass173 A0D;
    public AnonymousClass174 A0E;
    public PaymentAmountInputField A0F;
    public C110665ec A0G;
    public C52662eE A0H;
    public boolean A0I;
    public final AnonymousClass1Vo A0J;

    public IndiaUpiDisplaySecureQrCodeView(Context context) {
        super(context);
        A00();
        this.A0J = C110105dW.A0P("IndiaUpiDisplaySecureQrCodeView");
        A01();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0J = C110105dW.A0P("IndiaUpiDisplaySecureQrCodeView");
        A01();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A0J = C110105dW.A0P("IndiaUpiDisplaySecureQrCodeView");
        A01();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
        this.A0J = C110105dW.A0P("IndiaUpiDisplaySecureQrCodeView");
        A01();
    }

    public IndiaUpiDisplaySecureQrCodeView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A0I) {
            this.A0I = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A0B = (C15900s5) A002.ALm.get();
            this.A0C = C16150sX.A0Z(A002);
            this.A0E = (AnonymousClass174) A002.AI3.get();
            this.A0D = C110115dX.A0D(A002);
        }
    }

    public final void A01() {
        C13680ns.A0G(this).inflate(R.layout.layout0310, this, true);
        setOrientation(1);
        this.A0A = (QrImageView) findViewById(R.id.qr_code);
        this.A05 = C13680ns.A0L(this, R.id.add_amount);
        this.A06 = C13680ns.A0L(this, R.id.display_payment_amount);
        this.A07 = C13680ns.A0L(this, R.id.amount_input_error_text);
        this.A02 = C13680ns.A0J(this, R.id.dashed_underline);
        this.A0F = (PaymentAmountInputField) C004601z.A0E(this, R.id.user_payment_amount);
        C28411Vz A012 = this.A0D.A01("INR");
        PaymentAmountInputField paymentAmountInputField = this.A0F;
        paymentAmountInputField.A0E = A012;
        paymentAmountInputField.A03 = 1;
        C28401Vy A0C2 = C110115dX.A0C(A012, new BigDecimal(this.A0B.A02(C15910s6.A1o)));
        this.A0F.A0G = new AnonymousClass62Q(getContext(), this.A0C, A012, A0C2, A0C2, A0C2);
        this.A03 = C110115dX.A05(this, R.id.add_or_display_amount);
        this.A00 = C004601z.A0E(this, R.id.user_amount_input);
        this.A04 = (LinearLayout) findViewById(R.id.qr_code_signing_secure_title_container);
        this.A08 = C13680ns.A0M(this, R.id.qr_code_signing_retry_text);
        this.A01 = (FrameLayout) findViewById(R.id.progress_container);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0H;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0H = r0;
        }
        return r0.generatedComponent();
    }

    public C51252bG getQrCode() {
        return this.A09;
    }

    public String getUserInputAmount() {
        return C13680ns.A0f(this.A0F);
    }

    public void setup(C110665ec r5) {
        this.A0G = r5;
        C110105dW.A0r(this.A03, r5, 131);
        this.A08.setText(AnonymousClass2JN.A08(new AnonymousClass63M(), getContext().getString(R.string.str195c), "try-again"));
        C110105dW.A0r(this.A08, r5, 130);
        this.A0F.A08 = findViewById(R.id.send_payment_amount_container);
        this.A0F.setOnFocusChangeListener(new IDxCListenerShape242S0100000_3_I1(this, 1));
        this.A0F.setErrorTextView(this.A07);
        this.A0F.setOnEditorActionListener(new IDxAListenerShape213S0100000_3_I1(this, 1));
        this.A0F.A00 = new AnonymousClass5zX(this);
    }
}
