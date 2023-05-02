package X;

import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.jid.UserJid;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0ue  reason: invalid class name and case insensitive filesystem */
public class C17170ue {
    public String A00;
    public final C16040sK A01;
    public final C17030uP A02;
    public final C14710pd A03;
    public final C16490t9 A04;
    public final C20060zR A05;
    public final AnonymousClass00F A06;
    public final C16320sq A07;
    public final AtomicInteger A08 = new AtomicInteger();
    public final AtomicInteger A09 = new AtomicInteger();

    public C17170ue(C16040sK r2, C17030uP r3, C14710pd r4, C16490t9 r5, C20060zR r6, C16320sq r7) {
        this.A03 = r4;
        this.A01 = r2;
        this.A07 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = C16470t7.DEFAULT_SAMPLING_RATE;
    }

    public static C31481eG A00(C17170ue r2) {
        C31481eG r1 = new C31481eG();
        r1.A09 = r2.A00;
        r1.A04 = Integer.valueOf(r2.A08.get());
        return r1;
    }

    public C47802Kp A01() {
        return new C47802Kp(this.A08.get(), this.A00, (long) this.A09.getAndIncrement());
    }

    public void A02(int i2) {
        this.A00 = UUID.randomUUID().toString();
        this.A09.set(1);
        this.A08.set(i2);
    }

    public void A03(C31481eG r4) {
        this.A07.Acl(new RunnableRunnableShape3S0200000_I0_1(this, 16, r4));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.2RL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.2RI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.2RL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.2RL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.2RL} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(com.whatsapp.jid.UserJid r5, java.lang.Integer r6, java.lang.String r7, int r8) {
        /*
            r4 = this;
            r2 = 0
            X.0sK r0 = r4.A01
            boolean r0 = r0.A0I(r5)
            if (r0 == 0) goto L_0x003a
            X.2RI r1 = new X.2RI
            r1.<init>()
            r1.A02 = r6
            java.lang.String r0 = r4.A00
            r1.A06 = r0
            r1.A0A = r7
            r1.A04 = r2
            r1.A05 = r2
            r1.A09 = r2
            r1.A01 = r2
            r1.A00 = r2
            r1.A08 = r2
            r1.A0B = r2
            r1.A07 = r2
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A08
            int r0 = r0.get()
            if (r0 == 0) goto L_0x0034
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
        L_0x0034:
            X.0t9 r0 = r4.A04
            r0.A06(r1)
            return
        L_0x003a:
            X.0pd r3 = r4.A03
            r1 = 904(0x388, float:1.267E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x0051
            X.0sq r1 = r4.A07
            com.facebook.redex.RunnableRunnableShape0S1201000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1201000_I0
            r0.<init>(r4, r5, r7, r8)
            r1.Acl(r0)
            return
        L_0x0051:
            X.2RL r1 = new X.2RL
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.A05 = r0
            java.lang.String r0 = r4.A00
            r1.A0A = r0
            r1.A0E = r7
            r1.A06 = r2
            java.lang.String r0 = r5.getRawString()
            r1.A08 = r0
            r1.A07 = r2
            r1.A0D = r2
            r1.A02 = r2
            r1.A00 = r2
            r1.A0C = r2
            r1.A0F = r2
            r1.A0B = r2
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A08
            int r0 = r0.get()
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
        L_0x0086:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A01 = r0
            X.0uP r0 = r4.A02
            X.1Vq r0 = r0.A00(r5)
            int r0 = X.AnonymousClass2RK.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            r1.A0E = r2
            r1.A08 = r2
            r1.A0D = r2
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17170ue.A04(com.whatsapp.jid.UserJid, java.lang.Integer, java.lang.String, int):void");
    }

    public final void A05(UserJid userJid, Long l2, String str, String str2, String str3, int i2, int i3) {
        UserJid userJid2 = userJid;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i4 = i2;
        int i5 = i3;
        if (this.A03.A0E(C16620tM.A02, 904)) {
            this.A07.Acl(new AnonymousClass56Q(this, userJid2, l2, str4, str6, str5, i4, i5));
            return;
        }
        AnonymousClass2RL r1 = new AnonymousClass2RL();
        r1.A05 = Integer.valueOf(i4);
        r1.A09 = str;
        r1.A0A = str6;
        r1.A0E = str2;
        r1.A08 = userJid.getRawString();
        r1.A04 = i3 != 0 ? Integer.valueOf(i5) : null;
        r1.A01 = Boolean.FALSE;
        r1.A03 = Integer.valueOf(AnonymousClass2RK.A00(this.A02.A00(userJid)));
        r1.A0E = null;
        r1.A08 = null;
        r1.A0D = null;
        this.A04.A06(r1);
    }
}
