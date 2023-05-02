package X;

import android.content.Context;

/* renamed from: X.0QV  reason: invalid class name */
public class AnonymousClass0QV {
    public C06190Uq A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;

    public AnonymousClass0QV(Context context) {
        this.A04 = context;
    }

    public C04980Ot A00() {
        String str;
        String str2;
        C06190Uq r2 = this.A00;
        if (r2 != null) {
            boolean z2 = this.A03;
            if (!z2 || ((str2 = this.A01) != null && str2.length() != 0)) {
                return new C04980Ot(this.A04, r2, this.A01, z2, this.A02);
            }
            str = "Must set a non-null database name to a configuration that uses the no backup directory.";
        } else {
            str = "Must set a callback to create the configuration.";
        }
        throw AnonymousClass000.A0T(str);
    }
}
