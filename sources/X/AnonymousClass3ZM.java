package X;

/* renamed from: X.3ZM  reason: invalid class name */
public class AnonymousClass3ZM extends C98294rP {
    public AnonymousClass3Z1 A00;
    public boolean A01 = false;
    public final AnonymousClass3Z1 A02;

    public AnonymousClass3ZM(AnonymousClass3Z1 r3) {
        this.A02 = r3;
        this.A00 = (AnonymousClass3Z1) r3.A07(4);
    }

    public void A00() {
        if (this.A01) {
            AnonymousClass3Z1 r2 = (AnonymousClass3Z1) this.A00.A07(4);
            AnonymousClass3K3.A0Y(r2).AjF(r2, this.A00);
            this.A00 = r2;
            this.A01 = false;
        }
    }

    public final /* synthetic */ AnonymousClass5UZ AjA() {
        return this.A02;
    }

    public /* synthetic */ AnonymousClass5UZ AjB() {
        if (!this.A01) {
            AnonymousClass3Z1 r1 = this.A00;
            AnonymousClass3K3.A0Y(r1).AjE(r1);
            this.A01 = true;
        }
        return this.A00;
    }

    public /* synthetic */ Object clone() {
        AnonymousClass3ZM r3 = (AnonymousClass3ZM) this.A02.A07(5);
        r3.A00();
        AnonymousClass3Z1 r1 = r3.A00;
        AnonymousClass3K3.A0Y(r1).AjF(r1, (AnonymousClass3Z1) AjB());
        return r3;
    }
}
