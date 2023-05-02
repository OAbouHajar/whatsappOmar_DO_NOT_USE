package X;

import android.content.Context;
import com.obwhatsapp.payments.IDxRCallbackShape94S0100000_3_I1;
import com.whatsapp.util.Log;

/* renamed from: X.5hy  reason: invalid class name and case insensitive filesystem */
public class C112115hy extends C114525nu {
    public final int A00;
    public final Context A01;
    public final C14870pt A02;
    public final AnonymousClass173 A03;
    public final C18340wX A04;
    public final C18310wU A05;
    public final C18290wS A06;
    public final C117945to A07;
    public final C18280wR A08;
    public final C16320sq A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public C112115hy(Context context, C14870pt r9, C18260wP r10, AnonymousClass173 r11, C18340wX r12, C18300wT r13, C18310wU r14, C18290wS r15, C117945to r16, C18280wR r17, C116325rC r18, AnonymousClass0y5 r19, C16320sq r20, String str, String str2, String str3, String str4, int i2) {
        super(r10, r13, r14, r18, r19);
        this.A01 = context;
        this.A02 = r9;
        this.A09 = r20;
        this.A08 = r17;
        this.A06 = r15;
        this.A05 = r14;
        this.A03 = r11;
        this.A04 = r12;
        this.A0A = str;
        this.A0C = str2;
        this.A0B = str3;
        this.A00 = i2;
        this.A0D = str4;
        this.A07 = r16;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass01Q r14 = (AnonymousClass01Q) obj;
        String str = (String) r14.A00;
        AnonymousClass2HJ r1 = (AnonymousClass2HJ) r14.A01;
        if (str == null) {
            Log.e(AnonymousClass000.A0g("PAY: BrazilUpdateMerchantAccountAction token error: ", r1));
            this.A07.A00(r1);
            return;
        }
        C18310wU r7 = this.A05;
        C35081lL[] r3 = new C35081lL[7];
        C35081lL.A02("action", "br-update-merchant-account", r3, 0);
        C35081lL.A02("bank-token", str, r3, 1);
        C35081lL.A02("bank-code", this.A0C, r3, 2);
        C35081lL.A02("bank-branch", this.A0B, r3, 3);
        C35081lL.A02("bank-account-type", String.valueOf(this.A00), r3, 4);
        C35081lL.A02("device-id", this.A08.A01(), r3, 5);
        C35081lL.A02("nonce", this.A0D, r3, 6);
        r7.A0H(new IDxRCallbackShape94S0100000_3_I1(this.A01, this.A04, this.A02, this, 5), new C28371Vv("account", r3), "set", AnonymousClass1NO.A0L);
    }
}
