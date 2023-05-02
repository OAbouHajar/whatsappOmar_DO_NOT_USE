package X;

import javax.security.auth.Destroyable;

/* renamed from: X.1fL  reason: invalid class name and case insensitive filesystem */
public class C31981fL implements Destroyable {
    public boolean A00;
    public final C31991fM A01;
    public final C35891mf A02;

    public C31981fL(C31991fM r1, C35891mf r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public static C31981fL A00() {
        AnonymousClass5T9 r0 = C36471nb.A00().A00;
        byte[] A9P = r0.A9P();
        return new C31981fL(new C31991fM(A9P), new C35891mf(r0.generatePublicKey(A9P)));
    }

    public byte[] A01() {
        return C28641Wx.A04(this.A01.A01, this.A02.A01);
    }

    public void destroy() {
        if (!this.A00) {
            this.A01.destroy();
            this.A02.destroy();
            this.A00 = true;
        }
    }

    public boolean isDestroyed() {
        return this.A00;
    }
}
