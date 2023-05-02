package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2Lt  reason: invalid class name and case insensitive filesystem */
public final class C48072Lt extends C28541Wm implements C28561Wp {
    public static final C48072Lt A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    static {
        C48072Lt r0 = new C48072Lt();
        A06 = r0;
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
            i3 += CodedOutputStream.A02(2, this.A04);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A02(3, this.A05);
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A02(4, this.A02);
        }
        if ((i4 & 16) == 16) {
            i3 += CodedOutputStream.A02(5, this.A03);
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
            codedOutputStream.A0A(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(3, this.A05);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0A(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0A(5, this.A03);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
