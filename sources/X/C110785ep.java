package X;

import com.obwhatsapp.payments.ui.IndiaUpiStepUpActivity;

/* renamed from: X.5ep  reason: invalid class name and case insensitive filesystem */
public class C110785ep extends C014206u {
    public final /* synthetic */ C35521m4 A00;
    public final /* synthetic */ C18300wT A01;
    public final /* synthetic */ C112325iJ A02;
    public final /* synthetic */ C118375ua A03;
    public final /* synthetic */ IndiaUpiStepUpActivity A04;
    public final /* synthetic */ C117765tW A05;
    public final /* synthetic */ C18280wR A06;
    public final /* synthetic */ String A07;

    public C110785ep(C35521m4 r1, C18300wT r2, C112325iJ r3, C118375ua r4, IndiaUpiStepUpActivity indiaUpiStepUpActivity, C117765tW r6, C18280wR r7, String str) {
        this.A05 = r6;
        this.A07 = str;
        this.A06 = r7;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = indiaUpiStepUpActivity;
        this.A03 = r4;
    }

    public C003401n A6s(Class cls) {
        if (cls.isAssignableFrom(C110585eT.class)) {
            String str = this.A07;
            C16980tz r2 = this.A05.A0B;
            C18280wR r7 = this.A06;
            C112325iJ r5 = this.A02;
            return new C110585eT(this.A04, r2, this.A00, this.A01, r5, this.A03, r7, str);
        }
        throw AnonymousClass000.A0T("Invalid viewModel");
    }
}
