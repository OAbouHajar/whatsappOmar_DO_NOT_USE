package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2Lb  reason: invalid class name and case insensitive filesystem */
public final class C47892Lb extends C28541Wm implements C28561Wp {
    public static final C47892Lb A04;
    public static volatile C47872Kz A05;
    public byte A00 = -1;
    public int A01;
    public long A02;
    public long A03;

    static {
        C47892Lb r0 = new C47892Lb();
        A04 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A01;
        if ((i4 & 1) == 1) {
            i3 = 0 + 2 + CodedOutputStream.A03(this.A03);
        }
        if ((i4 & 2) == 2) {
            i3 += 2 + CodedOutputStream.A03(this.A02);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0C(44, this.A03);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0C(45, this.A02);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
