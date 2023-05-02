package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass04o;
import X.AnonymousClass109;
import X.AnonymousClass173;
import X.AnonymousClass174;
import X.AnonymousClass175;
import X.AnonymousClass1Vo;
import X.AnonymousClass2HJ;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.AnonymousClass64V;
import X.AnonymousClass64W;
import X.C001500q;
import X.C006602z;
import X.C110105dW;
import X.C110115dX;
import X.C110585eT;
import X.C110785ep;
import X.C111345g2;
import X.C111805hR;
import X.C112325iJ;
import X.C112935km;
import X.C116815rz;
import X.C117605tG;
import X.C117765tW;
import X.C118375ua;
import X.C118805vH;
import X.C119365wy;
import X.C1200960h;
import X.C14530pL;
import X.C14550pN;
import X.C14710pd;
import X.C14870pt;
import X.C16040sK;
import X.C16150sX;
import X.C17190ug;
import X.C18260wP;
import X.C18280wR;
import X.C18290wS;
import X.C18310wU;
import X.C18340wX;
import X.C32241fu;
import X.C35521m4;
import X.C49132Rg;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.obwhatsapp.R;
import java.util.List;

public class IndiaUpiStepUpActivity extends C112935km {
    public C35521m4 A00;
    public AnonymousClass109 A01;
    public C112325iJ A02;
    public C117765tW A03;
    public C110585eT A04;
    public String A05;
    public boolean A06;
    public final AnonymousClass1Vo A07;
    public final List A08;

    public IndiaUpiStepUpActivity() {
        this(0);
        this.A07 = C110105dW.A0P("IndiaUpiStepUpActivity");
        this.A08 = AnonymousClass000.A0u();
    }

    public IndiaUpiStepUpActivity(int i2) {
        this.A06 = false;
        C110105dW.A0t(this, 79);
    }

    public void A1q() {
        if (!this.A06) {
            this.A06 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            C111345g2.A1n(A0C, r1, this);
            this.A03 = (C117765tW) r1.ACL.get();
            this.A01 = (AnonymousClass109) r1.AH7.get();
        }
    }

    public void ASh(AnonymousClass2HJ r6, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A07.A06("onListKeys called");
            C110585eT r4 = this.A04;
            C35521m4 r3 = r4.A05;
            C117605tG r1 = new C117605tG(0);
            r1.A05 = str;
            r1.A04 = r3.A0B;
            r1.A01 = (C111805hR) r3.A08;
            r1.A06 = (String) C110105dW.A0d(r3.A09);
            r4.A01.A0B(r1);
        } else if (r6 != null && !C1200960h.A02(this, "upi-list-keys", r6.A00, false)) {
            if (this.A06.A07("upi-list-keys")) {
                this.A0C.A0E();
                Ac1();
                Afq(R.string.str1102);
                this.A02.A00();
                return;
            }
            AnonymousClass1Vo r2 = this.A07;
            StringBuilder A0r = AnonymousClass000.A0r("onListKeys: ");
            A0r.append(str != null ? Integer.valueOf(str.length()) : null);
            r2.A06(AnonymousClass000.A0h(" failed; ; showErrorAndFinish", A0r));
            A3b();
        }
    }

    public void AX5(AnonymousClass2HJ r3) {
        throw new UnsupportedOperationException(this.A07.A02("onSetPin unsupported"));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1014) {
            if (i3 == -1) {
                this.A0D.A08();
                this.A0D.A05(this.A08);
                this.A01.A01((String) null);
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("extra_bank_account");
        AnonymousClass00B.A07(parcelableExtra, "Bank account must be passed with intent extras");
        this.A00 = (C35521m4) parcelableExtra;
        List list = this.A08;
        String stringExtra = getIntent().getStringExtra("extra_step_up_id");
        AnonymousClass00B.A07(stringExtra, "Step up id must be passed as intent extra");
        list.add(stringExtra);
        C14710pd r12 = this.A0C;
        C14870pt r17 = this.A05;
        C16040sK r13 = this.A01;
        C17190ug r11 = this.A0H;
        C18280wR r10 = this.A0C;
        C18290wS r9 = this.A0P;
        AnonymousClass175 r8 = this.A0I;
        C119365wy r7 = this.A0B;
        C18310wU r27 = this.A0M;
        C118805vH r14 = this.A08;
        AnonymousClass173 r6 = this.A02;
        AnonymousClass174 r5 = this.A0N;
        AnonymousClass61W r3 = this.A0E;
        C18260wP r19 = this.A07;
        C18340wX r2 = this.A0K;
        AnonymousClass60V r1 = this.A0C;
        C119365wy r23 = r7;
        AnonymousClass60V r24 = r1;
        AnonymousClass175 r25 = r8;
        C18340wX r26 = r2;
        AnonymousClass173 r20 = r6;
        C14710pd r21 = r12;
        C17190ug r22 = r11;
        C16040sK r18 = r13;
        this.A02 = new C112325iJ(this, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r5, r9, r14, this, r3, this.A0F, r10);
        C118375ua r32 = new C118375ua(this, r17, r19, r2, r27);
        String A3F = A3F(r1.A07());
        this.A05 = A3F;
        C117765tW r15 = this.A03;
        C18280wR r0 = this.A0C;
        C110585eT r33 = (C110585eT) new C006602z((AnonymousClass04o) new C110785ep(this.A00, this.A0D, this.A02, r32, this, r15, r0, A3F), (C001500q) this).A01(C110585eT.class);
        this.A04 = r33;
        r33.A00.A0A(r33.A03, C110115dX.A07(this, 50));
        C110585eT r34 = this.A04;
        r34.A01.A0A(r34.A03, C110115dX.A07(this, 49));
        C110585eT r28 = this.A04;
        C116815rz.A01(r28.A00, r28.A04);
        r28.A07.A00();
    }

    public Dialog onCreateDialog(int i2) {
        int i3 = i2;
        if (i2 != 28) {
            if (i2 != 32) {
                switch (i2) {
                    case 10:
                        return A3U(new AnonymousClass64W(this), getString(R.string.str18bf), getString(R.string.str18be), i3, R.string.str1161, R.string.str0394);
                    case 11:
                        break;
                    case 12:
                        return A3T(new AnonymousClass64V(this), getString(R.string.str106e), 12, R.string.str1cf6, R.string.str0e87);
                    default:
                        return super.onCreateDialog(i2);
                }
            } else {
                C32241fu A002 = C32241fu.A00(this);
                A002.A01(R.string.str0fdd);
                C110105dW.A0w(A002, this, 71, R.string.str0e87);
                return A002.create();
            }
        }
        return A3S(this.A00, i2);
    }
}
