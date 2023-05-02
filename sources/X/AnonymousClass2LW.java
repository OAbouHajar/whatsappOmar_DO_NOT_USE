package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2LW  reason: invalid class name */
public final class AnonymousClass2LW extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2LW A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01;
    public int A02;
    public C28631Ww A03 = C28631Ww.A01;
    public AnonymousClass1XE A04 = AnonymousClass2NE.A01;

    static {
        AnonymousClass2LW r0 = new AnonymousClass2LW();
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
            A022 += CodedOutputStream.A02(2, this.A02);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.A04.size(); i5++) {
            int A032 = ((C28631Ww) this.A04.get(i5)).A03();
            int i6 = 1;
            if ((A032 & -128) != 0) {
                i6 = 2;
                if ((A032 & -16384) != 0) {
                    i6 = 3;
                    if ((-2097152 & A032) != 0) {
                        i6 = 5;
                        if ((-268435456 & A032) == 0) {
                            i6 = 4;
                        }
                    }
                }
            }
            i4 += i6 + A032;
        }
        int size = A022 + i4 + this.A04.size();
        if ((this.A00 & 4) == 4) {
            size += CodedOutputStream.A04(this.A03, 4);
        }
        int A002 = size + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0A(2, this.A02);
        }
        for (int i2 = 0; i2 < this.A04.size(); i2++) {
            codedOutputStream.A0F((C28631Ww) this.A04.get(i2), 3);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A03, 4);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
