package X;

import java.util.Arrays;

/* renamed from: X.1Wg  reason: invalid class name and case insensitive filesystem */
public class C28481Wg {
    public static final C28481Wg A02 = new C28481Wg(AnonymousClass1X4.A01, new byte[]{2});
    public static final C28481Wg A03 = new C28481Wg(AnonymousClass1X4.A02, new byte[]{1});
    public final AnonymousClass1X4 A00;
    public final byte[] A01;

    public C28481Wg(AnonymousClass1X4 r1, byte[] bArr) {
        this.A01 = bArr;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28481Wg)) {
            return false;
        }
        C28481Wg r4 = (C28481Wg) obj;
        return Arrays.equals(this.A01, r4.A01) && this.A00 == r4.A00;
    }

    public int hashCode() {
        return (Arrays.hashCode(new Object[]{this.A00}) * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SyncdOperation{bytes=");
        sb.append(Arrays.toString(this.A01));
        sb.append(", syncdOperation=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
