package X;

/* renamed from: X.5hb  reason: invalid class name and case insensitive filesystem */
public class C111895hb extends C23311Bm {
    public boolean A00;
    public final C15860rz A01;
    public final C14710pd A02;
    public final C16320sq A03;

    public C111895hb(C15860rz r1, C14710pd r2, C16320sq r3) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
    }

    public void A00() {
        if (!this.A00 && this.A02.A0C(544)) {
            this.A03.Acl(new AnonymousClass651(this));
        }
    }

    public void A01() {
        this.A00 = this.A02.A0C(544);
    }
}
