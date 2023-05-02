package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0wx  reason: invalid class name and case insensitive filesystem */
public class C18600wx {
    public final AnonymousClass027 A00 = new AnonymousClass027();
    public final C16040sK A01;
    public final C16000sG A02;
    public final C17030uP A03;
    public final C16440t3 A04;
    public final C224618a A05;
    public final AnonymousClass122 A06;

    public C18600wx(C16040sK r2, C16000sG r3, C17030uP r4, C16440t3 r5, C224618a r6, AnonymousClass122 r7) {
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
    }

    public int A00(UserJid userJid) {
        C16010sH A08;
        if (this.A01.A0I(userJid)) {
            return A04().intValue();
        }
        if (this.A03.A02(userJid) || (A08 = this.A02.A08(userJid)) == null) {
            return 0;
        }
        return A08.A00;
    }

    public long A01(UserJid userJid) {
        if (this.A01.A0I(userJid)) {
            return this.A05.A00().getLong("disappearing_mode_timestamp", 0);
        }
        C16010sH A08 = this.A02.A08(userJid);
        if (A08 == null) {
            return 0;
        }
        return A08.A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r1 <= (r0 == null ? 0 : r0.A00)) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.jid.UserJid A02(X.C15830rv r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.whatsapp.jid.UserJid
            r5 = 0
            if (r0 == 0) goto L_0x005f
            X.0uP r0 = r6.A03
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            boolean r0 = r0.A02(r7)
            if (r0 != 0) goto L_0x005f
            X.18a r4 = r6.A05
            android.content.SharedPreferences r1 = r4.A00()
            java.lang.String r3 = "disappearing_mode_duration_int"
            r0 = 0
            int r0 = r1.getInt(r3, r0)
            if (r0 == 0) goto L_0x0046
            X.0sG r2 = r6.A02
            X.0sH r0 = r2.A08(r7)
            if (r0 == 0) goto L_0x003b
            int r0 = r0.A00
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r0 = r6.A04()
            int r1 = r0.intValue()
            X.0sH r0 = r2.A08(r7)
            if (r0 != 0) goto L_0x0043
            r0 = 0
        L_0x0039:
            if (r1 > r0) goto L_0x0046
        L_0x003b:
            X.0sK r0 = r6.A01
            r0.A0B()
            X.1ZT r7 = r0.A05
            return r7
        L_0x0043:
            int r0 = r0.A00
            goto L_0x0039
        L_0x0046:
            X.0sK r0 = r6.A01
            boolean r0 = r0.A0I(r7)
            if (r0 == 0) goto L_0x005a
            android.content.SharedPreferences r1 = r4.A00()
            r0 = 0
            int r0 = r1.getInt(r3, r0)
        L_0x0057:
            if (r0 == 0) goto L_0x005f
            return r7
        L_0x005a:
            int r0 = r6.A00(r7)
            goto L_0x0057
        L_0x005f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18600wx.A02(X.0rv):com.whatsapp.jid.UserJid");
    }

    public C40281tr A03(C15830rv r14) {
        UserJid A022 = A02(r14);
        if (A022 == null) {
            return null;
        }
        int i2 = 2;
        if (this.A01.A0I(A022)) {
            i2 = 1;
        }
        AnonymousClass122 r7 = this.A06;
        UserJid of = UserJid.of(r14);
        AnonymousClass00B.A06(of);
        long A002 = this.A04.A00();
        int A003 = A00(A022);
        long A012 = A01(A022);
        C40281tr r1 = (C40281tr) AnonymousClass122.A00(r7.A00, r7.A03.A02(of, true), (C30641ci) null, 68, A002);
        r1.A00 = A003;
        r1.A0i(Long.valueOf(A012));
        r1.A00 = i2;
        return r1;
    }

    public Integer A04() {
        Integer num = (Integer) this.A00.A01();
        return num == null ? Integer.valueOf(this.A05.A00().getInt("disappearing_mode_duration_int", 0)) : num;
    }

    public void A05(int i2, long j2) {
        C224618a r2 = this.A05;
        r2.A00().edit().putInt("disappearing_mode_duration_int", i2).apply();
        r2.A00().edit().putLong("disappearing_mode_timestamp", j2).apply();
        this.A00.A09(Integer.valueOf(i2));
    }
}
