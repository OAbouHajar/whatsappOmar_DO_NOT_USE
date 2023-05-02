package X;

import android.text.TextUtils;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.1de  reason: invalid class name and case insensitive filesystem */
public abstract class C31181de {
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a6, code lost:
        r13 = new X.C31451eD(r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r2 = com.facebook.soloader.SoLoader.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ad, code lost:
        if (r2 == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00af, code lost:
        com.facebook.soloader.Api18TraceUtils.A01("SoLoader.getElfDependencies[", r5, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r14 = X.C31441eC.A03(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ba, code lost:
        if (r2 == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bf, code lost:
        r11 = r14.length;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        if (r10 >= r11) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c3, code lost:
        r2 = r14[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c9, code lost:
        if (r2.startsWith("/") != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cb, code lost:
        com.facebook.soloader.SoLoader.A05(r6, r2, (java.lang.String) null, r4 | 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d1, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012e, code lost:
        if (r2 != false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0133, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0134, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0138 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(android.os.StrictMode.ThreadPolicy r18, java.lang.String r19, int r20) {
        /*
            r17 = this;
            r4 = r20
            r7 = r17
            boolean r0 = r7 instanceof X.C31161dc
            r5 = r19
            r6 = r18
            if (r0 == 0) goto L_0x003c
            X.1dc r7 = (X.C31161dc) r7
            boolean r0 = r7 instanceof X.C31221dk
            if (r0 == 0) goto L_0x0035
            X.1dk r7 = (X.C31221dk) r7
            java.util.Map r0 = r7.A04
            monitor-enter(r0)
            java.lang.Object r2 = r0.get(r5)     // Catch:{ all -> 0x0032 }
            if (r2 != 0) goto L_0x0025
            java.lang.Object r2 = new java.lang.Object     // Catch:{ all -> 0x0032 }
            r2.<init>()     // Catch:{ all -> 0x0032 }
            r0.put(r5, r2)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            monitor-enter(r2)
            java.io.File r0 = r7.A01     // Catch:{ all -> 0x002f }
            int r0 = r7.A02(r6, r0, r5, r4)     // Catch:{ all -> 0x002f }
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            return r0
        L_0x002f:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            throw r1
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1
        L_0x0035:
            java.io.File r0 = r7.A01
            int r0 = r7.A02(r6, r0, r5, r4)
            return r0
        L_0x003c:
            boolean r0 = r7 instanceof X.C31321dx
            if (r0 == 0) goto L_0x0161
            X.1dx r7 = (X.C31321dx) r7
            X.1C4 r0 = com.facebook.soloader.SoLoader.A04
            if (r0 == 0) goto L_0x0159
            java.util.Set r0 = r7.A02
            java.util.Iterator r16 = r0.iterator()
        L_0x004c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r8 = r16.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map r0 = r7.A01
            java.lang.Object r1 = r0.get(r8)
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r9 = " not found on "
            java.lang.String r3 = "SoLoader"
            if (r0 != 0) goto L_0x0116
            if (r1 == 0) goto L_0x0116
            boolean r0 = r1.contains(r5)
            if (r0 == 0) goto L_0x0116
            java.lang.String r15 = "/"
            java.io.File r0 = r7.A00
            java.util.zip.ZipFile r12 = new java.util.zip.ZipFile
            r12.<init>(r0)
            java.util.Enumeration r10 = r12.entries()     // Catch:{ all -> 0x0152 }
        L_0x007f:
            boolean r0 = r10.hasMoreElements()     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r2 = r10.nextElement()     // Catch:{ all -> 0x0152 }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ all -> 0x0152 }
            if (r2 == 0) goto L_0x007f
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x0152 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0152 }
            r0.<init>()     // Catch:{ all -> 0x0152 }
            r0.append(r15)     // Catch:{ all -> 0x0152 }
            r0.append(r5)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0152 }
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x007f
            X.1eD r13 = new X.1eD     // Catch:{ all -> 0x0152 }
            r13.<init>(r2, r12)     // Catch:{ all -> 0x0152 }
            boolean r2 = com.facebook.soloader.SoLoader.A0B     // Catch:{ all -> 0x0134 }
            if (r2 == 0) goto L_0x00b6
            java.lang.String r1 = "SoLoader.getElfDependencies["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r5, r0)     // Catch:{ all -> 0x0134 }
        L_0x00b6:
            java.lang.String[] r14 = X.C31441eC.A03(r13)     // Catch:{ all -> 0x012d }
            if (r2 == 0) goto L_0x00bf
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0134 }
        L_0x00bf:
            int r11 = r14.length     // Catch:{ all -> 0x0134 }
            r10 = 0
        L_0x00c1:
            if (r10 >= r11) goto L_0x00d4
            r2 = r14[r10]     // Catch:{ all -> 0x0134 }
            boolean r0 = r2.startsWith(r15)     // Catch:{ all -> 0x0134 }
            if (r0 != 0) goto L_0x00d1
            r1 = r4 | 1
            r0 = 0
            com.facebook.soloader.SoLoader.A05(r6, r2, r0, r1)     // Catch:{ all -> 0x0134 }
        L_0x00d1:
            int r10 = r10 + 1
            goto L_0x00c1
        L_0x00d4:
            r13.close()     // Catch:{ all -> 0x0152 }
        L_0x00d7:
            r12.close()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x00f6 }
            r1.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x00f6 }
            r1.append(r8)     // Catch:{ UnsatisfiedLinkError -> 0x00f6 }
            java.lang.String r0 = java.io.File.separator     // Catch:{ UnsatisfiedLinkError -> 0x00f6 }
            r1.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00f6 }
            r1.append(r5)     // Catch:{ UnsatisfiedLinkError -> 0x00f6 }
            java.lang.String r1 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x00f6 }
            r4 = r4 | 4
            X.1C4 r0 = com.facebook.soloader.SoLoader.A04     // Catch:{ UnsatisfiedLinkError -> 0x00f6 }
            r0.AKC(r1, r4)     // Catch:{ UnsatisfiedLinkError -> 0x00f6 }
            goto L_0x0139
        L_0x00f6:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r9)
            r1.append(r8)
            java.lang.String r0 = " flag: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0, r2)
            goto L_0x004c
        L_0x0116:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r9)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
            goto L_0x004c
        L_0x012d:
            r0 = move-exception
            if (r2 == 0) goto L_0x0133
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0134 }
        L_0x0133:
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0138 }
        L_0x0138:
            throw r0     // Catch:{ all -> 0x0152 }
        L_0x0139:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = " found on "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r3, r0)
            r0 = 1
            return r0
        L_0x0152:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0156 }
        L_0x0156:
            throw r0
        L_0x0157:
            r0 = 0
            return r0
        L_0x0159:
            java.lang.String r0 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0161:
            X.1df r7 = (X.C31191df) r7
            X.1dc r0 = r7.A02
            int r0 = r0.A00(r6, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31181de.A00(android.os.StrictMode$ThreadPolicy, java.lang.String, int):int");
    }

    public void A01(int i2) {
        int indexOf;
        int i3;
        if (this instanceof C31321dx) {
            C31321dx r5 = (C31321dx) this;
            String str = null;
            for (String str2 : r5.A02) {
                if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf(33)) >= 0 && (i3 = indexOf + 2) < str2.length()) {
                    str = str2.substring(i3);
                }
                if (!TextUtils.isEmpty(str)) {
                    ZipFile zipFile = new ZipFile(r5.A00);
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                            if (zipEntry != null && zipEntry.getName().startsWith(str) && zipEntry.getName().endsWith(".so") && zipEntry.getMethod() == 0) {
                                String substring = zipEntry.getName().substring(str.length() + 1);
                                synchronized (r5) {
                                    Map map = r5.A01;
                                    if (!map.containsKey(str2)) {
                                        map.put(str2, new HashSet());
                                    }
                                    ((Set) map.get(str2)).add(substring);
                                }
                            }
                        }
                        zipFile.close();
                    } catch (Throwable th) {
                        try {
                            zipFile.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                }
            }
        } else if (this instanceof C31191df) {
            ((C31191df) this).A02.A01(i2);
        }
    }
}
