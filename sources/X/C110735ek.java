package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.5ek  reason: invalid class name and case insensitive filesystem */
public class C110735ek extends C003401n implements AnonymousClass68L {
    public final AnonymousClass027 A00 = C13690nt.A0O();
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final AnonymousClass027 A02 = C13690nt.A0O();
    public final C221116r A03;
    public final C14710pd A04;
    public final C119365wy A05;
    public final C112285iF A06;
    public final C1200960h A07;
    public final C16320sq A08;
    public final HashMap A09 = AnonymousClass000.A0x();

    public C110735ek(C221116r r2, C14710pd r3, C119365wy r4, C112285iF r5, C1200960h r6, C16320sq r7) {
        this.A04 = r3;
        this.A08 = r7;
        this.A07 = r6;
        this.A05 = r4;
        this.A03 = r2;
        this.A06 = r5;
    }

    public void A05(C35301lh r4, C35301lh r5) {
        String str = (String) C110105dW.A0d(r4);
        if (!TextUtils.isEmpty(str) && C39841t9.A03(r5) && this.A04.A0C(2491)) {
            C35301lh A012 = C39841t9.A01(this.A09.get(str.toLowerCase(Locale.US)), "accountHolderName");
            if (!C39841t9.A03(A012)) {
                this.A01.A0B(new AnonymousClass5wH(r4, A012));
                return;
            }
        }
        this.A00.A0B(Boolean.TRUE);
        this.A06.A01(r4, r5, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AWU(com.whatsapp.jid.UserJid r12, X.C35301lh r13, X.C35301lh r14, X.C35301lh r15, X.AnonymousClass2HJ r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24) {
        /*
            r11 = this;
            X.027 r1 = r11.A00
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0B(r0)
            X.5wH r1 = new X.5wH
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            r10 = r21
            r9 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r16
            if (r20 == 0) goto L_0x002c
            if (r16 != 0) goto L_0x0041
            boolean r0 = X.AnonymousClass000.A1O(r22)
            r1.A07 = r0
            X.027 r0 = r11.A01
            r0.A0B(r1)
            return
        L_0x002c:
            if (r16 != 0) goto L_0x0041
            r0 = 2131890021(0x7f120f65, float:1.9414722E38)
            if (r23 == 0) goto L_0x0036
            r0 = 2131890018(0x7f120f62, float:1.9414716E38)
        L_0x0036:
            X.5wo r1 = new X.5wo
            r1.<init>(r0)
        L_0x003b:
            X.027 r0 = r11.A02
            r0.A0B(r1)
            return
        L_0x0041:
            X.60h r2 = r11.A07
            int r1 = r0.A00
            X.5wy r0 = r11.A05
            X.4XO r0 = r0.A04
            X.5wo r1 = r2.A04(r0, r1)
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L_0x003b
            r0 = 2131890225(0x7f121031, float:1.9415136E38)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110735ek.AWU(com.whatsapp.jid.UserJid, X.1lh, X.1lh, X.1lh, X.2HJ, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):void");
    }
}
