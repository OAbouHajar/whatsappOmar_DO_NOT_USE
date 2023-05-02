package X;

/* renamed from: X.06h  reason: invalid class name and case insensitive filesystem */
public abstract class C012906h implements AnonymousClass02F {
    public final C013106j A00;

    public C012906h(C013106j r1) {
        this.A00 = r1;
    }

    public abstract boolean A00();

    public boolean AJb(CharSequence charSequence, int i2, int i3) {
        if (i3 < 0 || charSequence.length() - i3 < 0) {
            throw new IllegalArgumentException();
        }
        C013106j r0 = this.A00;
        if (r0 != null) {
            int A66 = r0.A66(charSequence, 0, i3);
            if (A66 == 0) {
                return true;
            }
            if (A66 == 1) {
                return false;
            }
        }
        return A00();
    }
}
