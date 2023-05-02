package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1tc  reason: invalid class name and case insensitive filesystem */
public final class C40131tc extends C28541Wm implements C28561Wp {
    public static final C40131tc A06;
    public static volatile C47872Kz A07;
    public int A00;
    public long A01;
    public long A02;
    public AnonymousClass1XE A03 = AnonymousClass2NE.A01;
    public String A04 = "";
    public String A05 = "";

    static {
        C40131tc r0 = new C40131tc();
        A06 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        int A032 = (i3 & 1) == 1 ? 1 + CodedOutputStream.A03(this.A02) : 0;
        if ((i3 & 2) == 2) {
            A032 += 1 + CodedOutputStream.A06(this.A04);
        }
        if ((this.A00 & 4) == 4) {
            A032 += 1 + CodedOutputStream.A06(this.A05);
        }
        for (int i4 = 0; i4 < this.A03.size(); i4++) {
            A032 += CodedOutputStream.A05((AnonymousClass1Wo) this.A03.get(i4), 8);
        }
        if ((this.A00 & 8) == 8) {
            A032 += 1 + CodedOutputStream.A03(this.A01);
        }
        int A002 = A032 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0C(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(4, this.A05);
        }
        for (int i2 = 0; i2 < this.A03.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A03.get(i2), 8);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0C(10, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
