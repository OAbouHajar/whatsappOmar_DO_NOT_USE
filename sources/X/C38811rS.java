package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1rS  reason: invalid class name and case insensitive filesystem */
public class C38811rS extends C16740tZ implements C16850tk, C16860tl {
    public String A00;
    public List A01;
    public List A02;

    public C38811rS(C28381Vw r2, long j2) {
        super(r2, (byte) 14, j2);
        this.A02 = 1;
    }

    public C38811rS(C28381Vw r8, C38811rS r9, long j2, boolean z2) {
        super(r9, r8, j2, z2);
        this.A02 = 1;
        this.A01 = r9.A01;
        this.A00 = r9.A00;
    }

    public List A12() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        List A022 = C30311c8.A02(A11());
        this.A01 = A022;
        return A022;
    }

    public void A13(List list) {
        this.A01 = new ArrayList(list);
        this.A02 = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this.A01);
            A0v(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new AssertionError("ObjectOutputStream backed by ByteArrayOutputStream should not throw IOException");
        }
    }

    public /* bridge */ /* synthetic */ C16740tZ A6L(C28381Vw r7, long j2) {
        return new C38811rS(r7, this, j2, false);
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r7) {
        return new C38811rS(r7, this, this.A0I, true);
    }
}
