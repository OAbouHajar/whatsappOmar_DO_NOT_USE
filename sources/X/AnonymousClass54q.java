package X;

import android.text.GetChars;
import android.text.Spannable;
import android.text.SpannableString;

/* renamed from: X.54q  reason: invalid class name */
public final class AnonymousClass54q implements CharSequence, Spannable, GetChars {
    public final SpannableString A00;

    public AnonymousClass54q(CharSequence charSequence) {
        this.A00 = new SpannableString(charSequence);
    }

    public char charAt(int i2) {
        if (i2 < 0 || i2 >= length()) {
            return ' ';
        }
        return this.A00.charAt(i2);
    }

    public void getChars(int i2, int i3, char[] cArr, int i4) {
        int length;
        if (i3 >= i2 && i2 <= (length = length()) && i3 <= length && i2 >= 0 && i3 >= 0) {
            this.A00.getChars(i2, i3, cArr, i4);
        }
    }

    public int getSpanEnd(Object obj) {
        return this.A00.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.A00.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.A00.getSpanStart(obj);
    }

    public Object[] getSpans(int i2, int i3, Class cls) {
        return this.A00.getSpans(i2, i3, cls);
    }

    public int length() {
        return this.A00.length();
    }

    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.A00.nextSpanTransition(i2, i3, cls);
    }

    public void removeSpan(Object obj) {
        this.A00.removeSpan(obj);
    }

    public void setSpan(Object obj, int i2, int i3, int i4) {
        this.A00.setSpan(obj, i2, i3, i4);
    }

    public CharSequence subSequence(int i2, int i3) {
        return this.A00.subSequence(i2, i3);
    }

    public final String toString() {
        return this.A00.toString();
    }
}
