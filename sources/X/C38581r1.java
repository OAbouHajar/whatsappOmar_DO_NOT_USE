package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1r1  reason: invalid class name and case insensitive filesystem */
public class C38581r1 {
    public int A00;
    public long A01;
    public final UserJid A02;
    public transient boolean A03;

    public C38581r1(UserJid userJid, int i2, long j2) {
        this.A01 = j2;
        this.A02 = userJid;
        this.A00 = i2;
    }

    public synchronized long A00() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r6.A01 == -1) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A01() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A03     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            long r4 = r6.A01     // Catch:{ all -> 0x0011 }
            r2 = -1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r6)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38581r1.A01():boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C38581r1 r7 = (C38581r1) obj;
                if (!(this.A02.equals(r7.A02) && this.A01 == r7.A01 && this.A00 == r7.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((int) this.A01) + 31) * 31) + this.A02.hashCode()) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CallLogParticipant[rowId=");
        sb.append(this.A01);
        sb.append(", jid=");
        sb.append(this.A02);
        sb.append(", callResult=");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }
}
