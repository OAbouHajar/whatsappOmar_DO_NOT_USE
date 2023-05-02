package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2L9  reason: invalid class name */
public final class AnonymousClass2L9 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2L9 A03;
    public static volatile C47872Kz A04;
    public int A00;
    public int A01;
    public C28631Ww A02 = C28631Ww.A01;

    static {
        AnonymousClass2L9 r0 = new AnonymousClass2L9();
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
            i3 = 0 + CodedOutputStream.A02(1, this.A01);
        }
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A04(this.A02, 2);
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
            codedOutputStream.A0F(this.A02, 2);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
