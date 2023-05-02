package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: X.152  reason: invalid class name */
public class AnonymousClass152 {
    public final C16040sK A00;
    public final C17230uk A01;
    public final AnonymousClass120 A02;
    public final C16260sj A03;
    public final AnonymousClass12B A04;
    public final C16320sq A05;

    public AnonymousClass152(C16040sK r1, C17230uk r2, AnonymousClass120 r3, C16260sj r4, AnonymousClass12B r5, C16320sq r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00d3 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:54:0x00d3=Splitter:B:54:0x00d3, B:47:0x00c9=Splitter:B:47:0x00c9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A00(android.content.Context r16, X.C16010sH r17, float r18, int r19) {
        /*
            r15 = this;
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            r6 = r17
            com.whatsapp.jid.Jid r7 = r6.A08(r0)
            r12 = r19
            float r2 = (float) r12
            r11 = 0
            android.content.res.Resources r0 = r16.getResources()     // Catch:{ OutOfMemoryError -> 0x00d5 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ OutOfMemoryError -> 0x00d5 }
            float r1 = r0.density     // Catch:{ OutOfMemoryError -> 0x00d5 }
            r0 = 1119879168(0x42c00000, float:96.0)
            float r1 = r1 * r0
            r9 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r10 = 0
            if (r0 < 0) goto L_0x0020
            r10 = 1
        L_0x0020:
            r5 = r15
            if (r7 == 0) goto L_0x0076
            boolean r0 = r6.A0J()     // Catch:{ OutOfMemoryError -> 0x00d5 }
            if (r0 == 0) goto L_0x0031
            X.0rv r0 = r6.A0E     // Catch:{ OutOfMemoryError -> 0x00d5 }
            boolean r0 = X.C16030sJ.A0R(r0)     // Catch:{ OutOfMemoryError -> 0x00d5 }
            if (r0 == 0) goto L_0x0049
        L_0x0031:
            boolean r0 = r6.A0J()     // Catch:{ OutOfMemoryError -> 0x00d5 }
            if (r0 != 0) goto L_0x0076
            X.0rv r0 = r6.A0E     // Catch:{ OutOfMemoryError -> 0x00d5 }
            boolean r0 = X.C16030sJ.A0G(r0)     // Catch:{ OutOfMemoryError -> 0x00d5 }
            if (r0 != 0) goto L_0x0076
            boolean r0 = X.C16030sJ.A0P(r7)     // Catch:{ OutOfMemoryError -> 0x00d5 }
            if (r0 != 0) goto L_0x0076
            boolean r0 = r6.A0i     // Catch:{ OutOfMemoryError -> 0x00d5 }
            if (r0 == 0) goto L_0x0076
        L_0x0049:
            if (r10 == 0) goto L_0x004e
            int r8 = r6.A04     // Catch:{ OutOfMemoryError -> 0x00d5 }
            goto L_0x0050
        L_0x004e:
            int r8 = r6.A05     // Catch:{ OutOfMemoryError -> 0x00d5 }
        L_0x0050:
            X.0sK r1 = r15.A00     // Catch:{ OutOfMemoryError -> 0x00d5 }
            X.0rv r0 = r6.A0E     // Catch:{ OutOfMemoryError -> 0x00d5 }
            boolean r0 = r1.A0I(r0)     // Catch:{ OutOfMemoryError -> 0x00d5 }
            if (r0 != 0) goto L_0x007b
            boolean r0 = r6 instanceof X.C34721kl     // Catch:{ OutOfMemoryError -> 0x00d5 }
            if (r0 != 0) goto L_0x007b
            long r0 = r6.A0A     // Catch:{ OutOfMemoryError -> 0x00d5 }
            r2 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 + r2
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ OutOfMemoryError -> 0x00d5 }
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x007b
        L_0x006c:
            X.0sq r0 = r15.A05     // Catch:{ OutOfMemoryError -> 0x00d5 }
            com.facebook.redex.RunnableRunnableShape0S0311000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S0311000_I0     // Catch:{ OutOfMemoryError -> 0x00d5 }
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (int) r8, (int) r9, (boolean) r10)     // Catch:{ OutOfMemoryError -> 0x00d5 }
            r0.Acl(r4)     // Catch:{ OutOfMemoryError -> 0x00d5 }
        L_0x0076:
            boolean r0 = r6.A0Z     // Catch:{ OutOfMemoryError -> 0x00d5 }
            if (r0 == 0) goto L_0x00d4
            goto L_0x007e
        L_0x007b:
            if (r8 == 0) goto L_0x006c
            goto L_0x0076
        L_0x007e:
            java.io.InputStream r3 = r15.A02(r6, r10)     // Catch:{ IOException -> 0x00d4 }
            if (r3 != 0) goto L_0x0087
            r6.A0Z = r9     // Catch:{ all -> 0x00cd }
            return r11
        L_0x0087:
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00cd }
            r10.<init>()     // Catch:{ all -> 0x00cd }
            r0 = 1
            r10.inDither = r0     // Catch:{ all -> 0x00cd }
            r10.inScaled = r9     // Catch:{ all -> 0x00cd }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00cd }
            r10.inPreferredConfig = r0     // Catch:{ all -> 0x00cd }
            r14 = 1
            X.25c r9 = new X.25c     // Catch:{ all -> 0x00cd }
            r13 = r12
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00cd }
            r0 = 0
            X.25d r0 = X.C37741pe.A04(r11, r9, r3, r0)     // Catch:{ all -> 0x00cd }
            android.graphics.Bitmap r0 = r0.A02     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x00a6
            goto L_0x00ad
        L_0x00a6:
            r1 = r18
            android.graphics.Bitmap r2 = X.C17200uh.A00(r0, r1, r12)     // Catch:{ all -> 0x00cd }
            goto L_0x00ae
        L_0x00ad:
            r2 = r11
        L_0x00ae:
            if (r2 != 0) goto L_0x00c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r1.<init>()     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = "contactPhotosBitmapManager/getphotofast/"
            r1.append(r0)     // Catch:{ all -> 0x00cd }
            r1.append(r7)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = " decodeStream returns null"
            r1.append(r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00cd }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00cd }
        L_0x00c9:
            r3.close()     // Catch:{ IOException -> 0x00d4 }
            return r2
        L_0x00cd:
            r0 = move-exception
            if (r3 == 0) goto L_0x00d3
            r3.close()     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            throw r0     // Catch:{ IOException -> 0x00d4 }
        L_0x00d4:
            return r11
        L_0x00d5:
            r1 = move-exception
            java.lang.String r0 = "contactPhotosBitmapManager/getphotofast/out-of-memory "
            com.whatsapp.util.Log.e(r0, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass152.A00(android.content.Context, X.0sH, float, int):android.graphics.Bitmap");
    }

    public Bitmap A01(Context context, C16010sH r6, float f2, int i2) {
        AnonymousClass120 r0 = this.A02;
        String A0C = r6.A0C(f2, i2);
        C23651Cv r3 = r0.A02;
        Bitmap bitmap = (Bitmap) r3.A01().A00(A0C);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap A002 = A00(context, r6, f2, i2);
        if (A002 != null) {
            r3.A01().A03(r6.A0C(f2, i2), A002);
        }
        return A002;
    }

    public InputStream A02(C16010sH r6, boolean z2) {
        File A012;
        if (!r6.A0Z) {
            return null;
        }
        AnonymousClass120 r1 = this.A02;
        if (z2) {
            A012 = r1.A00(r6);
            if (A012 == null || !A012.exists()) {
                A012 = r1.A01(r6);
                if (r6.A04 > 0 && this.A03.A0F(Environment.getExternalStorageState())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("contactPhotosBitmapManager/getphotostream/");
                    sb.append(r6.A0E);
                    sb.append(" full file missing id:");
                    sb.append(r6.A04);
                    Log.e(sb.toString());
                    r6.A04 = 0;
                }
            }
        } else {
            A012 = r1.A01(r6);
            if (A012 == null || !A012.exists()) {
                A012 = r1.A00(r6);
                if (r6.A05 > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("contactPhotosBitmapManager/getphotostream/");
                    sb2.append(r6.A0E);
                    sb2.append(" thumb file missing id:");
                    sb2.append(r6.A05);
                    Log.e(sb2.toString());
                    r6.A05 = 0;
                }
            }
        }
        if (A012 == null || !A012.exists()) {
            return null;
        }
        try {
            return new FileInputStream(A012);
        } catch (FileNotFoundException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("contactPhotosBitmapManager/getphotostream/");
            sb3.append(r6.A0E);
            sb3.append(" photo file not found");
            Log.e(sb3.toString(), e2);
            return null;
        }
    }
}
