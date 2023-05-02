package X;

import com.facebook.redex.IDxRListenerShape421S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.1pW  reason: invalid class name and case insensitive filesystem */
public class C37661pW extends C214614e implements C27371Rm {
    public File A00;
    public Executor A01;
    public final C16300so A02;
    public final C37681pY A03;
    public final C16440t3 A04;
    public final C16980tz A05;
    public final C37671pX A06;
    public final C16320sq A07;
    public final String A08;
    public volatile boolean A09;

    public C37661pW(C16300so r5, C27351Rk r6, C16440t3 r7, C16980tz r8, C214414c r9, C16320sq r10, String str, int i2) {
        super(r9);
        IDxRListenerShape421S0100000_2_I0 iDxRListenerShape421S0100000_2_I0 = new IDxRListenerShape421S0100000_2_I0(this, 1);
        this.A03 = iDxRListenerShape421S0100000_2_I0;
        this.A04 = r7;
        this.A05 = r8;
        this.A02 = r5;
        this.A07 = r10;
        this.A08 = str;
        C37671pX r0 = new C37671pX(new C17010u2(), (C214414c) r6.A00.A01.AQO.get(), i2);
        this.A06 = r0;
        r0.A02(iDxRListenerShape421S0100000_2_I0);
    }

    public final File A00() {
        String str;
        File file = this.A00;
        if (file != null && file.exists()) {
            return this.A00;
        }
        File externalCacheDir = this.A05.A00.getExternalCacheDir();
        if (externalCacheDir == null || !externalCacheDir.exists()) {
            str = "diskbackedgifcache/getmappingfile/external cache dir doesn't exit";
        } else {
            File file2 = new File(externalCacheDir, "gif/gif_cache_mem_store");
            if (file2.exists() || file2.mkdirs()) {
                File file3 = new File(file2, this.A08);
                this.A00 = file3;
                return file3;
            }
            str = "diskbackedgifcache/getmappingfile/disk cache dir doesn't exit";
        }
        Log.e(str);
        return null;
    }

    public synchronized Executor A01() {
        Executor executor;
        executor = this.A01;
        if (executor == null) {
            executor = new AnonymousClass1WA(this.A07, false);
            this.A01 = executor;
        }
        return executor;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00da */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A02() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = X.AnonymousClass01E.A01()     // Catch:{ all -> 0x00f2 }
            if (r0 != 0) goto L_0x00f0
            boolean r0 = r9.A09     // Catch:{ all -> 0x00f2 }
            if (r0 != 0) goto L_0x00f0
            r9.A01()     // Catch:{ all -> 0x00f2 }
            java.io.File r5 = r9.A00()     // Catch:{ all -> 0x00f2 }
            if (r5 == 0) goto L_0x00ed
            boolean r0 = r5.exists()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00ed
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x00db }
            r4.<init>()     // Catch:{ IOException -> 0x00db }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x00db }
            r0.<init>(r5)     // Catch:{ IOException -> 0x00db }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x00db }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00db }
            r2.beginObject()     // Catch:{ all -> 0x00d6 }
        L_0x002c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r1 = "mappings"
            java.lang.String r0 = r2.nextName()     // Catch:{ all -> 0x00d6 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x002c
            r2.beginArray()     // Catch:{ all -> 0x00d6 }
        L_0x0041:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x0090
            r2.beginObject()     // Catch:{ all -> 0x00d6 }
            r8 = 0
            r7 = r8
            r6 = r8
        L_0x004d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x0080
            java.lang.String r3 = r2.nextName()     // Catch:{ all -> 0x00d6 }
            int r1 = r3.hashCode()     // Catch:{ all -> 0x00d6 }
            r0 = 116079(0x1c56f, float:1.62661E-40)
            if (r1 == r0) goto L_0x0072
            r0 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r1 != r0) goto L_0x004d
            java.lang.String r0 = "file"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r7 = r2.nextString()     // Catch:{ all -> 0x00d6 }
            goto L_0x004d
        L_0x0072:
            java.lang.String r0 = "url"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x004d
            java.lang.String r6 = r2.nextString()     // Catch:{ all -> 0x00d6 }
            goto L_0x004d
        L_0x0080:
            r2.endObject()     // Catch:{ all -> 0x00d6 }
            if (r7 == 0) goto L_0x009c
            if (r6 == 0) goto L_0x0094
            X.20S r0 = new X.20S     // Catch:{ all -> 0x00d6 }
            r0.<init>(r7, r6, r8)     // Catch:{ all -> 0x00d6 }
            r4.add(r0)     // Catch:{ all -> 0x00d6 }
            goto L_0x0041
        L_0x0090:
            r2.endArray()     // Catch:{ all -> 0x00d6 }
            goto L_0x002c
        L_0x0094:
            java.lang.String r0 = "field not found: url"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00d6 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d6 }
            goto L_0x00a3
        L_0x009c:
            java.lang.String r0 = "field not found: file"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00d6 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d6 }
        L_0x00a3:
            throw r1     // Catch:{ all -> 0x00d6 }
        L_0x00a4:
            r2.endObject()     // Catch:{ all -> 0x00d6 }
            r2.close()     // Catch:{ IOException -> 0x00db }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ IOException -> 0x00db }
        L_0x00ae:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x00db }
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r2 = r3.next()     // Catch:{ IOException -> 0x00db }
            X.20S r2 = (X.AnonymousClass20S) r2     // Catch:{ IOException -> 0x00db }
            java.lang.String r1 = r2.A00     // Catch:{ IOException -> 0x00db }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x00db }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00db }
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x00db }
            if (r0 == 0) goto L_0x00ae
            X.1pX r1 = r9.A06     // Catch:{ IOException -> 0x00db }
            java.lang.String r0 = r2.A01     // Catch:{ IOException -> 0x00db }
            r1.A03(r0, r2)     // Catch:{ IOException -> 0x00db }
            goto L_0x00ae
        L_0x00cf:
            r4.size()     // Catch:{ IOException -> 0x00db }
            r5.getAbsolutePath()     // Catch:{ IOException -> 0x00db }
            goto L_0x00ed
        L_0x00d6:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00da }
        L_0x00da:
            throw r0     // Catch:{ IOException -> 0x00db }
        L_0x00db:
            r1 = move-exception
            java.lang.String r0 = "diskbackedgifcache/init/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00f2 }
            X.0so r3 = r9.A02     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = "disk-backed-gif-cache/load-error"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f2 }
            r0 = 0
            r3.AcB(r2, r1, r0)     // Catch:{ all -> 0x00f2 }
        L_0x00ed:
            r0 = 1
            r9.A09 = r0     // Catch:{ all -> 0x00f2 }
        L_0x00f0:
            monitor-exit(r9)
            return
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37661pW.A02():void");
    }

    public AnonymousClass20S A9Y(String str) {
        A02();
        return this.A06.A04(str);
    }

    public void Ab1(AnonymousClass20S r4, String str) {
        A02();
        this.A06.A03(str, r4);
        A01().execute(new RunnableRunnableShape9S0100000_I0_8(this, 17));
    }
}
