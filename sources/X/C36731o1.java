package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1o1  reason: invalid class name and case insensitive filesystem */
public final class C36731o1 extends C28541Wm implements C28561Wp {
    public static final C36731o1 A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;
    public AnonymousClass2LF A03;
    public C36231nD A04;

    static {
        C36731o1 r0 = new C36731o1();
        A05 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        int A022 = (i3 & 1) == 1 ? CodedOutputStream.A02(1, this.A01) : 0;
        if ((i3 & 2) == 2) {
            AnonymousClass2LF r0 = this.A03;
            if (r0 == null) {
                r0 = AnonymousClass2LF.A03;
            }
            A022 += CodedOutputStream.A05(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            C36231nD r02 = this.A04;
            if (r02 == null) {
                r02 = C36231nD.A03;
            }
            A022 += CodedOutputStream.A05(r02, 3);
        }
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            A022 += CodedOutputStream.A05((AnonymousClass1Wo) this.A02.get(i4), 4);
        }
        int A002 = A022 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass2LF r0 = this.A03;
            if (r0 == null) {
                r0 = AnonymousClass2LF.A03;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            C36231nD r02 = this.A04;
            if (r02 == null) {
                r02 = C36231nD.A03;
            }
            codedOutputStream.A0G(r02, 3);
        }
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A02.get(i2), 4);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
