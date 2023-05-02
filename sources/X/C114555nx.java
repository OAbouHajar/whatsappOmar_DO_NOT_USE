package X;

import android.content.Intent;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;

/* renamed from: X.5nx  reason: invalid class name and case insensitive filesystem */
public class C114555nx extends C16690tT {
    public final /* synthetic */ C28411Vz A00;
    public final /* synthetic */ C28401Vy A01;
    public final /* synthetic */ C30671cl A02;
    public final /* synthetic */ AnonymousClass1XP A03;
    public final /* synthetic */ C111845hV A04;
    public final /* synthetic */ BrazilPaymentActivity A05;
    public final /* synthetic */ C30581cc A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public C114555nx(C28411Vz r1, C28401Vy r2, C30671cl r3, AnonymousClass1XP r4, C111845hV r5, BrazilPaymentActivity brazilPaymentActivity, C30581cc r7, String str, String str2) {
        this.A05 = brazilPaymentActivity;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r27) {
        /*
            r26 = this;
            r0 = r26
            com.obwhatsapp.payments.ui.BrazilPaymentActivity r3 = r0.A05
            com.obwhatsapp.payments.ui.widget.PaymentView r1 = r3.A35()
            if (r1 == 0) goto L_0x0011
            X.1jm r2 = r1.getStickerIfSelected()
            r1 = 1
            if (r2 != 0) goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            java.lang.String r7 = "p2m"
            if (r1 == 0) goto L_0x00ab
            X.5ud r6 = r3.A0W
            com.obwhatsapp.payments.ui.widget.PaymentView r1 = r3.A0W
            if (r1 == 0) goto L_0x00a6
            X.1jm r5 = r1.getStickerIfSelected()
        L_0x0020:
            X.AnonymousClass00B.A06(r5)
            X.1XP r4 = r0.A03
            r23 = 0
            if (r4 == 0) goto L_0x00a3
            X.1f1 r1 = r4.A0J
            X.AnonymousClass00B.A06(r1)
            java.lang.String r8 = r1.A0D
        L_0x0030:
            X.0rv r10 = r3.A0E
            X.AnonymousClass00B.A06(r10)
            com.whatsapp.jid.UserJid r9 = r3.A0G
            long r1 = r3.A02
            r12 = 0
            int r11 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x0047
            X.0t6 r11 = r3.A09
            X.0th r11 = r11.A0K
            X.0tZ r23 = r11.A00(r1)
        L_0x0047:
            com.obwhatsapp.payments.ui.widget.PaymentView r1 = r3.A0W
            if (r1 == 0) goto L_0x00a0
            java.lang.Integer r25 = r1.getStickerSendOrigin()
        L_0x004f:
            X.1Vy r12 = r0.A01
            X.1Vz r11 = r0.A00
            X.1cl r13 = r0.A02
            X.5hV r14 = r0.A04
            java.lang.String r2 = r3.A0l
            java.lang.String r1 = r0.A07
            r15 = 0
            java.lang.String r0 = r0.A08
            boolean r19 = r7.equals(r0)
            X.0wQ r0 = r6.A04
            r20 = r0
            r21 = r10
            r22 = r9
            r24 = r5
            X.1rB r3 = r20.A02(r21, r22, r23, r24, r25)
            X.0wU r10 = r6.A03
            r18 = r1
            r16 = r3
            r17 = r2
            boolean r7 = r10.A0J(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r4 != 0) goto L_0x008c
            X.0wK r2 = r6.A02
            X.1XL r1 = X.C18270wQ.A00(r5, r8)
            X.AnonymousClass00B.A06(r1)
            r0 = 1
            X.1XP r4 = r2.A02(r1, r0)
        L_0x008c:
            X.0pt r1 = r6.A00
            X.66S r0 = new X.66S
            r0.<init>(r4, r6, r3)
            r1.A0K(r0)
            X.1HQ r0 = r6.A05
            r0.A00(r15, r3)
            if (r7 == 0) goto L_0x00a9
            X.1Vt r0 = r3.A0L
            return r0
        L_0x00a0:
            r25 = 0
            goto L_0x004f
        L_0x00a3:
            r8 = r23
            goto L_0x0030
        L_0x00a6:
            r5 = 0
            goto L_0x0020
        L_0x00a9:
            r0 = 0
            return r0
        L_0x00ab:
            X.0wU r8 = r3.A0M
            X.1cc r14 = r0.A06
            X.1Vy r10 = r0.A01
            X.1Vz r9 = r0.A00
            X.1cl r11 = r0.A02
            X.5hV r12 = r0.A04
            java.lang.String r15 = r3.A0l
            java.lang.String r1 = r0.A07
            r13 = 0
            java.lang.String r0 = r0.A08
            boolean r17 = r7.equals(r0)
            r16 = r1
            X.1Vt r0 = r8.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114555nx.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass1Vt r5 = (AnonymousClass1Vt) obj;
        BrazilPaymentActivity brazilPaymentActivity = this.A05;
        brazilPaymentActivity.A0O.AL3("send_payment", brazilPaymentActivity.A00);
        brazilPaymentActivity.A0F.A02(brazilPaymentActivity.A0h);
        brazilPaymentActivity.A0f = true;
        if (!brazilPaymentActivity.A0t || r5 == null) {
            brazilPaymentActivity.A37(0);
            return;
        }
        Intent A042 = C110105dW.A04(brazilPaymentActivity, BrazilPaymentTransactionDetailActivity.class);
        C110115dX.A0q(A042, r5, r5.A0C);
        C110115dX.A0r(A042, brazilPaymentActivity.A0c);
        A042.setFlags(67108864);
        A042.putExtra("extra_action_bar_display_close", true);
        brazilPaymentActivity.A2X(A042, true);
        brazilPaymentActivity.Ac1();
    }
}
