package X;

import android.content.res.Resources;

/* renamed from: X.08H  reason: invalid class name */
public final class AnonymousClass08H {
    public final Resources.Theme A00;
    public final Resources A01;

    public AnonymousClass08H(Resources.Theme theme, Resources resources) {
        this.A01 = resources;
        this.A00 = theme;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass08H.class != obj.getClass()) {
                return false;
            }
            AnonymousClass08H r5 = (AnonymousClass08H) obj;
            if (!this.A01.equals(r5.A01) || !AnonymousClass08I.A01(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass08I.A00(this.A01, this.A00);
    }
}
