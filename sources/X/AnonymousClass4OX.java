package X;

import java.io.File;

/* renamed from: X.4OX  reason: invalid class name */
public class AnonymousClass4OX {
    public final long A00;
    public final long A01;
    public final C43061zH A02;
    public final C43131zO A03;
    public final C29561ap A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public AnonymousClass4OX(C43061zH r7, C43131zO r8, AnonymousClass1XK r9, C29561ap r10, File file, String str, long j2, boolean z2, boolean z3, boolean z4) {
        long j3;
        this.A05 = str;
        this.A00 = j2;
        this.A02 = r7;
        this.A06 = z2;
        this.A03 = r8;
        this.A07 = z3;
        this.A04 = r10;
        if (j2 <= 0 || file != null) {
            if (file == null || !(r9 == AnonymousClass1XK.A0B || r9 == AnonymousClass1XK.A05 || r9 == AnonymousClass1XK.A0X || r9 == AnonymousClass1XK.A08 || r9 == AnonymousClass1XK.A0S)) {
                j3 = -1;
            } else {
                j3 = file.length();
                if (z4) {
                    j3 = (j3 - (j3 % 16)) + 16 + 10;
                }
            }
            this.A01 = j3;
            return;
        }
        throw AnonymousClass000.A0T("Must provide file for upload continuation");
    }
}
