package X;

import android.hardware.Camera;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.5vQ  reason: invalid class name */
public class AnonymousClass5vQ {
    public final int A00;
    public final int A01;
    public final int A02;

    public AnonymousClass5vQ(int i2, int i3) {
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i2 * i3;
    }

    public static int A00(AbstractCollection abstractCollection, List list, int i2) {
        Camera.Size size = (Camera.Size) list.get(i2);
        abstractCollection.add(new AnonymousClass5vQ(size.width, size.height));
        return i2 + 1;
    }

    public static void A01(AnonymousClass5vQ r2, StringBuilder sb) {
        sb.append(r2.A02);
        sb.append('x');
        sb.append(r2.A01);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5vQ)) {
            return false;
        }
        AnonymousClass5vQ r4 = (AnonymousClass5vQ) obj;
        return this.A02 == r4.A02 && this.A01 == r4.A01;
    }

    public int hashCode() {
        int i2 = this.A01;
        int i3 = this.A02;
        return i2 ^ ((i3 >>> 16) | (i3 << 16));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A02);
        A0o.append("x");
        return AnonymousClass000.A0l(A0o, this.A01);
    }
}
