package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.39E  reason: invalid class name */
public class AnonymousClass39E {
    public final C15860rz A00;
    public final C14710pd A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public AnonymousClass39E(C16180sb r3, C15860rz r4, C14710pd r5) {
        this.A01 = r5;
        this.A00 = r4;
        try {
            File file = r3.A05().A02;
            C16180sb.A04(file, false);
            this.A02 = file.getCanonicalPath();
            File file2 = r3.A05().A0M;
            C16180sb.A04(file2, false);
            this.A05 = file2.getCanonicalPath();
            this.A03 = r3.A05().A05.getCanonicalPath();
            File file3 = r3.A05().A0A;
            C16180sb.A04(file3, false);
            this.A04 = file3.getCanonicalPath();
            this.A06 = r3.A05().A0N.getCanonicalPath();
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r10.startsWith(r8.A02) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        if (r10.startsWith(r8.A05) == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(java.io.File r9, java.lang.String r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x000b
            java.lang.String r0 = r8.A05
            boolean r1 = r10.startsWith(r0)
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r7 = 0
            if (r0 != 0) goto L_0x0021
            X.0rz r0 = r8.A00
            boolean r0 = r0.A1a()
            if (r0 != 0) goto L_0x0022
            if (r10 == 0) goto L_0x0022
            java.lang.String r0 = r8.A06
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            return r7
        L_0x0022:
            X.0pd r6 = r8.A01
            r0 = 1239(0x4d7, float:1.736E-42)
            X.0tM r5 = X.C16620tM.A02
            int r0 = r6.A03(r5, r0)
            long r3 = (long) r0
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r1
            r0 = 1240(0x4d8, float:1.738E-42)
            int r0 = r6.A03(r5, r0)
            long r5 = (long) r0
            long r5 = r5 * r1
            if (r10 == 0) goto L_0x0044
            java.lang.String r0 = r8.A02
            boolean r1 = r10.startsWith(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            long r1 = r9.length()
            if (r0 == 0) goto L_0x004c
            r3 = r5
        L_0x004c:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
            java.lang.String r0 = "gdrive-util/should-backup/too-large "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r9.getAbsolutePath()
            r2.append(r0)
            java.lang.String r0 = " size:"
            r2.append(r0)
            long r0 = r9.length()
            java.lang.String r0 = X.C13680ns.A0j(r2, r0)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x006e:
            java.lang.String r1 = r9.getName()
            java.lang.String r0 = "."
            int r2 = r1.lastIndexOf(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0084
            int r1 = r1.length()
            r0 = 1
            int r1 = r1 - r0
            if (r2 == r1) goto L_0x0084
            return r0
        L_0x0084:
            r9.getAbsolutePath()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39E.A00(java.io.File, java.lang.String):boolean");
    }
}
