package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1nC  reason: invalid class name and case insensitive filesystem */
public final class C36221nC extends C28541Wm implements C28561Wp {
    public static final C36221nC A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;
    public C36231nD A03;

    static {
        C36221nC r0 = new C36221nC();
        A04 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A022 = (this.A00 & 1) == 1 ? CodedOutputStream.A02(1, this.A01) : 0;
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            A022 += CodedOutputStream.A05((AnonymousClass1Wo) this.A02.get(i3), 2);
        }
        if ((this.A00 & 2) == 2) {
            C36231nD r0 = this.A03;
            if (r0 == null) {
                r0 = C36231nD.A03;
            }
            A022 += CodedOutputStream.A05(r0, 3);
        }
        int A002 = A022 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A01);
        }
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A02.get(i2), 2);
        }
        if ((this.A00 & 2) == 2) {
            C36231nD r0 = this.A03;
            if (r0 == null) {
                r0 = C36231nD.A03;
            }
            codedOutputStream.A0G(r0, 3);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
