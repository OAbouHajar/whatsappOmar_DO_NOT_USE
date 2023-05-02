package X;

import java.util.Arrays;

/* renamed from: X.2E9  reason: invalid class name */
public class AnonymousClass2E9 {
    public final int A00;
    public final int A01;
    public final long A02;

    public AnonymousClass2E9(int i2, long j2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass2E9)) {
            return false;
        }
        AnonymousClass2E9 r7 = (AnonymousClass2E9) obj;
        return this.A00 == r7.A00 && this.A01 == r7.A01 && this.A02 == r7.A02;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FutureStageTiming{stage=");
        sb.append(this.A00);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", timeInMillis=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
