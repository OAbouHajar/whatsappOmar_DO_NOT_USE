package X;

/* renamed from: X.4ps  reason: invalid class name and case insensitive filesystem */
public final class C97364ps implements AnonymousClass5TE {
    public final int A00;

    public C97364ps(int i2) {
        this.A00 = i2;
    }

    public AnonymousClass5TE A6I() {
        return new C97364ps(0);
    }

    public AnonymousClass5TE A6J(int i2, int i3) {
        return new C97364ps(this.A00 + i3);
    }

    public AnonymousClass5TE A6K(int i2, int i3) {
        return new C97364ps(this.A00 - i3);
    }

    public int ACJ() {
        return this.A00 > 0 ? 0 : -1;
    }

    public int AD2() {
        int i2 = this.A00;
        int i3 = i2 - 1;
        if (i2 <= 0) {
            return -1;
        }
        return i3;
    }

    public int ADv(int i2) {
        int i3 = i2 + 1;
        if (i3 >= this.A00) {
            return -1;
        }
        return i3;
    }

    public int AFC(int i2) {
        int i3 = i2 - 1;
        if (i3 >= 0) {
            return i3;
        }
        return -1;
    }

    public int getLength() {
        return this.A00;
    }
}
