package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2M4  reason: invalid class name */
public final class AnonymousClass2M4 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2M4 A03;
    public static volatile C47872Kz A04;
    public int A00;
    public long A01;
    public C33231iF A02;

    static {
        AnonymousClass2M4 r0 = new AnonymousClass2M4();
        A03 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A02;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A03(this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A02;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0C(2, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
