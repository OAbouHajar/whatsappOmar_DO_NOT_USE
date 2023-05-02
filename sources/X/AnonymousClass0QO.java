package X;

import android.text.TextUtils;
import androidx.preference.Preference;

/* renamed from: X.0QO  reason: invalid class name */
public class AnonymousClass0QO {
    public int A00;
    public int A01;
    public String A02;

    public AnonymousClass0QO(Preference preference) {
        this.A02 = AnonymousClass000.A0d(preference);
        this.A00 = preference.A01;
        this.A01 = preference.A03;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0QO)) {
            return false;
        }
        AnonymousClass0QO r4 = (AnonymousClass0QO) obj;
        return this.A00 == r4.A00 && this.A01 == r4.A01 && TextUtils.equals(this.A02, r4.A02);
    }

    public int hashCode() {
        return ((((527 + this.A00) * 31) + this.A01) * 31) + this.A02.hashCode();
    }
}
