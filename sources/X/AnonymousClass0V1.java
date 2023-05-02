package X;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.0V1  reason: invalid class name */
public final class AnonymousClass0V1 {
    public final LocusId A00;
    public final String A01;

    public AnonymousClass0V1(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A01 = str;
            this.A00 = Build.VERSION.SDK_INT >= 29 ? AnonymousClass0SY.A00(str) : null;
            return;
        }
        throw AnonymousClass000.A0T(String.valueOf("id cannot be empty"));
    }

    public static AnonymousClass0V1 A00(LocusId locusId) {
        if (locusId != null) {
            String A012 = AnonymousClass0SY.A01(locusId);
            if (!TextUtils.isEmpty(A012)) {
                return new AnonymousClass0V1(A012);
            }
            throw AnonymousClass000.A0T(String.valueOf("id cannot be empty"));
        }
        throw AnonymousClass000.A0W(String.valueOf("locusId cannot be null"));
    }

    public LocusId A01() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0V1.class != obj.getClass()) {
            return false;
        }
        String str = this.A01;
        String str2 = ((AnonymousClass0V1) obj).A01;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        return 31 + AnonymousClass000.A0G(this.A01);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("LocusIdCompat[");
        int length = this.A01.length();
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(length);
        A0r.append(AnonymousClass000.A0h("_chars", A0o));
        return AnonymousClass000.A0h("]", A0r);
    }
}
