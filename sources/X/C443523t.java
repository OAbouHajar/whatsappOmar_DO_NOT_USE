package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.23t  reason: invalid class name and case insensitive filesystem */
public final class C443523t extends C28541Wm implements C28561Wp {
    public static final C443523t A04;
    public static volatile C47872Kz A05;
    public int A00;
    public long A01;
    public C441823c A02;
    public C33231iF A03;

    static {
        C443523t r0 = new C443523t();
        A04 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A03;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            C441823c r02 = this.A02;
            if (r02 == null) {
                r02 = C441823c.A01;
            }
            i3 += CodedOutputStream.A05(r02, 2);
        }
        if ((this.A00 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A03(this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A03;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            C441823c r02 = this.A02;
            if (r02 == null) {
                r02 = C441823c.A01;
            }
            codedOutputStream.A0G(r02, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0C(3, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
