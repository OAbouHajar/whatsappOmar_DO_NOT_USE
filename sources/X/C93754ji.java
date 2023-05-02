package X;

import android.text.InputFilter;
import android.text.Spanned;
import java.lang.ref.WeakReference;

/* renamed from: X.4ji  reason: invalid class name and case insensitive filesystem */
public class C93754ji implements InputFilter {
    public final WeakReference A00;

    public C93754ji(AnonymousClass1ZK r2) {
        this.A00 = C13690nt.A0h(r2);
    }

    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        AnonymousClass1ZK r0 = (AnonymousClass1ZK) this.A00.get();
        if (r0 == null || r0.A0P == null) {
            return null;
        }
        return "";
    }
}
