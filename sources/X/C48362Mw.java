package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2Mw  reason: invalid class name and case insensitive filesystem */
public final class C48362Mw extends C28541Wm implements C28561Wp {
    public static final C48362Mw A04;
    public static volatile C47872Kz A05;
    public byte A00 = -1;
    public int A01;
    public int A02 = 0;
    public Object A03;

    static {
        C48362Mw r0 = new C48362Mw();
        A04 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (this.A02 == 1) {
            i3 = 0 + CodedOutputStream.A05((C28551Wn) this.A03, 1);
        }
        if (this.A02 == 2) {
            i3 += CodedOutputStream.A05((C28551Wn) this.A03, 2);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if (this.A02 == 1) {
            codedOutputStream.A0G((C28551Wn) this.A03, 1);
        }
        if (this.A02 == 2) {
            codedOutputStream.A0G((C28551Wn) this.A03, 2);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
