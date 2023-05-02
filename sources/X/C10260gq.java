package X;

/* renamed from: X.0gq  reason: invalid class name and case insensitive filesystem */
public class C10260gq implements Runnable {
    public boolean A00 = false;
    public final C011405n A01;
    public final C009604p A02;

    public C10260gq(C011405n r2, C009604p r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public void run() {
        if (!this.A00) {
            this.A02.A04(this.A01);
            this.A00 = true;
        }
    }
}
