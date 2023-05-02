package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass1Vo;
import X.AnonymousClass29T;
import X.AnonymousClass60N;
import X.AnonymousClass60O;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C13680ns;
import X.C13690nt;
import X.C14550pN;
import X.C16150sX;
import X.C17160ud;
import X.C18310wU;
import X.C227919h;
import X.C32241fu;
import X.C35301lh;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.CopyableTextView;
import com.obwhatsapp.R;

public class IndiaUpiVpaContactInfoActivity extends C14550pN implements View.OnClickListener {
    public View A00;
    public LinearLayout A01;
    public C17160ud A02;
    public C35301lh A03;
    public C35301lh A04;
    public AnonymousClass60O A05;
    public C227919h A06;
    public C18310wU A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public final AnonymousClass1Vo A0C;

    public IndiaUpiVpaContactInfoActivity() {
        this(0);
        this.A0C = C110105dW.A0P("IndiaUpiVpaContactInfoActivity");
    }

    public IndiaUpiVpaContactInfoActivity(int i2) {
        this.A0A = false;
        C110105dW.A0t(this, 80);
    }

    public void A1q() {
        if (!this.A0A) {
            this.A0A = true;
            C16150sX r1 = C110105dW.A0C(this).A1s;
            C14550pN.A15(r1, this);
            this.A0A = C110105dW.A0F(r1);
            this.A02 = (C17160ud) r1.A4t.get();
            this.A07 = C110115dX.A0P(r1);
            this.A06 = (C227919h) r1.AH8.get();
            this.A05 = (AnonymousClass60O) r1.AC8.get();
        }
    }

    public final Intent A2m() {
        Intent A022 = this.A06.A02(this, false, true);
        C110115dX.A0r(A022, this.A08);
        A022.putExtra("extra_payment_handle", this.A03);
        A022.putExtra("extra_payment_handle_id", this.A09);
        A022.putExtra("extra_payee_name", this.A04);
        return A022;
    }

    public final void A2n(boolean z2) {
        int i2;
        this.A0B = z2;
        ImageView A042 = C110115dX.A04(this, R.id.block_vpa_icon);
        TextView A0N = C13680ns.A0N(this, R.id.block_vpa_text);
        View view = this.A00;
        int i3 = 8;
        int i4 = 0;
        if (z2) {
            i4 = 8;
        }
        view.setVisibility(i4);
        LinearLayout linearLayout = this.A01;
        if (!z2) {
            i3 = 0;
        }
        linearLayout.setVisibility(i3);
        if (z2) {
            A042.setColorFilter(AnonymousClass00T.A00(this, R.color.color01bd));
            C13680ns.A0v(this, A0N, R.color.color01bd);
            i2 = R.string.str1872;
        } else {
            A042.setColorFilter(AnonymousClass00T.A00(this, R.color.color0697));
            C13680ns.A0v(this, A0N, R.color.color0697);
            i2 = R.string.str0226;
        }
        A0N.setText(i2);
    }

    public void onClick(View view) {
        Intent A2m;
        String str;
        int i2;
        if (view.getId() == R.id.send_payment_container) {
            AnonymousClass1Vo r2 = this.A0C;
            StringBuilder A0r = AnonymousClass000.A0r("send payment to vpa: ");
            A0r.append(this.A03);
            C110105dW.A1L(r2, A0r);
            A2m = A2m();
            str = "extra_transfer_direction";
            i2 = 0;
        } else if (view.getId() == R.id.request_payment_container) {
            AnonymousClass1Vo r22 = this.A0C;
            StringBuilder A0r2 = AnonymousClass000.A0r("request payment from vpa: ");
            A0r2.append(this.A03);
            C110105dW.A1L(r22, A0r2);
            A2m = A2m();
            str = "extra_transfer_direction";
            i2 = 1;
        } else if (view.getId() == R.id.block_vpa_btn) {
            boolean z2 = this.A0B;
            AnonymousClass1Vo r23 = this.A0C;
            if (z2) {
                StringBuilder A0r3 = AnonymousClass000.A0r("unblock vpa: ");
                A0r3.append(this.A03);
                C110105dW.A1L(r23, A0r3);
                this.A05.Ahg(this, new AnonymousClass60N(this, false), this.A07, (String) C110105dW.A0d(this.A03), false);
                return;
            }
            StringBuilder A0r4 = AnonymousClass000.A0r("block vpa: ");
            A0r4.append(this.A03);
            C110105dW.A1L(r23, A0r4);
            AnonymousClass29T.A01(this, 1);
            return;
        } else {
            return;
        }
        A2m.putExtra(str, i2);
        startActivity(A2m);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0350);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            x2.A0B(R.string.str18ce);
        }
        this.A03 = (C35301lh) getIntent().getParcelableExtra("extra_payment_handle");
        this.A09 = getIntent().getStringExtra("extra_payment_handle_id");
        this.A04 = (C35301lh) getIntent().getParcelableExtra("extra_payee_name");
        this.A08 = C110115dX.A0b(this);
        this.A00 = findViewById(R.id.payment_separator);
        findViewById(R.id.send_payment_container).setOnClickListener(this);
        findViewById(R.id.request_payment_container).setOnClickListener(this);
        this.A01 = (LinearLayout) findViewById(R.id.send_and_request_payment_container);
        CopyableTextView copyableTextView = (CopyableTextView) findViewById(R.id.account_id_handle);
        copyableTextView.setText(C13680ns.A0d(this, C110105dW.A0d(this.A03), new Object[1], 0, R.string.str1b1e));
        copyableTextView.A02 = (String) C110105dW.A0d(this.A03);
        C13680ns.A0N(this, R.id.vpa_name).setText((CharSequence) C110105dW.A0d(this.A04));
        this.A02.A05(C110115dX.A04(this, R.id.avatar), R.drawable.avatar_contact);
        View findViewById = findViewById(R.id.block_vpa_btn);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(this);
        A2n(this.A05.AId(this.A03));
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 1) {
            return super.onCreateDialog(i2);
        }
        C32241fu A002 = C32241fu.A00(this);
        A002.A06(C13680ns.A0d(this, C110105dW.A0d(this.A04), new Object[1], 0, R.string.str023b));
        C110105dW.A0w(A002, this, 72, R.string.str0226);
        C13690nt.A1E(A002);
        return A002.create();
    }
}
