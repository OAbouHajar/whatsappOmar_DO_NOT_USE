package X;

import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1i8  reason: invalid class name and case insensitive filesystem */
public class C33161i8 {
    public C33201iC A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();

    public C33161i8(MappedByteBuffer mappedByteBuffer, List list) {
        if (mappedByteBuffer != null) {
            this.A00 = new C33201iC(mappedByteBuffer, list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r11.put(r10, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(X.C33141i6 r15, java.lang.Object r16, int r17) {
        /*
            r14 = this;
            java.util.concurrent.ConcurrentHashMap r11 = r14.A01
            r2 = r17
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r11.get(r10)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r1 = 0
            if (r5 != 0) goto L_0x0067
            X.1iC r9 = r14.A00
            if (r9 == 0) goto L_0x0062
            monitor-enter(r9)
            android.util.SparseIntArray r0 = r9.A01     // Catch:{ all -> 0x005e }
            int r0 = r0.get(r2)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x001f
            goto L_0x0061
        L_0x001f:
            java.nio.MappedByteBuffer r8 = r9.A03     // Catch:{ all -> 0x005e }
            r8.position(r0)     // Catch:{ all -> 0x005e }
            int r0 = r8.position()     // Catch:{ all -> 0x005e }
            byte r7 = r8.get(r0)     // Catch:{ all -> 0x005e }
            int r12 = r0 + 1
            r0 = 6
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x005e }
            r6 = 0
            r4 = 0
        L_0x0033:
            if (r4 >= r7) goto L_0x0063
            byte r13 = r8.get(r12)     // Catch:{ all -> 0x005e }
            int r0 = r12 + 1
            int r1 = r9.A01(r0)     // Catch:{ all -> 0x005e }
            int r0 = r0 + 4
            int r3 = r9.A00(r0)     // Catch:{ all -> 0x005e }
            int r12 = r0 + 2
            byte[] r2 = new byte[r3]     // Catch:{ all -> 0x005e }
            int r0 = r9.A00     // Catch:{ all -> 0x005e }
            int r0 = r0 + r1
            r8.position(r0)     // Catch:{ all -> 0x005e }
            r8.get(r2, r6, r3)     // Catch:{ all -> 0x005e }
            java.nio.charset.Charset r1 = r9.A04     // Catch:{ all -> 0x005e }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x005e }
            r0.<init>(r2, r6, r3, r1)     // Catch:{ all -> 0x005e }
            r5[r13] = r0     // Catch:{ all -> 0x005e }
            int r4 = r4 + 1
            goto L_0x0033
        L_0x005e:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0061:
            monitor-exit(r9)
        L_0x0062:
            return r1
        L_0x0063:
            monitor-exit(r9)
            r11.put(r10, r5)
        L_0x0067:
            r0 = r16
            int r2 = r15.A04(r0)
            r1 = 1
            if (r2 == r1) goto L_0x0080
            r1 = 2
            if (r2 == r1) goto L_0x0080
            r1 = 4
            if (r2 == r1) goto L_0x0088
            r0 = 8
            if (r2 == r0) goto L_0x0080
            r0 = 16
            r1 = 5
            if (r2 == r0) goto L_0x0080
            r1 = 0
        L_0x0080:
            r0 = r5[r1]
            if (r0 != 0) goto L_0x0087
            r0 = 0
            r0 = r5[r0]
        L_0x0087:
            return r0
        L_0x0088:
            r1 = 3
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33161i8.A00(X.1i6, java.lang.Object, int):java.lang.String");
    }
}
