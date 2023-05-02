package X;

import com.obwhatsapp.bloks.BloksCameraOverlay;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.5nw  reason: invalid class name and case insensitive filesystem */
public class C114545nw extends C16690tT {
    public final int A00;
    public final int A01;
    public final C12380kI A02;
    public final C117875th A03;
    public final File A04;
    public final String A05;
    public final WeakReference A06;
    public final boolean A07;
    public final byte[] A08;

    public C114545nw(C12380kI r2, BloksCameraOverlay bloksCameraOverlay, C117875th r4, File file, String str, byte[] bArr, int i2, int i3, boolean z2) {
        this.A02 = r2;
        this.A08 = bArr;
        this.A07 = z2;
        this.A04 = file;
        this.A05 = str;
        this.A00 = i2;
        this.A01 = i3;
        this.A06 = new WeakReference(bloksCameraOverlay);
        this.A03 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014f, code lost:
        if (r1 == null) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014a A[SYNTHETIC, Splitter:B:46:0x014a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0134=Splitter:B:43:0x0134, B:39:0x011d=Splitter:B:39:0x011d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r23) {
        /*
            r22 = this;
            java.lang.String r12 = "BloksStorePictureTask/ Error closing file: "
            java.lang.String r0 = "BloksStorePictureTask/doInBackground start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r22
            X.0kI r0 = r3.A02
            java.lang.Object r0 = r0.get()
            r11 = 0
            if (r0 == 0) goto L_0x0178
            java.io.File r0 = r3.A04     // Catch:{ FileNotFoundException -> 0x0132, IOException -> 0x011b, all -> 0x0166 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0132, IOException -> 0x011b, all -> 0x0166 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0132, IOException -> 0x011b, all -> 0x0166 }
            byte[] r2 = r3.A08     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r1.write(r2)     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            java.lang.String r5 = r0.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            X.03o r4 = new X.03o     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r14 = 0
            int r5 = r4.A07(r14)     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r4 = 3
            if (r5 == r4) goto L_0x0040
            r4 = 6
            if (r5 == r4) goto L_0x003d
            r4 = 8
            r6 = 270(0x10e, float:3.78E-43)
            if (r5 == r4) goto L_0x0042
            r6 = 0
            goto L_0x0042
        L_0x003d:
            r6 = 90
            goto L_0x0042
        L_0x0040:
            r6 = 180(0xb4, float:2.52E-43)
        L_0x0042:
            java.lang.String r4 = r0.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeFile(r4)     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            android.graphics.Matrix r5 = new android.graphics.Matrix     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            float r4 = (float) r6     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r5.postRotate(r4)     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r16 = r13.getWidth()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r17 = r13.getHeight()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r19 = 1
            r15 = 0
            r18 = r5
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            boolean r4 = r3.A07     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            if (r4 == 0) goto L_0x00d3
            android.graphics.Matrix r7 = new android.graphics.Matrix     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r4 = r15.getWidth()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r4 = r4 >> 1
            float r8 = (float) r4     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r4 = r15.getHeight()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r4 = r4 >> 1
            float r6 = (float) r4     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.postScale(r5, r4, r8, r6)     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r18 = r15.getWidth()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r19 = r15.getHeight()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r21 = 1
            r16 = 0
            r17 = 0
            r20 = r7
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
        L_0x0096:
            int r5 = r3.A01     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r4 = r3.A00     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r9, r5, r4, r14)     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            java.lang.ref.WeakReference r4 = r3.A06     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            java.lang.Object r8 = r4.get()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            com.obwhatsapp.bloks.BloksCameraOverlay r8 = (com.obwhatsapp.bloks.BloksCameraOverlay) r8     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r7 = r8.A05     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r4 = r8.A04     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r7 = r7 - r4
            int r6 = r8.A02     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r4 = r8.A06     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r6 = r6 - r4
            r10.getWidth()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r10.getHeight()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r5 = r8.A04     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            int r4 = r8.A06     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r10, r5, r4, r7, r6)     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r10.recycle()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r15.recycle()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r9.recycle()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r10.recycle()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r13.recycle()     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            r4.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0119, IOException -> 0x0117 }
            goto L_0x00d5
        L_0x00d3:
            r9 = r15
            goto L_0x0096
        L_0x00d5:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            r7.<init>()     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            java.lang.String r1 = r3.A05     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            java.lang.String r0 = ".jpg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            if (r0 != 0) goto L_0x00f4
            java.lang.String r0 = ".jpeg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            if (r0 == 0) goto L_0x00f6
        L_0x00f4:
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
        L_0x00f6:
            r0 = 75
            r5.compress(r6, r0, r7)     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            byte[] r0 = r7.toByteArray()     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            r4.write(r0)     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            r4.write(r2)     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            java.lang.String r0 = "BloksStorePictureTask/doInBackground end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x0114, IOException -> 0x0111, all -> 0x010e }
            r4.close()     // Catch:{ IOException -> 0x0168 }
            return r11
        L_0x010e:
            r3 = move-exception
            r1 = r4
            goto L_0x0151
        L_0x0111:
            r3 = move-exception
            r1 = r4
            goto L_0x011d
        L_0x0114:
            r3 = move-exception
            r1 = r4
            goto L_0x0134
        L_0x0117:
            r3 = move-exception
            goto L_0x011d
        L_0x0119:
            r3 = move-exception
            goto L_0x0134
        L_0x011b:
            r3 = move-exception
            r1 = r11
        L_0x011d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x014e }
            java.lang.String r0 = "BloksStorePictureTask/ Error accessing file: "
            r2.append(r0)     // Catch:{ all -> 0x014e }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x014e }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)     // Catch:{ all -> 0x014e }
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x014e }
            goto L_0x0148
        L_0x0132:
            r3 = move-exception
            r1 = r11
        L_0x0134:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x014e }
            java.lang.String r0 = "BloksStorePictureTask/ File not found: "
            r2.append(r0)     // Catch:{ all -> 0x014e }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x014e }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)     // Catch:{ all -> 0x014e }
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x014e }
        L_0x0148:
            if (r1 == 0) goto L_0x0178
            r1.close()     // Catch:{ IOException -> 0x0168 }
            return r11
        L_0x014e:
            r3 = move-exception
            if (r1 == 0) goto L_0x0167
        L_0x0151:
            r1.close()     // Catch:{ IOException -> 0x0155 }
            throw r3
        L_0x0155:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r12)
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.e(r0, r2)
            throw r3
        L_0x0166:
            r3 = move-exception
        L_0x0167:
            throw r3
        L_0x0168:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r12)
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0178:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114545nw.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Log.i("BloksStorePictureTask/onPostExecute start");
        AnonymousClass4HD r2 = (AnonymousClass4HD) this.A02.get();
        if (r2 != null) {
            AnonymousClass5MV r1 = (AnonymousClass5MV) C62183Bz.A05(r2.A00, r2.A01);
            AnonymousClass00B.A06(r1);
            C119915zp r12 = (C119915zp) r1;
            r12.A0A = true;
            C119925zq.A01(r2, r12, this.A03);
        }
        Log.i("BloksStorePictureTask/onPostExecute end");
    }
}
