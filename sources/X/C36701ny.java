package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1ny  reason: invalid class name and case insensitive filesystem */
public final class C36701ny extends C28541Wm implements C28561Wp {
    public static final C36701ny A03;
    public static volatile C47872Kz A04;
    public int A00;
    public AnonymousClass1XE A01 = AnonymousClass2NE.A01;
    public C36031mt A02;

    static {
        C36701ny r0 = new C36701ny();
        A03 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2;
        int i3 = this.A00;
        if (i3 != -1) {
            return i3;
        }
        if ((this.A00 & 1) == 1) {
            C36031mt r0 = this.A02;
            if (r0 == null) {
                r0 = C36031mt.A0E;
            }
            i2 = CodedOutputStream.A05(r0, 1);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < this.A01.size(); i4++) {
            i2 += CodedOutputStream.A05((AnonymousClass1Wo) this.A01.get(i4), 2);
        }
        int A002 = i2 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C36031mt r0 = this.A02;
            if (r0 == null) {
                r0 = C36031mt.A0E;
            }
            codedOutputStream.A0G(r0, 1);
        }
        for (int i2 = 0; i2 < this.A01.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A01.get(i2), 2);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
