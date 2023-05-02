package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1o6  reason: invalid class name and case insensitive filesystem */
public final class C36781o6 extends C28541Wm implements C28561Wp {
    public static final C36781o6 A02;
    public static volatile C47872Kz A03;
    public int A00;
    public C36791o7 A01;

    static {
        C36781o6 r0 = new C36781o6();
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
            C36791o7 r0 = this.A01;
            if (r0 == null) {
                r0 = C36791o7.A04;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C36791o7 r0 = this.A01;
            if (r0 == null) {
                r0 = C36791o7.A04;
            }
            codedOutputStream.A0G(r0, 1);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
