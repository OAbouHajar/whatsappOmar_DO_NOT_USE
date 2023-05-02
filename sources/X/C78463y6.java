package X;

import java.util.List;

/* renamed from: X.3y6  reason: invalid class name and case insensitive filesystem */
public class C78463y6 extends C616639u {
    public final List A00;

    public C78463y6(List list, int[] iArr, long j2) {
        super(iArr, list.size(), j2);
        this.A00 = list;
    }

    public int A00(int i2) {
        return AnonymousClass000.A0D(this.A00.get(i2));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.io.File r4) {
        /*
            r3 = this;
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002f }
            r1.<init>(r4)     // Catch:{ IOException -> 0x002f }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x002f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x002f }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x002f }
            r2.<init>(r0)     // Catch:{ IOException -> 0x002f }
            long r0 = r3.A01     // Catch:{ all -> 0x002a }
            r2.writeLong(r0)     // Catch:{ all -> 0x002a }
            r1 = 0
        L_0x0015:
            int r0 = r3.A00     // Catch:{ all -> 0x002a }
            if (r1 >= r0) goto L_0x0023
            int[] r0 = r3.A02     // Catch:{ all -> 0x002a }
            r0 = r0[r1]     // Catch:{ all -> 0x002a }
            r2.writeInt(r0)     // Catch:{ all -> 0x002a }
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0023:
            r2.flush()     // Catch:{ all -> 0x002a }
            r2.close()     // Catch:{ IOException -> 0x002f }
            return
        L_0x002a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = "ChunkStore/chunk store write failed"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78463y6.A07(java.io.File):void");
    }
}
