package X;

import android.text.TextUtils;

/* renamed from: X.4UC  reason: invalid class name */
public final class AnonymousClass4UC {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public AnonymousClass4UC(String str, boolean z2, boolean z3) {
        this.A00 = str;
        this.A01 = z2;
        this.A02 = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != AnonymousClass4UC.class) {
                return false;
            }
            AnonymousClass4UC r5 = (AnonymousClass4UC) obj;
            if (!(TextUtils.equals(this.A00, r5.A00) && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.A00.hashCode() + 31) * 31;
        int i2 = 1231;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        int i4 = (hashCode + i3) * 31;
        if (!this.A02) {
            i2 = 1237;
        }
        return i4 + i2;
    }
}
