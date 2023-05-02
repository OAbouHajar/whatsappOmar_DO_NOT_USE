package X;

import android.content.Context;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1VN  reason: invalid class name */
public class AnonymousClass1VN {
    public String A00;
    public final Context A01;
    public final C14600pS A02;
    public final C14870pt A03;
    public final C16040sK A04;
    public final C227919h A05;
    public final C18090w8 A06;
    public final C18290wS A07;
    public final AnonymousClass3Q5 A08;
    public final Runnable A09;
    public final Runnable A0A;
    public final boolean A0B;

    public AnonymousClass1VN(Context context, C14600pS r2, C14870pt r3, C16040sK r4, C227919h r5, C18090w8 r6, C18290wS r7, AnonymousClass3Q5 r8, Runnable runnable, Runnable runnable2, boolean z2) {
        this.A01 = context;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
        this.A07 = r7;
        this.A06 = r6;
        this.A08 = r8;
        this.A05 = r5;
        this.A0B = z2;
        this.A0A = runnable;
        this.A09 = runnable2;
    }

    public void A00(C15830rv r19, C16740tZ r20, String str, String str2, int i2, boolean z2) {
        C14870pt r2;
        Context context;
        int i3;
        int i4 = i2;
        if (i4 == 5) {
            r2 = this.A03;
            context = this.A01;
            i3 = R.string.str1030;
        } else if (i4 == 3) {
            r2 = this.A03;
            context = this.A01;
            i3 = R.string.str102f;
        } else if (i4 == 1) {
            r2 = this.A03;
            context = this.A01;
            i3 = R.string.str102e;
        } else {
            C14870pt r6 = this.A03;
            C18290wS r7 = this.A07;
            C15830rv r12 = r19;
            C16740tZ r14 = r20;
            String str3 = str;
            String str4 = str2;
            boolean z3 = z2;
            C87324Wh r3 = new C87324Wh(this.A01, this.A02, r6, r7, this.A08, new AnonymousClass56K(r12, this, r14, str3, str4, z3), new RunnableRunnableShape12S0100000_I0_11((Object) this, 8), this.A0B);
            UserJid of = UserJid.of(r12);
            if (of == null || !r3.A02()) {
                A01(r12, r14, str3, str4, z3);
                return;
            } else {
                r3.A01(of, new AnonymousClass513(this), str4);
                return;
            }
        }
        r2.A0H(context.getString(i3), 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r10.A04.A0I(r12.A0L.A0E) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C15830rv r11, X.C16740tZ r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r10 = this;
            if (r12 == 0) goto L_0x0019
            X.1Vt r0 = r12.A0L
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0019
            X.0sK r1 = r10.A04
            X.1Vt r0 = r12.A0L
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r1.A0I(r0)
            r7 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r7 = 0
        L_0x001a:
            X.0w8 r0 = r10.A06
            X.19h r1 = r10.A05
            android.content.Context r3 = r10.A01
            java.lang.String r8 = r10.A00
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4 = 0
            android.content.Intent r2 = r1.A02(r3, r7, r4)
            java.lang.String r1 = "referral_screen"
            r2.putExtra(r1, r14)
            java.lang.String r1 = "extra_payment_note"
            r2.putExtra(r1, r13)
            java.lang.String r9 = "upiHandle"
            java.lang.String r5 = "extra_payment_handle"
            if (r12 == 0) goto L_0x00a8
            java.lang.String r1 = "extra_conversation_message_type"
            r8 = 2
            r2.putExtra(r1, r8)
            X.0rv r1 = r12.A0B()
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r1)
            int r0 = r0.A00(r1)
            if (r0 != r8) goto L_0x0070
            java.lang.String r1 = X.C16030sJ.A03(r1)
            java.lang.String r0 = "extra_receiver_jid"
            r2.putExtra(r0, r1)
            X.1Vt r0 = r12.A0L
            if (r0 == 0) goto L_0x0070
            X.1W2 r0 = r0.A0A
            if (r0 == 0) goto L_0x0070
            X.2gP r8 = new X.2gP
            r8.<init>()
            java.lang.String r1 = r0.A0I()
            X.1lh r0 = new X.1lh
            r0.<init>(r8, r6, r1, r9)
            r2.putExtra(r5, r0)
        L_0x0070:
            long r0 = r12.A13
            java.lang.String r5 = "extra_quoted_msg_row_id"
            r2.putExtra(r5, r0)
            if (r7 == 0) goto L_0x0098
            X.1Vw r0 = r12.A11
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "extra_request_message_key"
            r2.putExtra(r0, r1)
            X.1Vt r0 = r12.A0L
            X.AnonymousClass00B.A06(r0)
            X.1Vy r0 = r0.A08
            X.AnonymousClass00B.A06(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "extra_payment_preset_amount"
            r2.putExtra(r0, r1)
            r2.putExtra(r5, r4)
        L_0x0098:
            java.lang.String r0 = "extra_should_open_transaction_detail_after_send_override"
            r2.putExtra(r0, r15)
            X.AnonymousClass477.A00(r3, r2, r11)
            java.lang.Runnable r0 = r10.A0A
            if (r0 == 0) goto L_0x00a7
            r0.run()
        L_0x00a7:
            return
        L_0x00a8:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0098
            X.2gP r1 = new X.2gP
            r1.<init>()
            X.1lh r0 = new X.1lh
            r0.<init>(r1, r6, r8, r9)
            r2.putExtra(r5, r0)
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VN.A01(X.0rv, X.0tZ, java.lang.String, java.lang.String, boolean):void");
    }
}
