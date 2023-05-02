package X;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.0Pv  reason: invalid class name and case insensitive filesystem */
public class C05240Pv {
    public int A00 = 0;
    public CharSequence A01 = null;
    public CharSequence A02 = null;
    public CharSequence A03 = null;
    public boolean A04 = true;
    public boolean A05 = false;

    public C05030Oy A00() {
        String str;
        if (!TextUtils.isEmpty(this.A03)) {
            int i2 = this.A00;
            if (AnonymousClass0L8.A00(i2)) {
                boolean A1O = i2 != 0 ? AnonymousClass000.A1O(i2 & 32768) : this.A05;
                if (TextUtils.isEmpty(this.A01) && !A1O) {
                    str = "Negative text must be set and non-empty.";
                } else if (TextUtils.isEmpty(this.A01) || !A1O) {
                    return new C05030Oy(this.A03, this.A02, this.A01, this.A00, this.A04, this.A05);
                } else {
                    str = "Negative text must not be set if device credential authentication is allowed.";
                }
            } else {
                StringBuilder A0r = AnonymousClass000.A0r("Authenticator combination is unsupported on API ");
                A0r.append(Build.VERSION.SDK_INT);
                A0r.append(": ");
                str = AnonymousClass000.A0h(i2 != 15 ? i2 != 255 ? i2 != 32768 ? i2 != 32783 ? i2 != 33023 ? String.valueOf(i2) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG", A0r);
            }
        } else {
            str = "Title must be set and non-empty.";
        }
        throw AnonymousClass000.A0T(str);
    }
}
