package X;

/* renamed from: X.0GH  reason: invalid class name */
public class AnonymousClass0GH extends C019409a {
    public AnonymousClass0GD A00;

    public AnonymousClass0GH(AnonymousClass0GD r1) {
        this.A00 = r1;
    }

    public void AZC(C015707n r3) {
        AnonymousClass0GD r1 = this.A00;
        int i2 = r1.A01 - 1;
        r1.A01 = i2;
        if (i2 == 0) {
            r1.A04 = false;
            r1.A0E();
        }
        r3.A09(this);
    }

    public void AZF(C015707n r3) {
        AnonymousClass0GD r1 = this.A00;
        if (!r1.A04) {
            r1.A0G();
            r1.A04 = true;
        }
    }
}
