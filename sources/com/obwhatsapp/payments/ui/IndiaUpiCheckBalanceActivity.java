package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass04o;
import X.AnonymousClass173;
import X.AnonymousClass174;
import X.AnonymousClass175;
import X.AnonymousClass1Vo;
import X.AnonymousClass29T;
import X.AnonymousClass2HJ;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.AnonymousClass648;
import X.AnonymousClass649;
import X.C001500q;
import X.C006602z;
import X.C110105dW;
import X.C110115dX;
import X.C110575eS;
import X.C110775eo;
import X.C111345g2;
import X.C111805hR;
import X.C112315iI;
import X.C112325iJ;
import X.C112935km;
import X.C117295sl;
import X.C117765tW;
import X.C118805vH;
import X.C119365wy;
import X.C1200960h;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14710pd;
import X.C16040sK;
import X.C16150sX;
import X.C17190ug;
import X.C18260wP;
import X.C18280wR;
import X.C18290wS;
import X.C18310wU;
import X.C18340wX;
import X.C32241fu;
import X.C35301lh;
import X.C35521m4;
import X.C49132Rg;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.obwhatsapp.R;

public class IndiaUpiCheckBalanceActivity extends C112935km {
    public C35521m4 A00;
    public C35301lh A01;
    public C110575eS A02;
    public C117765tW A03;
    public boolean A04;
    public final AnonymousClass1Vo A05;

    public IndiaUpiCheckBalanceActivity() {
        this(0);
        this.A05 = C110105dW.A0P("IndiaUpiCheckPinActivity");
    }

    public IndiaUpiCheckBalanceActivity(int i2) {
        this.A04 = false;
        C110105dW.A0t(this, 46);
    }

    public static /* synthetic */ void A02(IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity, C117295sl r6) {
        if (r6.A03 != 0) {
            AnonymousClass2HJ r2 = r6.A00;
            Bundle A0D = C13690nt.A0D();
            A0D.putInt("error_code", r2.A00);
            int i2 = r2.A00;
            int i3 = 10;
            if (i2 != 11459) {
                i3 = 11;
                if (i2 != 11468) {
                    i3 = 12;
                    if (i2 != 11454) {
                        if (i2 == 11487 || i2 == 20697 || i2 == 20682) {
                            i3 = 27;
                        } else {
                            indiaUpiCheckBalanceActivity.A05.A06(" onCheckBalance failed; showErrorAndFinish");
                            indiaUpiCheckBalanceActivity.A3b();
                            return;
                        }
                    }
                }
            }
            AnonymousClass29T.A02(indiaUpiCheckBalanceActivity, A0D, i3);
            return;
        }
        C35521m4 r4 = indiaUpiCheckBalanceActivity.A00;
        String str = r6.A01;
        String str2 = r6.A02;
        Intent A042 = C110105dW.A04(indiaUpiCheckBalanceActivity, IndiaUpiBalanceDetailsActivity.class);
        A042.putExtra("payment_bank_account", r4);
        A042.putExtra("balance", str);
        A042.putExtra("usable_balance", str2);
        indiaUpiCheckBalanceActivity.finish();
        indiaUpiCheckBalanceActivity.A2V(A042);
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
            this.A03 = (C117765tW) r1.ACL.get();
        }
    }

    public final void A3j(String str) {
        C35521m4 r1 = this.A00;
        A3g((C111805hR) r1.A08, str, r1.A0B, (String) this.A01.A00, (String) C110105dW.A0d(r1.A09), 3);
    }

    public void ASh(AnonymousClass2HJ r4, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A05.A06("onListKeys called");
            A3j(str);
        } else if (r4 != null && !C1200960h.A02(this, "upi-list-keys", r4.A00, false)) {
            if (this.A06.A07("upi-list-keys")) {
                C111345g2.A1y(this);
                return;
            }
            AnonymousClass1Vo r2 = this.A05;
            StringBuilder A0r = AnonymousClass000.A0r("onListKeys: ");
            A0r.append(str != null ? Integer.valueOf(str.length()) : null);
            r2.A06(AnonymousClass000.A0h(" failed; ; showErrorAndFinish", A0r));
            A3b();
        }
    }

    public void AX5(AnonymousClass2HJ r3) {
        throw new UnsupportedOperationException(this.A05.A02("onSetPin unsupported"));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = (C35521m4) getIntent().getParcelableExtra("extra_bank_account");
        C14710pd r21 = this.A0C;
        C17190ug r15 = this.A0H;
        C18280wR r14 = this.A0C;
        C18290wS r13 = this.A0P;
        AnonymousClass175 r12 = this.A0I;
        C119365wy r11 = this.A0B;
        C18310wU r10 = this.A0M;
        C118805vH r9 = this.A08;
        AnonymousClass173 r8 = this.A02;
        AnonymousClass174 r7 = this.A0N;
        AnonymousClass61W r6 = this.A0E;
        C18260wP r4 = this.A07;
        C18340wX r2 = this.A0K;
        AnonymousClass60V r5 = this.A0C;
        C119365wy r23 = r11;
        AnonymousClass60V r24 = r5;
        AnonymousClass175 r25 = r12;
        C18340wX r26 = r2;
        C18260wP r19 = r4;
        AnonymousClass173 r20 = r8;
        C17190ug r22 = r15;
        this.A0A = new C112325iJ(this, this.A05, this.A01, r19, r20, r21, r22, r23, r24, r25, r26, r10, r7, r13, r9, this, r6, this.A0F, r14);
        this.A01 = C110105dW.A0J(C110105dW.A0L(), String.class, A3F(r5.A07()), "upiSequenceNumber");
        C14710pd r212 = this.A0C;
        C16040sK r152 = this.A01;
        C17190ug r142 = this.A0H;
        C18290wS r132 = this.A0P;
        C18280wR r122 = this.A0C;
        C119365wy r112 = this.A0B;
        AnonymousClass175 r102 = this.A0I;
        C18310wU r92 = this.A0M;
        C118805vH r82 = this.A08;
        AnonymousClass173 r72 = this.A02;
        AnonymousClass61W r62 = this.A0E;
        C18260wP r42 = this.A07;
        C18340wX r27 = this.A0K;
        C112315iI r153 = new C112315iI(this, this.A05, r152, r42, r72, r212, r142, r112, this.A0C, r102, r27, r92, r132, r82, r62, this.A0F, r122);
        C117765tW r43 = this.A03;
        C110575eS r28 = (C110575eS) new C006602z((AnonymousClass04o) new C110775eo(this.A00, this.A01, r153, r43), (C001500q) this).A01(C110575eS.class);
        this.A02 = r28;
        r28.A01.A0A(this, C110115dX.A07(this, 21));
        C110575eS r29 = this.A02;
        r29.A07.A0A(this, C110115dX.A07(this, 20));
        A2h(getString(R.string.str13db));
        this.A0A.A00();
    }

    public Dialog onCreateDialog(int i2) {
        int i3 = i2;
        if (i2 != 27) {
            if (i2 != 28) {
                switch (i2) {
                    case 10:
                        return A3U(new AnonymousClass649(this), getString(R.string.str18bf), getString(R.string.str18be), i3, R.string.str1161, R.string.str0394);
                    case 11:
                        break;
                    case 12:
                        return A3U(new AnonymousClass648(this), getString(R.string.str18c1), getString(R.string.str18c0), i3, R.string.str1cf6, R.string.str0e87);
                    default:
                        return super.onCreateDialog(i2);
                }
            }
            return A3S(this.A00, i2);
        }
        C32241fu A002 = C32241fu.A00(this);
        A002.A01(R.string.str044c);
        A002.A02(R.string.str044d);
        C110105dW.A0w(A002, this, 21, R.string.str0e87);
        return A002.create();
    }
}
