package X;

import android.content.Context;
import com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1;

/* renamed from: X.5ut  reason: invalid class name and case insensitive filesystem */
public class C118565ut {
    public final Context A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C18260wP A03;
    public final C16440t3 A04;
    public final AnonymousClass173 A05;
    public final C17190ug A06;
    public final C119315wt A07;
    public final C18340wX A08;
    public final C18310wU A09;
    public final C18290wS A0A;
    public final C118335uW A0B;
    public final C18280wR A0C;
    public final String A0D;

    public C118565ut(Context context, C14870pt r2, C16040sK r3, C18260wP r4, C16440t3 r5, AnonymousClass173 r6, C17190ug r7, C119315wt r8, C18340wX r9, C18310wU r10, C18290wS r11, C118335uW r12, C18280wR r13, String str) {
        this.A04 = r5;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
        this.A0C = r13;
        this.A0A = r11;
        this.A09 = r10;
        this.A0B = r12;
        this.A05 = r6;
        this.A07 = r8;
        this.A03 = r4;
        this.A08 = r9;
        this.A0D = str;
    }

    public void A00(C1222468v r20) {
        C18290wS r13 = this.A0A;
        AnonymousClass160 A0H = C110115dX.A0H(r13);
        String str = this.A0D;
        C30671cl A082 = A0H.A08(str);
        AnonymousClass00B.A06(A082);
        C35391lr r1 = (C35391lr) A082;
        C111815hS r4 = (C111815hS) r1.A08;
        C1222468v r2 = r20;
        if (r4 != null) {
            if (r4.A08) {
                C16440t3 r7 = this.A04;
                Context context = this.A00;
                C14870pt r42 = this.A01;
                C16040sK r5 = this.A02;
                C17190ug r9 = this.A06;
                C18310wU r12 = this.A09;
                C118335uW r15 = this.A0B;
                new C118815vI(context, r42, r5, this.A03, r7, this.A05, r9, this.A07, this.A08, r12, r13, new C1202560y(r1, r2, this), r15).A00(r1);
                return;
            } else if (r4.A0a) {
                r2.AOB(r1);
                return;
            }
        }
        C17190ug r6 = this.A06;
        String A022 = r6.A02();
        String A012 = this.A0C.A01();
        AnonymousClass2BJ r92 = new AnonymousClass2BJ(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "br-get-verification-methods");
        if (C110115dX.A1C(str, false)) {
            C32461gQ.A00(A0Y, "credential-id", str);
        }
        if (C110105dW.A1V(A012, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A012);
        }
        C28371Vv A0S = C110105dW.A0S(A0Y, A0X, r92);
        r6.A0A(new IDxRCallbackShape20S0200000_3_I1(this.A00, this.A08, this.A01, r2, this, 7), A0S, A022, 204, 0);
    }
}
