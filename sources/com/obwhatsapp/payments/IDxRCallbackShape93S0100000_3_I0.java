package com.obwhatsapp.payments;

import X.AnonymousClass000;
import X.AnonymousClass2HA;
import X.AnonymousClass2HF;
import X.AnonymousClass2HJ;
import X.C110105dW;
import X.C110115dX;
import X.C113015lE;
import X.C114265nU;
import X.C117625tI;
import X.C118255uO;
import X.C118265uP;
import X.C13680ns;
import X.C14880pu;
import X.C18340wX;
import X.C28371Vv;
import X.C29501aj;
import X.C30671cl;
import X.C38411qk;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.util.Log;

public class IDxRCallbackShape93S0100000_3_I0 extends AnonymousClass2HA {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxRCallbackShape93S0100000_3_I0(Context context, C18340wX r2, C14880pu r3, Object obj, int i2) {
        super(context, r2, r3);
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A03(AnonymousClass2HJ r4) {
        if (this.A01 == 0) {
            C117625tI r0 = (C117625tI) this.A00;
            r0.A06.A00(C110115dX.A0N(), r0.A07);
        }
    }

    public void A04(AnonymousClass2HJ r4) {
        if (this.A01 == 0) {
            C117625tI r0 = (C117625tI) this.A00;
            r0.A06.A00(C110115dX.A0N(), r0.A07);
        }
    }

    public void A05(C28371Vv r9) {
        C28371Vv A0J;
        if (this.A01 != 0) {
            C28371Vv A0X = C110115dX.A0X(r9);
            if (A0X != null) {
                boolean equals = "1".equals(C28371Vv.A05(A0X, "is-recoverable"));
                C118255uO r5 = (C118255uO) this.A00;
                C13680ns.A0z(C110105dW.A06(r5.A02), "payment_account_recoverable", equals);
                if (equals) {
                    long A012 = C29501aj.A01(C28371Vv.A05(A0X, "suspended-ts"), 0);
                    if (A012 > 0) {
                        r5.A02.A0F(A012 * 1000);
                    } else {
                        r5.A02.A0A();
                    }
                } else {
                    r5.A02.A0F(0);
                }
            }
        } else {
            C28371Vv A0X2 = C110115dX.A0X(r9);
            if (A0X2 == null || (A0J = A0X2.A0J("image")) == null) {
                C117625tI r0 = (C117625tI) this.A00;
                r0.A06.A00(C110115dX.A0N(), r0.A07);
                return;
            }
            C118265uP r52 = ((C117625tI) this.A00).A06;
            String A0N = A0J.A0N("credential-id", (String) null);
            A0J.A0N("image-content-id", (String) null);
            String A0N2 = A0J.A0N("image-url", (String) null);
            String A0N3 = A0J.A0N("image-label-color", (String) null);
            C30671cl r3 = r52.A01;
            String str = r3.A0A;
            if (A0N.equals(str)) {
                if (!TextUtils.isEmpty(A0N2)) {
                    r52.A02.A0E = A0N2;
                    ImageView imageView = r52.A00;
                    C113015lE r02 = r52.A03.A08;
                    if (imageView != null) {
                        r02.A04.A01(imageView, A0N2);
                    } else {
                        C38411qk r1 = r02.A04;
                        int i2 = r1.A01;
                        r1.A02.A01(new C114265nU(i2, A0N2, i2), false);
                    }
                }
                if (!TextUtils.isEmpty(A0N3)) {
                    r52.A02.A0D = A0N3;
                }
                r52.A03.A07.A01().A02((AnonymousClass2HF) null, r3);
                return;
            }
            StringBuilder A0r = AnonymousClass000.A0r("PAY: fetchCardArtImageContentDetails credentialIds don't match; request: ");
            A0r.append(str);
            A0r.append(" response: ");
            Log.w(AnonymousClass000.A0h(A0N, A0r));
        }
    }
}
