package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass027;
import X.AnonymousClass173;
import X.AnonymousClass5x5;
import X.AnonymousClass60O;
import X.AnonymousClass60Y;
import X.C003401n;
import X.C014206u;
import X.C110105dW;
import X.C110115dX;
import X.C110635eZ;
import X.C110705eh;
import X.C112285iF;
import X.C116345rE;
import X.C117425sy;
import X.C117675tN;
import X.C119365wy;
import X.C119395xh;
import X.C14710pd;
import X.C14870pt;
import X.C17190ug;
import X.C18280wR;
import X.C18310wU;
import X.C18340wX;
import X.C30801cy;
import X.C35301lh;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.obwhatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.obwhatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;

public class IDxIFactoryShape0S2100000_3_I1 extends C014206u {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public IDxIFactoryShape0S2100000_3_I1(Object obj, String str, String str2, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = str2;
    }

    public C003401n A6s(Class cls) {
        C119395xh r0;
        Class cls2 = cls;
        if (this.A03 != 0) {
            if (cls2.isAssignableFrom(C110705eh.class)) {
                IndiaUpiQrCodeUrlValidationActivity indiaUpiQrCodeUrlValidationActivity = (IndiaUpiQrCodeUrlValidationActivity) this.A00;
                C14710pd r7 = indiaUpiQrCodeUrlValidationActivity.A0C;
                C110705eh r12 = new C110705eh(indiaUpiQrCodeUrlValidationActivity.A06, indiaUpiQrCodeUrlValidationActivity.A00, r7, indiaUpiQrCodeUrlValidationActivity.A02, indiaUpiQrCodeUrlValidationActivity.A04, indiaUpiQrCodeUrlValidationActivity.A05);
                IDxObserverShape118S0100000_3_I1 A07 = C110115dX.A07(this, 45);
                C30801cy r1 = r12.A01;
                r1.A0A(indiaUpiQrCodeUrlValidationActivity, A07);
                String str = this.A02;
                String str2 = this.A01;
                if (TextUtils.isEmpty(str)) {
                    C117425sy.A00(r1, 0);
                    return r12;
                }
                r12.A02 = str2;
                AnonymousClass027 r13 = r12.A00;
                if (str == null || (r0 = C119395xh.A00(Uri.parse(str), str2)) == null) {
                    r0 = null;
                } else {
                    r0.A08 = str;
                }
                r13.A0B(r0);
                AnonymousClass5x5 r132 = r12.A09;
                C35301lh A0J = C110105dW.A0J(C110105dW.A0L(), String.class, r12.A05().A0O, "upiHandle");
                C116345rE r9 = new C116345rE(r12);
                C117675tN r14 = r132.A01;
                Context context = r14.A01.A00;
                C14870pt r15 = r14.A00;
                C17190ug r142 = r14.A03;
                C18280wR r8 = r14.A09;
                C119365wy r72 = r14.A05;
                C18310wU r6 = r14.A07;
                AnonymousClass173 r5 = r14.A02;
                AnonymousClass60O r4 = r14.A04;
                C18340wX r21 = r14.A06;
                C119365wy r20 = r72;
                AnonymousClass60O r19 = r4;
                C17190ug r18 = r142;
                AnonymousClass173 r17 = r5;
                C14870pt r16 = r15;
                Context context2 = context;
                new C112285iF(context2, r16, r17, r18, r19, r20, r21, r6, r14.A08, r8).A01(A0J, (C35301lh) null, new AnonymousClass60Y(indiaUpiQrCodeUrlValidationActivity, A0J, r132, r9));
                return r12;
            }
        } else if (cls2.isAssignableFrom(C110635eZ.class)) {
            IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = (IndiaUpiQrCodeScannedDialogFragment) this.A00;
            C110635eZ r92 = new C110635eZ(indiaUpiQrCodeScannedDialogFragment.A0B, indiaUpiQrCodeScannedDialogFragment.A0D, indiaUpiQrCodeScannedDialogFragment.A0E, indiaUpiQrCodeScannedDialogFragment.A0H, indiaUpiQrCodeScannedDialogFragment.A0I, indiaUpiQrCodeScannedDialogFragment.A0J);
            IDxObserverShape118S0100000_3_I1 A072 = C110115dX.A07(this, 40);
            IDxObserverShape118S0100000_3_I1 A073 = C110115dX.A07(this, 42);
            IDxObserverShape118S0100000_3_I1 A074 = C110115dX.A07(this, 38);
            IDxObserverShape118S0100000_3_I1 A075 = C110115dX.A07(this, 37);
            IDxObserverShape118S0100000_3_I1 A076 = C110115dX.A07(this, 41);
            IDxObserverShape118S0100000_3_I1 A077 = C110115dX.A07(this, 43);
            IDxObserverShape118S0100000_3_I1 A078 = C110115dX.A07(this, 39);
            IDxObserverShape118S0100000_3_I1 A079 = C110115dX.A07(this, 36);
            IDxObserverShape118S0100000_3_I1 A0710 = C110115dX.A07(this, 44);
            r92.A02.A0A(indiaUpiQrCodeScannedDialogFragment, A072);
            r92.A05.A0A(indiaUpiQrCodeScannedDialogFragment, A073);
            r92.A09.A0A(indiaUpiQrCodeScannedDialogFragment, A074);
            r92.A08.A0A(indiaUpiQrCodeScannedDialogFragment, A075);
            r92.A01.A0A(indiaUpiQrCodeScannedDialogFragment, A076);
            r92.A00.A0A(indiaUpiQrCodeScannedDialogFragment, A077);
            r92.A03.A0A(indiaUpiQrCodeScannedDialogFragment, A078);
            r92.A07.A0A(indiaUpiQrCodeScannedDialogFragment, A079);
            r92.A04.A0A(indiaUpiQrCodeScannedDialogFragment, A0710);
            r92.A0A.A0A(indiaUpiQrCodeScannedDialogFragment, C110115dX.A07(this, 35));
            r92.A05(this.A02, this.A01);
            return r92;
        }
        throw AnonymousClass000.A0T("Invalid viewModel");
    }
}
