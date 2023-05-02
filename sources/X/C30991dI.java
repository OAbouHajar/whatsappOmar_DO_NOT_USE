package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1dI  reason: invalid class name and case insensitive filesystem */
public class C30991dI {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C16740tZ A08;
    public final C16440t3 A09;
    public final C14710pd A0A;
    public final UserJid A0B;

    public C30991dI(C16440t3 r3, C14710pd r4, UserJid userJid, int i2, int i3, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A0A = r4;
        this.A09 = r3;
        this.A0B = userJid;
        this.A04 = j2;
        this.A06 = j3;
        this.A07 = j4;
        this.A03 = j5;
        this.A02 = Math.max(j6, j5);
        this.A05 = j7;
        this.A01 = i2;
        this.A00 = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30991dI(X.C16440t3 r35, X.C30991dI r36, X.C14710pd r37) {
        /*
            r34 = this;
            r15 = r36
            com.whatsapp.jid.UserJid r14 = r15.A0B
            long r10 = r15.A04
            long r8 = r15.A06
            long r6 = r15.A07
            long r4 = r15.A03
            long r2 = r15.A02
            long r0 = r15.A05
            int r13 = r15.A01
            int r12 = r15.A00
            r16 = r34
            r17 = r35
            r18 = r37
            r32 = r0
            r30 = r2
            r28 = r4
            r26 = r6
            r24 = r8
            r21 = r12
            r22 = r10
            r19 = r14
            r20 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r24, r26, r28, r30, r32)
            X.0tZ r1 = r15.A08
            r0 = r16
            r0.A08 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30991dI.<init>(X.0t3, X.1dI, X.0pd):void");
    }

    public static void A00(C16740tZ r3) {
        StringBuilder sb = new StringBuilder("[id=");
        C28381Vw r1 = r3.A11;
        sb.append(r1.A01);
        sb.append(", from_me=");
        sb.append(r1.A02);
        sb.append(", remote_resource=");
        sb.append(r3.A0B());
        sb.append("]");
        sb.toString();
    }

    public synchronized int A01() {
        return this.A00;
    }

    public synchronized int A02() {
        return this.A01;
    }

    public synchronized long A03() {
        return this.A04;
    }

    public synchronized long A04() {
        return this.A05;
    }

    public synchronized C30991dI A05() {
        return new C30991dI(this.A09, this, this.A0A);
    }

    public synchronized C30991dI A06(C16740tZ r5) {
        this.A08 = r5;
        this.A04 = r5.A14;
        this.A05 = r5.A0I;
        this.A00++;
        if (this.A0A.A0E(C16620tM.A02, 2039) || !r5.A11.A02) {
            int i2 = this.A01 + 1;
            this.A01 = i2;
            if (i2 == 1) {
                this.A03 = this.A04;
            } else if (i2 <= 2) {
            }
            this.A02 = this.A04;
        } else {
            this.A01 = 0;
        }
        A00(r5);
        return A05();
    }

    public UserJid A07() {
        return this.A0B;
    }

    public synchronized void A08(int i2) {
        this.A00 = i2;
    }

    public synchronized void A09(long j2) {
        this.A02 = j2;
    }

    public synchronized void A0A(long j2) {
        this.A05 = j2;
    }

    public boolean A0B() {
        return this.A0B == C34091jg.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if ((r6.A09.A00() - r6.A05) <= 86400000) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0C() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.whatsapp.jid.UserJid r0 = r6.A0B     // Catch:{ all -> 0x001d }
            boolean r0 = X.C16030sJ.A0P(r0)     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001a
            X.0t3 r0 = r6.A09     // Catch:{ all -> 0x001d }
            long r4 = r0.A00()     // Catch:{ all -> 0x001d }
            long r0 = r6.A05     // Catch:{ all -> 0x001d }
            long r4 = r4 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            monitor-exit(r6)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30991dI.A0C():boolean");
    }

    public synchronized boolean A0D(C16740tZ r7) {
        boolean z2;
        z2 = false;
        if (r7.A14 > this.A06) {
            z2 = true;
        }
        return z2;
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("StatusInfo[jid=");
        sb.append(this.A0B);
        sb.append(", msgId=");
        sb.append(this.A04);
        sb.append(", lastRead=");
        sb.append(this.A06);
        sb.append(", lastSent=");
        sb.append(this.A07);
        sb.append(", firstUnread=");
        sb.append(this.A03);
        sb.append(", autoDownloadLimit=");
        sb.append(this.A02);
        sb.append(", ts=");
        sb.append(this.A05);
        sb.append(", unreadCount=");
        sb.append(this.A01);
        sb.append(", total=");
        sb.append(this.A00);
        sb.append(" ]");
        return sb.toString();
    }
}
