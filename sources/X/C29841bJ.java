package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1bJ  reason: invalid class name and case insensitive filesystem */
public final class C29841bJ extends C28541Wm implements C28561Wp {
    public static final C29841bJ A05;
    public static volatile C47872Kz A06;
    public int A00;
    public C28631Ww A01;
    public C28631Ww A02;
    public C28631Ww A03;
    public C28631Ww A04;

    static {
        C29841bJ r0 = new C29841bJ();
        A05 = r0;
        r0.A0W();
    }

    public C29841bJ() {
        C28631Ww r0 = C28631Ww.A01;
        this.A01 = r0;
        this.A03 = r0;
        this.A02 = r0;
        this.A04 = r0;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A04(this.A01, 1);
        }
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A04(this.A03, 2);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A02, 3);
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A04(this.A04, 4);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A01, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A03, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A02, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A04, 4);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
