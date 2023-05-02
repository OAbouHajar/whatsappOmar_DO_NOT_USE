package X;

import java.util.Arrays;

/* renamed from: X.2Dx  reason: invalid class name */
public class AnonymousClass2Dx {
    public final long A00;
    public final long[] A01;

    public AnonymousClass2Dx(long[] jArr, long j2) {
        this.A00 = j2;
        this.A01 = jArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass2Dx r7 = (AnonymousClass2Dx) obj;
            if (this.A00 != r7.A00 || !Arrays.equals(this.A01, r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (Long.valueOf(this.A00).hashCode() * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Duration{staticDurationMillis=");
        sb.append(this.A00);
        sb.append(", repeatDurationMills=");
        sb.append(Arrays.toString(this.A01));
        sb.append('}');
        return sb.toString();
    }
}
