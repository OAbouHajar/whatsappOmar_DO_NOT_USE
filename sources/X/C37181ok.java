package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1ok  reason: invalid class name and case insensitive filesystem */
public final class C37181ok extends C28541Wm implements C28561Wp {
    public static final C37181ok A03;
    public static volatile C47872Kz A04;
    public int A00;
    public C36791o7 A01;
    public boolean A02;

    static {
        C37181ok r0 = new C37181ok();
        A03 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 2;
        }
        if ((i4 & 2) == 2) {
            C36791o7 r0 = this.A01;
            if (r0 == null) {
                r0 = C36791o7.A04;
            }
            i3 += CodedOutputStream.A05(r0, 2);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0E(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            C36791o7 r0 = this.A01;
            if (r0 == null) {
                r0 = C36791o7.A04;
            }
            codedOutputStream.A0G(r0, 2);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
