package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Bz  reason: invalid class name and case insensitive filesystem */
public class C46012Bz {
    public final int A00;
    public final long A01;
    public final DeviceJid A02;
    public final UserJid A03;

    public C46012Bz(DeviceJid deviceJid, UserJid userJid, int i2, long j2) {
        this.A02 = deviceJid;
        this.A03 = userJid;
        this.A00 = i2;
        this.A01 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r6 == r7) goto L_0x003c
            r2 = 0
            if (r7 == 0) goto L_0x001a
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r0 = r7.getClass()
            if (r1 != r0) goto L_0x001a
            X.2Bz r7 = (X.C46012Bz) r7
            com.whatsapp.jid.UserJid r1 = r6.A03
            com.whatsapp.jid.UserJid r0 = r7.A03
            if (r1 != 0) goto L_0x001b
            if (r0 == 0) goto L_0x0022
        L_0x001a:
            return r2
        L_0x001b:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
            return r2
        L_0x0022:
            int r1 = r6.A00
            int r0 = r7.A00
            if (r1 != r0) goto L_0x003b
            long r3 = r6.A01
            long r1 = r7.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003b
            com.whatsapp.jid.DeviceJid r1 = r6.A02
            com.whatsapp.jid.DeviceJid r0 = r7.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            return r5
        L_0x003b:
            r5 = 0
        L_0x003c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46012Bz.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.A02.hashCode() + 31) * 31;
        UserJid userJid = this.A03;
        return (int) (((long) ((((hashCode + (userJid == null ? 0 : userJid.hashCode())) * 31) + this.A00) * 31)) + this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Device = ");
        sb.append(this.A02);
        sb.append(", recipient = ");
        sb.append(this.A03);
        sb.append(", status = ");
        sb.append(this.A00);
        sb.append(", timestamp = ");
        sb.append(this.A01);
        return sb.toString();
    }
}
