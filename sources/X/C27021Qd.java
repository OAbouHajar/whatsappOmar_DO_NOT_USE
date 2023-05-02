package X;

import java.io.ByteArrayInputStream;
import java.io.File;

/* renamed from: X.1Qd  reason: invalid class name and case insensitive filesystem */
public class C27021Qd {
    public final AnonymousClass01Z A00;

    public C27021Qd(AnonymousClass01Z r1) {
        this.A00 = r1;
    }

    public File A00(C37771pi r3, byte[] bArr) {
        File A01 = A01(r3.A0F);
        if (A01 == null || !AnonymousClass1XI.A0Q(A01, new ByteArrayInputStream(bArr))) {
            return null;
        }
        return A01;
    }

    public File A01(String str) {
        File A0B = this.A00.A00.A0B();
        if (!A0B.exists() && !A0B.mkdirs()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".png");
        return new File(A0B, sb.toString());
    }
}
