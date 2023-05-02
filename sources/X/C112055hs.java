package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.5hs  reason: invalid class name and case insensitive filesystem */
public class C112055hs extends AnonymousClass2HA {
    public final /* synthetic */ AnonymousClass1TV A00;
    public final /* synthetic */ C18310wU A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112055hs(Context context, AnonymousClass1TV r2, C18340wX r3, C18310wU r4, C14880pu r5, boolean z2, boolean z3) {
        super(context, r3, r5);
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = z2;
        this.A03 = z3;
    }

    public void A03(AnonymousClass2HJ r3) {
        this.A01.A0I.A05(AnonymousClass000.A0g("TosV2 onRequestError: ", r3));
        this.A00.AWC(r3);
    }

    public void A04(AnonymousClass2HJ r3) {
        this.A01.A0I.A05(AnonymousClass000.A0g("TosV2 onResponseError: ", r3));
        this.A00.AWI(r3);
    }

    public void A05(C28371Vv r9) {
        C28371Vv A0J = r9.A0J("accept_pay");
        C77573vz r3 = new C77573vz();
        boolean z2 = false;
        if (A0J != null) {
            String A0N = A0J.A0N("consumer", (String) null);
            String A0N2 = A0J.A0N("merchant", (String) null);
            if ((!this.A02 || "1".equals(A0N)) && (!this.A03 || "1".equals(A0N2))) {
                z2 = true;
            }
            r3.A02 = z2;
            r3.A00 = C110105dW.A1U(A0J, "outage", "1");
            r3.A01 = C110105dW.A1U(A0J, "sandbox", "1");
            if (!TextUtils.isEmpty(A0N) && !TextUtils.isEmpty("tos_no_wallet")) {
                AnonymousClass175 r2 = this.A01.A09;
                C40031tS A012 = r2.A01("tos_no_wallet");
                if ("1".equals(A0N)) {
                    r2.A08(A012);
                } else {
                    r2.A07(A012);
                }
            }
            if (!TextUtils.isEmpty(A0N2) && !TextUtils.isEmpty("tos_merchant")) {
                AnonymousClass17O r22 = this.A01.A0C;
                C40031tS A013 = r22.A01("tos_merchant");
                if ("1".equals(A0N2)) {
                    r22.A08(A013);
                } else {
                    r22.A07(A013);
                }
            }
            this.A01.A0D.A0O(r3.A01);
        } else {
            r3.A02 = false;
        }
        this.A00.AWJ(r3);
    }
}
