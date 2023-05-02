package X;

import java.io.File;
import java.util.HashMap;

/* renamed from: X.1Md  reason: invalid class name and case insensitive filesystem */
public class C26051Md extends C26061Me {
    public final HashMap A00 = new HashMap();

    public C26051Md(C16300so r2, C17130ua r3, C18260wP r4, C16440t3 r5, C16980tz r6, C17120uZ r7, C15860rz r8, C26041Mc r9, C14710pd r10, C16490t9 r11, C19950zG r12, C213013o r13, C17670vS r14, C16320sq r15) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
    }

    public synchronized HashMap A0D() {
        HashMap hashMap;
        AnonymousClass20T A02;
        String[] list;
        hashMap = this.A00;
        if (hashMap.isEmpty() && (A02 = A02()) != null) {
            String A022 = A02.A02();
            File filesDir = this.A08.A00.getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append("downloadable/filter_");
            sb.append(A022);
            File file = new File(filesDir, sb.toString());
            if (!file.exists() || (list = file.list()) == null) {
                A05();
            } else {
                String absolutePath = file.getAbsolutePath();
                for (String str : list) {
                    hashMap.put(str, new File(absolutePath, str));
                }
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007b A[SYNTHETIC, Splitter:B:40:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0E(X.AnonymousClass20Z r6, int r7) {
        /*
            r5 = this;
            r4 = r5
            monitor-enter(r4)
            r0 = -1
            int r3 = r5.A01(r0)     // Catch:{ all -> 0x008d }
            r1 = 5
            r2 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 == r2) goto L_0x0039
            r0 = 2
            if (r3 == r0) goto L_0x0049
            r0 = 3
            if (r3 == r0) goto L_0x0039
            r0 = 4
            if (r3 == r0) goto L_0x0049
            if (r3 == r1) goto L_0x0079
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            r2.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "FilterManager/getFilesAsync/Unexpected state "
            r2.append(r0)     // Catch:{ all -> 0x008d }
            java.util.HashMap r1 = X.C26061Me.A0J     // Catch:{ all -> 0x008d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x008d }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x008d }
            r2.append(r0)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x008d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x008d }
            goto L_0x0062
        L_0x0039:
            java.util.HashMap r1 = X.C26061Me.A0J     // Catch:{ all -> 0x008d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x008d }
            r1.get(r0)     // Catch:{ all -> 0x008d }
            if (r6 == 0) goto L_0x0089
            r0 = -1
            r5.A09(r6, r0)     // Catch:{ all -> 0x008b }
            goto L_0x0089
        L_0x0049:
            boolean r0 = r5.A0F()     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0075
            if (r7 != 0) goto L_0x0068
            X.0rz r1 = r5.A0A     // Catch:{ all -> 0x008d }
            X.0wP r0 = r5.A06     // Catch:{ all -> 0x008d }
            int r0 = r0.A04(r2)     // Catch:{ all -> 0x008d }
            int r0 = X.AnonymousClass20B.A00(r1, r0)     // Catch:{ all -> 0x008d }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0062
            goto L_0x0068
        L_0x0062:
            if (r6 == 0) goto L_0x0089
            r6.AQQ()     // Catch:{ all -> 0x008d }
            goto L_0x0089
        L_0x0068:
            r0 = -1
            r5.A08(r2, r0)     // Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x0071
            r5.A09(r6, r0)     // Catch:{ all -> 0x008b }
        L_0x0071:
            r5.A07(r7, r0)     // Catch:{ all -> 0x008d }
            goto L_0x0089
        L_0x0075:
            r0 = -1
            r5.A08(r1, r0)     // Catch:{ all -> 0x008b }
        L_0x0079:
            if (r6 == 0) goto L_0x0089
            boolean r0 = r5.A0F()     // Catch:{ all -> 0x008d }
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x008d }
            java.util.HashMap r0 = r5.A0D()     // Catch:{ all -> 0x008d }
            r6.AVi(r0)     // Catch:{ all -> 0x008d }
        L_0x0089:
            monitor-exit(r4)
            return
        L_0x008b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26051Md.A0E(X.20Z, int):void");
    }

    public synchronized boolean A0F() {
        return !A0D().isEmpty();
    }
}
