package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1X2  reason: invalid class name */
public final class AnonymousClass1X2 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass1X2 A04;
    public static volatile C47872Kz A05;
    public int A00;
    public AnonymousClass1X1 A01;
    public C28661Wz A02;
    public AnonymousClass1X0 A03;

    static {
        AnonymousClass1X2 r0 = new AnonymousClass1X2();
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
            C28661Wz r0 = this.A02;
            if (r0 == null) {
                r0 = C28661Wz.A02;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass1X0 r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass1X0.A02;
            }
            i3 += CodedOutputStream.A05(r02, 2);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass1X1 r03 = this.A01;
            if (r03 == null) {
                r03 = AnonymousClass1X1.A02;
            }
            i3 += CodedOutputStream.A05(r03, 3);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C28661Wz r0 = this.A02;
            if (r0 == null) {
                r0 = C28661Wz.A02;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass1X0 r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass1X0.A02;
            }
            codedOutputStream.A0G(r02, 2);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass1X1 r03 = this.A01;
            if (r03 == null) {
                r03 = AnonymousClass1X1.A02;
            }
            codedOutputStream.A0G(r03, 3);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
