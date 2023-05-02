package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2Mn  reason: invalid class name and case insensitive filesystem */
public final class C48272Mn extends C28541Wm implements C28561Wp {
    public static final C48272Mn A05;
    public static volatile C47872Kz A06;
    public int A00;
    public C28631Ww A01 = C28631Ww.A01;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;
    public AnonymousClass1X1 A03;
    public C34211jt A04;

    static {
        C48272Mn r0 = new C48272Mn();
        A05 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2;
        int i3 = this.A00;
        if (i3 != -1) {
            return i3;
        }
        if ((this.A00 & 1) == 1) {
            C34211jt r0 = this.A04;
            if (r0 == null) {
                r0 = C34211jt.A02;
            }
            i2 = CodedOutputStream.A05(r0, 1);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i2 += CodedOutputStream.A05((AnonymousClass1Wo) this.A02.get(i4), 2);
        }
        int i5 = this.A00;
        if ((i5 & 2) == 2) {
            i2 += CodedOutputStream.A04(this.A01, 3);
        }
        if ((i5 & 4) == 4) {
            AnonymousClass1X1 r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass1X1.A02;
            }
            i2 += CodedOutputStream.A05(r02, 4);
        }
        int A002 = i2 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C34211jt r0 = this.A04;
            if (r0 == null) {
                r0 = C34211jt.A02;
            }
            codedOutputStream.A0G(r0, 1);
        }
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A02.get(i2), 2);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A01, 3);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass1X1 r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass1X1.A02;
            }
            codedOutputStream.A0G(r02, 4);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
