package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1oC  reason: invalid class name and case insensitive filesystem */
public final class C36841oC extends C28541Wm implements C28561Wp {
    public static final C36841oC A03;
    public static volatile C47872Kz A04;
    public int A00;
    public long A01;
    public boolean A02;

    static {
        C36841oC r0 = new C36841oC();
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
            i3 += 1 + CodedOutputStream.A03(this.A01);
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
            codedOutputStream.A0C(2, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
