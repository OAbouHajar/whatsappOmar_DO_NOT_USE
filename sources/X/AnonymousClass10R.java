package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.10R  reason: invalid class name */
public class AnonymousClass10R {
    public final C16040sK A00;
    public final C15900s5 A01;
    public final C17030uP A02;
    public final C17120uZ A03;
    public final C15810rt A04;
    public final C17290uq A05;
    public final C18600wx A06;
    public final C14710pd A07;

    public AnonymousClass10R(C16040sK r1, C15900s5 r2, C17030uP r3, C17120uZ r4, C15810rt r5, C17290uq r6, C18600wx r7, C14710pd r8) {
        this.A07 = r8;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r7;
    }

    public void A00(C15840rx r4, boolean z2) {
        int i2 = r4.A06;
        if (i2 > 0) {
            int i3 = i2 - 1;
            synchronized (r4) {
                r4.A06 = i3;
            }
            if (!this.A07.A0E(C16620tM.A02, 1335) || z2) {
                int i4 = r4.A08 - 1;
                synchronized (r4) {
                    r4.A08 = i4;
                }
            }
        }
    }

    public boolean A01(int i2) {
        String A032;
        ArrayList arrayList;
        if (i2 >= 0) {
            if (i2 == 0) {
                return true;
            }
            C15900s5 r1 = this.A01;
            synchronized (C15910s6.class) {
                A032 = r1.A03(C15910s6.A29);
            }
            if (A032 == null) {
                A032 = "604800";
            }
            try {
                arrayList = new ArrayList();
                for (String valueOf : A032.split(",")) {
                    arrayList.add(Integer.valueOf(valueOf));
                }
            } catch (Exception unused) {
                arrayList = new ArrayList();
                for (String valueOf2 : "604800".split(",")) {
                    arrayList.add(Integer.valueOf(valueOf2));
                }
            }
            if (arrayList.contains(Integer.valueOf(i2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (X.C15840rx) r1.A0C().get(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(X.C15830rv r7) {
        /*
            r6 = this;
            X.0rt r1 = r6.A04
            boolean r0 = r1.A0I(r7)
            if (r0 != 0) goto L_0x001e
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C()
            java.lang.Object r0 = r0.get(r7)
            X.0rx r0 = (X.C15840rx) r0
            if (r0 == 0) goto L_0x001e
            long r3 = r0.A0L
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r0 = 1
        L_0x001d:
            return r0
        L_0x001e:
            X.0uq r0 = r6.A05
            long r4 = r0.A02(r7)
            r2 = 1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x001d
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10R.A02(X.0rv):boolean");
    }

    public final boolean A03(C15830rv r7, AnonymousClass1WV r8, Long l2, int i2, long j2) {
        if (!(r7 instanceof UserJid)) {
            return false;
        }
        if (r8 == null) {
            return true;
        }
        if (i2 == r8.expiration || l2 == null) {
            return false;
        }
        long longValue = l2.longValue();
        if (longValue > j2) {
            return false;
        }
        long j3 = r8.ephemeralSettingTimestamp;
        if (longValue != j3) {
            return longValue > j3;
        }
        UserJid of = UserJid.of(r7);
        AnonymousClass00B.A06(of);
        C16040sK r0 = this.A00;
        r0.A0B();
        AnonymousClass1ZT r02 = r0.A05;
        return r02 != null && of.compareTo((Jid) r02) < 0;
    }

    public boolean A04(C16740tZ r7) {
        C15840rx A062 = this.A04.A06(r7.A11.A00);
        if (A062 != null) {
            return r7.A14 <= A062.A0O;
        }
    }
}
