package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.23i  reason: invalid class name and case insensitive filesystem */
public final class C442423i extends C28541Wm implements C28561Wp {
    public static final C442423i A08;
    public static volatile C47872Kz A09;
    public byte A00 = -1;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public AnonymousClass1XE A05;
    public AnonymousClass1XE A06;
    public String A07 = "";

    static {
        C442423i r0 = new C442423i();
        A08 = r0;
        r0.A0W();
    }

    public C442423i() {
        AnonymousClass2NE r0 = AnonymousClass2NE.A01;
        this.A06 = r0;
        this.A05 = r0;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A062 = (this.A01 & 1) == 1 ? 1 + CodedOutputStream.A06(this.A07) : 0;
        int i3 = this.A01;
        if ((i3 & 2) == 2) {
            A062 += 1 + CodedOutputStream.A03(this.A04);
        }
        if ((i3 & 4) == 4) {
            A062 += 1 + CodedOutputStream.A03(this.A03);
        }
        if ((i3 & 8) == 8) {
            A062 += 1 + CodedOutputStream.A03(this.A02);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.A06.size(); i5++) {
            i4 += CodedOutputStream.A06((String) this.A06.get(i5));
        }
        int size = A062 + i4 + this.A06.size();
        int i6 = 0;
        for (int i7 = 0; i7 < this.A05.size(); i7++) {
            i6 += CodedOutputStream.A06((String) this.A05.get(i7));
        }
        int size2 = size + i6 + this.A05.size() + this.unknownFields.A00();
        this.A00 = size2;
        return size2;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0D(1, this.A07);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0C(2, this.A04);
        }
        if ((this.A01 & 4) == 4) {
            codedOutputStream.A0C(3, this.A03);
        }
        if ((this.A01 & 8) == 8) {
            codedOutputStream.A0C(4, this.A02);
        }
        for (int i2 = 0; i2 < this.A06.size(); i2++) {
            codedOutputStream.A0D(5, (String) this.A06.get(i2));
        }
        for (int i3 = 0; i3 < this.A05.size(); i3++) {
            codedOutputStream.A0D(6, (String) this.A05.get(i3));
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
