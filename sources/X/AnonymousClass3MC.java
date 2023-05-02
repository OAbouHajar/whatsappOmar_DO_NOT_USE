package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.3MC  reason: invalid class name */
public class AnonymousClass3MC extends InputFilter.AllCaps {
    public final /* synthetic */ C59092uf A00;

    public AnonymousClass3MC(C59092uf r1) {
        this.A00 = r1;
    }

    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        return String.valueOf(charSequence).toLowerCase(this.A00.A00.AH6());
    }
}
