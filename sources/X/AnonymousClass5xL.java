package X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.5xL  reason: invalid class name */
public final class AnonymousClass5xL {
    public static final AnonymousClass5xL A05 = new AnonymousClass5xL((String) null, new Object[0], 0, 8);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final Object[] A04;

    public AnonymousClass5xL(String str) {
        int i2 = TextUtils.isEmpty(str) ? 8 : 0;
        this.A03 = str;
        this.A00 = 0;
        this.A02 = null;
        this.A01 = i2;
        this.A04 = null;
    }

    public AnonymousClass5xL(String str, Object[] objArr, int i2, int i3) {
        this.A03 = null;
        this.A02 = str;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = objArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass5xL)) {
                return false;
            }
            AnonymousClass5xL r4 = (AnonymousClass5xL) obj;
            if (this.A01 != r4.A01 || this.A00 != r4.A00) {
                return false;
            }
            String str = this.A03;
            String str2 = r4.A03;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (str2 == null || !str.equals(str2)) {
                return false;
            }
            String str3 = this.A02;
            String str4 = r4.A02;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (str4 == null || !str3.equals(str4)) {
                return false;
            }
            return Arrays.equals(this.A04, r4.A04);
        }
    }

    public int hashCode() {
        String str = this.A03;
        int hashCode = str != null ? str.hashCode() + 31 : 1;
        String str2 = this.A02;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        return ((((hashCode * 31) + this.A00) * 31) + this.A01) | Arrays.hashCode(this.A04);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("TextConfiguration{text='");
        A0r.append(this.A03);
        A0r.append('\'');
        A0r.append(", textResId=");
        A0r.append(this.A00);
        A0r.append(", formatArgs=");
        A0r.append(Arrays.toString(this.A04));
        return AnonymousClass000.A0k(A0r);
    }
}
