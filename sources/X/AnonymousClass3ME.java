package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.3ME  reason: invalid class name */
public final class AnonymousClass3ME extends SpannableStringBuilder {
    public AnonymousClass3ME(CharSequence charSequence) {
        super(charSequence);
    }

    public char charAt(int i2) {
        if (i2 < 0 || i2 >= length()) {
            return ' ';
        }
        return super.charAt(i2);
    }

    public void getChars(int i2, int i3, char[] cArr, int i4) {
        int length;
        if (i3 >= i2 && i2 <= (length = length()) && i3 <= length && i2 >= 0 && i3 >= 0) {
            super.getChars(i2, i3, cArr, i4);
        }
    }
}
