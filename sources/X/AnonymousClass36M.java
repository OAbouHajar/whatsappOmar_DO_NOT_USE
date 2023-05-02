package X;

import com.facebook.redex.RunnableRunnableShape0S0310000_I0;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.obwhatsapp.mediaview.PhotoView;
import java.lang.ref.WeakReference;

/* renamed from: X.36M  reason: invalid class name */
public class AnonymousClass36M extends C16690tT {
    public final C16480t8 A00;
    public final C38681rF A01;
    public final AnonymousClass1A9 A02;
    public final C25791Ld A03;
    public final WeakReference A04;

    public AnonymousClass36M(C16480t8 r2, MediaViewFragment mediaViewFragment, C38681rF r4, AnonymousClass1A9 r5, C25791Ld r6) {
        this.A02 = r5;
        this.A00 = r2;
        this.A03 = r6;
        this.A04 = C13690nt.A0h(mediaViewFragment);
        this.A01 = r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00fc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0101 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1 A[Catch:{ all -> 0x00f8, all -> 0x00fc, all -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d5 A[SYNTHETIC, Splitter:B:50:0x00d5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r13) {
        /*
            r12 = this;
            X.0t8 r6 = r12.A00     // Catch:{ IOException -> 0x0102 }
            X.1rF r5 = r12.A01     // Catch:{ IOException -> 0x0102 }
            X.4EY r8 = new X.4EY     // Catch:{ IOException -> 0x0102 }
            r8.<init>(r12)     // Catch:{ IOException -> 0x0102 }
            X.AnonymousClass00B.A00()     // Catch:{ IOException -> 0x0102 }
            X.0tq r0 = r6.A0B     // Catch:{ IOException -> 0x0102 }
            X.0tf r11 = r0.A02()     // Catch:{ IOException -> 0x0102 }
            X.0ta r4 = X.C16730tY.A00(r5)     // Catch:{ all -> 0x00fd }
            X.01a r1 = r6.A08     // Catch:{ all -> 0x00fd }
            java.io.File r0 = r4.A0F     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x00fd }
            int r0 = r1.A00(r0)     // Catch:{ all -> 0x00fd }
            if (r0 <= 0) goto L_0x003b
            X.0sb r7 = r6.A01     // Catch:{ all -> 0x00fd }
            X.0u3 r3 = r6.A0D     // Catch:{ all -> 0x00fd }
            java.io.File r2 = r4.A0F     // Catch:{ all -> 0x00fd }
            X.1XK r1 = X.AnonymousClass1XK.A0B     // Catch:{ all -> 0x00fd }
            r0 = 2
            java.io.File r3 = X.C17970vw.A0B(r7, r3, r1, r2, r0)     // Catch:{ all -> 0x00fd }
            java.io.File r1 = r4.A0F     // Catch:{ all -> 0x00fd }
            X.0tB r0 = r7.A04     // Catch:{ all -> 0x00fd }
            X.AnonymousClass1XI.A0B(r0, r1, r3)     // Catch:{ all -> 0x00fd }
        L_0x0038:
            X.36M r9 = r8.A00     // Catch:{ all -> 0x00fd }
            goto L_0x003e
        L_0x003b:
            java.io.File r3 = r4.A0F     // Catch:{ all -> 0x00fd }
            goto L_0x0038
        L_0x003e:
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00b3 }
            X.03o r10 = new X.03o     // Catch:{ IOException -> 0x00b3 }
            r10.<init>(r0)     // Catch:{ IOException -> 0x00b3 }
            r8 = 1
            int r7 = r10.A07(r8)     // Catch:{ IOException -> 0x00b3 }
            r2 = 8
            r1 = 6
            r0 = 3
            if (r7 == 0) goto L_0x0061
            if (r7 == r8) goto L_0x0061
            if (r7 == r0) goto L_0x005e
            if (r7 == r1) goto L_0x005c
            if (r7 == r2) goto L_0x0062
            r8 = r7
            goto L_0x0062
        L_0x005c:
            r8 = 3
            goto L_0x0062
        L_0x005e:
            r8 = 8
            goto L_0x0062
        L_0x0061:
            r8 = 6
        L_0x0062:
            java.lang.String r0 = java.lang.Integer.toString(r8)     // Catch:{ IOException -> 0x00b3 }
            r10.A0O(r0)     // Catch:{ IOException -> 0x00b3 }
            r10.A0A()     // Catch:{ IOException -> 0x00b3 }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x00b7 }
            r7.<init>()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x00b7 }
            X.1A9 r2 = r9.A02     // Catch:{ all -> 0x00ae }
            android.net.Uri r1 = android.net.Uri.fromFile(r3)     // Catch:{ all -> 0x00ae }
            r0 = 100
            android.graphics.Bitmap r0 = r2.A0W(r1, r0, r0)     // Catch:{ all -> 0x00ae }
            byte[] r1 = X.C13690nt.A1X(r0, r7)     // Catch:{ all -> 0x00ae }
            r0.recycle()     // Catch:{ all -> 0x00ae }
            r7.close()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x00b7 }
            r8 = 0
            if (r1 == 0) goto L_0x00bd
            X.1rF r7 = r9.A01     // Catch:{ all -> 0x00fd }
            X.0tm r0 = r7.A0F()     // Catch:{ all -> 0x00fd }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00fd }
            r0.A02(r1)     // Catch:{ all -> 0x00fd }
            X.0ta r2 = X.C16730tY.A00(r7)     // Catch:{ all -> 0x00fd }
            long r0 = r3.length()     // Catch:{ all -> 0x00fd }
            r2.A0A = r0     // Catch:{ all -> 0x00fd }
            r2.A02 = r8     // Catch:{ all -> 0x00fd }
            r2.A03 = r8     // Catch:{ all -> 0x00fd }
            X.C17970vw.A0M(r2, r3)     // Catch:{ all -> 0x00fd }
            X.1Ld r0 = r9.A03     // Catch:{ all -> 0x00fd }
            r0.A0D(r7)     // Catch:{ all -> 0x00fd }
            r0 = 1
            goto L_0x00be
        L_0x00ae:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            throw r0     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x00b7 }
        L_0x00b3:
            r1 = move-exception
            java.lang.String r0 = "mediaview/rotate"
            goto L_0x00ba
        L_0x00b7:
            r1 = move-exception
            java.lang.String r0 = "mediaview/rotate/recreatethumb"
        L_0x00ba:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00fd }
        L_0x00bd:
            r0 = 0
        L_0x00be:
            r2 = 0
            if (r0 != 0) goto L_0x00d5
            java.io.File r0 = r4.A0F     // Catch:{ all -> 0x00fd }
            if (r0 == r3) goto L_0x00d0
            boolean r0 = r3.delete()     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x00d0
            java.lang.String r0 = "failed to delete media file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00fd }
        L_0x00d0:
            r11.close()     // Catch:{ IOException -> 0x0102 }
            r0 = 0
            goto L_0x00f3
        L_0x00d5:
            X.1cj r1 = r11.A00()     // Catch:{ all -> 0x00fd }
            java.io.File r0 = r4.A0F     // Catch:{ all -> 0x00f8 }
            if (r0 == r3) goto L_0x00e4
            X.0t6 r0 = r6.A06     // Catch:{ all -> 0x00f8 }
            r0.A0j(r5, r2, r2)     // Catch:{ all -> 0x00f8 }
            r4.A0F = r3     // Catch:{ all -> 0x00f8 }
        L_0x00e4:
            X.0t6 r0 = r6.A06     // Catch:{ all -> 0x00f8 }
            r0.A0a(r5)     // Catch:{ all -> 0x00f8 }
            r1.A00()     // Catch:{ all -> 0x00f8 }
            r1.close()     // Catch:{ all -> 0x00fd }
            r11.close()     // Catch:{ IOException -> 0x0102 }
            r0 = 1
        L_0x00f3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0102 }
            return r0
        L_0x00f8:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0101 }
        L_0x0101:
            throw r0     // Catch:{ IOException -> 0x0102 }
        L_0x0102:
            r1 = move-exception
            java.lang.String r0 = "mediaview/rotate"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36M.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        RunnableRunnableShape0S0310000_I0 runnableRunnableShape0S0310000_I0;
        Boolean bool = (Boolean) obj;
        MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A04.get();
        if (mediaViewFragment != null && !((C14550pN) mediaViewFragment.A0D()).AIm()) {
            C38681rF r2 = this.A01;
            mediaViewFragment.A1Z.A0D(r2);
            PhotoView A1A = mediaViewFragment.A1A(r2.A11);
            if (!(A1A == null || (runnableRunnableShape0S0310000_I0 = mediaViewFragment.A0C) == null)) {
                runnableRunnableShape0S0310000_I0.A00(A1A, r2);
            }
            if (bool.booleanValue()) {
                mediaViewFragment.A0t.A08(r2, 9);
            }
        }
    }
}
