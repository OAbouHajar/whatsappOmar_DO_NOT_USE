package X;

import android.content.Context;
import com.obwhatsapp.payments.IDxRCallbackShape94S0100000_3_I1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.5i0  reason: invalid class name and case insensitive filesystem */
public class C112135i0 extends C114525nu {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final C14870pt A03;
    public final C16040sK A04;
    public final C16440t3 A05;
    public final AnonymousClass173 A06;
    public final C17190ug A07;
    public final C18340wX A08;
    public final C18310wU A09;
    public final C18290wS A0A;
    public final AnonymousClass1Vo A0B = C110105dW.A0Q("BaseTokenAddCardAction", "network");
    public final C118585uv A0C;
    public final AnonymousClass5vX A0D;
    public final C118085u2 A0E;
    public final C18280wR A0F;
    public final C16320sq A0G;
    public final Boolean A0H;
    public final String A0I;
    public final String A0J;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C112135i0(android.content.Context r9, X.C14870pt r10, X.C16040sK r11, X.C18260wP r12, X.C16440t3 r13, X.AnonymousClass173 r14, X.C17190ug r15, X.C18340wX r16, X.C18300wT r17, X.C18310wU r18, X.C18290wS r19, X.C118585uv r20, X.AnonymousClass5vX r21, X.C118085u2 r22, X.C18280wR r23, X.C116325rC r24, X.AnonymousClass0y5 r25, X.C16320sq r26, java.lang.Boolean r27, java.lang.String r28, java.lang.String r29, int r30, int r31) {
        /*
            r8 = this;
            r2 = r8
            r6 = r24
            r5 = r18
            r4 = r17
            r3 = r12
            r7 = r25
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.String r1 = "BaseTokenAddCardAction"
            java.lang.String r0 = "network"
            X.1Vo r0 = X.C110105dW.A0Q(r1, r0)
            r8.A0B = r0
            r8.A03 = r10
            r0 = r26
            r8.A0G = r0
            r0 = r23
            r8.A0F = r0
            r0 = r19
            r8.A0A = r0
            r8.A09 = r5
            r0 = r16
            r8.A08 = r0
            r0 = r28
            r8.A0I = r0
            r0 = r29
            r8.A0J = r0
            r0 = r30
            r8.A00 = r0
            r0 = r31
            r8.A01 = r0
            r8.A05 = r13
            r8.A02 = r9
            r8.A04 = r11
            r8.A07 = r15
            r0 = r21
            r8.A0D = r0
            r0 = r20
            r8.A0C = r0
            r8.A06 = r14
            r0 = r27
            r8.A0H = r0
            r0 = r22
            r8.A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112135i0.<init>(android.content.Context, X.0pt, X.0sK, X.0wP, X.0t3, X.173, X.0ug, X.0wX, X.0wT, X.0wU, X.0wS, X.5uv, X.5vX, X.5u2, X.0wR, X.5rC, X.0y5, X.0sq, java.lang.Boolean, java.lang.String, java.lang.String, int, int):void");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass1Vo r2;
        String str;
        AnonymousClass01Q r0 = (AnonymousClass01Q) obj;
        String str2 = (String) r0.A00;
        AnonymousClass2HJ r22 = (AnonymousClass2HJ) r0.A01;
        if (str2 == null) {
            Log.i(AnonymousClass000.A0g("PAY: BrazilAddCardAction token error: ", r22));
            this.A0E.A00((C35391lr) null, r22, (ArrayList) null, false, false);
            return;
        }
        Log.i("PAY: BrazilAddCardAction sendAddCard token success");
        String A0g = C110105dW.A0g(this.A04, this.A05);
        C17190ug r24 = this.A07;
        String A022 = r24.A02();
        String A012 = this.A0F.A01();
        Locale locale = Locale.US;
        Object[] A1b = C13680ns.A1b();
        int i2 = this.A00;
        AnonymousClass000.A1M(A1b, i2, 0);
        String format = String.format(locale, "%02d", A1b);
        int i3 = this.A01;
        String num = Integer.toString(i3);
        Boolean bool = this.A0H;
        String str3 = (bool == null || bool.booleanValue()) ? "1" : "0";
        C118585uv r7 = this.A0C;
        String str4 = this.A0I;
        C117575tD r13 = r7.A00;
        C116395rJ r4 = null;
        if (r13 != null && r13.A00 == 5) {
            String str5 = r13.A02;
            r13.A02 = null;
            String A002 = r7.A0H.A00(5);
            String A062 = r7.A0E.A06();
            StringBuilder A0q = AnonymousClass000.A0q(str5);
            A0q.append(A002);
            A0q.append(A062);
            A0q.append(str4.replaceAll("\\s", ""));
            A0q.append(i2);
            Locale locale2 = Locale.US;
            Object[] A1b2 = C13680ns.A1b();
            AnonymousClass000.A1M(A1b2, i3 % 100, 0);
            String A0h = AnonymousClass000.A0h(String.format(locale2, "%02d", A1b2), A0q);
            C119315wt r1 = r7.A0C;
            String A042 = r1.A04(A0h);
            if (A042 == null) {
                r2 = r7.A01;
                str = "device_signature is null";
            } else {
                String A052 = r1.A05(A0h);
                if (A052 == null) {
                    r2 = r7.A01;
                    str = "wallet_signature is null";
                } else if (str5 == null) {
                    r2 = r7.A01;
                    str = "challenge_id is null";
                } else {
                    r4 = new C116395rJ(A042, A052, str5);
                }
            }
            r2.A05(str);
        }
        C51812cK r72 = new C51812cK(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "br-add-card");
        if (C110105dW.A1V(A012, 1, false)) {
            C32461gQ.A00(A0Y, "device-id", A012);
        }
        if (C110105dW.A1W(A0g, 1, false)) {
            C32461gQ.A00(A0Y, "nonce", A0g);
        }
        if (C32271fx.A0D(format, 2, 2, false)) {
            C32461gQ.A00(A0Y, "card-expiry-month", format);
        }
        if (C32271fx.A0D(num, 4, 4, false)) {
            C32461gQ.A00(A0Y, "card-expiry-year", num);
        }
        if (C110115dX.A1B(str2, 1, false)) {
            C32461gQ.A00(A0Y, "token", str2);
        }
        A0Y.A09(str3, "is_first_card", C115545pv.A00);
        if (r4 != null) {
            A0Y.A03(r4.A00);
        }
        r24.A0A(new IDxRCallbackShape94S0100000_3_I1(this.A02, this.A08, this.A03, this, 0), C110105dW.A0T(A0Y, A0X, r72), A022, 204, 0);
    }
}
