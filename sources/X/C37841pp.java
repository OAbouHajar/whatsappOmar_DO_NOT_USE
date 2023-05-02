package X;

import android.util.Size;

/* renamed from: X.1pp  reason: invalid class name and case insensitive filesystem */
public final class C37841pp {
    public final int A00;
    public final int A01;

    public C37841pp(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }

    public static C37841pp A00(Size size) {
        if (size != null) {
            return new C37841pp(size.getWidth(), size.getHeight());
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append("x");
        sb.append(this.A00);
        return sb.toString();
    }
}
