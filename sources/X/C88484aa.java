package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.4aa  reason: invalid class name and case insensitive filesystem */
public class C88484aa {
    public final File A00;

    public C88484aa(File file) {
        this.A00 = file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r0 = "_";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r2 != '.') goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r2 > r0) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.lang.String r6) {
        /*
            int r5 = r6.length()
            java.lang.StringBuilder r4 = X.C13690nt.A0g(r5)
            r3 = 0
        L_0x0009:
            if (r3 >= r5) goto L_0x003d
            char r2 = r6.charAt(r3)
            r0 = 65
            if (r2 < r0) goto L_0x0029
            r0 = 90
            if (r2 <= r0) goto L_0x0038
            r0 = 97
            r1 = 95
            if (r2 < r0) goto L_0x0032
            r0 = 122(0x7a, float:1.71E-43)
        L_0x001f:
            if (r2 <= r0) goto L_0x0038
        L_0x0021:
            java.lang.String r0 = "_"
        L_0x0023:
            r4.append(r0)
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0029:
            r0 = 48
            r1 = 45
            if (r2 < r0) goto L_0x0032
            r0 = 57
            goto L_0x001f
        L_0x0032:
            if (r2 == r1) goto L_0x0038
            r0 = 46
            if (r2 != r0) goto L_0x0021
        L_0x0038:
            java.lang.Character r0 = java.lang.Character.valueOf(r2)
            goto L_0x0023
        L_0x003d:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88484aa.A00(java.lang.String):java.lang.String");
    }

    public String A01(String str) {
        File file = this.A00;
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        try {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(file.getCanonicalPath());
            A0o.append(File.separator);
            A0o.append(str);
            return A0o.toString();
        } catch (IOException unused) {
            return null;
        }
    }
}
