package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.2Mz  reason: invalid class name and case insensitive filesystem */
public final class C48392Mz extends C28541Wm implements C28561Wp {
    public static final C48392Mz A03;
    public static volatile C47872Kz A04;
    public int A00;
    public C33231iF A01;
    public String A02 = "";

    static {
        C48392Mz r0 = new C48392Mz();
        A03 = r0;
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
            C33231iF r0 = this.A01;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            i3 += CodedOutputStream.A05(r0, 2);
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
            C33231iF r0 = this.A01;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            codedOutputStream.A0G(r0, 2);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
