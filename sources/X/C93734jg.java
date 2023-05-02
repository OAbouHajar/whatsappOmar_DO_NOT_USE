package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.4jg  reason: invalid class name and case insensitive filesystem */
public class C93734jg implements InputFilter {
    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        while (i2 < i3) {
            if (Character.isWhitespace(charSequence.charAt(i2))) {
                return "";
            }
            i2++;
        }
        return null;
    }
}
