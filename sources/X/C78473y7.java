package X;

/* renamed from: X.3y7  reason: invalid class name and case insensitive filesystem */
public class C78473y7 extends C616639u {
    public final int A00;
    public final long A01;

    public C78473y7(int[] iArr, int i2, long j2, long j3) {
        super(iArr, i2, j2);
        this.A01 = j3;
        this.A00 = i2;
    }

    public int A00(int i2) {
        int i3 = this.A00 - 1;
        long j2 = this.A01;
        if (i2 == i3) {
            j2 = Math.min(j2, this.A01 % j2);
        }
        return (int) j2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.io.File r4) {
        /*
            r3 = this;
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0039 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0039 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0039 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0039 }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0039 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0039 }
            long r0 = r3.A01     // Catch:{ all -> 0x0034 }
            r2.writeLong(r0)     // Catch:{ all -> 0x0034 }
            long r0 = r3.A01     // Catch:{ all -> 0x0034 }
            r2.writeLong(r0)     // Catch:{ all -> 0x0034 }
            int r0 = r3.A00     // Catch:{ all -> 0x0034 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0034 }
            r1 = 0
        L_0x001f:
            int r0 = r3.A00     // Catch:{ all -> 0x0034 }
            if (r1 >= r0) goto L_0x002d
            int[] r0 = r3.A02     // Catch:{ all -> 0x0034 }
            r0 = r0[r1]     // Catch:{ all -> 0x0034 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0034 }
            int r1 = r1 + 1
            goto L_0x001f
        L_0x002d:
            r2.flush()     // Catch:{ all -> 0x0034 }
            r2.close()     // Catch:{ IOException -> 0x0039 }
            return
        L_0x0034:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r1 = move-exception
            java.lang.String r0 = "ChunkStore/chunk store write failed"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78473y7.A07(java.io.File):void");
    }
}
