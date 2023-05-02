package X;

import java.util.Locale;
import java.util.Map;

/* renamed from: X.1NT  reason: invalid class name */
public class AnonymousClass1NT {
    public Map A00;
    public final C16300so A01;
    public final AnonymousClass1NV A02;
    public final C91604gC A03 = new C91604gC(this);
    public final AnonymousClass1NQ A04;

    public AnonymousClass1NT(C16300so r2, AnonymousClass1NV r3, AnonymousClass1NQ r4) {
        this.A01 = r2;
        this.A04 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A00(java.lang.String r8) {
        /*
            r7 = this;
            r5 = 0
            monitor-enter(r7)
            java.util.Map r6 = r7.A00     // Catch:{ all -> 0x005f }
            if (r6 != 0) goto L_0x0054
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x005f }
            r6.<init>()     // Catch:{ all -> 0x005f }
            X.1NQ r0 = r7.A04     // Catch:{ all -> 0x005f }
            X.1NS r0 = r0.A00     // Catch:{ all -> 0x005f }
            X.0tf r2 = r0.A00()     // Catch:{ all -> 0x005f }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "SELECT key, value FROM properties"
            android.database.Cursor r4 = r1.A08(r0, r5)     // Catch:{ all -> 0x004a }
            r2.close()     // Catch:{ all -> 0x005f }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "key"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "value"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0043 }
        L_0x0031:
            java.lang.String r1 = r4.getString(r3)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r4.getString(r2)     // Catch:{ all -> 0x0043 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0043 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0031
            goto L_0x004f
        L_0x0043:
            r0 = move-exception
            if (r4 == 0) goto L_0x004e
            r4.close()     // Catch:{ all -> 0x004e }
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x005f }
        L_0x004f:
            r4.close()     // Catch:{ all -> 0x005f }
            r7.A00 = r6     // Catch:{ all -> 0x005f }
        L_0x0054:
            java.lang.Object r0 = r6.get(r8)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x005f }
            monitor-exit(r7)
            if (r0 != 0) goto L_0x005e
            return r5
        L_0x005e:
            return r0
        L_0x005f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NT.A00(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:44|45|46|47|48) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0081 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0086 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0081=Splitter:B:42:0x0081, B:23:0x006b=Splitter:B:23:0x006b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A01(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            X.1NV r0 = r10.A02     // Catch:{ all -> 0x0087 }
            X.1jP r6 = r0.A04     // Catch:{ all -> 0x0087 }
            X.1NQ r0 = r10.A04     // Catch:{ all -> 0x0087 }
            X.1NS r0 = r0.A00     // Catch:{ all -> 0x0087 }
            X.0tf r9 = r0.A01()     // Catch:{ all -> 0x0087 }
            X.1cj r8 = r9.A00()     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = "properties"
            X.0tf r5 = r0.A01()     // Catch:{ all -> 0x007d }
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x0078 }
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "key = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0073 }
            r0 = 0
            r1[r0] = r11     // Catch:{ all -> 0x0073 }
            r3.A01(r7, r2, r1)     // Catch:{ all -> 0x0073 }
            if (r12 == 0) goto L_0x003d
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0073 }
            r1.<init>()     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "key"
            r1.put(r0, r11)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "value"
            r1.put(r0, r12)     // Catch:{ all -> 0x0073 }
            r3.A03(r1, r7)     // Catch:{ all -> 0x0073 }
        L_0x003d:
            r4.A00()     // Catch:{ all -> 0x0073 }
            r4.close()     // Catch:{ all -> 0x0078 }
            r5.close()     // Catch:{ all -> 0x007d }
            X.4gC r2 = r10.A03     // Catch:{ all -> 0x007d }
            java.lang.Object r1 = new java.lang.Object     // Catch:{ all -> 0x007d }
            r1.<init>()     // Catch:{ all -> 0x007d }
            java.lang.ThreadLocal r0 = r6.A02     // Catch:{ all -> 0x007d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x007d }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x007d }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x007d }
            r0.put(r1, r2)     // Catch:{ all -> 0x007d }
            r8.A00()     // Catch:{ all -> 0x007d }
            java.util.Map r0 = r10.A00     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x006b
            if (r12 == 0) goto L_0x0068
            r0.put(r11, r12)     // Catch:{ all -> 0x007d }
            goto L_0x006b
        L_0x0068:
            r0.remove(r11)     // Catch:{ all -> 0x007d }
        L_0x006b:
            r8.close()     // Catch:{ all -> 0x0082 }
            r9.close()     // Catch:{ all -> 0x0087 }
            monitor-exit(r10)
            return
        L_0x0073:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0077 }
        L_0x0077:
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x007c }
        L_0x007c:
            throw r0     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0081 }
        L_0x0081:
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0086 }
        L_0x0086:
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NT.A01(java.lang.String, java.lang.String):void");
    }

    public boolean A02(String str) {
        String A002 = A00(str);
        if (A002 != null) {
            String lowerCase = A002.toLowerCase(Locale.US);
            if (lowerCase.equals("true")) {
                return true;
            }
            if (!lowerCase.equals("false")) {
                C16300so r2 = this.A01;
                StringBuilder sb = new StringBuilder("Malformed boolean: ");
                sb.append(str);
                sb.append("=");
                sb.append(A002);
                r2.AcB("xpm-file-prefetcher-properties", sb.toString(), false);
            }
        }
        return false;
    }
}
