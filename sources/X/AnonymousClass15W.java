package X;

import android.text.TextUtils;

/* renamed from: X.15W  reason: invalid class name */
public class AnonymousClass15W {
    public String[] A00;
    public final C16000sG A01;
    public final AnonymousClass013 A02;
    public final C14710pd A03;

    public AnonymousClass15W(C16000sG r1, AnonymousClass013 r2, C14710pd r3) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
    }

    public boolean A00() {
        C14710pd r2 = this.A03;
        C16620tM r1 = C16620tM.A02;
        if (r2.A0E(r1, 233)) {
            String A06 = r2.A06(r1, 379);
            if (!TextUtils.isEmpty(A06)) {
                String A062 = this.A02.A06();
                String[] split = A06.split(",");
                int length = split.length;
                int i2 = 0;
                while (i2 < length) {
                    if (!split[i2].equals(A062)) {
                        i2++;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A01(com.whatsapp.jid.Jid r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r7 instanceof X.C15830rv     // Catch:{ all -> 0x005b }
            r5 = 0
            if (r0 == 0) goto L_0x0059
            X.0rv r7 = (X.C15830rv) r7     // Catch:{ all -> 0x005b }
            boolean r0 = X.C16030sJ.A0L(r7)     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0017
            X.0sG r0 = r6.A01     // Catch:{ all -> 0x005b }
            X.0sH r0 = r0.A0A(r7)     // Catch:{ all -> 0x005b }
            boolean r0 = r0.A0a     // Catch:{ all -> 0x005b }
            goto L_0x0057
        L_0x0017:
            boolean r0 = r7 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0059
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7     // Catch:{ all -> 0x005b }
            java.lang.String[] r4 = r6.A00     // Catch:{ all -> 0x005b }
            if (r4 != 0) goto L_0x0035
            X.0pd r2 = r6.A03     // Catch:{ all -> 0x005b }
            r1 = 1031(0x407, float:1.445E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x005b }
            java.lang.String r1 = r2.A06(r0, r1)     // Catch:{ all -> 0x005b }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0039
            java.lang.String[] r4 = new java.lang.String[r5]     // Catch:{ all -> 0x005b }
        L_0x0033:
            r6.A00 = r4     // Catch:{ all -> 0x005b }
        L_0x0035:
            java.lang.String r3 = r7.user     // Catch:{ all -> 0x005b }
            int r2 = r4.length     // Catch:{ all -> 0x005b }
            goto L_0x0040
        L_0x0039:
            java.lang.String r0 = ","
            java.lang.String[] r4 = r1.split(r0)     // Catch:{ all -> 0x005b }
            goto L_0x0033
        L_0x0040:
            if (r5 >= r2) goto L_0x0056
            r1 = r4[r5]     // Catch:{ all -> 0x005b }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0051
            boolean r0 = r3.startsWith(r1)     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            int r5 = r5 + 1
            goto L_0x0040
        L_0x0054:
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            monitor-exit(r6)
            return r0
        L_0x0059:
            monitor-exit(r6)
            return r5
        L_0x005b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15W.A01(com.whatsapp.jid.Jid):boolean");
    }
}
