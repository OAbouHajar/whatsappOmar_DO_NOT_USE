package X;

import java.util.Map;

/* renamed from: X.3AB  reason: invalid class name */
public class AnonymousClass3AB {
    public int A00;
    public final Map A01;

    public AnonymousClass3AB(Map map, int i2) {
        this.A01 = map;
        this.A00 = i2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x008e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3AB A00(android.content.Context r14, X.AnonymousClass1AP r15, java.util.List r16) {
        /*
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r13 = r16.iterator()
            r4 = 0
            r12 = 0
            r11 = 0
            r10 = 0
        L_0x000d:
            boolean r0 = r13.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x00e4
            X.0tZ r6 = X.C13680ns.A0V(r13)
            boolean r1 = r6 instanceof X.C38681rF
            r5 = 0
            if (r1 != 0) goto L_0x00ae
            boolean r0 = r6 instanceof X.C38701rH
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r6 instanceof X.C38721rJ
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r6 instanceof X.C30581cc
            if (r0 == 0) goto L_0x000d
            r2 = r6
            X.1cc r2 = (X.C30581cc) r2
            X.2os r8 = X.C56872os.A00(r14, r5, r2)
            X.AnonymousClass00B.A00()
            X.0tz r0 = r15.A01
            android.content.Context r0 = r0.A00
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0M(r0)
            int r9 = r0.widthPixels
            float r1 = (float) r9
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r1 / r0
            int r1 = java.lang.Math.round(r1)
            X.C13690nt.A12(r8, r9, r1)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r9, r1, r0)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r7)
            r8.layout(r4, r4, r9, r1)
            r8.draw(r0)
            java.lang.String r0 = "share-"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
            X.1Vw r0 = r2.A11     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
            java.lang.String r0 = r0.A01     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
            java.lang.String r0 = X.C004101u.A03(r0)     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
            java.lang.String r0 = ".png"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
            X.0sb r0 = r15.A00     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
            java.io.File r9 = r0.A0N(r1)     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
            r2.<init>(r9)     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x008a }
            r0 = 75
            r7.compress(r1, r0, r2)     // Catch:{ all -> 0x008a }
            r2.flush()     // Catch:{ all -> 0x008a }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
            goto L_0x00c3
        L_0x008a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x008e }
        L_0x008e:
            throw r0     // Catch:{ FileNotFoundException -> 0x0094, IOException -> 0x008f }
        L_0x008f:
            r7.recycle()
            r9 = r5
            goto L_0x00c6
        L_0x0094:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "File not found: "
            r1.append(r0)     // Catch:{ all -> 0x00df }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x00df }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00df }
            r7.recycle()
            r9 = r5
            goto L_0x00c6
        L_0x00ae:
            r0 = r6
            X.0tY r0 = (X.C16730tY) r0
            X.0ta r0 = X.C16730tY.A00(r0)
            java.io.File r9 = r0.A0F
            if (r9 == 0) goto L_0x000d
            if (r1 != 0) goto L_0x00d4
            boolean r0 = r6 instanceof X.C38701rH
            if (r0 == 0) goto L_0x00c1
            r11 = 1
            goto L_0x00d5
        L_0x00c1:
            r10 = 1
            goto L_0x00d5
        L_0x00c3:
            r7.recycle()
        L_0x00c6:
            java.util.List r1 = r8.A0B
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x00d2
            java.lang.String r5 = X.AnonymousClass000.A0n(r1, r4)
        L_0x00d2:
            if (r9 == 0) goto L_0x000d
        L_0x00d4:
            r12 = 1
        L_0x00d5:
            X.4Is r0 = new X.4Is
            r0.<init>(r9, r5)
            r3.put(r6, r0)
            goto L_0x000d
        L_0x00df:
            r0 = move-exception
            r7.recycle()
            throw r0
        L_0x00e4:
            int r0 = r12 + r11
            int r0 = r0 + r10
            if (r0 <= r2) goto L_0x00f0
            r2 = 7
        L_0x00ea:
            X.3AB r0 = new X.3AB
            r0.<init>(r3, r2)
            return r0
        L_0x00f0:
            int r1 = r3.size()
            if (r12 == 0) goto L_0x00fa
            if (r1 == r2) goto L_0x00ea
            r2 = 4
            goto L_0x00ea
        L_0x00fa:
            if (r11 == 0) goto L_0x0102
            r0 = 1
            r2 = 5
            if (r1 != r0) goto L_0x00ea
            r2 = 2
            goto L_0x00ea
        L_0x0102:
            if (r10 == 0) goto L_0x010a
            r0 = 1
            r2 = 6
            if (r1 != r0) goto L_0x00ea
            r2 = 3
            goto L_0x00ea
        L_0x010a:
            X.3AB r0 = new X.3AB
            r0.<init>(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AB.A00(android.content.Context, X.1AP, java.util.List):X.3AB");
    }
}
