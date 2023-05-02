package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2MR  reason: invalid class name */
public final class AnonymousClass2MR extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2MR A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01;
    public int A02;
    public String A03 = "";
    public boolean A04;

    static {
        AnonymousClass2MR r0 = new AnonymousClass2MR();
        A05 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A03);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A01(2, this.A01);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A01(3, this.A02);
        }
        if ((i4 & 8) == 8) {
            i3 += 2;
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A09(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A09(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0E(4, this.A04);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
