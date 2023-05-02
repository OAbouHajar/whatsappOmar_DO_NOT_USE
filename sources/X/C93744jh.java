package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.4jh  reason: invalid class name and case insensitive filesystem */
public final class C93744jh implements InputFilter {
    public final int A00;

    public C93744jh(int i2) {
        this.A00 = i2;
    }

    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        int A01 = C31011dK.A01(spanned, 0, spanned.length());
        int A012 = C31011dK.A01(spanned, i4, i5);
        int A013 = C31011dK.A01(charSequence, i2, i3);
        int i6 = (this.A00 - A01) + A012;
        if (i6 <= 0) {
            return "";
        }
        if (i6 >= A013) {
            return null;
        }
        return C40651uT.A01(charSequence, i2, i3, i6);
    }
}
