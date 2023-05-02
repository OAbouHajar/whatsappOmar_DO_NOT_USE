package X;

import java.io.File;

/* renamed from: X.5uT  reason: invalid class name and case insensitive filesystem */
public class C118305uT {
    public C38411qk A00;
    public final C14870pt A01;
    public final C17130ua A02;
    public final C16980tz A03;
    public final C19950zG A04;

    public C118305uT(C14870pt r1, C17130ua r2, C16980tz r3, C19950zG r4) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r4;
    }

    public C38411qk A00() {
        C38411qk r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C38461qp r1 = new C38461qp(this.A01, this.A02, this.A04, new File(this.A03.A00.getCacheDir(), "bloks_images"), "bloks-bridge-manager");
        r1.A00 = Integer.MAX_VALUE;
        r1.A05 = true;
        C38411qk A002 = r1.A00();
        this.A00 = A002;
        return A002;
    }
}
