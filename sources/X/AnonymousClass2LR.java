package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2LR  reason: invalid class name */
public final class AnonymousClass2LR extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2LR A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public int A02;
    public C28631Ww A03 = C28631Ww.A01;

    static {
        AnonymousClass2LR r0 = new AnonymousClass2LR();
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
            i3 = 0 + CodedOutputStream.A02(1, this.A01);
        }
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A02(2, this.A02);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A03, 3);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0A(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A03, 3);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
