package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1XB  reason: invalid class name */
public final class AnonymousClass1XB extends C28541Wm implements C28561Wp {
    public static final AnonymousClass1XB A07;
    public static volatile C47872Kz A08;
    public int A00;
    public long A01;
    public C28631Ww A02;
    public C28631Ww A03;
    public C28631Ww A04;
    public String A05 = "";
    public String A06 = "";

    static {
        AnonymousClass1XB r0 = new AnonymousClass1XB();
        A07 = r0;
        r0.A0W();
    }

    public AnonymousClass1XB() {
        C28631Ww r1 = C28631Ww.A01;
        this.A04 = r1;
        this.A03 = r1;
        this.A02 = r1;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A04(this.A04, 1);
        }
        if ((i4 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A05);
        }
        if ((this.A00 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A06);
        }
        int i5 = this.A00;
        if ((i5 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A03(this.A01);
        }
        if ((i5 & 16) == 16) {
            i3 += CodedOutputStream.A04(this.A03, 5);
        }
        if ((i5 & 32) == 32) {
            i3 += CodedOutputStream.A04(this.A02, 6);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A04, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A06);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0C(4, this.A01);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0F(this.A03, 5);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0F(this.A02, 6);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
