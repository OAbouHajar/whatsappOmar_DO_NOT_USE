package X;

import java.util.Arrays;

/* renamed from: X.2Vg  reason: invalid class name and case insensitive filesystem */
public class C49722Vg extends AnonymousClass1WN {
    public boolean A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C49722Vg(X.AnonymousClass1WN r15) {
        /*
            r14 = this;
            com.whatsapp.jid.DeviceJid r2 = r15.A06
            X.1p8 r3 = r15.A07
            java.lang.String r4 = r15.A08
            long r7 = r15.A00
            long r9 = r15.A04
            long r11 = r15.A01
            int r6 = r15.A03
            boolean r13 = r15.A09
            java.lang.String r5 = r15.A02
            X.1cN r1 = r15.A05
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49722Vg.<init>(X.1WN):void");
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && this.A00 == ((C49722Vg) obj).A00;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Boolean.valueOf(this.A00)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", isSyncing: ");
        sb.append(this.A00);
        return sb.toString();
    }
}
