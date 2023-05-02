package X;

import java.util.Arrays;

/* renamed from: X.1aS  reason: invalid class name and case insensitive filesystem */
public class C29331aS {
    public final int A00;
    public final byte[] A01;
    public final /* synthetic */ C219916f A02;

    public C29331aS(C219916f r2, byte[] bArr) {
        this.A02 = r2;
        this.A01 = bArr;
        this.A00 = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C29331aS)) {
            return false;
        }
        return Arrays.equals(this.A01, ((C29331aS) obj).A01);
    }

    public int hashCode() {
        return this.A00;
    }
}
