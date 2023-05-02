package X;

import java.io.File;
import java.util.zip.ZipFile;

/* renamed from: X.1eN  reason: invalid class name and case insensitive filesystem */
public class C31551eN extends C31501eI {
    public AnonymousClass3U4[] A00;
    public final C31221dk A01;
    public final File A02;
    public final ZipFile A03;
    public final /* synthetic */ C31351e0 A04;
    public final /* synthetic */ C31351e0 A05;

    public C31551eN(C31351e0 r3, C31351e0 r4) {
        this.A04 = r3;
        this.A05 = r3;
        this.A03 = new ZipFile(r3.A00);
        this.A01 = r4;
        this.A02 = new File(r3.A03.getApplicationInfo().nativeLibraryDir);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3U4[] A00() {
        /*
            r15 = this;
            X.3U4[] r5 = r15.A00
            if (r5 != 0) goto L_0x015a
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r0 = "^lib/([^/]+)/([^/]+\\.so)$"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r0)
            java.lang.String[] r6 = X.C31331dy.A02()
            java.util.zip.ZipFile r0 = r15.A03
            java.util.Enumeration r9 = r0.entries()
        L_0x001e:
            boolean r0 = r9.hasMoreElements()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r5 = r9.nextElement()
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5
            java.lang.String r0 = r5.getName()
            java.util.regex.Matcher r1 = r7.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x001e
            r0 = 1
            java.lang.String r8 = r1.group(r0)
            r0 = 2
            java.lang.String r2 = r1.group(r0)
            r1 = 0
        L_0x0043:
            int r0 = r6.length
            if (r1 >= r0) goto L_0x001e
            r0 = r6[r1]
            if (r0 == 0) goto L_0x006c
            r0 = r6[r1]
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x006c
            if (r1 < 0) goto L_0x001e
            r4.add(r8)
            java.lang.Object r0 = r3.get(r2)
            X.3U4 r0 = (X.AnonymousClass3U4) r0
            if (r0 == 0) goto L_0x0063
            int r0 = r0.A00
            if (r1 >= r0) goto L_0x001e
        L_0x0063:
            X.3U4 r0 = new X.3U4
            r0.<init>(r2, r5, r1)
            r3.put(r2, r0)
            goto L_0x001e
        L_0x006c:
            int r1 = r1 + 1
            goto L_0x0043
        L_0x006f:
            X.1dk r1 = r15.A01
            int r0 = r4.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.A02 = r0
            java.util.Collection r1 = r3.values()
            int r0 = r3.size()
            X.3U4[] r0 = new X.AnonymousClass3U4[r0]
            java.lang.Object[] r4 = r1.toArray(r0)
            X.3U4[] r4 = (X.AnonymousClass3U4[]) r4
            java.util.Arrays.sort(r4)
            r3 = 0
            r5 = 0
            r2 = 0
        L_0x0095:
            int r6 = r4.length
            if (r5 >= r6) goto L_0x0147
            r0 = r4[r5]
            java.util.zip.ZipEntry r7 = r0.A01
            java.lang.String r6 = r0.A01
            java.lang.String r11 = r7.getName()
            X.1e0 r1 = r15.A04
            java.lang.String r0 = r1.A01
            boolean r0 = r6.equals(r0)
            r14 = 0
            r12 = 1
            if (r0 == 0) goto L_0x00cc
            r0 = 0
            r1.A01 = r0
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r3] = r6
            java.lang.String r0 = "allowing consideration of corrupted lib %s"
        L_0x00b7:
            java.lang.String r1 = java.lang.String.format(r0, r1)
            r14 = 1
        L_0x00bc:
            java.lang.String r0 = "ApkSoSource"
            android.util.Log.d(r0, r1)
            if (r14 == 0) goto L_0x00c8
            int r2 = r2 + 1
        L_0x00c5:
            int r5 = r5 + 1
            goto L_0x0095
        L_0x00c8:
            r0 = 0
            r4[r5] = r0
            goto L_0x00c5
        L_0x00cc:
            java.io.File r0 = r15.A02
            java.io.File r13 = new java.io.File
            r13.<init>(r0, r6)
            r1 = 3
            r10 = 2
            java.lang.String r8 = r13.getCanonicalPath()     // Catch:{ IOException -> 0x0132 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0132 }
            boolean r0 = r8.startsWith(r0)     // Catch:{ IOException -> 0x0132 }
            if (r0 != 0) goto L_0x00f0
            java.lang.String r7 = "not allowing consideration of %s: %s not in lib dir"
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x0132 }
            r0[r3] = r11     // Catch:{ IOException -> 0x0132 }
            r0[r12] = r6     // Catch:{ IOException -> 0x0132 }
            java.lang.String r1 = java.lang.String.format(r7, r0)     // Catch:{ IOException -> 0x0132 }
            goto L_0x00bc
        L_0x00f0:
            boolean r0 = r13.isFile()
            if (r0 != 0) goto L_0x00ff
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r3] = r11
            r1[r12] = r6
            java.lang.String r0 = "allowing consideration of %s: %s not in system lib dir"
            goto L_0x00b7
        L_0x00ff:
            long r8 = r13.length()
            long r6 = r7.getSize()
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x011e
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r13
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r1[r12] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r1[r10] = r0
            java.lang.String r0 = "allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK"
            goto L_0x00b7
        L_0x011e:
            java.lang.String r0 = "not allowing consideration of "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r0 = ": deferring to libdir"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            goto L_0x00bc
        L_0x0132:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r11
            r1[r12] = r6
            java.lang.String r0 = r0.toString()
            r1[r10] = r0
            java.lang.String r0 = "not allowing consideration of %s: %s, IOException when constructing path: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            goto L_0x00bc
        L_0x0147:
            X.3U4[] r5 = new X.AnonymousClass3U4[r2]
            r2 = 0
        L_0x014a:
            if (r3 >= r6) goto L_0x0158
            r1 = r4[r3]
            if (r1 == 0) goto L_0x0155
            int r0 = r2 + 1
            r5[r2] = r1
            r2 = r0
        L_0x0155:
            int r3 = r3 + 1
            goto L_0x014a
        L_0x0158:
            r15.A00 = r5
        L_0x015a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31551eN.A00():X.3U4[]");
    }
}
