package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.1oW  reason: invalid class name and case insensitive filesystem */
public final class C37041oW extends C28541Wm implements C28561Wp {
    public static final C37041oW A02;
    public static volatile C47872Kz A03;
    public int A00;
    public String A01 = "";

    static {
        C37041oW r0 = new C37041oW();
        A02 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
