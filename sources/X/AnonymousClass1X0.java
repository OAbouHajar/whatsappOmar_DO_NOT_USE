package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1X0  reason: invalid class name */
public final class AnonymousClass1X0 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass1X0 A02;
    public static volatile C47872Kz A03;
    public int A00;
    public C28631Ww A01 = C28631Ww.A01;

    static {
        AnonymousClass1X0 r0 = new AnonymousClass1X0();
        A02 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A04(this.A01, 1);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A01, 1);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
