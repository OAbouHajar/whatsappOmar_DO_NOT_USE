package X;

import android.graphics.Bitmap;

/* renamed from: X.2WR  reason: invalid class name */
public final class AnonymousClass2WR extends AnonymousClass2WQ {
    public final Bitmap A00;

    public AnonymousClass2WR(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2WR) && C18450wi.A0R(this.A00, ((AnonymousClass2WR) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DisplayBitmap(bitmap=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
