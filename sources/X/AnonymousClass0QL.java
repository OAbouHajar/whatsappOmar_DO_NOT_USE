package X;

import android.net.Uri;

/* renamed from: X.0QL  reason: invalid class name */
public final class AnonymousClass0QL {
    public final Uri A00;
    public final boolean A01;

    public AnonymousClass0QL(Uri uri, boolean z2) {
        this.A00 = uri;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (AnonymousClass0QL.class.equals(obj != null ? obj.getClass() : null)) {
                C18450wi.A0M(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
                AnonymousClass0QL r5 = (AnonymousClass0QL) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return hashCode + i2;
    }
}
