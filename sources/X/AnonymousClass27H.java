package X;

import com.facebook.redex.IDxCallableShape148S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import java.util.HashSet;

/* renamed from: X.27H  reason: invalid class name */
public class AnonymousClass27H {
    public final C16440t3 A00;
    public final C15860rz A01;
    public final C208211s A02;
    public final AnonymousClass16P A03;
    public final C19410yO A04;
    public final C16320sq A05;

    public AnonymousClass27H(C16440t3 r1, C15860rz r2, C208211s r3, AnonymousClass16P r4, C19410yO r5, C16320sq r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
    }

    public static AnonymousClass27I A00(int i2, int i3, long j2) {
        C28581Wr A0U = AnonymousClass27I.A04.A0U();
        A0U.A03();
        AnonymousClass27I r1 = (AnonymousClass27I) A0U.A00;
        r1.A00 |= 1;
        r1.A02 = i2;
        A0U.A03();
        AnonymousClass27I r12 = (AnonymousClass27I) A0U.A00;
        r12.A00 |= 4;
        r12.A01 = i3;
        A0U.A03();
        AnonymousClass27I r13 = (AnonymousClass27I) A0U.A00;
        r13.A00 |= 2;
        r13.A03 = j2;
        return (AnonymousClass27I) A0U.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r5 != 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01() {
        /*
            r13 = this;
            X.0rz r0 = r13.A01
            X.01D r0 = r0.A01
            java.lang.Object r3 = r0.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "adv_timestamp_sec"
            r0 = -1
            long r7 = r3.getLong(r2, r0)
            X.0t3 r9 = r13.A00
            long r4 = r9.A01
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            long r5 = r9.A01
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 + r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
        L_0x0027:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r0
            long r3 = r9.A01()
            long r3 = r3 / r0
            r1 = 1
            long r1 = r1 + r7
            r11 = 86400(0x15180, double:4.26873E-319)
            long r9 = r5 + r11
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            java.lang.String r0 = "CompanionDeviceAdvUtil/getTimestampSec invalid ts lastTs="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = "; ntpTs="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; serverTs="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = -1
            return r0
        L_0x005f:
            long r5 = java.lang.System.currentTimeMillis()
            goto L_0x0027
        L_0x0064:
            long r7 = r3 - r5
            long r7 = java.lang.Math.abs(r7)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x006f
            r5 = r3
        L_0x006f:
            long r0 = java.lang.Math.max(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27H.A01():long");
    }

    public AnonymousClass27J A02(AnonymousClass27I r7) {
        C19410yO r1 = this.A04;
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(!r1.A07.A0G() ? 0 : r1.A0D.A01()));
        C28031Ub it = r1.A0I.A01().values().iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((AnonymousClass1WN) it.next()).A03));
        }
        hashSet.add(Integer.valueOf(r7.A01));
        C28581Wr A0U = AnonymousClass27J.A06.A0U();
        int i2 = r7.A02;
        A0U.A03();
        AnonymousClass27J r12 = (AnonymousClass27J) A0U.A00;
        r12.A00 |= 1;
        r12.A02 = i2;
        int i3 = r7.A01;
        A0U.A03();
        AnonymousClass27J r13 = (AnonymousClass27J) A0U.A00;
        r13.A00 |= 4;
        r13.A01 = i3;
        long j2 = r7.A03;
        A0U.A03();
        AnonymousClass27J r14 = (AnonymousClass27J) A0U.A00;
        r14.A00 |= 2;
        r14.A04 = j2;
        A0U.A03();
        AnonymousClass27J r2 = (AnonymousClass27J) A0U.A00;
        AnonymousClass27P r15 = r2.A05;
        if (!((AnonymousClass1XF) r15).A00) {
            r15 = C28541Wm.A0F(r15);
            r2.A05 = r15;
        }
        C28591Ws.A01(hashSet, r15);
        return (AnonymousClass27J) A0U.A02();
    }

    public AnonymousClass27K A03(AnonymousClass27J r6) {
        C36431nX r0 = (C36431nX) this.A03.A00.submit(new IDxCallableShape148S0100000_2_I0(this, 8)).get();
        AnonymousClass00B.A06(r0);
        C36671nv r4 = r0.A00;
        byte[] A042 = C28641Wx.A04(AnonymousClass01S.A0D, r6.A02());
        C28581Wr A0U = AnonymousClass27K.A03.A0U();
        byte[] A06 = C28851Ya.A06(r4, A042);
        C28631Ww A012 = C28631Ww.A01(A06, 0, A06.length);
        A0U.A03();
        AnonymousClass27K r1 = (AnonymousClass27K) A0U.A00;
        r1.A00 |= 2;
        r1.A01 = A012;
        C28631Ww A002 = r6.A00();
        A0U.A03();
        AnonymousClass27K r12 = (AnonymousClass27K) A0U.A00;
        r12.A00 |= 1;
        r12.A02 = A002;
        return (AnonymousClass27K) A0U.A02();
    }

    public void A04() {
        this.A01.A0K().putLong("adv_timestamp_sec", -1).apply();
        this.A05.Acl(new RunnableRunnableShape6S0100000_I0_5(this, 4));
    }

    public void A05(long j2) {
        C15860rz r4 = this.A01;
        r4.A0K().remove("adv_key_index_list_update_retry_count").apply();
        r4.A0K().remove("adv_key_index_list_last_failure_time").apply();
        r4.A0K().putLong("adv_key_index_list_last_update_time", this.A00.A00()).apply();
        r4.A0K().remove("adv_key_index_list_require_update").apply();
        if (j2 > 0) {
            r4.A0K().putLong("adv_timestamp_sec", j2).apply();
        }
    }
}
