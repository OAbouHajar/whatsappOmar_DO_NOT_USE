package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2ME  reason: invalid class name */
public final class AnonymousClass2ME extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2ME A03;
    public static volatile C47872Kz A04;
    public float A00;
    public int A01;
    public String A02 = "";

    static {
        AnonymousClass2ME r0 = new AnonymousClass2ME();
        A03 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A01 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A02);
        }
        if ((this.A01 & 2) == 2) {
            i3 += 5;
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0D(1, this.A02);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A08(2, Float.floatToRawIntBits(this.A00));
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
