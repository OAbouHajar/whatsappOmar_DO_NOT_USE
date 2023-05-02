package X;

import android.graphics.Rect;

/* renamed from: X.0RQ  reason: invalid class name */
public final class AnonymousClass0RQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AnonymousClass0RQ(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.A01 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A00 = i5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass0RQ.class.equals(obj == null ? null : obj.getClass())) {
                if (obj != null) {
                    AnonymousClass0RQ r5 = (AnonymousClass0RQ) obj;
                    if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                        return false;
                    }
                } else {
                    throw AnonymousClass000.A0W("null cannot be cast to non-null type androidx.window.core.Bounds");
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append("Bounds");
        A0o.append(" { [");
        A0o.append(this.A01);
        A0o.append(',');
        A0o.append(this.A03);
        A0o.append(',');
        A0o.append(this.A02);
        A0o.append(',');
        A0o.append(this.A00);
        return AnonymousClass000.A0h("] }", A0o);
    }
}
