package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass04o;
import X.AnonymousClass174;
import X.AnonymousClass175;
import X.AnonymousClass1Vo;
import X.AnonymousClass5xN;
import X.AnonymousClass5xQ;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.C001000l;
import X.C001500q;
import X.C006602z;
import X.C018208n;
import X.C110105dW;
import X.C110635eZ;
import X.C119395xh;
import X.C1201560n;
import X.C1220167y;
import X.C1222168s;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C15900s5;
import X.C16440t3;
import X.C16980tz;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxIFactoryShape0S2100000_3_I1;
import com.obwhatsapp.R;

public class IndiaUpiQrCodeScannedDialogFragment extends Hilt_IndiaUpiQrCodeScannedDialogFragment {
    public View A00;
    public View A01;
    public Button A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public ProgressBar A06;
    public ProgressBar A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public C15900s5 A0B;
    public C16440t3 A0C;
    public C16980tz A0D;
    public AnonymousClass013 A0E;
    public C14710pd A0F;
    public C1201560n A0G;
    public AnonymousClass60V A0H;
    public AnonymousClass175 A0I;
    public AnonymousClass174 A0J;
    public AnonymousClass61W A0K;
    public AnonymousClass5xN A0L;
    public C110635eZ A0M;
    public String A0N;
    public final AnonymousClass1Vo A0O = C110105dW.A0P("IndiaUpiQrCodeScannedDialogFragment");

    public static IndiaUpiQrCodeScannedDialogFragment A01(String str, String str2, String str3) {
        IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = new IndiaUpiQrCodeScannedDialogFragment();
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putString("ARG_URL", str);
        A0D2.putString("external_payment_source", str2);
        A0D2.putString("referral_screen", str3);
        indiaUpiQrCodeScannedDialogFragment.A0T(A0D2);
        return indiaUpiQrCodeScannedDialogFragment;
    }

    public void A0n(Bundle bundle) {
        this.A0V = true;
        Bundle A042 = A04();
        this.A0M = (C110635eZ) new C006602z((AnonymousClass04o) new IDxIFactoryShape0S2100000_3_I1(this, A042.getString("ARG_URL"), A042.getString("external_payment_source"), 0), (C001500q) this).A01(C110635eZ.class);
        AnonymousClass60V r3 = this.A0H;
        this.A0G = new C1201560n(this.A0B, this.A0F, r3, this.A0K, this.A0L);
        C110105dW.A0r(this.A02, this, 78);
    }

    public void A0x(int i2, int i3, Intent intent) {
        super.A0x(i2, i3, intent);
        if (i2 == 1001) {
            if (this.A0I.A0D() || this.A0I.A0E()) {
                if (!this.A0F.A0C(1933) || !AnonymousClass5xQ.A04(this.A0N)) {
                    Bundle A042 = A04();
                    this.A0M.A05(A042.getString("ARG_URL"), A042.getString("external_payment_source"));
                    return;
                }
                A1A();
                return;
            }
        } else if (i2 == 1002) {
            C001000l A0C2 = A0C();
            if (A0C2 instanceof C1220167y) {
                ((Activity) ((C1220167y) A0C2)).setResult(i3, intent);
            }
        } else {
            return;
        }
        AnonymousClass01A r1 = this.A0D;
        if (r1 instanceof DialogFragment) {
            ((DialogFragment) r1).A1C();
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0O.A06("scanned payment QR code deep link");
        View inflate = A0D().getLayoutInflater().inflate(R.layout.layout0347, (ViewGroup) null);
        this.A01 = inflate;
        this.A07 = (ProgressBar) inflate.findViewById(R.id.progress);
        this.A03 = (LinearLayout) this.A01.findViewById(R.id.details_row);
        this.A09 = C13680ns.A0M(this.A01, R.id.contact_info_title);
        this.A08 = C13680ns.A0M(this.A01, R.id.contact_info_subtitle);
        this.A0A = C13680ns.A0M(this.A01, R.id.error_desc);
        this.A02 = (Button) this.A01.findViewById(R.id.positive_button);
        this.A04 = (LinearLayout) this.A01.findViewById(R.id.prefill_amount);
        this.A05 = (LinearLayout) this.A01.findViewById(R.id.qr_code_secure_info_container);
        this.A00 = this.A01.findViewById(R.id.qr_code_secure_info_container_divider);
        for (Drawable drawable : C13680ns.A0M(this.A01, R.id.warning_text).getCompoundDrawables()) {
            if (drawable != null) {
                C018208n.A0A(drawable, A03().getColor(R.color.color06c5));
            }
        }
        ProgressBar progressBar = (ProgressBar) this.A01.findViewById(R.id.button_progress_bar);
        this.A06 = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(AnonymousClass00T.A00(A0u(), R.color.color065f), PorterDuff.Mode.SRC_IN);
        String string = A04().getString("referral_screen");
        this.A0N = string;
        this.A0K.AKS(0, (Integer) null, "qr_code_scan_prompt", string);
        return this.A01;
    }

    public final void A1A() {
        Object A012 = this.A0M.A06.A01();
        AnonymousClass00B.A06(A012);
        C119395xh r0 = (C119395xh) A012;
        C1201560n r1 = this.A0G;
        C001000l A0D2 = A0D();
        String str = r0.A08;
        AnonymousClass00B.A06(str);
        r1.A00(A0D2, (C1222168s) null, str, r0.A02, this.A0N);
        AnonymousClass01A r12 = this.A0D;
        if (r12 instanceof DialogFragment) {
            ((DialogFragment) r12).A1C();
        }
    }
}
