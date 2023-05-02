package X;

import android.content.Context;
import com.obwhatsapp.payments.IDxRCallbackShape94S0100000_3_I1;
import com.whatsapp.util.Log;

/* renamed from: X.5i2  reason: invalid class name and case insensitive filesystem */
public class C112155i2 extends AnonymousClass5vY {
    public final Context A00;
    public final AnonymousClass173 A01;
    public final C17190ug A02;
    public final C119315wt A03;
    public final C118095u3 A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C112155i2(android.content.Context r13, X.C14870pt r14, X.C16040sK r15, X.C16440t3 r16, X.AnonymousClass173 r17, X.AnonymousClass160 r18, X.C17190ug r19, X.C119315wt r20, X.C18340wX r21, X.C18310wU r22, X.C18290wS r23, X.C119285wq r24, X.C118585uv r25, X.C118095u3 r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            r12 = this;
            r10 = r24
            r9 = r23
            r8 = r22
            r7 = r21
            r5 = r16
            r4 = r15
            r3 = r14
            r2 = r13
            r11 = r25
            r1 = r12
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r13
            r0 = r19
            r12.A02 = r0
            r0 = r17
            r12.A01 = r0
            r0 = r20
            r12.A03 = r0
            r0 = r27
            r12.A05 = r0
            r0 = r28
            r12.A07 = r0
            r0 = r29
            r12.A06 = r0
            r0 = r26
            r12.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112155i2.<init>(android.content.Context, X.0pt, X.0sK, X.0t3, X.173, X.160, X.0ug, X.5wt, X.0wX, X.0wU, X.0wS, X.5wq, X.5uv, X.5u3, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void A03(String str) {
        Log.i("PAY: BrazilVerifyCardSendAuthCodeAction sendAuthCode");
        C17190ug r4 = this.A02;
        String A022 = r4.A02();
        String str2 = this.A06;
        String str3 = this.A07;
        C51812cK r8 = new C51812cK(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "br-verify-send-auth-code");
        if (C110115dX.A1C(str2, false)) {
            C32461gQ.A00(A0Y, "credential-id", str2);
        }
        if (C110105dW.A1W(str3, 1, false)) {
            C32461gQ.A00(A0Y, "nonce", str3);
        }
        if (C110115dX.A1B(str, 1, false)) {
            C32461gQ.A00(A0Y, "auth-code", str);
        }
        C110105dW.A1H(r4, new IDxRCallbackShape94S0100000_3_I1(this.A00, this.A05, this.A01, this, 7), C110105dW.A0T(A0Y, A0X, r8), A022);
    }
}
