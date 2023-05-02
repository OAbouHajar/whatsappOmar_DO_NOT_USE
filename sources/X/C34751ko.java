package X;

import android.text.TextUtils;

/* renamed from: X.1ko  reason: invalid class name and case insensitive filesystem */
public class C34751ko {
    public final long A00;
    public final String A01;

    public C34751ko(String str, long j2) {
        this.A00 = j2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C34751ko r7 = (C34751ko) obj;
            if (this.A00 != r7.A00 || !TextUtils.equals(this.A01, r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.A00;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.A01;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(":");
        sb.append(AnonymousClass1ZW.A03(4, this.A01));
        return sb.toString();
    }
}
