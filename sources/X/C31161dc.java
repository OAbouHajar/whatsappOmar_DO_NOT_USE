package X;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1dc  reason: invalid class name and case insensitive filesystem */
public class C31161dc extends C31181de {
    public final int A00;
    public final File A01;
    public final List A02;

    public C31161dc(File file, String[] strArr, int i2) {
        this.A01 = file;
        this.A00 = i2;
        this.A02 = Arrays.asList(strArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ff A[SYNTHETIC, Splitter:B:44:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109 A[Catch:{ UnsatisfiedLinkError -> 0x0118, all -> 0x00e2, all -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(android.os.StrictMode.ThreadPolicy r12, java.io.File r13, java.lang.String r14, int r15) {
        /*
            r11 = this;
            X.1C4 r0 = com.facebook.soloader.SoLoader.A04
            if (r0 == 0) goto L_0x0150
            java.util.List r0 = r11.A02
            boolean r0 = r0.contains(r14)
            r5 = 0
            java.lang.String r4 = "SoLoader"
            if (r0 == 0) goto L_0x002b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r0 = " is on the denyList, skip loading from "
            r1.append(r0)
            java.lang.String r0 = r13.getCanonicalPath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r4, r0)
            return r5
        L_0x002b:
            java.io.File r0 = r11.A01
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r14)
            boolean r0 = r2.exists()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 == 0) goto L_0x0139
            r1.append(r14)
            java.lang.String r0 = " found on "
            r1.append(r0)
            java.lang.String r0 = r13.getCanonicalPath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r4, r0)
            r0 = r15 & 1
            if (r0 == 0) goto L_0x0073
            int r0 = r11.A00
            r3 = 2
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0073
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r0 = " loaded implicitly"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r4, r0)
            return r3
        L_0x0073:
            r3 = 0
            int r0 = r11.A00
            r10 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x007c
            r5 = 1
        L_0x007c:
            java.lang.String r0 = r2.getName()
            boolean r9 = r0.equals(r14)
            if (r5 != 0) goto L_0x0088
            if (r9 != 0) goto L_0x00e9
        L_0x0088:
            X.1eA r0 = new X.1eA     // Catch:{ all -> 0x0132 }
            r0.<init>(r2)     // Catch:{ all -> 0x0132 }
            r3 = r0
            if (r5 == 0) goto L_0x00e9
            boolean r5 = com.facebook.soloader.SoLoader.A0B     // Catch:{ all -> 0x0132 }
            if (r5 == 0) goto L_0x009b
            java.lang.String r1 = "SoLoader.getElfDependencies["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r14, r0)     // Catch:{ all -> 0x0132 }
        L_0x009b:
            java.lang.String[] r7 = X.C31441eC.A03(r3)     // Catch:{ all -> 0x00e2 }
            if (r5 == 0) goto L_0x00a4
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0132 }
        L_0x00a4:
            java.lang.String r0 = "Loading "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
            r1.<init>(r0)     // Catch:{ all -> 0x0132 }
            r1.append(r14)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "'s dependencies: "
            r1.append(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = java.util.Arrays.toString(r7)     // Catch:{ all -> 0x0132 }
            r1.append(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0132 }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x0132 }
            int r8 = r7.length     // Catch:{ all -> 0x0132 }
            r6 = 0
        L_0x00c3:
            if (r6 >= r8) goto L_0x00fd
            r5 = r7[r6]     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "/"
            boolean r0 = r5.startsWith(r0)     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x00df
            r0 = 46
            int r1 = r5.indexOf(r0)     // Catch:{ all -> 0x0132 }
            r0 = 3
            r5.substring(r0, r1)     // Catch:{ all -> 0x0132 }
            r1 = 0
            r0 = r15 | 1
            com.facebook.soloader.SoLoader.A04(r12, r5, r1, r0)     // Catch:{ all -> 0x0132 }
        L_0x00df:
            int r6 = r6 + 1
            goto L_0x00c3
        L_0x00e2:
            r0 = move-exception
            if (r5 == 0) goto L_0x00e8
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0132 }
        L_0x00e8:
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x00e9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
            r1.<init>()     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "Not resolving dependencies for "
            r1.append(r0)     // Catch:{ all -> 0x0132 }
            r1.append(r14)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0132 }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x0132 }
        L_0x00fd:
            if (r9 == 0) goto L_0x0109
            X.1C4 r1 = com.facebook.soloader.SoLoader.A04     // Catch:{ UnsatisfiedLinkError -> 0x0118 }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x0118 }
            r1.AKC(r0, r15)     // Catch:{ UnsatisfiedLinkError -> 0x0118 }
            goto L_0x0112
        L_0x0109:
            X.1C4 r1 = com.facebook.soloader.SoLoader.A04     // Catch:{ UnsatisfiedLinkError -> 0x0118 }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x0118 }
            r1.AKE(r3, r0, r15)     // Catch:{ UnsatisfiedLinkError -> 0x0118 }
        L_0x0112:
            if (r3 == 0) goto L_0x0117
            r3.close()
        L_0x0117:
            return r10
        L_0x0118:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "bad ELF magic"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = "Corrupted lib file detected"
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x0132 }
            r0 = 3
            if (r3 == 0) goto L_0x0130
            r3.close()
        L_0x0130:
            return r0
        L_0x0131:
            throw r2     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r1 = move-exception
            if (r3 == 0) goto L_0x0157
            r3.close()
            throw r1
        L_0x0139:
            r1.append(r14)
            java.lang.String r0 = " not found on "
            r1.append(r0)
            java.lang.String r0 = r13.getCanonicalPath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r4, r0)
            return r5
        L_0x0150:
            java.lang.String r0 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
        L_0x0157:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31161dc.A02(android.os.StrictMode$ThreadPolicy, java.io.File, java.lang.String, int):int");
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.A01.getCanonicalPath());
        } catch (IOException unused) {
            str = this.A01.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }
}
