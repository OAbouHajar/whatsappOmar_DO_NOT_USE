package X;

import android.content.Context;

/* renamed from: X.5ht  reason: invalid class name and case insensitive filesystem */
public class C112065ht extends AnonymousClass2HA {
    public final /* synthetic */ AnonymousClass690 A00;
    public final /* synthetic */ C117565tC A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112065ht(Context context, C18340wX r2, AnonymousClass690 r3, C117565tC r4, C14880pu r5, String str, String str2) {
        super(context, r2, r5);
        this.A01 = r4;
        this.A02 = str;
        this.A00 = r3;
        this.A03 = str2;
    }

    public void A03(AnonymousClass2HJ r4) {
        AnonymousClass1Vo r2 = this.A01.A05;
        StringBuilder A0r = AnonymousClass000.A0r("PaymentKycAction ");
        A0r.append(this.A02);
        r2.A05(AnonymousClass000.A0e(r4, ": onRequestError: ", A0r));
        this.A00.ASW(r4);
    }

    public void A04(AnonymousClass2HJ r4) {
        AnonymousClass1Vo r2 = this.A01.A05;
        StringBuilder A0r = AnonymousClass000.A0r("PaymentKycAction ");
        A0r.append(this.A02);
        r2.A05(AnonymousClass000.A0e(r4, ": onResponseError: ", A0r));
        this.A00.ASW(r4);
    }

    public void A05(C28371Vv r6) {
        AnonymousClass1Vo r2;
        String str;
        C28371Vv A0X = C110115dX.A0X(r6);
        if (A0X == null) {
            r2 = this.A01.A05;
            StringBuilder A0q = AnonymousClass000.A0q("PaymentKycAction ");
            A0q.append(this.A02);
            str = AnonymousClass000.A0h(": onResponseSuccess: missing account node", A0q);
        } else {
            AnonymousClass2HJ A002 = AnonymousClass2HJ.A00(A0X);
            if (A002 != null) {
                C117565tC r3 = this.A01;
                AnonymousClass1Vo r22 = r3.A05;
                StringBuilder A0q2 = AnonymousClass000.A0q("PaymentKycAction ");
                A0q2.append(this.A02);
                r22.A05(AnonymousClass000.A0e(A002, ": onResponseSuccess: account-node error: ", A0q2));
                if (A002.A00 == 1448) {
                    r3.A04.A03(A002, this.A03, "KYC");
                }
                this.A00.ASW(A002);
                return;
            }
            C35451lx A003 = C35451lx.A00(A0X);
            if (A003 != null) {
                this.A00.ASX(A003);
                return;
            } else {
                r2 = this.A01.A05;
                str = "PaymentKycAction/createCallback PaymentKycInfo is null";
            }
        }
        r2.A05(str);
        this.A00.ASW(C110115dX.A0N());
    }
}
