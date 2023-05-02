package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.11I  reason: invalid class name */
public class AnonymousClass11I {
    public final C16440t3 A00;
    public final C17620vN A01;
    public final C16900tq A02;
    public final C16320sq A03;
    public final Object A04 = new Object();
    public final Map A05 = new HashMap();

    public AnonymousClass11I(C16440t3 r2, C17620vN r3, C16900tq r4, C16320sq r5) {
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    public int A00(String str, int i2) {
        String A022 = A02(str);
        return A022 == null ? i2 : Integer.parseInt(A022);
    }

    public long A01(String str, long j2) {
        String A022 = A02(str);
        return A022 == null ? j2 : Long.parseLong(A022);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:38|39|40|41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r4 = r10.A02.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = r4.A02.A08("SELECT value FROM props WHERE key = ?", new java.lang.String[]{r11});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1.moveToNext() == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5 = r1.getString(r1.getColumnIndexOrThrow("value"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r7.put(r11, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        r10.A01.A00("PropsMessageStore/getProp", android.os.SystemClock.uptimeMillis() - r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        if (r1 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r5 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x003e=Splitter:B:18:0x003e, B:36:0x005f=Splitter:B:36:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02(java.lang.String r11) {
        /*
            r10 = this;
            long r8 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r6 = r10.A04
            monitor-enter(r6)
            java.util.Map r7 = r10.A05     // Catch:{ all -> 0x0067 }
            boolean r0 = r7.containsKey(r11)     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r7.get(r11)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0067 }
            monitor-exit(r6)     // Catch:{ all -> 0x0067 }
            return r0
        L_0x0017:
            monitor-exit(r6)     // Catch:{ all -> 0x0067 }
            r5 = 0
            X.0tq r0 = r10.A02     // Catch:{ all -> 0x0065 }
            X.0tf r4 = r0.get()     // Catch:{ all -> 0x0065 }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "SELECT value FROM props WHERE key = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0060 }
            r0 = 0
            r1[r0] = r11     // Catch:{ all -> 0x0060 }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x0060 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "value"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = r1.getString(r0)     // Catch:{ all -> 0x0059 }
        L_0x003e:
            r1.close()     // Catch:{ all -> 0x0060 }
            r4.close()     // Catch:{ all -> 0x0065 }
            monitor-enter(r6)
            r7.put(r11, r5)     // Catch:{ all -> 0x0056 }
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            X.0vN r3 = r10.A01
            java.lang.String r2 = "PropsMessageStore/getProp"
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r8
            r3.A00(r2, r0)
            return r5
        L_0x0056:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            throw r0
        L_0x0059:
            r0 = move-exception
            if (r1 == 0) goto L_0x005f
            r1.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            throw r0
        L_0x0067:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0067 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11I.A02(java.lang.String):java.lang.String");
    }

    public void A03(String str) {
        C16800tf A022 = this.A02.A02();
        try {
            C33971jU.A01(A022.A02, str);
            A022.close();
            synchronized (this.A04) {
                this.A05.remove(str);
            }
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A04(String str, int i2) {
        A06(str, String.valueOf(i2));
    }

    public void A05(String str, long j2) {
        A06(str, String.valueOf(j2));
    }

    public void A06(String str, String str2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C16800tf A022 = this.A02.A02();
        try {
            C33971jU.A03(A022.A02, str, str2, "PropsMessageStore");
            A022.close();
            synchronized (this.A04) {
                this.A05.put(str, str2);
            }
            this.A01.A00("PropsMessageStore/setProp", SystemClock.uptimeMillis() - uptimeMillis);
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
