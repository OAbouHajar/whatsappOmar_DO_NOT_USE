package X;

import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.3t7  reason: invalid class name and case insensitive filesystem */
public class C76003t7 extends AnonymousClass2BE {
    public final long A00;

    public C76003t7(C16730tY r1, File file, long j2, long j3) {
        super(r1, file, j2);
        this.A00 = j3;
    }

    public long ABq() {
        return this.A00;
    }

    public String ADk() {
        return "image/gif";
    }

    public Bitmap Agi(int i2) {
        return C18830xK.A01(this.A04);
    }

    public int getType() {
        return 2;
    }
}
