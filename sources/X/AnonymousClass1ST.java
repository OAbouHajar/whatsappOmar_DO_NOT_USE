package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1ST  reason: invalid class name */
public class AnonymousClass1ST {
    public static final long A09 = TimeUnit.MINUTES.toMillis(15);
    public long A00;
    public boolean A01;
    public final C16980tz A02;
    public final C19950zG A03;
    public final C17660vR A04;
    public final C16320sq A05;
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();
    public final List A08 = new ArrayList();

    public AnonymousClass1ST(C16980tz r2, C19950zG r3, C17660vR r4, C16320sq r5) {
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.A01     // Catch:{ all -> 0x0084 }
            if (r0 != 0) goto L_0x0082
            java.util.List r4 = r7.A08     // Catch:{ all -> 0x0084 }
            r4.clear()     // Catch:{ all -> 0x0084 }
            java.util.List r0 = r7.A07     // Catch:{ all -> 0x0084 }
            r0.clear()     // Catch:{ all -> 0x0084 }
            java.util.List r0 = r7.A06     // Catch:{ all -> 0x0084 }
            r0.clear()     // Catch:{ all -> 0x0084 }
            X.0tz r0 = r7.A02     // Catch:{ all -> 0x0084 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0084 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ all -> 0x0084 }
            r0 = 2131820546(0x7f110002, float:1.927381E38)
            java.io.InputStream r2 = r1.openRawResource(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x007f }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x007f }
            r0.<init>(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x007f }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x007f }
            r3.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x007f }
        L_0x002f:
            java.lang.String r5 = r3.readLine()     // Catch:{ all -> 0x007a }
            if (r5 == 0) goto L_0x0076
            java.lang.String r0 = "\t"
            java.lang.String r6 = " "
            java.lang.String r2 = r5.replaceAll(r0, r6)     // Catch:{ IllegalArgumentException -> 0x0060 }
            java.lang.String r1 = "^ +| +$|( )+"
            java.lang.String r0 = "$1"
            java.lang.String r0 = r2.replaceAll(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0060 }
            java.lang.String[] r2 = android.text.TextUtils.split(r0, r6)     // Catch:{ IllegalArgumentException -> 0x0060 }
            if (r2 == 0) goto L_0x005a
            int r1 = r2.length     // Catch:{ IllegalArgumentException -> 0x0060 }
            r0 = 3
            if (r1 < r0) goto L_0x005a
            X.0vR r1 = r7.A04     // Catch:{ IllegalArgumentException -> 0x0060 }
            X.2Ho r0 = new X.2Ho     // Catch:{ IllegalArgumentException -> 0x0060 }
            r0.<init>(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0060 }
            r4.add(r0)     // Catch:{ IllegalArgumentException -> 0x0060 }
            goto L_0x002f
        L_0x005a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0060 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0060 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0060 }
        L_0x0060:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r1.<init>()     // Catch:{ all -> 0x007a }
            java.lang.String r0 = "domain-fronting-providers/load/bad-line: "
            r1.append(r0)     // Catch:{ all -> 0x007a }
            r1.append(r5)     // Catch:{ all -> 0x007a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007a }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x007a }
            goto L_0x002f
        L_0x0076:
            r3.close()     // Catch:{ UnsupportedEncodingException -> 0x007f }
            goto L_0x007f
        L_0x007a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x007e }
        L_0x007e:
            throw r0     // Catch:{ UnsupportedEncodingException -> 0x007f }
        L_0x007f:
            r0 = 1
            r7.A01 = r0     // Catch:{ all -> 0x0084 }
        L_0x0082:
            monitor-exit(r7)
            return
        L_0x0084:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ST.A00():void");
    }
}
