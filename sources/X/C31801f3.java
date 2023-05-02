package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1f3  reason: invalid class name and case insensitive filesystem */
public final class C31801f3 extends C28541Wm implements C28561Wp {
    public static final C31801f3 A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01;
    public long A02;
    public C28631Ww A03;
    public C28631Ww A04;
    public C28631Ww A05;

    static {
        C31801f3 r0 = new C31801f3();
        A06 = r0;
        r0.A0W();
    }

    public C31801f3() {
        C28631Ww r0 = C28631Ww.A01;
        this.A04 = r0;
        this.A03 = r0;
        this.A05 = r0;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A02(1, this.A01);
        }
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A04(this.A04, 2);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A03, 3);
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A04(this.A05, 4);
        }
        if ((i4 & 16) == 16) {
            i3 += 9;
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A04, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A03, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A05, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0B(5, this.A02);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
