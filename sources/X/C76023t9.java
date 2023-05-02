package X;

import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.3t9  reason: invalid class name and case insensitive filesystem */
public class C76023t9 extends AnonymousClass2BE {
    public final long A00;
    public final C25791Ld A01;
    public final String A02;

    public C76023t9(C38631rA r1, C25791Ld r2, File file, String str, long j2, long j3) {
        super(r1, file, j2);
        this.A01 = r2;
        this.A00 = j3;
        this.A02 = str;
    }

    public long ABq() {
        return this.A00;
    }

    public String ADk() {
        String str = this.A02;
        return str == null ? "application/*" : str;
    }

    public Bitmap Agi(int i2) {
        Bitmap A012;
        C25791Ld r3 = this.A01;
        C16730tY r2 = this.A03;
        synchronized (r3) {
            AnonymousClass00B.A00();
            A012 = C25791Ld.A01(r2, 100, false, false);
            if (A012 == null) {
                C16870tm A0F = r2.A0F();
                if (!A0F.A05()) {
                    r3.A03.A01(A0F);
                    byte[] A07 = A0F.A07();
                    if (A07 != null) {
                        A012 = AnonymousClass25U.A00(C25791Ld.A07, A07, 100);
                    }
                }
                A012 = null;
            }
        }
        return A012;
    }

    public int getType() {
        return 4;
    }
}
