package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2L8  reason: invalid class name */
public final class AnonymousClass2L8 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2L8 A05;
    public static volatile C47872Kz A06;
    public int A00;
    public C28631Ww A01;
    public C28631Ww A02;
    public AnonymousClass1XE A03 = AnonymousClass2NE.A01;
    public AnonymousClass2L9 A04;

    static {
        AnonymousClass2L8 r0 = new AnonymousClass2L8();
        A05 = r0;
        r0.A0W();
    }

    public AnonymousClass2L8() {
        C28631Ww r0 = C28631Ww.A01;
        this.A02 = r0;
        this.A01 = r0;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        int A042 = (i3 & 1) == 1 ? CodedOutputStream.A04(this.A02, 1) : 0;
        if ((i3 & 2) == 2) {
            A042 += CodedOutputStream.A04(this.A01, 2);
        }
        if ((i3 & 4) == 4) {
            AnonymousClass2L9 r0 = this.A04;
            if (r0 == null) {
                r0 = AnonymousClass2L9.A03;
            }
            A042 += CodedOutputStream.A05(r0, 3);
        }
        for (int i4 = 0; i4 < this.A03.size(); i4++) {
            A042 += CodedOutputStream.A05((AnonymousClass1Wo) this.A03.get(i4), 4);
        }
        int A002 = A042 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A02, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A01, 2);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass2L9 r0 = this.A04;
            if (r0 == null) {
                r0 = AnonymousClass2L9.A03;
            }
            codedOutputStream.A0G(r0, 3);
        }
        for (int i2 = 0; i2 < this.A03.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A03.get(i2), 4);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
