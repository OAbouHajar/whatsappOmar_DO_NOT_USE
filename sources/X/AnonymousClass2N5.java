package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2N5  reason: invalid class name */
public final class AnonymousClass2N5 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2N5 A06;
    public static volatile C47872Kz A07;
    public byte A00 = -1;
    public int A01;
    public long A02;
    public long A03;
    public String A04 = "";
    public String A05 = "";

    static {
        AnonymousClass2N5 r0 = new AnonymousClass2N5();
        A06 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A01;
        if ((i4 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A03(this.A03);
        }
        if ((i4 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A03(this.A02);
        }
        if ((i4 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A04);
        }
        if ((this.A01 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A06(this.A05);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0C(1, this.A03);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0C(2, this.A02);
        }
        if ((this.A01 & 4) == 4) {
            codedOutputStream.A0D(3, this.A04);
        }
        if ((this.A01 & 8) == 8) {
            codedOutputStream.A0D(4, this.A05);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
