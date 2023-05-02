package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1te  reason: invalid class name and case insensitive filesystem */
public final class C40151te extends C28541Wm implements C28561Wp {
    public static final C40151te A04;
    public static volatile C47872Kz A05;
    public int A00;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";

    static {
        C40151te r0 = new C40151te();
        A04 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A02);
        }
        if ((this.A00 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A01);
        }
        if ((this.A00 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A03);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A03);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
