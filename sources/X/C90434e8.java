package X;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: X.4e8  reason: invalid class name and case insensitive filesystem */
public class C90434e8 {
    public static Object A00;
    public static HashMap A01;
    public static boolean A02;
    public static String[] A03 = new String[0];
    public static final Uri A04 = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri A05 = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final HashMap A06 = AnonymousClass000.A0x();
    public static final HashMap A07 = AnonymousClass000.A0x();
    public static final HashMap A08 = AnonymousClass000.A0x();
    public static final HashMap A09 = AnonymousClass000.A0x();
    public static final AtomicBoolean A0A = new AtomicBoolean();
    public static final Pattern A0B = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern A0C = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r0 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        r2 = r8.query(A04, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r14}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        if (r2 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        if (r2.moveToFirst() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0099, code lost:
        r1 = r2.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        if (r1 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r1.equals((java.lang.Object) null) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a6, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a9, code lost:
        if (r3 != A00) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ab, code lost:
        A01.put(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b0, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b1, code lost:
        if (r1 == null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b3, code lost:
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00bb, code lost:
        if (r3 != A00) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00bd, code lost:
        A01.put(r14, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c2, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c8, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00cd, code lost:
        if (r2 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00cf, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.ContentResolver r13, java.lang.String r14) {
        /*
            java.lang.Class<X.4e8> r7 = X.C90434e8.class
            monitor-enter(r7)
            r8 = r13
            A01(r13)     // Catch:{ all -> 0x00d3 }
            java.lang.Object r3 = A00     // Catch:{ all -> 0x00d3 }
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00d3 }
            boolean r0 = r0.containsKey(r14)     // Catch:{ all -> 0x00d3 }
            r10 = 0
            if (r0 == 0) goto L_0x001d
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00d3 }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0082
            goto L_0x007b
        L_0x001d:
            java.lang.String[] r12 = A03     // Catch:{ all -> 0x00d3 }
            int r2 = r12.length     // Catch:{ all -> 0x00d3 }
            r6 = 0
            r1 = 0
        L_0x0022:
            r5 = 1
            if (r1 >= r2) goto L_0x0084
            r0 = r12[r1]     // Catch:{ all -> 0x00d3 }
            boolean r0 = r14.startsWith(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0049
            boolean r0 = A02     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0039
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00d3 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0082
        L_0x0039:
            java.util.HashMap r4 = A01     // Catch:{ all -> 0x00d3 }
            android.net.Uri r9 = A05     // Catch:{ all -> 0x00d3 }
            r13 = r10
            r11 = r10
            android.database.Cursor r3 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00d3 }
            java.util.TreeMap r2 = new java.util.TreeMap     // Catch:{ all -> 0x00d3 }
            r2.<init>()     // Catch:{ all -> 0x00d3 }
            goto L_0x004c
        L_0x0049:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x004c:
            if (r3 != 0) goto L_0x004f
            goto L_0x0064
        L_0x004f:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = r3.getString(r6)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r3.getString(r5)     // Catch:{ all -> 0x007d }
            r2.put(r1, r0)     // Catch:{ all -> 0x007d }
            goto L_0x004f
        L_0x0061:
            r3.close()     // Catch:{ all -> 0x00d3 }
        L_0x0064:
            r4.putAll(r2)     // Catch:{ all -> 0x00d3 }
            A02 = r5     // Catch:{ all -> 0x00d3 }
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00d3 }
            boolean r0 = r0.containsKey(r14)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0082
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00d3 }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0082
        L_0x007b:
            r10 = r0
            goto L_0x0082
        L_0x007d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x0082:
            monitor-exit(r7)     // Catch:{ all -> 0x00d3 }
            return r10
        L_0x0084:
            monitor-exit(r7)     // Catch:{ all -> 0x00d3 }
            android.net.Uri r9 = A04
            java.lang.String[] r12 = new java.lang.String[r5]
            r12[r6] = r14
            r13 = r10
            r11 = r10
            android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13)
            if (r2 == 0) goto L_0x00b8
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00b8
            java.lang.String r1 = r2.getString(r5)     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00a6
            boolean r0 = r1.equals(r10)     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00a6
            r1 = r10
        L_0x00a6:
            monitor-enter(r7)     // Catch:{ all -> 0x00cc }
            java.lang.Object r0 = A00     // Catch:{ all -> 0x00b5 }
            if (r3 != r0) goto L_0x00b0
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00b5 }
            r0.put(r14, r1)     // Catch:{ all -> 0x00b5 }
        L_0x00b0:
            monitor-exit(r7)     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x00c5
            r10 = r1
            goto L_0x00c5
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00b5 }
            goto L_0x00cb
        L_0x00b8:
            monitor-enter(r7)     // Catch:{ all -> 0x00cc }
            java.lang.Object r0 = A00     // Catch:{ all -> 0x00c9 }
            if (r3 != r0) goto L_0x00c2
            java.util.HashMap r0 = A01     // Catch:{ all -> 0x00c9 }
            r0.put(r14, r10)     // Catch:{ all -> 0x00c9 }
        L_0x00c2:
            monitor-exit(r7)     // Catch:{ all -> 0x00c9 }
            if (r2 == 0) goto L_0x00c8
        L_0x00c5:
            r2.close()
        L_0x00c8:
            return r10
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00c9 }
        L_0x00cb:
            throw r0     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            if (r2 == 0) goto L_0x00d2
            r2.close()
        L_0x00d2:
            throw r0
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00d3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90434e8.A00(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    public static void A01(ContentResolver contentResolver) {
        if (A01 == null) {
            A0A.set(false);
            A01 = AnonymousClass000.A0x();
            A00 = C13690nt.A0Y();
            A02 = false;
            contentResolver.registerContentObserver(A04, true, new C63603Kp());
        } else if (A0A.getAndSet(false)) {
            A01.clear();
            A06.clear();
            A07.clear();
            A08.clear();
            A09.clear();
            A00 = C13690nt.A0Y();
            A02 = false;
        }
    }
}
