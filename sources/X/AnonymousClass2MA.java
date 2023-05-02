package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2MA  reason: invalid class name */
public final class AnonymousClass2MA extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2MA A02;
    public static volatile C47872Kz A03;
    public int A00;
    public boolean A01;

    static {
        AnonymousClass2MA r0 = new AnonymousClass2MA();
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
            i3 = 2;
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0E(1, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
