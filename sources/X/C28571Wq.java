package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1Wq  reason: invalid class name and case insensitive filesystem */
public final class C28571Wq extends C28541Wm implements C28561Wp {
    public static final C28571Wq A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01;
    public C28631Ww A02;
    public C28631Ww A03;
    public C28531Wl A04;

    static {
        C28571Wq r0 = new C28571Wq();
        A05 = r0;
        r0.A0W();
    }

    public C28571Wq() {
        C28631Ww r0 = C28631Ww.A01;
        this.A02 = r0;
        this.A03 = r0;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A04(this.A02, 1);
        }
        if ((i4 & 2) == 2) {
            C28531Wl r0 = this.A04;
            if (r0 == null) {
                r0 = C28531Wl.A0X;
            }
            i3 += CodedOutputStream.A05(r0, 2);
        }
        int i5 = this.A00;
        if ((i5 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A03, 3);
        }
        if ((i5 & 8) == 8) {
            i3 += CodedOutputStream.A01(4, this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A02, 1);
        }
        if ((this.A00 & 2) == 2) {
            C28531Wl r0 = this.A04;
            if (r0 == null) {
                r0 = C28531Wl.A0X;
            }
            codedOutputStream.A0G(r0, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A03, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A09(4, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
