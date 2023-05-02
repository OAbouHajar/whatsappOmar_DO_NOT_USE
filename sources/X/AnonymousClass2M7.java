package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2M7  reason: invalid class name */
public final class AnonymousClass2M7 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2M7 A04;
    public static volatile C47872Kz A05;
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;

    static {
        AnonymousClass2M7 r0 = new AnonymousClass2M7();
        A04 = r0;
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
            i3 += 2;
        }
        if ((i4 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A03(this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0E(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0E(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0C(3, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
