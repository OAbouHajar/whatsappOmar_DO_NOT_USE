package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2Lh  reason: invalid class name and case insensitive filesystem */
public final class C47952Lh extends C28541Wm implements C28561Wp {
    public static final C47952Lh A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public C28631Ww A02;
    public C28631Ww A03;

    static {
        C47952Lh r0 = new C47952Lh();
        A04 = r0;
        r0.A0W();
    }

    public C47952Lh() {
        C28631Ww r0 = C28631Ww.A01;
        this.A03 = r0;
        this.A02 = r0;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A04(this.A03, 1);
        }
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A04(this.A02, 2);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A02(3, this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A03, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A02, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(3, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}