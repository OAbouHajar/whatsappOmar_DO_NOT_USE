package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1yC  reason: invalid class name and case insensitive filesystem */
public class C42661yC {
    public List A00;
    public final int A01;
    public final byte[] A02;

    public C42661yC() {
        this((byte[]) null, 0);
    }

    public C42661yC(byte[] bArr, int i2) {
        this.A02 = bArr;
        this.A01 = i2;
    }

    public List A00() {
        byte[] bArr = this.A02;
        if (bArr == null) {
            return null;
        }
        List list = this.A00;
        if (list != null) {
            return list;
        }
        this.A00 = new ArrayList(r4);
        for (byte b2 : bArr) {
            this.A00.add(Float.valueOf(((float) b2) / 100.0f));
        }
        return this.A00;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return new C42661yC(this.A02, this.A01);
    }
}
