package X;

import java.util.Arrays;
import java.util.Set;

/* renamed from: X.284  reason: invalid class name */
public class AnonymousClass284 {
    public static final AnonymousClass284 A02 = new AnonymousClass284((Set) null, 6);
    public static final AnonymousClass284 A03 = new AnonymousClass284((Set) null, 4);
    public static final AnonymousClass284 A04 = new AnonymousClass284((Set) null, 0);
    public static final AnonymousClass284 A05 = new AnonymousClass284((Set) null, 5);
    public static final AnonymousClass284 A06 = new AnonymousClass284((Set) null, 3);
    public static final AnonymousClass284 A07 = new AnonymousClass284((Set) null, 2);
    public static final AnonymousClass284 A08 = new AnonymousClass284((Set) null, 1);
    public final int A00;
    public final Set A01;

    public AnonymousClass284(Set set, int i2) {
        this.A00 = i2;
        this.A01 = set;
    }

    public boolean A00() {
        int i2 = this.A00;
        return i2 == 2 || i2 == 3 || i2 == 1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass284 r5 = (AnonymousClass284) obj;
            if (this.A00 != r5.A00 || !C34901l3.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SyncResult(resultType=");
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }
}
