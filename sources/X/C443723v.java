package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.23v  reason: invalid class name and case insensitive filesystem */
public final class C443723v extends C28541Wm implements C28561Wp {
    public static final C443723v A06;
    public static volatile C47872Kz A07;
    public int A00;
    public long A01;
    public C33231iF A02;
    public String A03 = "";
    public String A04 = "";
    public boolean A05;

    static {
        C443723v r0 = new C443723v();
        A06 = r0;
        r0.A0W();
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A02;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            i3 = 0 + CodedOutputStream.A05(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A04);
        }
        if ((this.A00 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A03);
        }
        int i4 = this.A00;
        if ((i4 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A03(this.A01);
        }
        if ((i4 & 16) == 16) {
            i3 += 2;
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C33231iF r0 = this.A02;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0C(4, this.A01);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0E(5, this.A05);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
