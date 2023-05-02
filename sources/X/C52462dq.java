package X;

import java.util.List;

/* renamed from: X.2dq  reason: invalid class name and case insensitive filesystem */
public final class C52462dq {
    public final int A00;
    public final C34861kz A01;
    public final List A02;
    public final boolean A03;

    public C52462dq(C34861kz r1, List list, int i2, boolean z2) {
        this.A01 = r1;
        this.A02 = list;
        this.A03 = z2;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3 == X.C34861kz.A01) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C52462dq A00(X.C34861kz r3, com.whatsapp.jid.UserJid r4, java.lang.String r5, int r6, boolean r7) {
        /*
            X.1kz r0 = X.C34861kz.A0D
            r2 = 1
            if (r3 == r0) goto L_0x000a
            X.1kz r1 = X.C34861kz.A01
            r0 = 0
            if (r3 != r1) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.AnonymousClass00B.A0G(r0)
            X.1qw r0 = new X.1qw
            r0.<init>(r4, r5)
            r0.A09 = r2
            r0.A0I = r2
            r0.A0G = r2
            r0.A08 = r2
            r0.A0C = r2
            r0.A0E = r7
            X.27f r0 = r0.A02()
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.2dq r0 = new X.2dq
            r0.<init>(r3, r1, r6, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52462dq.A00(X.1kz, com.whatsapp.jid.UserJid, java.lang.String, int, boolean):X.2dq");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[mode=");
        C34861kz r2 = this.A01;
        sb.append(r2.mode.modeString);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.append(" context=");
        sb2.append(r2.context.contextString);
        sb2.append(" requests=");
        sb2.append(this.A02.size());
        sb2.append("]");
        return sb2.toString();
    }
}
