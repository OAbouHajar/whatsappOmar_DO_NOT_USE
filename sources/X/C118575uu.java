package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.redex.IDxTCallbackShape112S0200000_3_I1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5uu  reason: invalid class name and case insensitive filesystem */
public class C118575uu {
    public final Context A00;
    public final C14870pt A01;
    public final C18260wP A02;
    public final C18340wX A03;
    public final C18310wU A04;
    public final C118365uZ A05;
    public final C118435ug A06;
    public final C119285wq A07;
    public final C118915vc A08;
    public final AnonymousClass5wR A09;
    public final C18280wR A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;

    public C118575uu(Context context, C14870pt r12, C16040sK r13, C18260wP r14, C16440t3 r15, C18340wX r16, C18310wU r17, C118365uZ r18, C119285wq r19, C118915vc r20, C18280wR r21, String str, String str2, String str3, List list) {
        String str4 = str2;
        String str5 = str3;
        AnonymousClass00B.A0F((TextUtils.isEmpty(str4) ^ true) != (TextUtils.isEmpty(str5) ^ true) ? false : true);
        this.A00 = context;
        this.A01 = r12;
        this.A05 = r18;
        this.A0A = r21;
        this.A08 = r20;
        C18310wU r7 = r17;
        this.A04 = r7;
        this.A02 = r14;
        C18340wX r6 = r16;
        this.A03 = r6;
        C119285wq r8 = r19;
        this.A07 = r8;
        this.A09 = new AnonymousClass5wR(r13, r15, r7);
        this.A06 = new C118435ug(context, r12, r6, r7, r8, "PIN");
        this.A0B = str;
        this.A0E = list;
        this.A0C = str4;
        this.A0D = str5;
    }

    public final void A00(C117915tl r13, C118185uH r14, String str) {
        C118365uZ r2 = this.A05;
        List list = this.A0E;
        C118245uN r6 = new C118245uN(new C1202360w(this, r13, r14));
        if ("token".equals(r13.A00.A03)) {
            C16320sq r1 = r2.A05;
            C116325rC r8 = r2.A03;
            C18300wT r4 = r2.A01;
            AnonymousClass0y5 r9 = r2.A04;
            C18310wU r5 = r2.A02;
            C18260wP r3 = r2.A00;
            C13700nu.A0W(new C112105hx(r3, r4, r5, r6, (C1222268t) null, r8, r9, list, 0), r1);
            ArrayList A0u = AnonymousClass000.A0u();
            C13680ns.A1W("fbpay_pin", str, A0u);
            C13700nu.A0W(new C112105hx(r3, r4, r5, r6, (C1222268t) null, r8, r9, A0u, 1), r1);
            return;
        }
        r6.A00(1, str);
        C16320sq r0 = r2.A05;
        C116325rC r82 = r2.A03;
        C18300wT r42 = r2.A01;
        AnonymousClass0y5 r92 = r2.A04;
        C13700nu.A0W(new C112105hx(r2.A00, r42, r2.A02, (C118245uN) null, new IDxTCallbackShape112S0200000_3_I1(r6, 0, r2), r82, r92, list, -1), r0);
    }
}
