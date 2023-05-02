package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.2GG  reason: invalid class name */
public class AnonymousClass2GG {
    public final UserJid A00;
    public final String A01;

    public AnonymousClass2GG(UserJid userJid, String str) {
        this.A01 = str;
        this.A00 = userJid;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0022
            boolean r1 = r4 instanceof X.AnonymousClass2GG
            r0 = 0
            if (r1 == 0) goto L_0x0025
            X.2GG r4 = (X.AnonymousClass2GG) r4
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            boolean r0 = X.C34901l3.A00(r1, r0)
            if (r0 == 0) goto L_0x0023
            com.whatsapp.jid.UserJid r1 = r3.A00
            if (r1 == 0) goto L_0x0022
            com.whatsapp.jid.UserJid r0 = r4.A00
            if (r0 == 0) goto L_0x0022
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            return r2
        L_0x0023:
            r2 = 0
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2GG.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }
}
