package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1xA  reason: invalid class name and case insensitive filesystem */
public class C42061xA {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public final File A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00d1 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7 A[Catch:{ Exception -> 0x00e3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C42061xA(java.io.File r13) {
        /*
            r12 = this;
            java.lang.String r10 = ") "
            java.lang.String r9 = ") or height ("
            java.lang.String r5 = " "
            r12.<init>()
            r12.A06 = r13
            X.C41911wr.A04(r13)     // Catch:{ IOException -> 0x000f }
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r12.A08 = r0
            if (r0 == 0) goto L_0x003b
            X.1ws r1 = X.C41911wr.A04(r13)     // Catch:{ Exception -> 0x0023 }
            int r0 = r1.A01     // Catch:{ Exception -> 0x0023 }
            r12.A03 = r0     // Catch:{ Exception -> 0x0023 }
            int r0 = r1.A00     // Catch:{ Exception -> 0x0023 }
            r12.A01 = r0     // Catch:{ Exception -> 0x0023 }
            return
        L_0x0023:
            r2 = move-exception
            java.lang.String r1 = "media_file not found: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            X.1xB r0 = new X.1xB
            r0.<init>()
            throw r0
        L_0x003b:
            X.1wq r3 = new X.1wq
            r3.<init>()
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x0179 }
            r3.setDataSource(r0)     // Catch:{ Exception -> 0x0179 }
            boolean r0 = com.whatsapp.GifHelper.A01(r13)     // Catch:{ all -> 0x01ec }
            r12.A07 = r0     // Catch:{ all -> 0x01ec }
            r0 = 9
            java.lang.String r8 = r3.extractMetadata(r0)     // Catch:{ all -> 0x01ec }
            r0 = 18
            java.lang.String r4 = r3.extractMetadata(r0)     // Catch:{ all -> 0x01ec }
            r0 = 19
            java.lang.String r2 = r3.extractMetadata(r0)     // Catch:{ all -> 0x01ec }
            long r6 = java.lang.Long.parseLong(r8)     // Catch:{ Exception -> 0x0145 }
            r12.A04 = r6     // Catch:{ Exception -> 0x0145 }
            r0 = 0
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x0115
            int r6 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x0078 }
            r12.A03 = r6     // Catch:{ Exception -> 0x0078 }
            int r6 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0078 }
            r12.A01 = r6     // Catch:{ Exception -> 0x0078 }
            goto L_0x00c5
        L_0x0078:
            r8 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ec }
            r11.<init>()     // Catch:{ all -> 0x01ec }
            java.lang.String r6 = "videometa/cannot parse width ("
            r11.append(r6)     // Catch:{ all -> 0x01ec }
            r11.append(r4)     // Catch:{ all -> 0x01ec }
            r11.append(r9)     // Catch:{ all -> 0x01ec }
            r11.append(r2)     // Catch:{ all -> 0x01ec }
            r11.append(r10)     // Catch:{ all -> 0x01ec }
            java.io.File r6 = r12.A06     // Catch:{ all -> 0x01ec }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x01ec }
            r11.append(r6)     // Catch:{ all -> 0x01ec }
            r11.append(r5)     // Catch:{ all -> 0x01ec }
            java.io.File r6 = r12.A06     // Catch:{ all -> 0x01ec }
            long r6 = r6.length()     // Catch:{ all -> 0x01ec }
            r11.append(r6)     // Catch:{ all -> 0x01ec }
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x01ec }
            com.whatsapp.util.Log.w(r6, r8)     // Catch:{ all -> 0x01ec }
            r6 = 0
            android.graphics.Bitmap r6 = r3.getFrameAtTime(r0)     // Catch:{ Exception | NoSuchMethodError -> 0x00b1 }
        L_0x00b1:
            if (r6 == 0) goto L_0x00e7
            int r0 = r6.getWidth()     // Catch:{ all -> 0x01ec }
            r12.A03 = r0     // Catch:{ all -> 0x01ec }
            int r1 = r6.getHeight()     // Catch:{ all -> 0x01ec }
            r12.A01 = r1     // Catch:{ all -> 0x01ec }
            int r0 = r12.A03     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x01b3
            if (r1 == 0) goto L_0x01b3
        L_0x00c5:
            r0 = 20
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch:{ Exception -> 0x00d1 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00d1 }
            r12.A00 = r0     // Catch:{ Exception -> 0x00d1 }
        L_0x00d1:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00e3 }
            r0 = 17
            if (r1 < r0) goto L_0x00e3
            r0 = 24
            java.lang.String r0 = r3.extractMetadata(r0)     // Catch:{ Exception -> 0x00e3 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00e3 }
            r12.A02 = r0     // Catch:{ Exception -> 0x00e3 }
        L_0x00e3:
            r3.close()
            return
        L_0x00e7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ec }
            r2.<init>()     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = "videometa/cannot get frame"
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            java.io.File r0 = r12.A06     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x01ec }
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            r2.append(r5)     // Catch:{ all -> 0x01ec }
            java.io.File r0 = r12.A06     // Catch:{ all -> 0x01ec }
            long r0 = r0.length()     // Catch:{ all -> 0x01ec }
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01ec }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01ec }
            X.1xB r0 = new X.1xB     // Catch:{ all -> 0x01ec }
            r0.<init>()     // Catch:{ all -> 0x01ec }
            goto L_0x01eb
        L_0x0115:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ec }
            r2.<init>()     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = "videometa/no duration:"
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            r2.append(r8)     // Catch:{ all -> 0x01ec }
            r2.append(r5)     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ all -> 0x01ec }
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            r2.append(r5)     // Catch:{ all -> 0x01ec }
            long r0 = r13.length()     // Catch:{ all -> 0x01ec }
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01ec }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01ec }
            X.1xB r0 = new X.1xB     // Catch:{ all -> 0x01ec }
            r0.<init>()     // Catch:{ all -> 0x01ec }
            goto L_0x01eb
        L_0x0145:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ec }
            r2.<init>()     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = "videometa/cannot parse duration:"
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            r2.append(r8)     // Catch:{ all -> 0x01ec }
            r2.append(r5)     // Catch:{ all -> 0x01ec }
            java.io.File r0 = r12.A06     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x01ec }
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            r2.append(r5)     // Catch:{ all -> 0x01ec }
            java.io.File r0 = r12.A06     // Catch:{ all -> 0x01ec }
            long r0 = r0.length()     // Catch:{ all -> 0x01ec }
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01ec }
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x01ec }
            X.1xB r0 = new X.1xB     // Catch:{ all -> 0x01ec }
            r0.<init>()     // Catch:{ all -> 0x01ec }
            goto L_0x01eb
        L_0x0179:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ec }
            r2.<init>()     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = "videometa/cannot process file:"
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            java.io.File r0 = r12.A06     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x01ec }
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            r2.append(r5)     // Catch:{ all -> 0x01ec }
            java.io.File r0 = r12.A06     // Catch:{ all -> 0x01ec }
            long r0 = r0.length()     // Catch:{ all -> 0x01ec }
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            r2.append(r5)     // Catch:{ all -> 0x01ec }
            java.io.File r0 = r12.A06     // Catch:{ all -> 0x01ec }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01ec }
            r2.append(r0)     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01ec }
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x01ec }
            X.1xB r0 = new X.1xB     // Catch:{ all -> 0x01ec }
            r0.<init>()     // Catch:{ all -> 0x01ec }
            goto L_0x01eb
        L_0x01b3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ec }
            r6.<init>()     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = "videometa/bad width ("
            r6.append(r0)     // Catch:{ all -> 0x01ec }
            r6.append(r4)     // Catch:{ all -> 0x01ec }
            r6.append(r9)     // Catch:{ all -> 0x01ec }
            r6.append(r2)     // Catch:{ all -> 0x01ec }
            r6.append(r10)     // Catch:{ all -> 0x01ec }
            java.io.File r0 = r12.A06     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x01ec }
            r6.append(r0)     // Catch:{ all -> 0x01ec }
            r6.append(r5)     // Catch:{ all -> 0x01ec }
            java.io.File r0 = r12.A06     // Catch:{ all -> 0x01ec }
            long r0 = r0.length()     // Catch:{ all -> 0x01ec }
            r6.append(r0)     // Catch:{ all -> 0x01ec }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x01ec }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01ec }
            X.1xB r0 = new X.1xB     // Catch:{ all -> 0x01ec }
            r0.<init>()     // Catch:{ all -> 0x01ec }
        L_0x01eb:
            throw r0     // Catch:{ all -> 0x01ec }
        L_0x01ec:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x01f0 }
        L_0x01f0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42061xA.<init>(java.io.File):void");
    }

    public int A00() {
        int i2 = this.A00;
        if (i2 != 0) {
            return i2;
        }
        long j2 = this.A04;
        if (j2 != 0) {
            return (int) ((this.A06.length() * 8000) / j2);
        }
        return 0;
    }

    public int A01() {
        if (Build.VERSION.SDK_INT < 17 && !this.A05) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                int i2 = AnonymousClass1QS.A04(this.A06, true).A05;
                this.A02 = i2;
                StringBuilder sb = new StringBuilder();
                sb.append("mediafileutils/VideoMeta/getRotation rotation=");
                sb.append(i2);
                sb.append(" rotationExtractionTime=");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.w(sb.toString());
                this.A05 = true;
            } catch (Exception unused) {
            }
        }
        return this.A02;
    }

    public boolean A02() {
        return Math.abs(A01() % 180) == 90;
    }
}
