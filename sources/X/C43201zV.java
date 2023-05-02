package X;

import android.graphics.Bitmap;
import com.facebook.redex.IDxLCacheShape19S0100000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1zV  reason: invalid class name and case insensitive filesystem */
public class C43201zV {
    public static final Bitmap A07 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public C42001x2 A00;
    public boolean A01 = false;
    public final long A02;
    public final AnonymousClass03L A03;
    public final C43231zf A04;
    public final File A05;
    public final Object A06 = new Object();

    public C43201zV(File file, long j2) {
        this.A05 = file;
        this.A02 = j2;
        IDxLCacheShape19S0100000_2_I0 iDxLCacheShape19S0100000_2_I0 = new IDxLCacheShape19S0100000_2_I0(this, (int) (AnonymousClass01S.A00 / 8192));
        this.A03 = iDxLCacheShape19S0100000_2_I0;
        this.A04 = new C43231zf(iDxLCacheShape19S0100000_2_I0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:30|31|32|33|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A00(java.lang.String r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            r6.A01()
            java.lang.Object r3 = r6.A06
            monitor-enter(r3)
            X.1x2 r0 = r6.A00     // Catch:{ all -> 0x006f }
            r4 = 0
            if (r0 == 0) goto L_0x006d
            X.1x3 r0 = r0.A09(r7)     // Catch:{ IOException -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            java.lang.String r0 = "bitmapcache/journal corrupted"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x006f }
            r0 = r4
        L_0x0016:
            if (r0 == 0) goto L_0x006d
            r1 = 0
            java.io.InputStream[] r0 = r0.A00     // Catch:{ IOException -> 0x0058 }
            r5 = r0[r1]     // Catch:{ IOException -> 0x0058 }
            if (r5 == 0) goto L_0x0052
            if (r10 == 0) goto L_0x0030
            X.25c r2 = new X.25c     // Catch:{ all -> 0x004c }
            r2.<init>(r8, r9)     // Catch:{ all -> 0x004c }
            X.1zf r1 = r6.A04     // Catch:{ all -> 0x004c }
            r0 = 1
            X.25d r0 = X.C37741pe.A04(r1, r2, r5, r0)     // Catch:{ all -> 0x004c }
            android.graphics.Bitmap r1 = r0.A02     // Catch:{ all -> 0x004c }
            goto L_0x003b
        L_0x0030:
            X.25c r0 = new X.25c     // Catch:{ all -> 0x004c }
            r0.<init>(r8, r9)     // Catch:{ all -> 0x004c }
            X.25d r0 = X.C37741pe.A04(r4, r0, r5, r1)     // Catch:{ all -> 0x004c }
            android.graphics.Bitmap r1 = r0.A02     // Catch:{ all -> 0x004c }
        L_0x003b:
            if (r1 != 0) goto L_0x0051
            java.lang.String r0 = "bitmapcache/decode failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x006d
        L_0x0046:
            r2 = move-exception
            r4 = r1
            goto L_0x0059
        L_0x0049:
            r0 = move-exception
            r4 = r1
            goto L_0x004d
        L_0x004c:
            r0 = move-exception
        L_0x004d:
            r5.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0     // Catch:{ IOException -> 0x0058 }
        L_0x0051:
            r4 = r1
        L_0x0052:
            if (r5 == 0) goto L_0x006d
            r5.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x006d
        L_0x0058:
            r2 = move-exception
        L_0x0059:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r1.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r0 = "bitmapcache/ IO exception on diskcache: "
            r1.append(r0)     // Catch:{ all -> 0x006f }
            r1.append(r2)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x006f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r3)     // Catch:{ all -> 0x006f }
            return r4
        L_0x006f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43201zV.A00(java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    public final void A01() {
        synchronized (this.A06) {
            C42001x2 r0 = this.A00;
            if (r0 == null || r0.A03 == null) {
                File file = this.A05;
                if (!file.exists() && !file.mkdirs() && !file.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("bitmapcache/initDiskCache: unable to create cache dir ");
                    sb.append(file);
                    Log.e(sb.toString());
                }
                long usableSpace = file.getUsableSpace();
                long j2 = this.A02;
                if (usableSpace > j2) {
                    try {
                        this.A00 = C42001x2.A00(file, j2);
                    } catch (IOException e2) {
                        Log.e("bitmapcache/initDiskCache ", e2);
                    }
                }
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A02(java.io.InputStream r4, java.lang.String r5) {
        /*
            r3 = this;
            r3.A01()
            java.lang.Object r2 = r3.A06
            monitor-enter(r2)
            X.1x2 r0 = r3.A00     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            X.1x3 r0 = r0.A09(r5)     // Catch:{ Exception -> 0x0037 }
            r1 = 0
            if (r0 != 0) goto L_0x002c
            X.1x2 r0 = r3.A00     // Catch:{ Exception -> 0x0037 }
            X.1x6 r0 = r0.A08(r5)     // Catch:{ Exception -> 0x0037 }
            if (r0 == 0) goto L_0x0033
            java.io.OutputStream r1 = r0.A00()     // Catch:{ Exception -> 0x0037 }
            X.AnonymousClass1XI.A0H(r4, r1)     // Catch:{ all -> 0x0027 }
            r0.A01()     // Catch:{ all -> 0x0027 }
            r1.close()     // Catch:{ Exception -> 0x0037 }
            goto L_0x0033
        L_0x0027:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            throw r0     // Catch:{ Exception -> 0x0037 }
        L_0x002c:
            java.io.InputStream[] r0 = r0.A00     // Catch:{ Exception -> 0x0037 }
            r0 = r0[r1]     // Catch:{ Exception -> 0x0037 }
            r0.close()     // Catch:{ Exception -> 0x0037 }
        L_0x0033:
            X.1x2 r0 = r3.A00     // Catch:{ all -> 0x004a }
            monitor-enter(r0)     // Catch:{ all -> 0x004a }
            goto L_0x0047
        L_0x0037:
            r1 = move-exception
            java.lang.String r0 = "bitmapcache/download "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x003e }
            goto L_0x0044
        L_0x003e:
            r1 = move-exception
            X.1x2 r0 = r3.A00     // Catch:{ all -> 0x004a }
            monitor-enter(r0)     // Catch:{ all -> 0x004a }
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r1     // Catch:{ all -> 0x004a }
        L_0x0044:
            X.1x2 r0 = r3.A00     // Catch:{ all -> 0x004a }
            monitor-enter(r0)     // Catch:{ all -> 0x004a }
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43201zV.A02(java.io.InputStream, java.lang.String):void");
    }

    public void A03(boolean z2) {
        AnonymousClass03L r1 = this.A03;
        synchronized (r1) {
            r1.A05(-1);
        }
        synchronized (this.A06) {
            C42001x2 r0 = this.A00;
            if (r0 != null) {
                if (z2) {
                    try {
                        r0.close();
                        C42001x2.A04(r0.A07);
                    } catch (IOException e2) {
                        Log.e("bitmapcache/close ", e2);
                    }
                }
                C42001x2 r12 = this.A00;
                if (r12.A03 != null) {
                    r12.close();
                }
                this.A00 = null;
            }
        }
    }
}
