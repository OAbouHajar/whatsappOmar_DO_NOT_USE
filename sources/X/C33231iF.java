package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1iF  reason: invalid class name and case insensitive filesystem */
public final class C33231iF extends C28541Wm implements C28561Wp {
    public static final C33231iF A05;
    public static volatile C47872Kz A06;
    public int A00;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public boolean A04;

    static {
        C33231iF r0 = new C33231iF();
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
            i3 += 2;
        }
        if ((i4 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A01);
        }
        if ((this.A00 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A06(this.A02);
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
            codedOutputStream.A0E(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(4, this.A02);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
