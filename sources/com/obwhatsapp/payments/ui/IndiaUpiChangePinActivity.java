package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass1Vo;
import X.AnonymousClass29T;
import X.AnonymousClass2HJ;
import X.AnonymousClass644;
import X.AnonymousClass645;
import X.AnonymousClass646;
import X.AnonymousClass647;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C111805hR;
import X.C112935km;
import X.C114295nX;
import X.C119405xi;
import X.C1200960h;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C35521m4;
import X.C39841t9;
import X.C39901tF;
import X.C49132Rg;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.obwhatsapp.R;

public class IndiaUpiChangePinActivity extends C112935km {
    public ProgressBar A00;
    public TextView A01;
    public C35521m4 A02;
    public String A03;
    public boolean A04;
    public final AnonymousClass1Vo A05;

    public IndiaUpiChangePinActivity() {
        this(0);
        this.A05 = C110105dW.A0P("IndiaUpiChangePinActivity");
    }

    public IndiaUpiChangePinActivity(int i2) {
        this.A04 = false;
        C110105dW.A0t(this, 45);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            C111345g2.A1n(A0C, r1, this);
        }
    }

    public void A3c() {
        if (!this.A06.A07.contains("pin-entry-ui")) {
            if (!(getIntent() == null || C13690nt.A0E(this) == null)) {
                this.A02 = (C35521m4) C13690nt.A0E(this).get("extra_bank_account");
            }
            if (this.A02 == null) {
                C13680ns.A1U(new C114295nX(this), this.A05);
                return;
            }
            this.A06.A02("pin-entry-ui");
            if (this.A02 != null) {
                this.A0A.A00();
                return;
            }
            this.A05.A06("could not find bank account; showErrorAndFinish");
            A3b();
        }
    }

    public void ASh(AnonymousClass2HJ r12, String str) {
        C35521m4 r0;
        this.A0E.A05(this.A02, r12, 1);
        String str2 = str;
        if (!TextUtils.isEmpty(str) && (r0 = this.A02) != null && r0.A08 != null) {
            this.A03 = C111345g2.A1b(this);
            this.A06.A03("upi-get-credential");
            C35521m4 r02 = this.A02;
            A3g((C111805hR) r02.A08, str2, r02.A0B, this.A03, (String) C39841t9.A02(r02.A09), 2);
        } else if (r12 != null && !C1200960h.A02(this, "upi-list-keys", r12.A00, true)) {
            if (this.A06.A07("upi-list-keys")) {
                this.A0C.A0E();
                this.A05.A09(R.string.str1102, 1);
                this.A0A.A00();
                return;
            }
            AnonymousClass1Vo r3 = this.A05;
            StringBuilder A0r = AnonymousClass000.A0r("IndiaUpiChangePinActivity: onListKeys: ");
            A0r.append(str != null ? Integer.valueOf(str.length()) : null);
            A0r.append(" bankAccount: ");
            A0r.append(this.A02);
            A0r.append(" countrydata: ");
            C35521m4 r03 = this.A02;
            A0r.append(r03 != null ? r03.A08 : null);
            r3.A08("payment-settings", AnonymousClass000.A0h(" failed; ; showErrorAndFinish", A0r), (Throwable) null);
            A3b();
        }
    }

    public void AX5(AnonymousClass2HJ r5) {
        this.A0E.A05(this.A02, r5, 7);
        if (r5 == null) {
            this.A05.A06("onSetPin success; showSuccessAndFinish");
            A3I();
            Object[] A1b = C13680ns.A1b();
            A1b[0] = C119405xi.A06(this.A02);
            Afj(A1b, 0, R.string.str1008);
        } else if (!C1200960h.A02(this, "upi-change-mpin", r5.A00, true)) {
            int i2 = r5.A00;
            int i3 = 10;
            if (i2 != 11459) {
                i3 = 11;
                if (i2 != 11468) {
                    i3 = 12;
                    if (i2 != 11454) {
                        if (i2 == 11456 || i2 == 11471) {
                            i3 = 13;
                        } else {
                            this.A05.A06(" onSetPin failed; showErrorAndFinish");
                            A3b();
                            return;
                        }
                    }
                }
            }
            AnonymousClass29T.A01(this, i3);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout033f);
        C005402i x2 = x();
        if (x2 != null) {
            C110115dX.A0u(x2, this.A01.A00.getResources().getString(R.string.str1009));
        }
        this.A01 = C13680ns.A0N(this, R.id.payments_upi_pin_setup_desc);
        this.A00 = (ProgressBar) findViewById(R.id.progress);
    }

    public Dialog onCreateDialog(int i2) {
        this.A01.setVisibility(4);
        this.A00.setVisibility(4);
        int i3 = i2;
        switch (i2) {
            case 10:
                return A3T(new AnonymousClass647(this), getString(R.string.str1007), i3, R.string.str1ba6, R.string.str0de3);
            case 11:
                return A3T(new AnonymousClass645(this), getString(R.string.str107f), i3, R.string.str1ba6, R.string.str0de3);
            case 12:
                return A3T(new AnonymousClass646(this), getString(R.string.str1080), i3, R.string.str1ba6, R.string.str0de3);
            case 13:
                this.A0C.A0F();
                return A3T(new AnonymousClass644(this), getString(R.string.str10de), i3, R.string.str1ba6, R.string.str0de3);
            default:
                return super.onCreateDialog(i2);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C35521m4 r0 = (C35521m4) bundle.getParcelable("bankAccountSavedInst");
        this.A02 = r0;
        if (r0 != null) {
            this.A02.A08 = (C39901tF) bundle.getParcelable("countryDataSavedInst");
        }
        this.A03 = bundle.getString("seqNumSavedInst");
    }

    public void onResume() {
        super.onResume();
        AnonymousClass1Vo r2 = this.A05;
        StringBuilder A0r = AnonymousClass000.A0r("onResume with states: ");
        A0r.append(this.A06);
        C110105dW.A1L(r2, A0r);
        if (!this.A06.A07.contains("upi-get-challenge") && this.A0C.A06().A00 == null) {
            this.A06.A03("upi-get-challenge");
            A3Y();
        } else if (!this.A06.A07.contains("upi-get-challenge")) {
            A3c();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C39901tF r1;
        super.onSaveInstanceState(bundle);
        C35521m4 r12 = this.A02;
        if (r12 != null) {
            bundle.putParcelable("bankAccountSavedInst", r12);
        }
        C35521m4 r0 = this.A02;
        if (!(r0 == null || (r1 = r0.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        String str = this.A03;
        if (str != null) {
            bundle.putString("seqNumSavedInst", str);
        }
    }
}
