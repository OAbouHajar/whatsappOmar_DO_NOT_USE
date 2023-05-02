package X;

import android.content.Context;
import com.obwhatsapp.payments.IDxRCallbackShape94S0100000_3_I1;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.5hz  reason: invalid class name and case insensitive filesystem */
public class C112125hz extends C114525nu {
    public final Context A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C16440t3 A03;
    public final C18340wX A04;
    public final C18310wU A05;
    public final C117935tn A06;
    public final C18280wR A07;
    public final C16320sq A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public C112125hz(Context context, C14870pt r9, C16040sK r10, C18260wP r11, C16440t3 r12, C18340wX r13, C18300wT r14, C18310wU r15, C117935tn r16, C18280wR r17, C116325rC r18, AnonymousClass0y5 r19, C16320sq r20, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(r11, r14, r15, r18, r19);
        this.A00 = context;
        this.A03 = r12;
        this.A01 = r9;
        this.A02 = r10;
        this.A08 = r20;
        this.A07 = r17;
        this.A05 = r15;
        this.A04 = r13;
        this.A0F = str;
        this.A0E = str2;
        this.A0C = str3;
        this.A0B = str4;
        this.A0A = str5;
        this.A09 = str6;
        this.A0D = str7;
        this.A06 = r16;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C35081lL r3;
        AnonymousClass01Q r15 = (AnonymousClass01Q) obj;
        String str = (String) r15.A00;
        AnonymousClass2HJ r2 = (AnonymousClass2HJ) r15.A01;
        if (str != null) {
            ArrayList A0u = AnonymousClass000.A0u();
            C110105dW.A1P("action", "br-prelink-merchant", A0u);
            String str2 = this.A0F;
            if ("PREPAID".equals(str2)) {
                AnonymousClass00B.A05(str);
                r3 = new C35081lL("card-token", str);
            } else if ("BANK".equals(str2)) {
                AnonymousClass00B.A05(str);
                C110105dW.A1P("bank-token", str, A0u);
                String str3 = this.A0C;
                AnonymousClass00B.A05(str3);
                C110105dW.A1P("bank-code", str3, A0u);
                String str4 = this.A0B;
                AnonymousClass00B.A05(str4);
                C110105dW.A1P("bank-branch", str4, A0u);
                String str5 = this.A0A;
                AnonymousClass00B.A05(str5);
                r3 = new C35081lL("bank-account-type", str5);
            } else {
                throw AnonymousClass000.A0V("Expecting card token or bank account!");
            }
            A0u.add(r3);
            C110105dW.A1P("device-id", this.A07.A01(), A0u);
            C110105dW.A1P("nonce", C110105dW.A0g(this.A02, this.A03), A0u);
            C110105dW.A1P("verify-type", str2, A0u);
            C110105dW.A1P("verify-id", this.A0E, A0u);
            this.A05.A0H(new IDxRCallbackShape94S0100000_3_I1(this.A00, this.A04, this.A01, this, 4), new C28371Vv("account", C110115dX.A1F(A0u, 0)), "set", AnonymousClass1NO.A0L);
            return;
        }
        Log.e(AnonymousClass000.A0g("PAY: BrazilMerchantPreLinkAction token error: ", r2));
        this.A06.A00(r2, (C117465t2) null);
    }
}
