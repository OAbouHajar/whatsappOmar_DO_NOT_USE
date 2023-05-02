package X;

import android.text.TextUtils;

/* renamed from: X.2Iy  reason: invalid class name and case insensitive filesystem */
public final class C47432Iy {
    public final CharSequence A00;
    public final CharSequence A01;

    public C47432Iy(CharSequence charSequence, CharSequence charSequence2) {
        this.A00 = charSequence;
        this.A01 = charSequence2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C47432Iy.class != obj.getClass()) {
                return false;
            }
            C47432Iy r5 = (C47432Iy) obj;
            if (!TextUtils.equals(this.A00, r5.A00) || !TextUtils.equals(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        CharSequence charSequence = this.A00;
        int i2 = 0;
        int hashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        CharSequence charSequence2 = this.A01;
        if (charSequence2 != null) {
            i2 = charSequence2.hashCode();
        }
        return hashCode + i2;
    }
}
