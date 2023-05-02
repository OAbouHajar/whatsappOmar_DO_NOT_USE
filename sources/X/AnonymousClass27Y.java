package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.27Y  reason: invalid class name */
public final class AnonymousClass27Y extends C28541Wm implements C28561Wp {
    public static final AnonymousClass27Y A07;
    public static volatile C47872Kz A08;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C28631Ww A04;
    public C28631Ww A05;
    public C28631Ww A06;

    static {
        AnonymousClass27Y r0 = new AnonymousClass27Y();
        A07 = r0;
        r0.A0W();
    }

    public AnonymousClass27Y() {
        C28631Ww r0 = C28631Ww.A01;
        this.A04 = r0;
        this.A05 = r0;
        this.A06 = r0;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 = 0 + CodedOutputStream.A02(1, this.A01);
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A04(this.A04, 2);
        }
        if ((i4 & 16) == 16) {
            i3 += CodedOutputStream.A04(this.A05, 3);
        }
        if ((i4 & 32) == 32) {
            i3 += CodedOutputStream.A04(this.A06, 4);
        }
        if ((i4 & 1) == 1) {
            i3 += CodedOutputStream.A02(5, this.A02);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A02(6, this.A03);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0A(1, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A04, 2);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0F(this.A05, 3);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0F(this.A06, 4);
        }
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(5, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(6, this.A03);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
