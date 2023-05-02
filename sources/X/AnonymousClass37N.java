package X;

import com.whatsapp.Mp4Ops;
import java.io.File;
import java.io.IOException;

/* renamed from: X.37N  reason: invalid class name */
public abstract class AnonymousClass37N extends C16690tT {
    public final C16300so A00;
    public final Mp4Ops A01;
    public final C17130ua A02;
    public final AnonymousClass12W A03;
    public final C16440t3 A04;
    public final AnonymousClass20R A05;
    public final C27371Rm A06;
    public final String A07;
    public final boolean A08;

    public AnonymousClass37N(C16300so r1, Mp4Ops mp4Ops, C17130ua r3, AnonymousClass12W r4, C16440t3 r5, AnonymousClass20R r6, C27371Rm r7, String str, boolean z2) {
        this.A01 = mp4Ops;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = str;
        this.A05 = r6;
        this.A08 = z2;
        this.A06 = r7;
        this.A04 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return A0B();
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        File file;
        C86054Ra r5 = (C86054Ra) obj;
        AnonymousClass20R r3 = this.A05;
        String str = this.A07;
        byte[] bArr = null;
        if (r5 == null) {
            file = null;
        } else {
            file = r5.A02;
            bArr = r5.A03;
        }
        r3.ARL(file, str, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a3, code lost:
        r6 = X.C18830xK.A03(X.C18830xK.A01(r8), 100);
        r20 = r20.A00() - r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b5, code lost:
        if (r10.A08 == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        r0 = r10.A03;
        com.whatsapp.Mp4Ops.A00(r0, r8);
        com.whatsapp.GifHelper.A00(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        if (r22.isCancelled() != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7 = r5.A9Y(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ca, code lost:
        if (r7 == null) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        r10 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d6, code lost:
        if (X.C13700nu.A0D(r10).exists() == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        if (X.C13700nu.A0D(r10).getAbsolutePath().equals(r8.getAbsolutePath()) != false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ea, code lost:
        r2.close();
        X.AnonymousClass1XI.A0N(r8);
        r13 = new X.C86054Ra(X.C13700nu.A0D(r10), r7.A02, -1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0100, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        r5.Ab1(new X.AnonymousClass20S(r8.getAbsolutePath(), r9, r6), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010e, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r15 = new X.C86054Ra(r8, r6, r18, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r2.close();
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015b, code lost:
        if (r2 == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0160, code lost:
        if (r3 == null) goto L_0x0167;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0148 A[SYNTHETIC, Splitter:B:75:0x0148] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014d A[Catch:{ IOException -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C86054Ra A0B() {
        /*
            r23 = this;
            r10 = r23
            java.lang.String r9 = r10.A07
            X.0tU r0 = r10.A02
            r22 = r0
            boolean r0 = r22.isCancelled()
            r13 = 0
            if (r0 != 0) goto L_0x0028
            X.1Rm r5 = r10.A06
            X.20S r1 = r5.A9Y(r9)
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = r1.A00
            java.io.File r14 = X.C13700nu.A0D(r0)
            byte[] r15 = r1.A02
            r16 = -1
            r18 = -1
            X.4Ra r13 = new X.4Ra
            r13.<init>(r14, r15, r16, r18)
        L_0x0028:
            return r13
        L_0x0029:
            X.0t3 r0 = r10.A04
            r20 = r0
            long r16 = r20.A00()
            r0 = 10
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception -> 0x013f, all -> 0x016d }
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x013f, all -> 0x016d }
            r0.<init>(r9)     // Catch:{ Exception -> 0x013f, all -> 0x016d }
            java.net.URLConnection r4 = r0.openConnection()     // Catch:{ Exception -> 0x013f, all -> 0x016d }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x013f, all -> 0x016d }
            r4.connect()     // Catch:{ Exception -> 0x013d, all -> 0x0166 }
            int r1 = r4.getResponseCode()     // Catch:{ Exception -> 0x013d, all -> 0x0166 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0053
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r13
        L_0x0053:
            int r12 = r4.getContentLength()     // Catch:{ Exception -> 0x013d, all -> 0x0166 }
            X.0ua r2 = r10.A02     // Catch:{ Exception -> 0x013d, all -> 0x0166 }
            r11 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x013d, all -> 0x0166 }
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ Exception -> 0x013d, all -> 0x0166 }
            X.1qW r3 = new X.1qW     // Catch:{ Exception -> 0x013d, all -> 0x0166 }
            r3.<init>(r2, r0, r13, r1)     // Catch:{ Exception -> 0x013d, all -> 0x0166 }
            java.io.File r8 = r10.A0C()     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x013b, all -> 0x0139 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r0]     // Catch:{ Exception -> 0x0137 }
            r18 = 0
        L_0x0076:
            int r6 = r3.read(r7)     // Catch:{ Exception -> 0x0137 }
            r0 = -1
            if (r6 == r0) goto L_0x00a3
            boolean r0 = r22.isCancelled()     // Catch:{ Exception -> 0x0137 }
            if (r0 == 0) goto L_0x0088
            r3.close()     // Catch:{ Exception -> 0x0137 }
            goto L_0x012a
        L_0x0088:
            long r0 = (long) r6     // Catch:{ Exception -> 0x0137 }
            long r18 = r18 + r0
            if (r12 <= 0) goto L_0x009e
            java.lang.Object[] r13 = X.C13680ns.A1b()     // Catch:{ Exception -> 0x0137 }
            r0 = 100
            long r0 = r0 * r18
            long r14 = (long) r12     // Catch:{ Exception -> 0x0137 }
            long r0 = r0 / r14
            int r14 = (int) r0     // Catch:{ Exception -> 0x0137 }
            X.AnonymousClass000.A1M(r13, r14, r11)     // Catch:{ Exception -> 0x0137 }
            r10.A07(r13)     // Catch:{ Exception -> 0x0137 }
        L_0x009e:
            r2.write(r7, r11, r6)     // Catch:{ Exception -> 0x0137 }
            r13 = 0
            goto L_0x0076
        L_0x00a3:
            android.graphics.Bitmap r1 = X.C18830xK.A01(r8)     // Catch:{ Exception -> 0x0137 }
            r0 = 100
            byte[] r6 = X.C18830xK.A03(r1, r0)     // Catch:{ Exception -> 0x0137 }
            long r20 = r20.A00()     // Catch:{ Exception -> 0x0137 }
            long r20 = r20 - r16
            boolean r0 = r10.A08     // Catch:{ Exception -> 0x0137 }
            if (r0 == 0) goto L_0x00bf
            X.12W r0 = r10.A03     // Catch:{ Exception -> 0x0137 }
            com.whatsapp.Mp4Ops.A00(r0, r8)     // Catch:{ Exception -> 0x0137 }
            com.whatsapp.GifHelper.A00(r0, r8)     // Catch:{ Exception -> 0x0137 }
        L_0x00bf:
            boolean r0 = r22.isCancelled()     // Catch:{ Exception -> 0x0137 }
            if (r0 != 0) goto L_0x012a
            monitor-enter(r5)     // Catch:{ Exception -> 0x0137 }
            X.20S r7 = r5.A9Y(r9)     // Catch:{ all -> 0x0125 }
            if (r7 == 0) goto L_0x0102
            java.lang.String r10 = r7.A00     // Catch:{ all -> 0x0125 }
            java.io.File r0 = X.C13700nu.A0D(r10)     // Catch:{ all -> 0x0125 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x0102
            java.io.File r0 = X.C13700nu.A0D(r10)     // Catch:{ all -> 0x0125 }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ all -> 0x0125 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0125 }
            if (r0 != 0) goto L_0x0102
            r2.close()     // Catch:{ all -> 0x0125 }
            X.AnonymousClass1XI.A0N(r8)     // Catch:{ all -> 0x0125 }
            java.io.File r14 = X.C13700nu.A0D(r10)     // Catch:{ all -> 0x0125 }
            byte[] r0 = r7.A02     // Catch:{ all -> 0x0125 }
            r16 = -1
            r18 = -1
            X.4Ra r13 = new X.4Ra     // Catch:{ all -> 0x0125 }
            r15 = r0
            r13.<init>(r14, r15, r16, r18)     // Catch:{ all -> 0x0125 }
            monitor-exit(r5)     // Catch:{ all -> 0x0125 }
            goto L_0x012a
        L_0x0102:
            java.lang.String r1 = r8.getAbsolutePath()     // Catch:{ all -> 0x0125 }
            X.20S r0 = new X.20S     // Catch:{ all -> 0x0125 }
            r0.<init>(r1, r9, r6)     // Catch:{ all -> 0x0125 }
            r5.Ab1(r0, r9)     // Catch:{ all -> 0x0125 }
            monitor-exit(r5)     // Catch:{ all -> 0x0125 }
            X.4Ra r15 = new X.4Ra     // Catch:{ Exception -> 0x0137, all -> 0x0128 }
            r16 = r8
            r17 = r6
            r15.<init>(r16, r17, r18, r20)     // Catch:{ Exception -> 0x0137, all -> 0x0128 }
            r2.close()     // Catch:{ IOException -> 0x011e }
            r3.close()     // Catch:{ IOException -> 0x011e }
        L_0x011e:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r15
        L_0x0125:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0125 }
            throw r0     // Catch:{ Exception -> 0x0137, all -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            goto L_0x015d
        L_0x012a:
            r2.close()     // Catch:{ IOException -> 0x0130 }
            r3.close()     // Catch:{ IOException -> 0x0130 }
        L_0x0130:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r13
        L_0x0137:
            r0 = move-exception
            goto L_0x0143
        L_0x0139:
            r0 = move-exception
            goto L_0x0162
        L_0x013b:
            r0 = move-exception
            goto L_0x0142
        L_0x013d:
            r0 = move-exception
            goto L_0x0141
        L_0x013f:
            r0 = move-exception
            r4 = 0
        L_0x0141:
            r3 = 0
        L_0x0142:
            r2 = 0
        L_0x0143:
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x015a }
            if (r2 == 0) goto L_0x014b
            r2.close()     // Catch:{ IOException -> 0x0150 }
        L_0x014b:
            if (r3 == 0) goto L_0x0150
            r3.close()     // Catch:{ IOException -> 0x0150 }
        L_0x0150:
            if (r4 == 0) goto L_0x0155
            r4.disconnect()
        L_0x0155:
            android.net.TrafficStats.clearThreadStatsTag()
            r13 = 0
            return r13
        L_0x015a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0160
        L_0x015d:
            r2.close()     // Catch:{ IOException -> 0x0167 }
        L_0x0160:
            if (r3 == 0) goto L_0x0167
        L_0x0162:
            r3.close()     // Catch:{ IOException -> 0x0167 }
            goto L_0x0167
        L_0x0166:
            r0 = move-exception
        L_0x0167:
            if (r4 == 0) goto L_0x016e
            r4.disconnect()
            goto L_0x016e
        L_0x016d:
            r0 = move-exception
        L_0x016e:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37N.A0B():X.4Ra");
    }

    public File A0C() {
        AnonymousClass32J r3 = (AnonymousClass32J) this;
        C27371Rm r1 = r3.A06;
        if (r1 instanceof C27361Rl) {
            C27361Rl r12 = (C27361Rl) r1;
            String str = r3.A07;
            AnonymousClass00B.A00();
            r12.A00();
            AnonymousClass5UN r2 = r12.A00;
            AnonymousClass00B.A06(r2);
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(C004101u.A02(str));
            return r2.AIO(AnonymousClass000.A0h(".gif", A0o));
        }
        File A0C = C13700nu.A0C(r3.A00.A00.getExternalCacheDir(), "gif/gif_preview_cache");
        if (A0C.exists() || A0C.mkdirs()) {
            StringBuilder A0o2 = AnonymousClass000.A0o();
            A0o2.append(C004101u.A02(r3.A07));
            return C13700nu.A0C(A0C, AnonymousClass000.A0h(".gif", A0o2));
        }
        throw new IOException("gifcache/gifpreviewdownloadaction/createtempfile/error creating directory");
    }
}
