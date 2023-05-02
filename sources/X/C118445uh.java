package X;

import android.content.Context;
import com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1;

/* renamed from: X.5uh  reason: invalid class name and case insensitive filesystem */
public class C118445uh {
    public final Context A00;
    public final C16300so A01;
    public final C14870pt A02;
    public final AnonymousClass173 A03;
    public final C17190ug A04;
    public final C18340wX A05;
    public final AnonymousClass68N A06;
    public final String A07;

    public C118445uh(Context context, C16300so r2, C14870pt r3, AnonymousClass173 r4, C17190ug r5, C18340wX r6, AnonymousClass68N r7, String str) {
        this.A00 = context;
        this.A07 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = r7;
    }

    public void A00() {
        C17190ug r7 = this.A04;
        String A022 = r7.A02();
        C116405rK r4 = new C116405rK(new AnonymousClass2BJ(A022), this.A07);
        C28371Vv r9 = r4.A00;
        Context context = this.A00;
        C14870pt r3 = this.A02;
        r7.A0A(new IDxRCallbackShape20S0200000_3_I1(context, this.A05, r3, r4, this, 6), r9, A022, 204, AnonymousClass1NO.A0L);
    }
}
